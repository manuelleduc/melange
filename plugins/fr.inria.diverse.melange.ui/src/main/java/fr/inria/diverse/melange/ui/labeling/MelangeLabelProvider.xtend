/*******************************************************************************
 * Copyright (c) 2017 Inria and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Inria - initial API and implementation
 *******************************************************************************/
package fr.inria.diverse.melange.ui.labeling

import com.google.inject.Inject
import fr.inria.diverse.melange.metamodel.melange.Aspect
import fr.inria.diverse.melange.metamodel.melange.Inheritance
import fr.inria.diverse.melange.metamodel.melange.Language
import fr.inria.diverse.melange.metamodel.melange.ModelType
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import fr.inria.diverse.melange.metamodel.melange.Transformation
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EOperation
import org.eclipse.emf.ecore.EParameter
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.xbase.ui.labeling.XbaseLabelProvider
import fr.inria.diverse.melange.metamodel.melange.LanguageConcern

class MelangeLabelProvider extends XbaseLabelProvider
{
	@Inject
	new(AdapterFactoryLabelProvider delegate) {
		super(delegate)
	}

	def String image(ModelTypingSpace root) {
		return"melange.png"
	}

	def String image(Language l) {
		return "metamodel.png"
	}
	
	def String image(LanguageConcern lc) {
		return "concern.png"
	}

	def String image(ModelType mt) {
		return "modeltype.png"
	}

	def String image(Transformation t) {
		return "transformation.png"
	}

	def String text(Aspect asp) {
		return
			if (asp.aspectTypeRef.type instanceof JvmDeclaredType)
				'''«asp.aspectTypeRef.type.simpleName»«IF asp.aspectedClass !== null» @ «asp.aspectedClass.name»«ENDIF»'''
			else "Unbinded aspect"
	}

	def String image(Aspect asp) {
		return
			if (asp.aspectedClass !== null)
				"aspect.png"
			else
				"aspect2.png"
	}

	def String text(ModelType mt) {
		return '''«mt.name»«FOR t : mt.subtypingRelations BEFORE ' \u25C1 ' SEPARATOR ', '»«t.superType.name»«ENDFOR»'''.toString
	}

	def String text(Language l) {
		return '''«l.name»«FOR t : l.operators.filter(Inheritance).map[targetLanguage] BEFORE '\u25C0' SEPARATOR ', '»«t.name»«ENDFOR»«FOR t : l.implements BEFORE ' \u25C1 ' SEPARATOR ', '»«t.name»«ENDFOR»'''.toString
	}

	def String text(EAttribute a){
	    return '''«a.name» : «a.EType.name»'''
	}

	def String text(EReference r){
	    return '''«r.name» : «r.EType.name»'''
	}

	def String text(EOperation o){
	    return '''«o.name» : «o.EType.name»'''
	}

	def String text(EParameter p){
	    return '''«p.name» : «p.EType.name»'''
	}
}
