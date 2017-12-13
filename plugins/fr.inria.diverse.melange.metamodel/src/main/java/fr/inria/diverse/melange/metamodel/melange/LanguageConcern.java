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
 * A representation of the model object '<em><b>Language Concern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.LanguageConcern#getVm <em>Vm</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.LanguageConcern#getOperators <em>Operators</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.LanguageConcern#getRealisations <em>Realisations</em>}</li>
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
	 * @model containment="true"
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

	/**
	 * Returns the value of the '<em><b>Operators</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.diverse.melange.metamodel.melange.Operator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operators</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operators</em>' containment reference list.
	 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getLanguageConcern_Operators()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operator> getOperators();

	/**
	 * Returns the value of the '<em><b>Realisations</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.diverse.melange.metamodel.melange.Realisation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realisations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realisations</em>' containment reference list.
	 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getLanguageConcern_Realisations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Realisation> getRealisations();

} // LanguageConcern
