package fr.inria.diverse.melange.utils

import com.google.inject.Inject
import fr.inria.diverse.melange.metamodel.melange.ImportDsl
import fr.inria.diverse.melange.metamodel.melange.LanguageConcern
import fr.inria.diverse.melange.metamodel.melange.ModelType
import fr.inria.diverse.melange.metamodel.melange.Variability
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.xtext.xbase.scoping.XbaseQualifiedNameProvider

class MelangeQualifiedNameProvider extends XbaseQualifiedNameProvider {

	@Inject extension IQualifiedNameConverter

	override getFullyQualifiedName(EObject obj) {

		if (obj instanceof ImportDsl) {
			return getFullyQualifiedName(obj)
		} else if (obj instanceof ModelType) {
			if (obj.extracted instanceof ImportDsl) {
				val importName = getFullyQualifiedName(obj.extracted as ImportDsl)
				val simpleName = importName.lastSegment + "MT"
				return importName.skipLast(1).append(simpleName)
			}
		} else if (obj instanceof Variability) {

			var EObject lc = obj.eContainer
			while (!(lc instanceof LanguageConcern))
				lc = lc.eContainer

			val lcqn = this.getFullyQualifiedName(lc)

			val res = lcqn.append(obj.name.toQualifiedName)
			println(res)
			return res
		}

		super.getFullyQualifiedName(obj)
	}

	def QualifiedName getFullyQualifiedName(ImportDsl lang) {

		if (lang.name !== null)
			return lang.name.toQualifiedName

		val dslRef = lang.eClass.EReferences.findFirst[name == "dsl"]
		val node = NodeModelUtils.findNodesForFeature(lang, dslRef)
		return node.head.text.toQualifiedName
	}
}
