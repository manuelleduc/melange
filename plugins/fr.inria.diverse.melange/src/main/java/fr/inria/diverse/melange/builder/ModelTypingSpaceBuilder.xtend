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
import com.google.inject.Injector
import fr.inria.diverse.melange.metamodel.melange.Language
import java.util.Map
import com.google.inject.Singleton
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import fr.inria.diverse.melange.metamodel.melange.LanguageConcern

/**
 * Wololo, wololo wololo.
 */
@Singleton
class ModelTypingSpaceBuilder {
	@Inject Injector injector
	Map<LanguageConcern, LanguageBuilder> registry = newHashMap

	/**
	 * Creates and returns a builder to construct a model for {@code l}.
	 * Always returns the same builder for a given language.
	 */
	def LanguageBuilder getBuilder(LanguageConcern l) {
		var res = registry.get(l)

		if (res === null) {
			res = new LanguageBuilder(l, this)
			injector.injectMembers(res)
			registry.put(l, res)
		}

		return res
	}

	def void resetFor(ModelTypingSpace root) {
		root.elements.filter(Language).forEach[registry.remove(it)]
	}

	/**
	 * Return the builder corresponding to {@code l}, or null if it cannot be
	 * retrieved.
	 */
	def LanguageBuilder findBuilder(LanguageConcern l){
		return registry.get(l)
	}
}
