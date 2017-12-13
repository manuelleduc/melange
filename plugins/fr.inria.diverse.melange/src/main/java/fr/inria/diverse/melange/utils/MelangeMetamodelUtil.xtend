package fr.inria.diverse.melange.utils

import fr.inria.diverse.melange.metamodel.melange.LanguageConcern
import org.eclipse.emf.ecore.EObject

class MelangeMetamodelUtil {

	/**
	 * @param a tagged element
	 * @return the Language or LanguageConcern
	 */
	def LanguageConcern findLanguage(EObject te) {
		var parent = te.eContainer
		if(parent === null) return null
		while (!(parent instanceof LanguageConcern)) {
			parent = parent.eContainer
			if(parent === null) return null
		}

		return parent as LanguageConcern
	}
}
