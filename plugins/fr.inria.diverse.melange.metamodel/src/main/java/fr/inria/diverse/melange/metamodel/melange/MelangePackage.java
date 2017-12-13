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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.inria.diverse.melange.metamodel.melange.MelangeFactory
 * @model kind="package"
 * @generated
 */
public interface MelangePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "melange";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.inria.fr/diverse/melange";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "melange";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MelangePackage eINSTANCE = fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.ModelTypingSpaceImpl <em>Model Typing Space</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.ModelTypingSpaceImpl
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getModelTypingSpace()
	 * @generated
	 */
	int MODEL_TYPING_SPACE = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPING_SPACE__ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPING_SPACE__IMPORTS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPING_SPACE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Model Typing Space</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPING_SPACE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Model Typing Space</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPING_SPACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.ElementImpl
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.ModelingElementImpl <em>Modeling Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.ModelingElementImpl
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getModelingElement()
	 * @generated
	 */
	int MODELING_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Ecore Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_ELEMENT__ECORE_URI = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Genmodel Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_ELEMENT__GENMODEL_URIS = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Modeling Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Modeling Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.MetamodelImpl <em>Metamodel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MetamodelImpl
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getMetamodel()
	 * @generated
	 */
	int METAMODEL = 2;

	/**
	 * The feature id for the '<em><b>Ecore Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__ECORE_URI = MODELING_ELEMENT__ECORE_URI;

	/**
	 * The feature id for the '<em><b>Genmodel Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__GENMODEL_URIS = MODELING_ELEMENT__GENMODEL_URIS;

	/**
	 * The feature id for the '<em><b>Owning Language</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__OWNING_LANGUAGE = MODELING_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Metamodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_FEATURE_COUNT = MODELING_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Metamodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_OPERATION_COUNT = MODELING_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.ModelTypeImpl <em>Model Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.ModelTypeImpl
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getModelType()
	 * @generated
	 */
	int MODEL_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Ecore Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__ECORE_URI = MODELING_ELEMENT__ECORE_URI;

	/**
	 * The feature id for the '<em><b>Genmodel Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__GENMODEL_URIS = MODELING_ELEMENT__GENMODEL_URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__NAME = MODELING_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subtyping Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__SUBTYPING_RELATIONS = MODELING_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Extracted</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__EXTRACTED = MODELING_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Mt Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__MT_URI = MODELING_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE_FEATURE_COUNT = MODELING_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE_OPERATION_COUNT = MODELING_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.NamedElementImpl
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.TransformationImpl <em>Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.TransformationImpl
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getTransformation()
	 * @generated
	 */
	int TRANSFORMATION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.AspectImpl <em>Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.AspectImpl
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getAspect()
	 * @generated
	 */
	int ASPECT = 5;

	/**
	 * The feature id for the '<em><b>Aspect Type Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__ASPECT_TYPE_REF = 0;

	/**
	 * The feature id for the '<em><b>Aspected Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__ASPECTED_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Ecore Fragment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__ECORE_FRAGMENT = 2;

	/**
	 * The feature id for the '<em><b>Owning Language</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__OWNING_LANGUAGE = 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__SOURCE = 4;

	/**
	 * The number of structural features of the '<em>Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.OperatorImpl <em>Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.OperatorImpl
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 13;

	/**
	 * The feature id for the '<em><b>Owning Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__OWNING_LANGUAGE = 0;

	/**
	 * The number of structural features of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.LanguageOperatorImpl <em>Language Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.LanguageOperatorImpl
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getLanguageOperator()
	 * @generated
	 */
	int LANGUAGE_OPERATOR = 14;

	/**
	 * The feature id for the '<em><b>Owning Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_OPERATOR__OWNING_LANGUAGE = OPERATOR__OWNING_LANGUAGE;

	/**
	 * The feature id for the '<em><b>Target Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_OPERATOR__TARGET_LANGUAGE = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Language Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Language Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_OPERATOR_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.InheritanceImpl <em>Inheritance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.InheritanceImpl
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getInheritance()
	 * @generated
	 */
	int INHERITANCE = 6;

	/**
	 * The feature id for the '<em><b>Owning Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE__OWNING_LANGUAGE = LANGUAGE_OPERATOR__OWNING_LANGUAGE;

	/**
	 * The feature id for the '<em><b>Target Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE__TARGET_LANGUAGE = LANGUAGE_OPERATOR__TARGET_LANGUAGE;

	/**
	 * The number of structural features of the '<em>Inheritance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_FEATURE_COUNT = LANGUAGE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Inheritance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_OPERATION_COUNT = LANGUAGE_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.SubtypingImpl <em>Subtyping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.SubtypingImpl
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getSubtyping()
	 * @generated
	 */
	int SUBTYPING = 7;

	/**
	 * The feature id for the '<em><b>Sub Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTYPING__SUB_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTYPING__SUPER_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Subtyping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTYPING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Subtyping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTYPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.XbaseTransformationImpl <em>Xbase Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.XbaseTransformationImpl
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getXbaseTransformation()
	 * @generated
	 */
	int XBASE_TRANSFORMATION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBASE_TRANSFORMATION__NAME = TRANSFORMATION__NAME;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBASE_TRANSFORMATION__BODY = TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Main</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBASE_TRANSFORMATION__MAIN = TRANSFORMATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBASE_TRANSFORMATION__PARAMETERS = TRANSFORMATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Return Type Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBASE_TRANSFORMATION__RETURN_TYPE_REF = TRANSFORMATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Xbase Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBASE_TRANSFORMATION_FEATURE_COUNT = TRANSFORMATION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Xbase Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBASE_TRANSFORMATION_OPERATION_COUNT = TRANSFORMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.MappingImpl <em>Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MappingImpl
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getMapping()
	 * @generated
	 */
	int MAPPING = 10;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__RULES = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__FROM = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__TO = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.ClassBindingImpl <em>Class Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.ClassBindingImpl
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getClassBinding()
	 * @generated
	 */
	int CLASS_BINDING = 11;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_BINDING__FROM = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_BINDING__TO = 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_BINDING__PROPERTIES = 2;

	/**
	 * The number of structural features of the '<em>Class Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_BINDING_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Class Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_BINDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.PropertyBindingImpl <em>Property Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.PropertyBindingImpl
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getPropertyBinding()
	 * @generated
	 */
	int PROPERTY_BINDING = 12;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_BINDING__FROM = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_BINDING__TO = 1;

	/**
	 * The number of structural features of the '<em>Property Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_BINDING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Property Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_BINDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.ImportImpl
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 15;

	/**
	 * The feature id for the '<em><b>Owning Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__OWNING_LANGUAGE = OPERATOR__OWNING_LANGUAGE;

	/**
	 * The feature id for the '<em><b>Ecore Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__ECORE_URI = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Genmodel Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__GENMODEL_URIS = OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mapping Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__MAPPING_RULES = OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.MergeImpl <em>Merge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MergeImpl
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getMerge()
	 * @generated
	 */
	int MERGE = 16;

	/**
	 * The feature id for the '<em><b>Owning Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE__OWNING_LANGUAGE = LANGUAGE_OPERATOR__OWNING_LANGUAGE;

	/**
	 * The feature id for the '<em><b>Target Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE__TARGET_LANGUAGE = LANGUAGE_OPERATOR__TARGET_LANGUAGE;

	/**
	 * The feature id for the '<em><b>Mapping Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE__MAPPING_RULES = LANGUAGE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Merge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_FEATURE_COUNT = LANGUAGE_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Merge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_OPERATION_COUNT = LANGUAGE_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.SliceImpl <em>Slice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.SliceImpl
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getSlice()
	 * @generated
	 */
	int SLICE = 17;

	/**
	 * The feature id for the '<em><b>Owning Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICE__OWNING_LANGUAGE = LANGUAGE_OPERATOR__OWNING_LANGUAGE;

	/**
	 * The feature id for the '<em><b>Target Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICE__TARGET_LANGUAGE = LANGUAGE_OPERATOR__TARGET_LANGUAGE;

	/**
	 * The feature id for the '<em><b>Roots</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICE__ROOTS = LANGUAGE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mapping Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICE__MAPPING_RULES = LANGUAGE_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Slice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICE_FEATURE_COUNT = LANGUAGE_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Slice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICE_OPERATION_COUNT = LANGUAGE_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.PackageBindingImpl <em>Package Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.PackageBindingImpl
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getPackageBinding()
	 * @generated
	 */
	int PACKAGE_BINDING = 18;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_BINDING__FROM = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_BINDING__TO = 1;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_BINDING__CLASSES = 2;

	/**
	 * The number of structural features of the '<em>Package Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_BINDING_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Package Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_BINDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.LanguageImpl <em>Language</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.LanguageImpl
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getLanguage()
	 * @generated
	 */
	int LANGUAGE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Vm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__VM = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__OPERATORS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Realisations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__REALISATIONS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Exact Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__EXACT_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__IMPLEMENTS = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__REQUIRES = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Syntax</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__SYNTAX = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Exact Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__EXACT_TYPE_NAME = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Exact Type Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__EXACT_TYPE_URI = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Resource Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__RESOURCE_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Resource Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__RESOURCE_URI = NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Xtext Setup Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__XTEXT_SETUP_REF = NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__MAPPINGS = NAMED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Semantics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__SEMANTICS = NAMED_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Xtext</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__XTEXT = NAMED_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Sirius</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__SIRIUS = NAMED_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Ecl</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__ECL = NAMED_ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Xmof</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__XMOF = NAMED_ELEMENT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>File Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__FILE_EXTENSION = NAMED_ELEMENT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__ANNOTATIONS = NAMED_ELEMENT_FEATURE_COUNT + 19;

	/**
	 * The number of structural features of the '<em>Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 20;

	/**
	 * The number of operations of the '<em>Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.WeaveImpl <em>Weave</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.WeaveImpl
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getWeave()
	 * @generated
	 */
	int WEAVE = 20;

	/**
	 * The feature id for the '<em><b>Owning Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAVE__OWNING_LANGUAGE = OPERATOR__OWNING_LANGUAGE;

	/**
	 * The feature id for the '<em><b>Aspect Type Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAVE__ASPECT_TYPE_REF = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Aspect Wildcard Import</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAVE__ASPECT_WILDCARD_IMPORT = OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Weave</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAVE_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Weave</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAVE_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.ExternalLanguageImpl <em>External Language</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.ExternalLanguageImpl
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getExternalLanguage()
	 * @generated
	 */
	int EXTERNAL_LANGUAGE = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LANGUAGE__NAME = LANGUAGE__NAME;

	/**
	 * The feature id for the '<em><b>Vm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LANGUAGE__VM = LANGUAGE__VM;

	/**
	 * The feature id for the '<em><b>Operators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LANGUAGE__OPERATORS = LANGUAGE__OPERATORS;

	/**
	 * The feature id for the '<em><b>Realisations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LANGUAGE__REALISATIONS = LANGUAGE__REALISATIONS;

	/**
	 * The feature id for the '<em><b>Exact Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LANGUAGE__EXACT_TYPE = LANGUAGE__EXACT_TYPE;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LANGUAGE__IMPLEMENTS = LANGUAGE__IMPLEMENTS;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LANGUAGE__REQUIRES = LANGUAGE__REQUIRES;

	/**
	 * The feature id for the '<em><b>Syntax</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LANGUAGE__SYNTAX = LANGUAGE__SYNTAX;

	/**
	 * The feature id for the '<em><b>Exact Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LANGUAGE__EXACT_TYPE_NAME = LANGUAGE__EXACT_TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Exact Type Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LANGUAGE__EXACT_TYPE_URI = LANGUAGE__EXACT_TYPE_URI;

	/**
	 * The feature id for the '<em><b>Resource Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LANGUAGE__RESOURCE_TYPE = LANGUAGE__RESOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Resource Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LANGUAGE__RESOURCE_URI = LANGUAGE__RESOURCE_URI;

	/**
	 * The feature id for the '<em><b>Xtext Setup Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LANGUAGE__XTEXT_SETUP_REF = LANGUAGE__XTEXT_SETUP_REF;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LANGUAGE__MAPPINGS = LANGUAGE__MAPPINGS;

	/**
	 * The feature id for the '<em><b>Semantics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LANGUAGE__SEMANTICS = LANGUAGE__SEMANTICS;

	/**
	 * The feature id for the '<em><b>Xtext</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LANGUAGE__XTEXT = LANGUAGE__XTEXT;

	/**
	 * The feature id for the '<em><b>Sirius</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LANGUAGE__SIRIUS = LANGUAGE__SIRIUS;

	/**
	 * The feature id for the '<em><b>Ecl</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LANGUAGE__ECL = LANGUAGE__ECL;

	/**
	 * The feature id for the '<em><b>Xmof</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LANGUAGE__XMOF = LANGUAGE__XMOF;

	/**
	 * The feature id for the '<em><b>File Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LANGUAGE__FILE_EXTENSION = LANGUAGE__FILE_EXTENSION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LANGUAGE__ANNOTATIONS = LANGUAGE__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>External Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LANGUAGE_FEATURE_COUNT = LANGUAGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>External Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LANGUAGE_OPERATION_COUNT = LANGUAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.AnnotationImpl
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 23;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.ImportDslImpl <em>Import Dsl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.ImportDslImpl
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getImportDsl()
	 * @generated
	 */
	int IMPORT_DSL = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DSL__NAME = LANGUAGE__NAME;

	/**
	 * The feature id for the '<em><b>Vm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DSL__VM = LANGUAGE__VM;

	/**
	 * The feature id for the '<em><b>Operators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DSL__OPERATORS = LANGUAGE__OPERATORS;

	/**
	 * The feature id for the '<em><b>Realisations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DSL__REALISATIONS = LANGUAGE__REALISATIONS;

	/**
	 * The feature id for the '<em><b>Exact Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DSL__EXACT_TYPE = LANGUAGE__EXACT_TYPE;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DSL__IMPLEMENTS = LANGUAGE__IMPLEMENTS;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DSL__REQUIRES = LANGUAGE__REQUIRES;

	/**
	 * The feature id for the '<em><b>Syntax</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DSL__SYNTAX = LANGUAGE__SYNTAX;

	/**
	 * The feature id for the '<em><b>Exact Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DSL__EXACT_TYPE_NAME = LANGUAGE__EXACT_TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Exact Type Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DSL__EXACT_TYPE_URI = LANGUAGE__EXACT_TYPE_URI;

	/**
	 * The feature id for the '<em><b>Resource Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DSL__RESOURCE_TYPE = LANGUAGE__RESOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Resource Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DSL__RESOURCE_URI = LANGUAGE__RESOURCE_URI;

	/**
	 * The feature id for the '<em><b>Xtext Setup Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DSL__XTEXT_SETUP_REF = LANGUAGE__XTEXT_SETUP_REF;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DSL__MAPPINGS = LANGUAGE__MAPPINGS;

	/**
	 * The feature id for the '<em><b>Semantics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DSL__SEMANTICS = LANGUAGE__SEMANTICS;

	/**
	 * The feature id for the '<em><b>Xtext</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DSL__XTEXT = LANGUAGE__XTEXT;

	/**
	 * The feature id for the '<em><b>Sirius</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DSL__SIRIUS = LANGUAGE__SIRIUS;

	/**
	 * The feature id for the '<em><b>Ecl</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DSL__ECL = LANGUAGE__ECL;

	/**
	 * The feature id for the '<em><b>Xmof</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DSL__XMOF = LANGUAGE__XMOF;

	/**
	 * The feature id for the '<em><b>File Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DSL__FILE_EXTENSION = LANGUAGE__FILE_EXTENSION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DSL__ANNOTATIONS = LANGUAGE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Dsl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DSL__DSL = LANGUAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Import Dsl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DSL_FEATURE_COUNT = LANGUAGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Import Dsl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DSL_OPERATION_COUNT = LANGUAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.LanguageConcernImpl <em>Language Concern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.LanguageConcernImpl
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getLanguageConcern()
	 * @generated
	 */
	int LANGUAGE_CONCERN = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_CONCERN__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Vm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_CONCERN__VM = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_CONCERN__OPERATORS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Realisations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_CONCERN__REALISATIONS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Language Concern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_CONCERN_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Language Concern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_CONCERN_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.VariabilityImpl <em>Variability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.VariabilityImpl
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getVariability()
	 * @generated
	 */
	int VARIABILITY = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABILITY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABILITY__OPTIONAL = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABILITY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Variability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABILITY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.FeatureImpl
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = VARIABILITY__NAME;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__OPTIONAL = VARIABILITY__OPTIONAL;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = VARIABILITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_COUNT = VARIABILITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.OneOfImpl <em>One Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.OneOfImpl
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getOneOf()
	 * @generated
	 */
	int ONE_OF = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF__NAME = VARIABILITY__NAME;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF__OPTIONAL = VARIABILITY__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF__CHILDREN = VARIABILITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>One Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF_FEATURE_COUNT = VARIABILITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>One Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF_OPERATION_COUNT = VARIABILITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.SomeOfImpl <em>Some Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.SomeOfImpl
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getSomeOf()
	 * @generated
	 */
	int SOME_OF = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_OF__NAME = VARIABILITY__NAME;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_OF__OPTIONAL = VARIABILITY__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_OF__CHILDREN = VARIABILITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Some Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_OF_FEATURE_COUNT = VARIABILITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Some Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_OF_OPERATION_COUNT = VARIABILITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.TaggedElementImpl <em>Tagged Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.TaggedElementImpl
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getTaggedElement()
	 * @generated
	 */
	int TAGGED_ELEMENT = 41;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Tagged Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Tagged Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.TaggedOperatorImpl <em>Tagged Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.TaggedOperatorImpl
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getTaggedOperator()
	 * @generated
	 */
	int TAGGED_OPERATOR = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_OPERATOR__NAME = TAGGED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owning Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_OPERATOR__OWNING_LANGUAGE = TAGGED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_OPERATOR__OPERATOR = TAGGED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tagged Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_OPERATOR_FEATURE_COUNT = TAGGED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Tagged Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_OPERATOR_OPERATION_COUNT = TAGGED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.RealisationImpl <em>Realisation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.RealisationImpl
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getRealisation()
	 * @generated
	 */
	int REALISATION = 31;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALISATION__CONDITION = 0;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALISATION__TARGETS = 1;

	/**
	 * The number of structural features of the '<em>Realisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALISATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Realisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALISATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.ConditionImpl
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 32;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.OrImpl <em>Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.OrImpl
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getOr()
	 * @generated
	 */
	int OR = 33;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__LEFT = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__RIGHT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.AndImpl
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getAnd()
	 * @generated
	 */
	int AND = 34;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__LEFT = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__RIGHT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.NotImpl <em>Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.NotImpl
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getNot()
	 * @generated
	 */
	int NOT = 35;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__CONTENT = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.FeatureRefImpl <em>Feature Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.FeatureRefImpl
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getFeatureRef()
	 * @generated
	 */
	int FEATURE_REF = 36;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_REF__REF = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_REF_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Feature Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_REF_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.ReuseImpl <em>Reuse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.ReuseImpl
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getReuse()
	 * @generated
	 */
	int REUSE = 37;

	/**
	 * The feature id for the '<em><b>Owning Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE__OWNING_LANGUAGE = OPERATOR__OWNING_LANGUAGE;

	/**
	 * The feature id for the '<em><b>Languageconcern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE__LANGUAGECONCERN = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE__FEATURES = OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Reuse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Reuse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.ReuseFeatureImpl <em>Reuse Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.ReuseFeatureImpl
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getReuseFeature()
	 * @generated
	 */
	int REUSE_FEATURE = 38;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_FEATURE__REF = 0;

	/**
	 * The number of structural features of the '<em>Reuse Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_FEATURE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Reuse Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_FEATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.ReferenceReuseFeatureImpl <em>Reference Reuse Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.ReferenceReuseFeatureImpl
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getReferenceReuseFeature()
	 * @generated
	 */
	int REFERENCE_REUSE_FEATURE = 39;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_REUSE_FEATURE__REF = REUSE_FEATURE__REF;

	/**
	 * The feature id for the '<em><b>Unselected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_REUSE_FEATURE__UNSELECTED = REUSE_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reference Reuse Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_REUSE_FEATURE_FEATURE_COUNT = REUSE_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Reference Reuse Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_REUSE_FEATURE_OPERATION_COUNT = REUSE_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.TaggedReuseFeatureImpl <em>Tagged Reuse Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.TaggedReuseFeatureImpl
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getTaggedReuseFeature()
	 * @generated
	 */
	int TAGGED_REUSE_FEATURE = 40;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_REUSE_FEATURE__REF = REUSE_FEATURE__REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_REUSE_FEATURE__NAME = REUSE_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tagged Reuse Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_REUSE_FEATURE_FEATURE_COUNT = REUSE_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Tagged Reuse Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_REUSE_FEATURE_OPERATION_COUNT = REUSE_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melange.metamodel.melange.ResourceType <em>Resource Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melange.metamodel.melange.ResourceType
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getResourceType()
	 * @generated
	 */
	int RESOURCE_TYPE = 42;


	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace <em>Model Typing Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Typing Space</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
	 * @generated
	 */
	EClass getModelTypingSpace();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace#getElements()
	 * @see #getModelTypingSpace()
	 * @generated
	 */
	EReference getModelTypingSpace_Elements();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Imports</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace#getImports()
	 * @see #getModelTypingSpace()
	 * @generated
	 */
	EReference getModelTypingSpace_Imports();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace#getName()
	 * @see #getModelTypingSpace()
	 * @generated
	 */
	EAttribute getModelTypingSpace_Name();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melange.metamodel.melange.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melange.metamodel.melange.Metamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metamodel</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Metamodel
	 * @generated
	 */
	EClass getMetamodel();

	/**
	 * Returns the meta object for the container reference '{@link fr.inria.diverse.melange.metamodel.melange.Metamodel#getOwningLanguage <em>Owning Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Language</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Metamodel#getOwningLanguage()
	 * @see #getMetamodel()
	 * @generated
	 */
	EReference getMetamodel_OwningLanguage();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melange.metamodel.melange.ModelType <em>Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Type</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.ModelType
	 * @generated
	 */
	EClass getModelType();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.melange.metamodel.melange.ModelType#getSubtypingRelations <em>Subtyping Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subtyping Relations</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.ModelType#getSubtypingRelations()
	 * @see #getModelType()
	 * @generated
	 */
	EReference getModelType_SubtypingRelations();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.diverse.melange.metamodel.melange.ModelType#getExtracted <em>Extracted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extracted</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.ModelType#getExtracted()
	 * @see #getModelType()
	 * @generated
	 */
	EReference getModelType_Extracted();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melange.metamodel.melange.ModelType#getMtUri <em>Mt Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mt Uri</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.ModelType#getMtUri()
	 * @see #getModelType()
	 * @generated
	 */
	EAttribute getModelType_MtUri();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melange.metamodel.melange.Transformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Transformation
	 * @generated
	 */
	EClass getTransformation();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melange.metamodel.melange.Aspect <em>Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aspect</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Aspect
	 * @generated
	 */
	EClass getAspect();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.melange.metamodel.melange.Aspect#getAspectTypeRef <em>Aspect Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aspect Type Ref</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Aspect#getAspectTypeRef()
	 * @see #getAspect()
	 * @generated
	 */
	EReference getAspect_AspectTypeRef();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.diverse.melange.metamodel.melange.Aspect#getAspectedClass <em>Aspected Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Aspected Class</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Aspect#getAspectedClass()
	 * @see #getAspect()
	 * @generated
	 */
	EReference getAspect_AspectedClass();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.melange.metamodel.melange.Aspect#getEcoreFragment <em>Ecore Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ecore Fragment</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Aspect#getEcoreFragment()
	 * @see #getAspect()
	 * @generated
	 */
	EReference getAspect_EcoreFragment();

	/**
	 * Returns the meta object for the container reference '{@link fr.inria.diverse.melange.metamodel.melange.Aspect#getOwningLanguage <em>Owning Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Language</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Aspect#getOwningLanguage()
	 * @see #getAspect()
	 * @generated
	 */
	EReference getAspect_OwningLanguage();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.diverse.melange.metamodel.melange.Aspect#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Aspect#getSource()
	 * @see #getAspect()
	 * @generated
	 */
	EReference getAspect_Source();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melange.metamodel.melange.Inheritance <em>Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inheritance</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Inheritance
	 * @generated
	 */
	EClass getInheritance();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melange.metamodel.melange.Subtyping <em>Subtyping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subtyping</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Subtyping
	 * @generated
	 */
	EClass getSubtyping();

	/**
	 * Returns the meta object for the container reference '{@link fr.inria.diverse.melange.metamodel.melange.Subtyping#getSubType <em>Sub Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Sub Type</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Subtyping#getSubType()
	 * @see #getSubtyping()
	 * @generated
	 */
	EReference getSubtyping_SubType();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.diverse.melange.metamodel.melange.Subtyping#getSuperType <em>Super Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Type</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Subtyping#getSuperType()
	 * @see #getSubtyping()
	 * @generated
	 */
	EReference getSubtyping_SuperType();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melange.metamodel.melange.XbaseTransformation <em>Xbase Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xbase Transformation</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.XbaseTransformation
	 * @generated
	 */
	EClass getXbaseTransformation();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.melange.metamodel.melange.XbaseTransformation#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.XbaseTransformation#getBody()
	 * @see #getXbaseTransformation()
	 * @generated
	 */
	EReference getXbaseTransformation_Body();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melange.metamodel.melange.XbaseTransformation#isMain <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Main</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.XbaseTransformation#isMain()
	 * @see #getXbaseTransformation()
	 * @generated
	 */
	EAttribute getXbaseTransformation_Main();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.melange.metamodel.melange.XbaseTransformation#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.XbaseTransformation#getParameters()
	 * @see #getXbaseTransformation()
	 * @generated
	 */
	EReference getXbaseTransformation_Parameters();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.melange.metamodel.melange.XbaseTransformation#getReturnTypeRef <em>Return Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Type Ref</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.XbaseTransformation#getReturnTypeRef()
	 * @see #getXbaseTransformation()
	 * @generated
	 */
	EReference getXbaseTransformation_ReturnTypeRef();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melange.metamodel.melange.ModelingElement <em>Modeling Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modeling Element</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.ModelingElement
	 * @generated
	 */
	EClass getModelingElement();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melange.metamodel.melange.ModelingElement#getEcoreUri <em>Ecore Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ecore Uri</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.ModelingElement#getEcoreUri()
	 * @see #getModelingElement()
	 * @generated
	 */
	EAttribute getModelingElement_EcoreUri();

	/**
	 * Returns the meta object for the attribute list '{@link fr.inria.diverse.melange.metamodel.melange.ModelingElement#getGenmodelUris <em>Genmodel Uris</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Genmodel Uris</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.ModelingElement#getGenmodelUris()
	 * @see #getModelingElement()
	 * @generated
	 */
	EAttribute getModelingElement_GenmodelUris();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melange.metamodel.melange.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Mapping
	 * @generated
	 */
	EClass getMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.melange.metamodel.melange.Mapping#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Mapping#getRules()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_Rules();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.diverse.melange.metamodel.melange.Mapping#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Mapping#getFrom()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_From();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.diverse.melange.metamodel.melange.Mapping#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Mapping#getTo()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_To();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melange.metamodel.melange.ClassBinding <em>Class Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Binding</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.ClassBinding
	 * @generated
	 */
	EClass getClassBinding();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melange.metamodel.melange.ClassBinding#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.ClassBinding#getFrom()
	 * @see #getClassBinding()
	 * @generated
	 */
	EAttribute getClassBinding_From();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melange.metamodel.melange.ClassBinding#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.ClassBinding#getTo()
	 * @see #getClassBinding()
	 * @generated
	 */
	EAttribute getClassBinding_To();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.melange.metamodel.melange.ClassBinding#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.ClassBinding#getProperties()
	 * @see #getClassBinding()
	 * @generated
	 */
	EReference getClassBinding_Properties();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melange.metamodel.melange.PropertyBinding <em>Property Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Binding</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.PropertyBinding
	 * @generated
	 */
	EClass getPropertyBinding();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melange.metamodel.melange.PropertyBinding#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.PropertyBinding#getFrom()
	 * @see #getPropertyBinding()
	 * @generated
	 */
	EAttribute getPropertyBinding_From();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melange.metamodel.melange.PropertyBinding#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.PropertyBinding#getTo()
	 * @see #getPropertyBinding()
	 * @generated
	 */
	EAttribute getPropertyBinding_To();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melange.metamodel.melange.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Operator
	 * @generated
	 */
	EClass getOperator();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.diverse.melange.metamodel.melange.Operator#getOwningLanguage <em>Owning Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owning Language</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Operator#getOwningLanguage()
	 * @see #getOperator()
	 * @generated
	 */
	EReference getOperator_OwningLanguage();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melange.metamodel.melange.LanguageOperator <em>Language Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Language Operator</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.LanguageOperator
	 * @generated
	 */
	EClass getLanguageOperator();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.diverse.melange.metamodel.melange.LanguageOperator#getTargetLanguage <em>Target Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Language</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.LanguageOperator#getTargetLanguage()
	 * @see #getLanguageOperator()
	 * @generated
	 */
	EReference getLanguageOperator_TargetLanguage();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melange.metamodel.melange.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melange.metamodel.melange.Import#getEcoreUri <em>Ecore Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ecore Uri</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Import#getEcoreUri()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_EcoreUri();

	/**
	 * Returns the meta object for the attribute list '{@link fr.inria.diverse.melange.metamodel.melange.Import#getGenmodelUris <em>Genmodel Uris</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Genmodel Uris</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Import#getGenmodelUris()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_GenmodelUris();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.melange.metamodel.melange.Import#getMappingRules <em>Mapping Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mapping Rules</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Import#getMappingRules()
	 * @see #getImport()
	 * @generated
	 */
	EReference getImport_MappingRules();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melange.metamodel.melange.Merge <em>Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merge</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Merge
	 * @generated
	 */
	EClass getMerge();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.melange.metamodel.melange.Merge#getMappingRules <em>Mapping Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mapping Rules</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Merge#getMappingRules()
	 * @see #getMerge()
	 * @generated
	 */
	EReference getMerge_MappingRules();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melange.metamodel.melange.Slice <em>Slice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slice</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Slice
	 * @generated
	 */
	EClass getSlice();

	/**
	 * Returns the meta object for the attribute list '{@link fr.inria.diverse.melange.metamodel.melange.Slice#getRoots <em>Roots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Roots</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Slice#getRoots()
	 * @see #getSlice()
	 * @generated
	 */
	EAttribute getSlice_Roots();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.melange.metamodel.melange.Slice#getMappingRules <em>Mapping Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mapping Rules</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Slice#getMappingRules()
	 * @see #getSlice()
	 * @generated
	 */
	EReference getSlice_MappingRules();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melange.metamodel.melange.PackageBinding <em>Package Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Binding</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.PackageBinding
	 * @generated
	 */
	EClass getPackageBinding();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melange.metamodel.melange.PackageBinding#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.PackageBinding#getFrom()
	 * @see #getPackageBinding()
	 * @generated
	 */
	EAttribute getPackageBinding_From();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melange.metamodel.melange.PackageBinding#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.PackageBinding#getTo()
	 * @see #getPackageBinding()
	 * @generated
	 */
	EAttribute getPackageBinding_To();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.melange.metamodel.melange.PackageBinding#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.PackageBinding#getClasses()
	 * @see #getPackageBinding()
	 * @generated
	 */
	EReference getPackageBinding_Classes();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melange.metamodel.melange.Language <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Language</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Language
	 * @generated
	 */
	EClass getLanguage();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.diverse.melange.metamodel.melange.Language#getExactType <em>Exact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Exact Type</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Language#getExactType()
	 * @see #getLanguage()
	 * @generated
	 */
	EReference getLanguage_ExactType();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.diverse.melange.metamodel.melange.Language#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Implements</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Language#getImplements()
	 * @see #getLanguage()
	 * @generated
	 */
	EReference getLanguage_Implements();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.diverse.melange.metamodel.melange.Language#getRequires <em>Requires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requires</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Language#getRequires()
	 * @see #getLanguage()
	 * @generated
	 */
	EReference getLanguage_Requires();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.melange.metamodel.melange.Language#getSyntax <em>Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Syntax</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Language#getSyntax()
	 * @see #getLanguage()
	 * @generated
	 */
	EReference getLanguage_Syntax();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melange.metamodel.melange.Language#getExactTypeName <em>Exact Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exact Type Name</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Language#getExactTypeName()
	 * @see #getLanguage()
	 * @generated
	 */
	EAttribute getLanguage_ExactTypeName();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melange.metamodel.melange.Language#getExactTypeUri <em>Exact Type Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exact Type Uri</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Language#getExactTypeUri()
	 * @see #getLanguage()
	 * @generated
	 */
	EAttribute getLanguage_ExactTypeUri();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melange.metamodel.melange.Language#getResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Type</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Language#getResourceType()
	 * @see #getLanguage()
	 * @generated
	 */
	EAttribute getLanguage_ResourceType();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melange.metamodel.melange.Language#getResourceUri <em>Resource Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Uri</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Language#getResourceUri()
	 * @see #getLanguage()
	 * @generated
	 */
	EAttribute getLanguage_ResourceUri();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.melange.metamodel.melange.Language#getXtextSetupRef <em>Xtext Setup Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Xtext Setup Ref</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Language#getXtextSetupRef()
	 * @see #getLanguage()
	 * @generated
	 */
	EReference getLanguage_XtextSetupRef();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.diverse.melange.metamodel.melange.Language#getMappings <em>Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mappings</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Language#getMappings()
	 * @see #getLanguage()
	 * @generated
	 */
	EReference getLanguage_Mappings();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.melange.metamodel.melange.Language#getSemantics <em>Semantics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semantics</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Language#getSemantics()
	 * @see #getLanguage()
	 * @generated
	 */
	EReference getLanguage_Semantics();

	/**
	 * Returns the meta object for the attribute list '{@link fr.inria.diverse.melange.metamodel.melange.Language#getXtext <em>Xtext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Xtext</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Language#getXtext()
	 * @see #getLanguage()
	 * @generated
	 */
	EAttribute getLanguage_Xtext();

	/**
	 * Returns the meta object for the attribute list '{@link fr.inria.diverse.melange.metamodel.melange.Language#getSirius <em>Sirius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Sirius</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Language#getSirius()
	 * @see #getLanguage()
	 * @generated
	 */
	EAttribute getLanguage_Sirius();

	/**
	 * Returns the meta object for the attribute list '{@link fr.inria.diverse.melange.metamodel.melange.Language#getEcl <em>Ecl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ecl</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Language#getEcl()
	 * @see #getLanguage()
	 * @generated
	 */
	EAttribute getLanguage_Ecl();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melange.metamodel.melange.Language#getXmof <em>Xmof</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xmof</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Language#getXmof()
	 * @see #getLanguage()
	 * @generated
	 */
	EAttribute getLanguage_Xmof();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melange.metamodel.melange.Language#getFileExtension <em>File Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Extension</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Language#getFileExtension()
	 * @see #getLanguage()
	 * @generated
	 */
	EAttribute getLanguage_FileExtension();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.melange.metamodel.melange.Language#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Language#getAnnotations()
	 * @see #getLanguage()
	 * @generated
	 */
	EReference getLanguage_Annotations();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melange.metamodel.melange.Weave <em>Weave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weave</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Weave
	 * @generated
	 */
	EClass getWeave();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.melange.metamodel.melange.Weave#getAspectTypeRef <em>Aspect Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aspect Type Ref</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Weave#getAspectTypeRef()
	 * @see #getWeave()
	 * @generated
	 */
	EReference getWeave_AspectTypeRef();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melange.metamodel.melange.Weave#getAspectWildcardImport <em>Aspect Wildcard Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aspect Wildcard Import</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Weave#getAspectWildcardImport()
	 * @see #getWeave()
	 * @generated
	 */
	EAttribute getWeave_AspectWildcardImport();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melange.metamodel.melange.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melange.metamodel.melange.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melange.metamodel.melange.ExternalLanguage <em>External Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Language</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.ExternalLanguage
	 * @generated
	 */
	EClass getExternalLanguage();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melange.metamodel.melange.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melange.metamodel.melange.Annotation#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Annotation#getKey()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Key();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melange.metamodel.melange.Annotation#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Annotation#getValue()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Value();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melange.metamodel.melange.ImportDsl <em>Import Dsl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import Dsl</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.ImportDsl
	 * @generated
	 */
	EClass getImportDsl();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.diverse.melange.metamodel.melange.ImportDsl#getDsl <em>Dsl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dsl</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.ImportDsl#getDsl()
	 * @see #getImportDsl()
	 * @generated
	 */
	EReference getImportDsl_Dsl();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melange.metamodel.melange.LanguageConcern <em>Language Concern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Language Concern</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.LanguageConcern
	 * @generated
	 */
	EClass getLanguageConcern();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.melange.metamodel.melange.LanguageConcern#getVm <em>Vm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vm</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.LanguageConcern#getVm()
	 * @see #getLanguageConcern()
	 * @generated
	 */
	EReference getLanguageConcern_Vm();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.melange.metamodel.melange.LanguageConcern#getOperators <em>Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operators</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.LanguageConcern#getOperators()
	 * @see #getLanguageConcern()
	 * @generated
	 */
	EReference getLanguageConcern_Operators();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.melange.metamodel.melange.LanguageConcern#getRealisations <em>Realisations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realisations</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.LanguageConcern#getRealisations()
	 * @see #getLanguageConcern()
	 * @generated
	 */
	EReference getLanguageConcern_Realisations();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melange.metamodel.melange.Variability <em>Variability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variability</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Variability
	 * @generated
	 */
	EClass getVariability();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melange.metamodel.melange.Variability#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Variability#isOptional()
	 * @see #getVariability()
	 * @generated
	 */
	EAttribute getVariability_Optional();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melange.metamodel.melange.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melange.metamodel.melange.OneOf <em>One Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>One Of</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.OneOf
	 * @generated
	 */
	EClass getOneOf();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.melange.metamodel.melange.OneOf#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.OneOf#getChildren()
	 * @see #getOneOf()
	 * @generated
	 */
	EReference getOneOf_Children();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melange.metamodel.melange.SomeOf <em>Some Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Some Of</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.SomeOf
	 * @generated
	 */
	EClass getSomeOf();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.melange.metamodel.melange.SomeOf#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.SomeOf#getChildren()
	 * @see #getSomeOf()
	 * @generated
	 */
	EReference getSomeOf_Children();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melange.metamodel.melange.TaggedOperator <em>Tagged Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tagged Operator</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.TaggedOperator
	 * @generated
	 */
	EClass getTaggedOperator();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.melange.metamodel.melange.TaggedOperator#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operator</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.TaggedOperator#getOperator()
	 * @see #getTaggedOperator()
	 * @generated
	 */
	EReference getTaggedOperator_Operator();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melange.metamodel.melange.Realisation <em>Realisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Realisation</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Realisation
	 * @generated
	 */
	EClass getRealisation();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.melange.metamodel.melange.Realisation#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Realisation#getCondition()
	 * @see #getRealisation()
	 * @generated
	 */
	EReference getRealisation_Condition();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.diverse.melange.metamodel.melange.Realisation#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Targets</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Realisation#getTargets()
	 * @see #getRealisation()
	 * @generated
	 */
	EReference getRealisation_Targets();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melange.metamodel.melange.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melange.metamodel.melange.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Or
	 * @generated
	 */
	EClass getOr();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.melange.metamodel.melange.Or#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Or#getLeft()
	 * @see #getOr()
	 * @generated
	 */
	EReference getOr_Left();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.melange.metamodel.melange.Or#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Or#getRight()
	 * @see #getOr()
	 * @generated
	 */
	EReference getOr_Right();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melange.metamodel.melange.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.And
	 * @generated
	 */
	EClass getAnd();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.melange.metamodel.melange.And#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.And#getLeft()
	 * @see #getAnd()
	 * @generated
	 */
	EReference getAnd_Left();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.melange.metamodel.melange.And#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.And#getRight()
	 * @see #getAnd()
	 * @generated
	 */
	EReference getAnd_Right();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melange.metamodel.melange.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Not
	 * @generated
	 */
	EClass getNot();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.melange.metamodel.melange.Not#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Not#getContent()
	 * @see #getNot()
	 * @generated
	 */
	EReference getNot_Content();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melange.metamodel.melange.FeatureRef <em>Feature Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Ref</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.FeatureRef
	 * @generated
	 */
	EClass getFeatureRef();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.diverse.melange.metamodel.melange.FeatureRef#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.FeatureRef#getRef()
	 * @see #getFeatureRef()
	 * @generated
	 */
	EReference getFeatureRef_Ref();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melange.metamodel.melange.Reuse <em>Reuse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reuse</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Reuse
	 * @generated
	 */
	EClass getReuse();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.diverse.melange.metamodel.melange.Reuse#getLanguageconcern <em>Languageconcern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Languageconcern</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Reuse#getLanguageconcern()
	 * @see #getReuse()
	 * @generated
	 */
	EReference getReuse_Languageconcern();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.melange.metamodel.melange.Reuse#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Reuse#getFeatures()
	 * @see #getReuse()
	 * @generated
	 */
	EReference getReuse_Features();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melange.metamodel.melange.ReuseFeature <em>Reuse Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reuse Feature</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.ReuseFeature
	 * @generated
	 */
	EClass getReuseFeature();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.diverse.melange.metamodel.melange.ReuseFeature#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.ReuseFeature#getRef()
	 * @see #getReuseFeature()
	 * @generated
	 */
	EReference getReuseFeature_Ref();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melange.metamodel.melange.ReferenceReuseFeature <em>Reference Reuse Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Reuse Feature</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.ReferenceReuseFeature
	 * @generated
	 */
	EClass getReferenceReuseFeature();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melange.metamodel.melange.ReferenceReuseFeature#isUnselected <em>Unselected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unselected</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.ReferenceReuseFeature#isUnselected()
	 * @see #getReferenceReuseFeature()
	 * @generated
	 */
	EAttribute getReferenceReuseFeature_Unselected();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melange.metamodel.melange.TaggedReuseFeature <em>Tagged Reuse Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tagged Reuse Feature</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.TaggedReuseFeature
	 * @generated
	 */
	EClass getTaggedReuseFeature();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melange.metamodel.melange.TaggedElement <em>Tagged Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tagged Element</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.TaggedElement
	 * @generated
	 */
	EClass getTaggedElement();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melange.metamodel.melange.TaggedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.TaggedElement#getName()
	 * @see #getTaggedElement()
	 * @generated
	 */
	EAttribute getTaggedElement_Name();

	/**
	 * Returns the meta object for enum '{@link fr.inria.diverse.melange.metamodel.melange.ResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Resource Type</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.ResourceType
	 * @generated
	 */
	EEnum getResourceType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MelangeFactory getMelangeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.ModelTypingSpaceImpl <em>Model Typing Space</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.ModelTypingSpaceImpl
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getModelTypingSpace()
		 * @generated
		 */
		EClass MODEL_TYPING_SPACE = eINSTANCE.getModelTypingSpace();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TYPING_SPACE__ELEMENTS = eINSTANCE.getModelTypingSpace_Elements();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TYPING_SPACE__IMPORTS = eINSTANCE.getModelTypingSpace_Imports();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_TYPING_SPACE__NAME = eINSTANCE.getModelTypingSpace_Name();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.ElementImpl
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.MetamodelImpl <em>Metamodel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MetamodelImpl
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getMetamodel()
		 * @generated
		 */
		EClass METAMODEL = eINSTANCE.getMetamodel();

		/**
		 * The meta object literal for the '<em><b>Owning Language</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METAMODEL__OWNING_LANGUAGE = eINSTANCE.getMetamodel_OwningLanguage();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.ModelTypeImpl <em>Model Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.ModelTypeImpl
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getModelType()
		 * @generated
		 */
		EClass MODEL_TYPE = eINSTANCE.getModelType();

		/**
		 * The meta object literal for the '<em><b>Subtyping Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TYPE__SUBTYPING_RELATIONS = eINSTANCE.getModelType_SubtypingRelations();

		/**
		 * The meta object literal for the '<em><b>Extracted</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TYPE__EXTRACTED = eINSTANCE.getModelType_Extracted();

		/**
		 * The meta object literal for the '<em><b>Mt Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_TYPE__MT_URI = eINSTANCE.getModelType_MtUri();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.TransformationImpl <em>Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.TransformationImpl
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getTransformation()
		 * @generated
		 */
		EClass TRANSFORMATION = eINSTANCE.getTransformation();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.AspectImpl <em>Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.AspectImpl
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getAspect()
		 * @generated
		 */
		EClass ASPECT = eINSTANCE.getAspect();

		/**
		 * The meta object literal for the '<em><b>Aspect Type Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASPECT__ASPECT_TYPE_REF = eINSTANCE.getAspect_AspectTypeRef();

		/**
		 * The meta object literal for the '<em><b>Aspected Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASPECT__ASPECTED_CLASS = eINSTANCE.getAspect_AspectedClass();

		/**
		 * The meta object literal for the '<em><b>Ecore Fragment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASPECT__ECORE_FRAGMENT = eINSTANCE.getAspect_EcoreFragment();

		/**
		 * The meta object literal for the '<em><b>Owning Language</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASPECT__OWNING_LANGUAGE = eINSTANCE.getAspect_OwningLanguage();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASPECT__SOURCE = eINSTANCE.getAspect_Source();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.InheritanceImpl <em>Inheritance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.InheritanceImpl
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getInheritance()
		 * @generated
		 */
		EClass INHERITANCE = eINSTANCE.getInheritance();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.SubtypingImpl <em>Subtyping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.SubtypingImpl
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getSubtyping()
		 * @generated
		 */
		EClass SUBTYPING = eINSTANCE.getSubtyping();

		/**
		 * The meta object literal for the '<em><b>Sub Type</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBTYPING__SUB_TYPE = eINSTANCE.getSubtyping_SubType();

		/**
		 * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBTYPING__SUPER_TYPE = eINSTANCE.getSubtyping_SuperType();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.XbaseTransformationImpl <em>Xbase Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.XbaseTransformationImpl
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getXbaseTransformation()
		 * @generated
		 */
		EClass XBASE_TRANSFORMATION = eINSTANCE.getXbaseTransformation();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XBASE_TRANSFORMATION__BODY = eINSTANCE.getXbaseTransformation_Body();

		/**
		 * The meta object literal for the '<em><b>Main</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XBASE_TRANSFORMATION__MAIN = eINSTANCE.getXbaseTransformation_Main();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XBASE_TRANSFORMATION__PARAMETERS = eINSTANCE.getXbaseTransformation_Parameters();

		/**
		 * The meta object literal for the '<em><b>Return Type Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XBASE_TRANSFORMATION__RETURN_TYPE_REF = eINSTANCE.getXbaseTransformation_ReturnTypeRef();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.ModelingElementImpl <em>Modeling Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.ModelingElementImpl
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getModelingElement()
		 * @generated
		 */
		EClass MODELING_ELEMENT = eINSTANCE.getModelingElement();

		/**
		 * The meta object literal for the '<em><b>Ecore Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELING_ELEMENT__ECORE_URI = eINSTANCE.getModelingElement_EcoreUri();

		/**
		 * The meta object literal for the '<em><b>Genmodel Uris</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELING_ELEMENT__GENMODEL_URIS = eINSTANCE.getModelingElement_GenmodelUris();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.MappingImpl <em>Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MappingImpl
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getMapping()
		 * @generated
		 */
		EClass MAPPING = eINSTANCE.getMapping();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__RULES = eINSTANCE.getMapping_Rules();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__FROM = eINSTANCE.getMapping_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__TO = eINSTANCE.getMapping_To();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.ClassBindingImpl <em>Class Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.ClassBindingImpl
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getClassBinding()
		 * @generated
		 */
		EClass CLASS_BINDING = eINSTANCE.getClassBinding();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_BINDING__FROM = eINSTANCE.getClassBinding_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_BINDING__TO = eINSTANCE.getClassBinding_To();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_BINDING__PROPERTIES = eINSTANCE.getClassBinding_Properties();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.PropertyBindingImpl <em>Property Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.PropertyBindingImpl
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getPropertyBinding()
		 * @generated
		 */
		EClass PROPERTY_BINDING = eINSTANCE.getPropertyBinding();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_BINDING__FROM = eINSTANCE.getPropertyBinding_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_BINDING__TO = eINSTANCE.getPropertyBinding_To();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.OperatorImpl <em>Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.OperatorImpl
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getOperator()
		 * @generated
		 */
		EClass OPERATOR = eINSTANCE.getOperator();

		/**
		 * The meta object literal for the '<em><b>Owning Language</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR__OWNING_LANGUAGE = eINSTANCE.getOperator_OwningLanguage();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.LanguageOperatorImpl <em>Language Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.LanguageOperatorImpl
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getLanguageOperator()
		 * @generated
		 */
		EClass LANGUAGE_OPERATOR = eINSTANCE.getLanguageOperator();

		/**
		 * The meta object literal for the '<em><b>Target Language</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANGUAGE_OPERATOR__TARGET_LANGUAGE = eINSTANCE.getLanguageOperator_TargetLanguage();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.ImportImpl
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getImport()
		 * @generated
		 */
		EClass IMPORT = eINSTANCE.getImport();

		/**
		 * The meta object literal for the '<em><b>Ecore Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__ECORE_URI = eINSTANCE.getImport_EcoreUri();

		/**
		 * The meta object literal for the '<em><b>Genmodel Uris</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__GENMODEL_URIS = eINSTANCE.getImport_GenmodelUris();

		/**
		 * The meta object literal for the '<em><b>Mapping Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORT__MAPPING_RULES = eINSTANCE.getImport_MappingRules();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.MergeImpl <em>Merge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MergeImpl
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getMerge()
		 * @generated
		 */
		EClass MERGE = eINSTANCE.getMerge();

		/**
		 * The meta object literal for the '<em><b>Mapping Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGE__MAPPING_RULES = eINSTANCE.getMerge_MappingRules();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.SliceImpl <em>Slice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.SliceImpl
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getSlice()
		 * @generated
		 */
		EClass SLICE = eINSTANCE.getSlice();

		/**
		 * The meta object literal for the '<em><b>Roots</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLICE__ROOTS = eINSTANCE.getSlice_Roots();

		/**
		 * The meta object literal for the '<em><b>Mapping Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLICE__MAPPING_RULES = eINSTANCE.getSlice_MappingRules();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.PackageBindingImpl <em>Package Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.PackageBindingImpl
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getPackageBinding()
		 * @generated
		 */
		EClass PACKAGE_BINDING = eINSTANCE.getPackageBinding();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_BINDING__FROM = eINSTANCE.getPackageBinding_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_BINDING__TO = eINSTANCE.getPackageBinding_To();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_BINDING__CLASSES = eINSTANCE.getPackageBinding_Classes();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.LanguageImpl <em>Language</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.LanguageImpl
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getLanguage()
		 * @generated
		 */
		EClass LANGUAGE = eINSTANCE.getLanguage();

		/**
		 * The meta object literal for the '<em><b>Exact Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANGUAGE__EXACT_TYPE = eINSTANCE.getLanguage_ExactType();

		/**
		 * The meta object literal for the '<em><b>Implements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANGUAGE__IMPLEMENTS = eINSTANCE.getLanguage_Implements();

		/**
		 * The meta object literal for the '<em><b>Requires</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANGUAGE__REQUIRES = eINSTANCE.getLanguage_Requires();

		/**
		 * The meta object literal for the '<em><b>Syntax</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANGUAGE__SYNTAX = eINSTANCE.getLanguage_Syntax();

		/**
		 * The meta object literal for the '<em><b>Exact Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE__EXACT_TYPE_NAME = eINSTANCE.getLanguage_ExactTypeName();

		/**
		 * The meta object literal for the '<em><b>Exact Type Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE__EXACT_TYPE_URI = eINSTANCE.getLanguage_ExactTypeUri();

		/**
		 * The meta object literal for the '<em><b>Resource Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE__RESOURCE_TYPE = eINSTANCE.getLanguage_ResourceType();

		/**
		 * The meta object literal for the '<em><b>Resource Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE__RESOURCE_URI = eINSTANCE.getLanguage_ResourceUri();

		/**
		 * The meta object literal for the '<em><b>Xtext Setup Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANGUAGE__XTEXT_SETUP_REF = eINSTANCE.getLanguage_XtextSetupRef();

		/**
		 * The meta object literal for the '<em><b>Mappings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANGUAGE__MAPPINGS = eINSTANCE.getLanguage_Mappings();

		/**
		 * The meta object literal for the '<em><b>Semantics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANGUAGE__SEMANTICS = eINSTANCE.getLanguage_Semantics();

		/**
		 * The meta object literal for the '<em><b>Xtext</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE__XTEXT = eINSTANCE.getLanguage_Xtext();

		/**
		 * The meta object literal for the '<em><b>Sirius</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE__SIRIUS = eINSTANCE.getLanguage_Sirius();

		/**
		 * The meta object literal for the '<em><b>Ecl</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE__ECL = eINSTANCE.getLanguage_Ecl();

		/**
		 * The meta object literal for the '<em><b>Xmof</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE__XMOF = eINSTANCE.getLanguage_Xmof();

		/**
		 * The meta object literal for the '<em><b>File Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE__FILE_EXTENSION = eINSTANCE.getLanguage_FileExtension();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANGUAGE__ANNOTATIONS = eINSTANCE.getLanguage_Annotations();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.WeaveImpl <em>Weave</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.WeaveImpl
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getWeave()
		 * @generated
		 */
		EClass WEAVE = eINSTANCE.getWeave();

		/**
		 * The meta object literal for the '<em><b>Aspect Type Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEAVE__ASPECT_TYPE_REF = eINSTANCE.getWeave_AspectTypeRef();

		/**
		 * The meta object literal for the '<em><b>Aspect Wildcard Import</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEAVE__ASPECT_WILDCARD_IMPORT = eINSTANCE.getWeave_AspectWildcardImport();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.NamedElementImpl
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.ExternalLanguageImpl <em>External Language</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.ExternalLanguageImpl
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getExternalLanguage()
		 * @generated
		 */
		EClass EXTERNAL_LANGUAGE = eINSTANCE.getExternalLanguage();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.AnnotationImpl
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__KEY = eINSTANCE.getAnnotation_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__VALUE = eINSTANCE.getAnnotation_Value();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.ImportDslImpl <em>Import Dsl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.ImportDslImpl
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getImportDsl()
		 * @generated
		 */
		EClass IMPORT_DSL = eINSTANCE.getImportDsl();

		/**
		 * The meta object literal for the '<em><b>Dsl</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORT_DSL__DSL = eINSTANCE.getImportDsl_Dsl();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.LanguageConcernImpl <em>Language Concern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.LanguageConcernImpl
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getLanguageConcern()
		 * @generated
		 */
		EClass LANGUAGE_CONCERN = eINSTANCE.getLanguageConcern();

		/**
		 * The meta object literal for the '<em><b>Vm</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANGUAGE_CONCERN__VM = eINSTANCE.getLanguageConcern_Vm();

		/**
		 * The meta object literal for the '<em><b>Operators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANGUAGE_CONCERN__OPERATORS = eINSTANCE.getLanguageConcern_Operators();

		/**
		 * The meta object literal for the '<em><b>Realisations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANGUAGE_CONCERN__REALISATIONS = eINSTANCE.getLanguageConcern_Realisations();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.VariabilityImpl <em>Variability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.VariabilityImpl
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getVariability()
		 * @generated
		 */
		EClass VARIABILITY = eINSTANCE.getVariability();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABILITY__OPTIONAL = eINSTANCE.getVariability_Optional();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.FeatureImpl
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.OneOfImpl <em>One Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.OneOfImpl
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getOneOf()
		 * @generated
		 */
		EClass ONE_OF = eINSTANCE.getOneOf();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_OF__CHILDREN = eINSTANCE.getOneOf_Children();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.SomeOfImpl <em>Some Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.SomeOfImpl
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getSomeOf()
		 * @generated
		 */
		EClass SOME_OF = eINSTANCE.getSomeOf();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOME_OF__CHILDREN = eINSTANCE.getSomeOf_Children();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.TaggedOperatorImpl <em>Tagged Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.TaggedOperatorImpl
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getTaggedOperator()
		 * @generated
		 */
		EClass TAGGED_OPERATOR = eINSTANCE.getTaggedOperator();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAGGED_OPERATOR__OPERATOR = eINSTANCE.getTaggedOperator_Operator();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.RealisationImpl <em>Realisation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.RealisationImpl
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getRealisation()
		 * @generated
		 */
		EClass REALISATION = eINSTANCE.getRealisation();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALISATION__CONDITION = eINSTANCE.getRealisation_Condition();

		/**
		 * The meta object literal for the '<em><b>Targets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALISATION__TARGETS = eINSTANCE.getRealisation_Targets();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.ConditionImpl
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.OrImpl <em>Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.OrImpl
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getOr()
		 * @generated
		 */
		EClass OR = eINSTANCE.getOr();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OR__LEFT = eINSTANCE.getOr_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OR__RIGHT = eINSTANCE.getOr_Right();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.AndImpl <em>And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.AndImpl
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getAnd()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAnd();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AND__LEFT = eINSTANCE.getAnd_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AND__RIGHT = eINSTANCE.getAnd_Right();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.NotImpl <em>Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.NotImpl
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getNot()
		 * @generated
		 */
		EClass NOT = eINSTANCE.getNot();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT__CONTENT = eINSTANCE.getNot_Content();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.FeatureRefImpl <em>Feature Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.FeatureRefImpl
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getFeatureRef()
		 * @generated
		 */
		EClass FEATURE_REF = eINSTANCE.getFeatureRef();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_REF__REF = eINSTANCE.getFeatureRef_Ref();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.ReuseImpl <em>Reuse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.ReuseImpl
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getReuse()
		 * @generated
		 */
		EClass REUSE = eINSTANCE.getReuse();

		/**
		 * The meta object literal for the '<em><b>Languageconcern</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REUSE__LANGUAGECONCERN = eINSTANCE.getReuse_Languageconcern();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REUSE__FEATURES = eINSTANCE.getReuse_Features();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.ReuseFeatureImpl <em>Reuse Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.ReuseFeatureImpl
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getReuseFeature()
		 * @generated
		 */
		EClass REUSE_FEATURE = eINSTANCE.getReuseFeature();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REUSE_FEATURE__REF = eINSTANCE.getReuseFeature_Ref();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.ReferenceReuseFeatureImpl <em>Reference Reuse Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.ReferenceReuseFeatureImpl
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getReferenceReuseFeature()
		 * @generated
		 */
		EClass REFERENCE_REUSE_FEATURE = eINSTANCE.getReferenceReuseFeature();

		/**
		 * The meta object literal for the '<em><b>Unselected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_REUSE_FEATURE__UNSELECTED = eINSTANCE.getReferenceReuseFeature_Unselected();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.TaggedReuseFeatureImpl <em>Tagged Reuse Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.TaggedReuseFeatureImpl
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getTaggedReuseFeature()
		 * @generated
		 */
		EClass TAGGED_REUSE_FEATURE = eINSTANCE.getTaggedReuseFeature();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.TaggedElementImpl <em>Tagged Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.TaggedElementImpl
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getTaggedElement()
		 * @generated
		 */
		EClass TAGGED_ELEMENT = eINSTANCE.getTaggedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAGGED_ELEMENT__NAME = eINSTANCE.getTaggedElement_Name();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melange.metamodel.melange.ResourceType <em>Resource Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melange.metamodel.melange.ResourceType
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getResourceType()
		 * @generated
		 */
		EEnum RESOURCE_TYPE = eINSTANCE.getResourceType();

	}

} //MelangePackage
