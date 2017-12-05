/**
 */
package fr.inria.diverse.melange.metamodel.melange.impl;

import fr.inria.diverse.melange.metamodel.melange.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MelangeFactoryImpl extends EFactoryImpl implements MelangeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MelangeFactory init() {
		try {
			MelangeFactory theMelangeFactory = (MelangeFactory)EPackage.Registry.INSTANCE.getEFactory(MelangePackage.eNS_URI);
			if (theMelangeFactory != null) {
				return theMelangeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MelangeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MelangeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MelangePackage.MODEL_TYPING_SPACE: return createModelTypingSpace();
			case MelangePackage.METAMODEL: return createMetamodel();
			case MelangePackage.MODEL_TYPE: return createModelType();
			case MelangePackage.ASPECT: return createAspect();
			case MelangePackage.INHERITANCE: return createInheritance();
			case MelangePackage.SUBTYPING: return createSubtyping();
			case MelangePackage.XBASE_TRANSFORMATION: return createXbaseTransformation();
			case MelangePackage.MAPPING: return createMapping();
			case MelangePackage.CLASS_BINDING: return createClassBinding();
			case MelangePackage.PROPERTY_BINDING: return createPropertyBinding();
			case MelangePackage.LANGUAGE_OPERATOR: return createLanguageOperator();
			case MelangePackage.IMPORT: return createImport();
			case MelangePackage.MERGE: return createMerge();
			case MelangePackage.SLICE: return createSlice();
			case MelangePackage.PACKAGE_BINDING: return createPackageBinding();
			case MelangePackage.LANGUAGE: return createLanguage();
			case MelangePackage.WEAVE: return createWeave();
			case MelangePackage.EXTERNAL_LANGUAGE: return createExternalLanguage();
			case MelangePackage.ANNOTATION: return createAnnotation();
			case MelangePackage.IMPORT_DSL: return createImportDsl();
			case MelangePackage.LANGUAGE_CONCERN: return createLanguageConcern();
			case MelangePackage.VARIABILITY: return createVariability();
			case MelangePackage.FEATURE: return createFeature();
			case MelangePackage.ONE_OF: return createOneOf();
			case MelangePackage.SOME_OF: return createSomeOf();
			case MelangePackage.TAGGED_OPERATOR: return createTaggedOperator();
			case MelangePackage.REALISATION: return createRealisation();
			case MelangePackage.OR: return createOr();
			case MelangePackage.AND: return createAnd();
			case MelangePackage.NOT: return createNot();
			case MelangePackage.FEATURE_REF: return createFeatureRef();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MelangePackage.RESOURCE_TYPE:
				return createResourceTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MelangePackage.RESOURCE_TYPE:
				return convertResourceTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelTypingSpace createModelTypingSpace() {
		ModelTypingSpaceImpl modelTypingSpace = new ModelTypingSpaceImpl();
		return modelTypingSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metamodel createMetamodel() {
		MetamodelImpl metamodel = new MetamodelImpl();
		return metamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelType createModelType() {
		ModelTypeImpl modelType = new ModelTypeImpl();
		return modelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aspect createAspect() {
		AspectImpl aspect = new AspectImpl();
		return aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inheritance createInheritance() {
		InheritanceImpl inheritance = new InheritanceImpl();
		return inheritance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subtyping createSubtyping() {
		SubtypingImpl subtyping = new SubtypingImpl();
		return subtyping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XbaseTransformation createXbaseTransformation() {
		XbaseTransformationImpl xbaseTransformation = new XbaseTransformationImpl();
		return xbaseTransformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mapping createMapping() {
		MappingImpl mapping = new MappingImpl();
		return mapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassBinding createClassBinding() {
		ClassBindingImpl classBinding = new ClassBindingImpl();
		return classBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyBinding createPropertyBinding() {
		PropertyBindingImpl propertyBinding = new PropertyBindingImpl();
		return propertyBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageOperator createLanguageOperator() {
		LanguageOperatorImpl languageOperator = new LanguageOperatorImpl();
		return languageOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Import createImport() {
		ImportImpl import_ = new ImportImpl();
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Merge createMerge() {
		MergeImpl merge = new MergeImpl();
		return merge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Slice createSlice() {
		SliceImpl slice = new SliceImpl();
		return slice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageBinding createPackageBinding() {
		PackageBindingImpl packageBinding = new PackageBindingImpl();
		return packageBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Language createLanguage() {
		LanguageImpl language = new LanguageImpl();
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Weave createWeave() {
		WeaveImpl weave = new WeaveImpl();
		return weave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalLanguage createExternalLanguage() {
		ExternalLanguageImpl externalLanguage = new ExternalLanguageImpl();
		return externalLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportDsl createImportDsl() {
		ImportDslImpl importDsl = new ImportDslImpl();
		return importDsl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageConcern createLanguageConcern() {
		LanguageConcernImpl languageConcern = new LanguageConcernImpl();
		return languageConcern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variability createVariability() {
		VariabilityImpl variability = new VariabilityImpl();
		return variability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature createFeature() {
		FeatureImpl feature = new FeatureImpl();
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OneOf createOneOf() {
		OneOfImpl oneOf = new OneOfImpl();
		return oneOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SomeOf createSomeOf() {
		SomeOfImpl someOf = new SomeOfImpl();
		return someOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaggedOperator createTaggedOperator() {
		TaggedOperatorImpl taggedOperator = new TaggedOperatorImpl();
		return taggedOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Realisation createRealisation() {
		RealisationImpl realisation = new RealisationImpl();
		return realisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Or createOr() {
		OrImpl or = new OrImpl();
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public And createAnd() {
		AndImpl and = new AndImpl();
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Not createNot() {
		NotImpl not = new NotImpl();
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureRef createFeatureRef() {
		FeatureRefImpl featureRef = new FeatureRefImpl();
		return featureRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceType createResourceTypeFromString(EDataType eDataType, String initialValue) {
		ResourceType result = ResourceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResourceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MelangePackage getMelangePackage() {
		return (MelangePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MelangePackage getPackage() {
		return MelangePackage.eINSTANCE;
	}

} //MelangeFactoryImpl
