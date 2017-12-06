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
 * A representation of the model object '<em><b>Metamodel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.Metamodel#getOwningLanguage <em>Owning Language</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getMetamodel()
 * @model
 * @generated
 */
public interface Metamodel extends ModelingElement {
	/**
	 * Returns the value of the '<em><b>Owning Language</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.inria.diverse.melange.metamodel.melange.Language#getSyntax <em>Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Language</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Language</em>' container reference.
	 * @see #setOwningLanguage(Language)
	 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getMetamodel_OwningLanguage()
	 * @see fr.inria.diverse.melange.metamodel.melange.Language#getSyntax
	 * @model opposite="syntax" required="true" transient="false"
	 * @generated
	 */
	Language getOwningLanguage();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melange.metamodel.melange.Metamodel#getOwningLanguage <em>Owning Language</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Language</em>' container reference.
	 * @see #getOwningLanguage()
	 * @generated
	 */
	void setOwningLanguage(Language value);

} // Metamodel
