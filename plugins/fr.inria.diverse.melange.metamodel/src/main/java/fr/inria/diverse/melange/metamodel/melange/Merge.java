/**
 * Copyright (c) 2017 Inria and others.
 *  * All rights reserved. This program and the accompanying materials
 *  * are made available under the terms of the Eclipse Public License v1.0
 *  * which accompanies this distribution, and is available at
 *  * http://www.eclipse.org/legal/epl-v10.html
 *  *
 *  * Contributors:
 *  *     Inria - initial API and implementation
 */
package fr.inria.diverse.melange.metamodel.melange;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Merge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.Merge#getMappingRules <em>Mapping Rules</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getMerge()
 * @model
 * @generated
 */
public interface Merge extends LanguageOperator {
	/**
	 * Returns the value of the '<em><b>Mapping Rules</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.diverse.melange.metamodel.melange.PackageBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping Rules</em>' containment reference list.
	 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getMerge_MappingRules()
	 * @model containment="true"
	 * @generated
	 */
	EList<PackageBinding> getMappingRules();

} // Merge
