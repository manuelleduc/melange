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
package fr.inria.diverse.melange.formatting

import com.google.inject.Inject
import fr.inria.diverse.melange.services.MelangeGrammarAccess
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter
import org.eclipse.xtext.formatting.impl.FormattingConfig

class MelangeFormatter extends AbstractDeclarativeFormatter {

	@Inject extension MelangeGrammarAccess

	override protected void configureFormatting(FormattingConfig c) {
		// It's usually a good idea to activate the following three statements.
		// They will add and preserve newlines around comments
		c.setLinewrap(0, 1, 2).before(SL_COMMENTRule)
		c.setLinewrap(0, 1, 2).before(ML_COMMENTRule)
		c.setLinewrap(0, 1, 1).after(ML_COMMENTRule)

		// ModelTypingSpace
		c.setLinewrap(2).after(modelTypingSpaceAccess.nameAssignment_1)

		// LanguageConcern
		{
			val lcob = languageConcernAccess.leftCurlyBracketKeyword_2
			val lccb = languageConcernAccess.rightCurlyBracketKeyword_8
			c.setIndentation(lcob, lccb)
			c.setLinewrap().after(lcob)
			c.setLinewrap(2).after(lccb)
		}

		// variability
		{
			val ooob = oneOfAccess.leftCurlyBracketKeyword_1_2
			val oocb = oneOfAccess.rightCurlyBracketKeyword_1_4
			c.setIndentation(ooob, oocb)
			c.setLinewrap().after(ooob)
			c.setLinewrap().after(oocb)
			c.setLinewrap.after(oneOfAccess.childrenAssignment_1_3)
		}

		{
			val soob = someOfAccess.leftCurlyBracketKeyword_1_2
			val socb = someOfAccess.rightCurlyBracketKeyword_1_4
			c.setIndentation(soob, socb)
			c.setLinewrap().after(soob)
			c.setLinewrap().after(socb)
			c.setLinewrap.after(someOfAccess.childrenAssignment_1_3)
		}

		c.setNoSpace.after(oneOfAccess.optionalQuestionMarkKeyword_0_0)
		c.setNoSpace.after(someOfAccess.optionalQuestionMarkKeyword_0_0)
		c.setNoSpace.after(featureAccess.optionalQuestionMarkKeyword_0_0)

		// Language
		{
			val lob = languageAccess.leftCurlyBracketKeyword_0_5
			val loc = languageAccess.rightCurlyBracketKeyword_8_1
			c.setIndentation(lob, loc)
			c.setLinewrap.after(lob)
			c.setLinewrap(2).after(loc)

			c.setLinewrap.after(operatorRule)
		}

	}
}
