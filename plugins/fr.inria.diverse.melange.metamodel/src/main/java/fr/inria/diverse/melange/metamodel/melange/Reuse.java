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
 * A representation of the model object '<em><b>Reuse</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.Reuse#getLanguageconcern <em>Languageconcern</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.Reuse#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getReuse()
 * @model
 * @generated
 */
public interface Reuse extends Operator {
	/**
	 * Returns the value of the '<em><b>Languageconcern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Languageconcern</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Languageconcern</em>' reference.
	 * @see #setLanguageconcern(LanguageConcern)
	 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getReuse_Languageconcern()
	 * @model required="true"
	 * @generated
	 */
	LanguageConcern getLanguageconcern();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melange.metamodel.melange.Reuse#getLanguageconcern <em>Languageconcern</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Languageconcern</em>' reference.
	 * @see #getLanguageconcern()
	 * @generated
	 */
	void setLanguageconcern(LanguageConcern value);

	/**
	 * Returns the value of the '<em><b>Features</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.diverse.melange.metamodel.melange.Variability}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' reference list.
	 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getReuse_Features()
	 * @model
	 * @generated
	 */
	EList<Variability> getFeatures();

} // Reuse
