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
 * A representation of the model object '<em><b>Reference Reuse Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.ReferenceReuseFeature#isUnselected <em>Unselected</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getReferenceReuseFeature()
 * @model
 * @generated
 */
public interface ReferenceReuseFeature extends ReuseFeature {
	/**
	 * Returns the value of the '<em><b>Unselected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unselected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unselected</em>' attribute.
	 * @see #setUnselected(boolean)
	 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getReferenceReuseFeature_Unselected()
	 * @model
	 * @generated
	 */
	boolean isUnselected();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melange.metamodel.melange.ReferenceReuseFeature#isUnselected <em>Unselected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unselected</em>' attribute.
	 * @see #isUnselected()
	 * @generated
	 */
	void setUnselected(boolean value);

} // ReferenceReuseFeature
