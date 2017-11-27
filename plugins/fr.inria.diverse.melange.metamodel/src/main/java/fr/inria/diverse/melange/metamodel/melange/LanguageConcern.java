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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Language Concern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.LanguageConcern#getVm <em>Vm</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getLanguageConcern()
 * @model
 * @generated
 */
public interface LanguageConcern extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Vm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vm</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vm</em>' containment reference.
	 * @see #setVm(Variability)
	 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getLanguageConcern_Vm()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Variability getVm();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melange.metamodel.melange.LanguageConcern#getVm <em>Vm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vm</em>' containment reference.
	 * @see #getVm()
	 * @generated
	 */
	void setVm(Variability value);
} // LanguageConcern
