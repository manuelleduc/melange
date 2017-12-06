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
package fr.inria.diverse.melange.metamodel.melange.impl;

import fr.inria.diverse.melange.metamodel.melange.LanguageConcern;
import fr.inria.diverse.melange.metamodel.melange.MelangePackage;
import fr.inria.diverse.melange.metamodel.melange.Reuse;
import fr.inria.diverse.melange.metamodel.melange.Variability;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reuse</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.impl.ReuseImpl#getLanguageconcern <em>Languageconcern</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.impl.ReuseImpl#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReuseImpl extends OperatorImpl implements Reuse {
	/**
	 * The cached value of the '{@link #getLanguageconcern() <em>Languageconcern</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageconcern()
	 * @generated
	 * @ordered
	 */
	protected LanguageConcern languageconcern;

	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Variability> features;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReuseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MelangePackage.Literals.REUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageConcern getLanguageconcern() {
		if (languageconcern != null && languageconcern.eIsProxy()) {
			InternalEObject oldLanguageconcern = (InternalEObject)languageconcern;
			languageconcern = (LanguageConcern)eResolveProxy(oldLanguageconcern);
			if (languageconcern != oldLanguageconcern) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MelangePackage.REUSE__LANGUAGECONCERN, oldLanguageconcern, languageconcern));
			}
		}
		return languageconcern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageConcern basicGetLanguageconcern() {
		return languageconcern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguageconcern(LanguageConcern newLanguageconcern) {
		LanguageConcern oldLanguageconcern = languageconcern;
		languageconcern = newLanguageconcern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MelangePackage.REUSE__LANGUAGECONCERN, oldLanguageconcern, languageconcern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variability> getFeatures() {
		if (features == null) {
			features = new EObjectResolvingEList<Variability>(Variability.class, this, MelangePackage.REUSE__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MelangePackage.REUSE__LANGUAGECONCERN:
				if (resolve) return getLanguageconcern();
				return basicGetLanguageconcern();
			case MelangePackage.REUSE__FEATURES:
				return getFeatures();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MelangePackage.REUSE__LANGUAGECONCERN:
				setLanguageconcern((LanguageConcern)newValue);
				return;
			case MelangePackage.REUSE__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends Variability>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MelangePackage.REUSE__LANGUAGECONCERN:
				setLanguageconcern((LanguageConcern)null);
				return;
			case MelangePackage.REUSE__FEATURES:
				getFeatures().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MelangePackage.REUSE__LANGUAGECONCERN:
				return languageconcern != null;
			case MelangePackage.REUSE__FEATURES:
				return features != null && !features.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ReuseImpl
