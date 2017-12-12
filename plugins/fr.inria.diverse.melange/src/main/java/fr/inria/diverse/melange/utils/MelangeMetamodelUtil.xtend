package fr.inria.diverse.melange.utils

import fr.inria.diverse.melange.metamodel.melange.Language
import fr.inria.diverse.melange.metamodel.melange.LanguageConcern
import fr.inria.diverse.melange.metamodel.melange.TaggedElement

class MelangeMetamodelUtil {

	/**
	 * @param a tagged element
	 * @return the Language or LanguageConcern
	 */
	def findLanguage(TaggedElement te) {
		var parent = te.eContainer
		if(parent === null) return null
		while (!(parent instanceof Language || parent instanceof LanguageConcern)) {
			parent = parent.eContainer
			if(parent === null) return null
		}

		return parent
	}
}
