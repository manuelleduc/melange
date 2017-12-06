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
import fr.inria.diverse.melange.metamodel.melange.Realisation;
import fr.inria.diverse.melange.metamodel.melange.TaggedOperator;
import fr.inria.diverse.melange.metamodel.melange.Variability;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Language Concern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.impl.LanguageConcernImpl#getVm <em>Vm</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.impl.LanguageConcernImpl#getOperators <em>Operators</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.impl.LanguageConcernImpl#getRealisations <em>Realisations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LanguageConcernImpl extends NamedElementImpl implements LanguageConcern {
	/**
	 * The cached value of the '{@link #getVm() <em>Vm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVm()
	 * @generated
	 * @ordered
	 */
	protected Variability vm;

	/**
	 * The cached value of the '{@link #getOperators() <em>Operators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperators()
	 * @generated
	 * @ordered
	 */
	protected EList<TaggedOperator> operators;

	/**
	 * The cached value of the '{@link #getRealisations() <em>Realisations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealisations()
	 * @generated
	 * @ordered
	 */
	protected EList<Realisation> realisations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LanguageConcernImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MelangePackage.Literals.LANGUAGE_CONCERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variability getVm() {
		return vm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVm(Variability newVm, NotificationChain msgs) {
		Variability oldVm = vm;
		vm = newVm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MelangePackage.LANGUAGE_CONCERN__VM, oldVm, newVm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVm(Variability newVm) {
		if (newVm != vm) {
			NotificationChain msgs = null;
			if (vm != null)
				msgs = ((InternalEObject)vm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MelangePackage.LANGUAGE_CONCERN__VM, null, msgs);
			if (newVm != null)
				msgs = ((InternalEObject)newVm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MelangePackage.LANGUAGE_CONCERN__VM, null, msgs);
			msgs = basicSetVm(newVm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MelangePackage.LANGUAGE_CONCERN__VM, newVm, newVm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaggedOperator> getOperators() {
		if (operators == null) {
			operators = new EObjectContainmentEList<TaggedOperator>(TaggedOperator.class, this, MelangePackage.LANGUAGE_CONCERN__OPERATORS);
		}
		return operators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Realisation> getRealisations() {
		if (realisations == null) {
			realisations = new EObjectContainmentEList<Realisation>(Realisation.class, this, MelangePackage.LANGUAGE_CONCERN__REALISATIONS);
		}
		return realisations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MelangePackage.LANGUAGE_CONCERN__VM:
				return basicSetVm(null, msgs);
			case MelangePackage.LANGUAGE_CONCERN__OPERATORS:
				return ((InternalEList<?>)getOperators()).basicRemove(otherEnd, msgs);
			case MelangePackage.LANGUAGE_CONCERN__REALISATIONS:
				return ((InternalEList<?>)getRealisations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MelangePackage.LANGUAGE_CONCERN__VM:
				return getVm();
			case MelangePackage.LANGUAGE_CONCERN__OPERATORS:
				return getOperators();
			case MelangePackage.LANGUAGE_CONCERN__REALISATIONS:
				return getRealisations();
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
			case MelangePackage.LANGUAGE_CONCERN__VM:
				setVm((Variability)newValue);
				return;
			case MelangePackage.LANGUAGE_CONCERN__OPERATORS:
				getOperators().clear();
				getOperators().addAll((Collection<? extends TaggedOperator>)newValue);
				return;
			case MelangePackage.LANGUAGE_CONCERN__REALISATIONS:
				getRealisations().clear();
				getRealisations().addAll((Collection<? extends Realisation>)newValue);
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
			case MelangePackage.LANGUAGE_CONCERN__VM:
				setVm((Variability)null);
				return;
			case MelangePackage.LANGUAGE_CONCERN__OPERATORS:
				getOperators().clear();
				return;
			case MelangePackage.LANGUAGE_CONCERN__REALISATIONS:
				getRealisations().clear();
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
			case MelangePackage.LANGUAGE_CONCERN__VM:
				return vm != null;
			case MelangePackage.LANGUAGE_CONCERN__OPERATORS:
				return operators != null && !operators.isEmpty();
			case MelangePackage.LANGUAGE_CONCERN__REALISATIONS:
				return realisations != null && !realisations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LanguageConcernImpl
