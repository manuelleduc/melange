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
package fr.inria.diverse.melange

import fr.inria.diverse.melange.compiler.ModelOrientedXbaseCompiler
import fr.inria.diverse.melange.resource.MelangeDerivedStateComputer
import fr.inria.diverse.melange.scoping.MelangeScopeProvider
import fr.inria.diverse.melange.typesystem.MelangeSynonymTypesProvider
import fr.inria.diverse.melange.utils.MelangeQualifiedNameProvider
import fr.inria.diverse.melange.validation.MelangeLocalResourceValidator
import org.eclipse.xtext.parser.antlr.IReferableElementsUnloader
import org.eclipse.xtext.resource.IDerivedStateComputer
import org.eclipse.xtext.xbase.compiler.XbaseCompiler
import org.eclipse.xtext.xbase.scoping.batch.IBatchScopeProvider
import org.eclipse.xtext.xbase.typesystem.computation.SynonymTypesProvider

class MelangeRuntimeModule extends AbstractMelangeRuntimeModule {
	override Class<? extends IDerivedStateComputer> bindIDerivedStateComputer() {
		return typeof(MelangeDerivedStateComputer)
	}

	def Class<? extends SynonymTypesProvider> bindSynonymTypesProvider() {
		return typeof(MelangeSynonymTypesProvider)
	}

	def Class<? extends XbaseCompiler> bindXbaseCompiler() {
		return typeof(ModelOrientedXbaseCompiler)
	}

	override bindIResourceValidator() {
		return typeof(MelangeLocalResourceValidator)
	}

	override bindIQualifiedNameProvider() {
		return typeof(MelangeQualifiedNameProvider);
	}

	def Class<? extends IReferableElementsUnloader> bindIReferableElementsUnloader() {
		return IReferableElementsUnloader.NullUnloader
	}

	def Class<? extends IBatchScopeProvider> bindIBatchScopeProvider() {
		return typeof(MelangeScopeProvider);
	}
}
