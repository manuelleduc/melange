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
package fr.inria.diverse.melange.builder

import com.google.inject.Inject
import fr.inria.diverse.melange.metamodel.melange.Language
import fr.inria.diverse.melange.metamodel.melange.Merge
import java.util.Set
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.EClass

/**
 * Builder for the {@link Merge} operator.
 */
class MergeBuilder extends LanguageOperatorBuilder<Merge> {
	@Inject extension RenamerHelper

	new(Merge op, ModelTypingSpaceBuilder root) {
		super(op, root)
	}

	/**
	 * Copy the set of {@link EPackage} built from the {@link Language} pointed by
	 * the current {@link Merge} operator and apply the associated renaming rules.
	 */
	override make() {
		if (!targetModel.isEmpty) {
			model = EcoreUtil::copyAll(targetModel).toSet
			model.forEach[applyRenaming(source.mappingRules)]
//			model.applyCleanupCustomize(targetModel)
		}
	}
	
	/**
	 * Look for Customizable elements in the model and remove them if they have been 
	 */
	def applyCleanupCustomize(Set<EPackage> model, Set<EPackage> targetModel) {
		val customizedElements = model.map[it.eAllContents.filter(EClass).filter[it.EAnnotations.exists[it.source == "Customizable"]].toList].flatten
		
		customizedElements.forEach[customizableClass|
			
		]
//		println(a)
	}
}
