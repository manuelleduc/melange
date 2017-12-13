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
package fr.inria.diverse.melange.metamodel.melange.util;

import fr.inria.diverse.melange.metamodel.melange.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage
 * @generated
 */
public class MelangeSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MelangePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MelangeSwitch() {
		if (modelPackage == null) {
			modelPackage = MelangePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MelangePackage.MODEL_TYPING_SPACE: {
				ModelTypingSpace modelTypingSpace = (ModelTypingSpace)theEObject;
				T result = caseModelTypingSpace(modelTypingSpace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MelangePackage.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MelangePackage.METAMODEL: {
				Metamodel metamodel = (Metamodel)theEObject;
				T result = caseMetamodel(metamodel);
				if (result == null) result = caseModelingElement(metamodel);
				if (result == null) result = caseElement(metamodel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MelangePackage.MODEL_TYPE: {
				ModelType modelType = (ModelType)theEObject;
				T result = caseModelType(modelType);
				if (result == null) result = caseModelingElement(modelType);
				if (result == null) result = caseNamedElement(modelType);
				if (result == null) result = caseElement(modelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MelangePackage.TRANSFORMATION: {
				Transformation transformation = (Transformation)theEObject;
				T result = caseTransformation(transformation);
				if (result == null) result = caseNamedElement(transformation);
				if (result == null) result = caseElement(transformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MelangePackage.ASPECT: {
				Aspect aspect = (Aspect)theEObject;
				T result = caseAspect(aspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MelangePackage.INHERITANCE: {
				Inheritance inheritance = (Inheritance)theEObject;
				T result = caseInheritance(inheritance);
				if (result == null) result = caseLanguageOperator(inheritance);
				if (result == null) result = caseOperator(inheritance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MelangePackage.SUBTYPING: {
				Subtyping subtyping = (Subtyping)theEObject;
				T result = caseSubtyping(subtyping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MelangePackage.XBASE_TRANSFORMATION: {
				XbaseTransformation xbaseTransformation = (XbaseTransformation)theEObject;
				T result = caseXbaseTransformation(xbaseTransformation);
				if (result == null) result = caseTransformation(xbaseTransformation);
				if (result == null) result = caseNamedElement(xbaseTransformation);
				if (result == null) result = caseElement(xbaseTransformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MelangePackage.MODELING_ELEMENT: {
				ModelingElement modelingElement = (ModelingElement)theEObject;
				T result = caseModelingElement(modelingElement);
				if (result == null) result = caseElement(modelingElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MelangePackage.MAPPING: {
				Mapping mapping = (Mapping)theEObject;
				T result = caseMapping(mapping);
				if (result == null) result = caseElement(mapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MelangePackage.CLASS_BINDING: {
				ClassBinding classBinding = (ClassBinding)theEObject;
				T result = caseClassBinding(classBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MelangePackage.PROPERTY_BINDING: {
				PropertyBinding propertyBinding = (PropertyBinding)theEObject;
				T result = casePropertyBinding(propertyBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MelangePackage.OPERATOR: {
				Operator operator = (Operator)theEObject;
				T result = caseOperator(operator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MelangePackage.LANGUAGE_OPERATOR: {
				LanguageOperator languageOperator = (LanguageOperator)theEObject;
				T result = caseLanguageOperator(languageOperator);
				if (result == null) result = caseOperator(languageOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MelangePackage.IMPORT: {
				Import import_ = (Import)theEObject;
				T result = caseImport(import_);
				if (result == null) result = caseOperator(import_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MelangePackage.MERGE: {
				Merge merge = (Merge)theEObject;
				T result = caseMerge(merge);
				if (result == null) result = caseLanguageOperator(merge);
				if (result == null) result = caseOperator(merge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MelangePackage.SLICE: {
				Slice slice = (Slice)theEObject;
				T result = caseSlice(slice);
				if (result == null) result = caseLanguageOperator(slice);
				if (result == null) result = caseOperator(slice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MelangePackage.PACKAGE_BINDING: {
				PackageBinding packageBinding = (PackageBinding)theEObject;
				T result = casePackageBinding(packageBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MelangePackage.LANGUAGE: {
				Language language = (Language)theEObject;
				T result = caseLanguage(language);
				if (result == null) result = caseLanguageConcern(language);
				if (result == null) result = caseNamedElement(language);
				if (result == null) result = caseElement(language);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MelangePackage.WEAVE: {
				Weave weave = (Weave)theEObject;
				T result = caseWeave(weave);
				if (result == null) result = caseOperator(weave);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MelangePackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = caseElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MelangePackage.EXTERNAL_LANGUAGE: {
				ExternalLanguage externalLanguage = (ExternalLanguage)theEObject;
				T result = caseExternalLanguage(externalLanguage);
				if (result == null) result = caseLanguage(externalLanguage);
				if (result == null) result = caseLanguageConcern(externalLanguage);
				if (result == null) result = caseNamedElement(externalLanguage);
				if (result == null) result = caseElement(externalLanguage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MelangePackage.ANNOTATION: {
				Annotation annotation = (Annotation)theEObject;
				T result = caseAnnotation(annotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MelangePackage.IMPORT_DSL: {
				ImportDsl importDsl = (ImportDsl)theEObject;
				T result = caseImportDsl(importDsl);
				if (result == null) result = caseLanguage(importDsl);
				if (result == null) result = caseLanguageConcern(importDsl);
				if (result == null) result = caseNamedElement(importDsl);
				if (result == null) result = caseElement(importDsl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MelangePackage.LANGUAGE_CONCERN: {
				LanguageConcern languageConcern = (LanguageConcern)theEObject;
				T result = caseLanguageConcern(languageConcern);
				if (result == null) result = caseNamedElement(languageConcern);
				if (result == null) result = caseElement(languageConcern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MelangePackage.VARIABILITY: {
				Variability variability = (Variability)theEObject;
				T result = caseVariability(variability);
				if (result == null) result = caseNamedElement(variability);
				if (result == null) result = caseElement(variability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MelangePackage.FEATURE: {
				Feature feature = (Feature)theEObject;
				T result = caseFeature(feature);
				if (result == null) result = caseVariability(feature);
				if (result == null) result = caseNamedElement(feature);
				if (result == null) result = caseElement(feature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MelangePackage.ONE_OF: {
				OneOf oneOf = (OneOf)theEObject;
				T result = caseOneOf(oneOf);
				if (result == null) result = caseVariability(oneOf);
				if (result == null) result = caseNamedElement(oneOf);
				if (result == null) result = caseElement(oneOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MelangePackage.SOME_OF: {
				SomeOf someOf = (SomeOf)theEObject;
				T result = caseSomeOf(someOf);
				if (result == null) result = caseVariability(someOf);
				if (result == null) result = caseNamedElement(someOf);
				if (result == null) result = caseElement(someOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MelangePackage.TAGGED_OPERATOR: {
				TaggedOperator taggedOperator = (TaggedOperator)theEObject;
				T result = caseTaggedOperator(taggedOperator);
				if (result == null) result = caseTaggedElement(taggedOperator);
				if (result == null) result = caseOperator(taggedOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MelangePackage.REALISATION: {
				Realisation realisation = (Realisation)theEObject;
				T result = caseRealisation(realisation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MelangePackage.CONDITION: {
				Condition condition = (Condition)theEObject;
				T result = caseCondition(condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MelangePackage.OR: {
				Or or = (Or)theEObject;
				T result = caseOr(or);
				if (result == null) result = caseCondition(or);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MelangePackage.AND: {
				And and = (And)theEObject;
				T result = caseAnd(and);
				if (result == null) result = caseCondition(and);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MelangePackage.NOT: {
				Not not = (Not)theEObject;
				T result = caseNot(not);
				if (result == null) result = caseCondition(not);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MelangePackage.FEATURE_REF: {
				FeatureRef featureRef = (FeatureRef)theEObject;
				T result = caseFeatureRef(featureRef);
				if (result == null) result = caseCondition(featureRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MelangePackage.REUSE: {
				Reuse reuse = (Reuse)theEObject;
				T result = caseReuse(reuse);
				if (result == null) result = caseOperator(reuse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MelangePackage.REUSE_FEATURE: {
				ReuseFeature reuseFeature = (ReuseFeature)theEObject;
				T result = caseReuseFeature(reuseFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MelangePackage.REFERENCE_REUSE_FEATURE: {
				ReferenceReuseFeature referenceReuseFeature = (ReferenceReuseFeature)theEObject;
				T result = caseReferenceReuseFeature(referenceReuseFeature);
				if (result == null) result = caseReuseFeature(referenceReuseFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MelangePackage.TAGGED_REUSE_FEATURE: {
				TaggedReuseFeature taggedReuseFeature = (TaggedReuseFeature)theEObject;
				T result = caseTaggedReuseFeature(taggedReuseFeature);
				if (result == null) result = caseReuseFeature(taggedReuseFeature);
				if (result == null) result = caseTaggedElement(taggedReuseFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MelangePackage.TAGGED_ELEMENT: {
				TaggedElement taggedElement = (TaggedElement)theEObject;
				T result = caseTaggedElement(taggedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Typing Space</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Typing Space</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelTypingSpace(ModelTypingSpace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metamodel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metamodel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetamodel(Metamodel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelType(ModelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformation(Transformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAspect(Aspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inheritance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inheritance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInheritance(Inheritance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subtyping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subtyping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubtyping(Subtyping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xbase Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xbase Transformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXbaseTransformation(XbaseTransformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modeling Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modeling Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelingElement(ModelingElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapping(Mapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassBinding(ClassBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyBinding(PropertyBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperator(Operator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Language Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Language Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLanguageOperator(LanguageOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImport(Import object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMerge(Merge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Slice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Slice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSlice(Slice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageBinding(PackageBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Language</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Language</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLanguage(Language object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Weave</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Weave</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWeave(Weave object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Language</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Language</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalLanguage(ExternalLanguage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotation(Annotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import Dsl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import Dsl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImportDsl(ImportDsl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Language Concern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Language Concern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLanguageConcern(LanguageConcern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariability(Variability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeature(Feature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>One Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>One Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOneOf(OneOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Some Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Some Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSomeOf(SomeOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tagged Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tagged Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaggedOperator(TaggedOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Realisation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Realisation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealisation(Realisation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOr(Or object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnd(And object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNot(Not object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureRef(FeatureRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reuse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reuse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReuse(Reuse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reuse Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reuse Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReuseFeature(ReuseFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Reuse Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Reuse Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceReuseFeature(ReferenceReuseFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tagged Reuse Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tagged Reuse Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaggedReuseFeature(TaggedReuseFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tagged Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tagged Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaggedElement(TaggedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MelangeSwitch
