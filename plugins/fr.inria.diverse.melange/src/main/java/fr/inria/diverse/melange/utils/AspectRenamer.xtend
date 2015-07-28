package fr.inria.diverse.melange.utils

import com.google.inject.Inject
import fr.inria.diverse.melange.ast.AspectExtensions
import fr.inria.diverse.melange.ast.LanguageExtensions
import fr.inria.diverse.melange.metamodel.melange.Aspect
import fr.inria.diverse.melange.metamodel.melange.Language
import java.util.List
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IWorkspace
import org.eclipse.core.resources.IWorkspaceRoot
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.jdt.core.ICompilationUnit
import org.eclipse.jdt.core.JavaCore
import org.eclipse.jdt.core.dom.AST
import org.eclipse.jdt.core.dom.ASTParser
import org.eclipse.jdt.core.dom.ASTVisitor
import org.eclipse.jdt.core.dom.CompilationUnit
import org.eclipse.jface.text.Document
import org.eclipse.text.edits.TextEdit
import org.eclipse.xtext.naming.IQualifiedNameConverter

class AspectRenamer {
	
	@Inject extension IQualifiedNameConverter
	@Inject extension AspectExtensions
	@Inject extension LanguageExtensions
	
	def void processRenaming(Aspect asp, Language l, List<Pair<String,String>> classRenaming, List<Pair<String,String>> packageRenaming, List<Pair<String,String>> propertiesRenaming){
		val targetClass = asp.aspectAnnotationValue
		val fileName1 = targetClass+"Aspect.java"
		val fileName2 = targetClass+"Aspect"+targetClass+"AspectContext.java"
		val fileName3 = targetClass+"Aspect"+targetClass+"AspectProperties.java"
		
		val sourceAspectNamespace = asp.aspectTypeRef.identifier.toQualifiedName.skipLast(1)
    	val targetAspectNamespace = AspectCopier.getAspectTargetNamespace(sourceAspectNamespace, l)
		
		val IWorkspace workspace = ResourcesPlugin.getWorkspace();
    	val IWorkspaceRoot root = workspace.getRoot();
    	val IProject[] projects = root.getProjects();
    	val targetProject = projects.findFirst[name == l.externalRuntimeName]
		val javaProject = JavaCore.create(targetProject)
		
		val roots = javaProject.allPackageFragmentRoots
		val aspectNamespace = roots.findFirst[elementName == "src-gen"].getPackageFragment(targetAspectNamespace.toString)
		
		val cu1 = aspectNamespace.getCompilationUnit(fileName1)
		val cu2 = aspectNamespace.getCompilationUnit(fileName2)
		val cu3 = aspectNamespace.getCompilationUnit(fileName3)
		
		applyRenaming(cu1, new RenamerVisitor(classRenaming,packageRenaming,propertiesRenaming))
		applyRenaming(cu2, new RenamerVisitor(classRenaming,packageRenaming,propertiesRenaming))
		applyRenaming(cu3, new RenamerVisitor(classRenaming,packageRenaming,propertiesRenaming))
	}
	
	/**
	 * Visit {@link sourceUnit} with {@link renamer} and apply changes in
	 * the corresponding textual file
	 */
	private def void applyRenaming(ICompilationUnit sourceUnit, ASTVisitor renamer){
		
		// textual document
		val String source = sourceUnit.getSource();
		val Document document= new Document(source);
		
		// get the AST
		val ASTParser parser = ASTParser.newParser(AST.JLS8)
		parser.setSource(sourceUnit)
//		parser.setResolveBindings(true) --not working
		val astRoot = parser.createAST(null) as CompilationUnit
		
		// start record of the modifications
		astRoot.recordModifications()
	
		astRoot.accept(renamer)
		
		// computation of the text edits
	   	val TextEdit edits = astRoot.rewrite(document, sourceUnit.getJavaProject().getOptions(true))
	
	   	// computation of the new source code
	   	edits.apply(document);
	   	val String newSource = document.get();
	
	   	// update of the compilation unit
	   	sourceUnit.getBuffer().setContents(newSource);
	   	sourceUnit.getBuffer().save(null,true)
		
	}
}
