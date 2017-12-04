/*
 * generated by Xtext
 */
package fr.inria.diverse.melange.serializer;

import com.google.inject.Inject;
import fr.inria.diverse.melange.metamodel.melange.Annotation;
import fr.inria.diverse.melange.metamodel.melange.ClassBinding;
import fr.inria.diverse.melange.metamodel.melange.ExternalLanguage;
import fr.inria.diverse.melange.metamodel.melange.Feature;
import fr.inria.diverse.melange.metamodel.melange.Import;
import fr.inria.diverse.melange.metamodel.melange.ImportDsl;
import fr.inria.diverse.melange.metamodel.melange.Inheritance;
import fr.inria.diverse.melange.metamodel.melange.Language;
import fr.inria.diverse.melange.metamodel.melange.LanguageConcern;
import fr.inria.diverse.melange.metamodel.melange.Mapping;
import fr.inria.diverse.melange.metamodel.melange.MelangePackage;
import fr.inria.diverse.melange.metamodel.melange.Merge;
import fr.inria.diverse.melange.metamodel.melange.ModelType;
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace;
import fr.inria.diverse.melange.metamodel.melange.OneOf;
import fr.inria.diverse.melange.metamodel.melange.PackageBinding;
import fr.inria.diverse.melange.metamodel.melange.PropertyBinding;
import fr.inria.diverse.melange.metamodel.melange.Slice;
import fr.inria.diverse.melange.metamodel.melange.SomeOf;
import fr.inria.diverse.melange.metamodel.melange.TaggedOperator;
import fr.inria.diverse.melange.metamodel.melange.Weave;
import fr.inria.diverse.melange.metamodel.melange.XbaseTransformation;
import fr.inria.diverse.melange.services.MelangeGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericArrayTypeReference;
import org.eclipse.xtext.common.types.JvmInnerTypeReference;
import org.eclipse.xtext.common.types.JvmLowerBound;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmTypeParameter;
import org.eclipse.xtext.common.types.JvmUpperBound;
import org.eclipse.xtext.common.types.JvmWildcardTypeReference;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.eclipse.xtext.xbase.XAssignment;
import org.eclipse.xtext.xbase.XBasicForLoopExpression;
import org.eclipse.xtext.xbase.XBinaryOperation;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XBooleanLiteral;
import org.eclipse.xtext.xbase.XCasePart;
import org.eclipse.xtext.xbase.XCastedExpression;
import org.eclipse.xtext.xbase.XCatchClause;
import org.eclipse.xtext.xbase.XClosure;
import org.eclipse.xtext.xbase.XConstructorCall;
import org.eclipse.xtext.xbase.XDoWhileExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XForLoopExpression;
import org.eclipse.xtext.xbase.XIfExpression;
import org.eclipse.xtext.xbase.XInstanceOfExpression;
import org.eclipse.xtext.xbase.XListLiteral;
import org.eclipse.xtext.xbase.XMemberFeatureCall;
import org.eclipse.xtext.xbase.XNullLiteral;
import org.eclipse.xtext.xbase.XNumberLiteral;
import org.eclipse.xtext.xbase.XPostfixOperation;
import org.eclipse.xtext.xbase.XReturnExpression;
import org.eclipse.xtext.xbase.XSetLiteral;
import org.eclipse.xtext.xbase.XStringLiteral;
import org.eclipse.xtext.xbase.XSwitchExpression;
import org.eclipse.xtext.xbase.XSynchronizedExpression;
import org.eclipse.xtext.xbase.XThrowExpression;
import org.eclipse.xtext.xbase.XTryCatchFinallyExpression;
import org.eclipse.xtext.xbase.XTypeLiteral;
import org.eclipse.xtext.xbase.XUnaryOperation;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.XWhileExpression;
import org.eclipse.xtext.xbase.XbasePackage;
import org.eclipse.xtext.xbase.serializer.XbaseSemanticSequencer;
import org.eclipse.xtext.xtype.XFunctionTypeRef;
import org.eclipse.xtext.xtype.XImportDeclaration;
import org.eclipse.xtext.xtype.XImportSection;
import org.eclipse.xtext.xtype.XtypePackage;

@SuppressWarnings("all")
public class MelangeSemanticSequencer extends XbaseSemanticSequencer {

	@Inject
	private MelangeGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MelangePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MelangePackage.ANNOTATION:
				sequence_Annotation(context, (Annotation) semanticObject); 
				return; 
			case MelangePackage.CLASS_BINDING:
				sequence_ClassMapping(context, (ClassBinding) semanticObject); 
				return; 
			case MelangePackage.EXTERNAL_LANGUAGE:
				sequence_ExternalLanguage(context, (ExternalLanguage) semanticObject); 
				return; 
			case MelangePackage.FEATURE:
				sequence_Feature(context, (Feature) semanticObject); 
				return; 
			case MelangePackage.IMPORT:
				if (rule == grammarAccess.getExternalImportRule()) {
					sequence_ExternalImport(context, (Import) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getOperatorRule()
						|| rule == grammarAccess.getImportRule()) {
					sequence_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case MelangePackage.IMPORT_DSL:
				sequence_ImportDsl(context, (ImportDsl) semanticObject); 
				return; 
			case MelangePackage.INHERITANCE:
				sequence_Inherit(context, (Inheritance) semanticObject); 
				return; 
			case MelangePackage.LANGUAGE:
				sequence_Language(context, (Language) semanticObject); 
				return; 
			case MelangePackage.LANGUAGE_CONCERN:
				sequence_LanguageConcern(context, (LanguageConcern) semanticObject); 
				return; 
			case MelangePackage.MAPPING:
				sequence_Mapping(context, (Mapping) semanticObject); 
				return; 
			case MelangePackage.MERGE:
				sequence_Merge(context, (Merge) semanticObject); 
				return; 
			case MelangePackage.MODEL_TYPE:
				sequence_EcoreModelType(context, (ModelType) semanticObject); 
				return; 
			case MelangePackage.MODEL_TYPING_SPACE:
				sequence_ModelTypingSpace(context, (ModelTypingSpace) semanticObject); 
				return; 
			case MelangePackage.ONE_OF:
				sequence_OneOf(context, (OneOf) semanticObject); 
				return; 
			case MelangePackage.PACKAGE_BINDING:
				sequence_PackageMapping(context, (PackageBinding) semanticObject); 
				return; 
			case MelangePackage.PROPERTY_BINDING:
				sequence_PropertyMapping(context, (PropertyBinding) semanticObject); 
				return; 
			case MelangePackage.SLICE:
				sequence_Slice(context, (Slice) semanticObject); 
				return; 
			case MelangePackage.SOME_OF:
				sequence_SomeOf(context, (SomeOf) semanticObject); 
				return; 
			case MelangePackage.TAGGED_OPERATOR:
				sequence_TaggedOperator(context, (TaggedOperator) semanticObject); 
				return; 
			case MelangePackage.WEAVE:
				if (rule == grammarAccess.getOperatorRule()
						|| rule == grammarAccess.getWeaveRule()) {
					sequence_AspectTypeRef_AspectWildcard(context, (Weave) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getAspectTypeRefRule()) {
					sequence_AspectTypeRef(context, (Weave) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getAspectWildcardRule()) {
					sequence_AspectWildcard(context, (Weave) semanticObject); 
					return; 
				}
				else break;
			case MelangePackage.XBASE_TRANSFORMATION:
				sequence_XbaseTransformation(context, (XbaseTransformation) semanticObject); 
				return; 
			}
		else if (epackage == TypesPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case TypesPackage.JVM_FORMAL_PARAMETER:
				if (rule == grammarAccess.getFullJvmFormalParameterRule()) {
					sequence_FullJvmFormalParameter(context, (JvmFormalParameter) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getJvmFormalParameterRule()) {
					sequence_JvmFormalParameter(context, (JvmFormalParameter) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_GENERIC_ARRAY_TYPE_REFERENCE:
				sequence_JvmTypeReference(context, (JvmGenericArrayTypeReference) semanticObject); 
				return; 
			case TypesPackage.JVM_INNER_TYPE_REFERENCE:
				sequence_JvmParameterizedTypeReference(context, (JvmInnerTypeReference) semanticObject); 
				return; 
			case TypesPackage.JVM_LOWER_BOUND:
				if (rule == grammarAccess.getJvmLowerBoundAndedRule()) {
					sequence_JvmLowerBoundAnded(context, (JvmLowerBound) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getJvmLowerBoundRule()) {
					sequence_JvmLowerBound(context, (JvmLowerBound) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_PARAMETERIZED_TYPE_REFERENCE:
				if (action == grammarAccess.getJvmParameterizedTypeReferenceAccess().getJvmInnerTypeReferenceOuterAction_1_4_0_0_0()) {
					sequence_JvmParameterizedTypeReference_JvmInnerTypeReference_1_4_0_0_0(context, (JvmParameterizedTypeReference) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getJvmTypeReferenceRule()
						|| action == grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0()
						|| rule == grammarAccess.getJvmParameterizedTypeReferenceRule()
						|| rule == grammarAccess.getJvmArgumentTypeReferenceRule()) {
					sequence_JvmParameterizedTypeReference(context, (JvmParameterizedTypeReference) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_TYPE_PARAMETER:
				sequence_JvmTypeParameter(context, (JvmTypeParameter) semanticObject); 
				return; 
			case TypesPackage.JVM_UPPER_BOUND:
				if (rule == grammarAccess.getJvmUpperBoundAndedRule()) {
					sequence_JvmUpperBoundAnded(context, (JvmUpperBound) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getJvmUpperBoundRule()) {
					sequence_JvmUpperBound(context, (JvmUpperBound) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_WILDCARD_TYPE_REFERENCE:
				sequence_JvmWildcardTypeReference(context, (JvmWildcardTypeReference) semanticObject); 
				return; 
			}
		else if (epackage == XbasePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case XbasePackage.XASSIGNMENT:
				sequence_XAssignment_XMemberFeatureCall(context, (XAssignment) semanticObject); 
				return; 
			case XbasePackage.XBASIC_FOR_LOOP_EXPRESSION:
				sequence_XBasicForLoopExpression(context, (XBasicForLoopExpression) semanticObject); 
				return; 
			case XbasePackage.XBINARY_OPERATION:
				sequence_XAdditiveExpression_XAndExpression_XAssignment_XEqualityExpression_XMultiplicativeExpression_XOrExpression_XOtherOperatorExpression_XRelationalExpression(context, (XBinaryOperation) semanticObject); 
				return; 
			case XbasePackage.XBLOCK_EXPRESSION:
				if (rule == grammarAccess.getXExpressionRule()
						|| rule == grammarAccess.getXAssignmentRule()
						|| action == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0()
						|| rule == grammarAccess.getXOrExpressionRule()
						|| action == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXAndExpressionRule()
						|| action == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXEqualityExpressionRule()
						|| action == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXRelationalExpressionRule()
						|| action == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0()
						|| action == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0()
						|| rule == grammarAccess.getXOtherOperatorExpressionRule()
						|| action == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXAdditiveExpressionRule()
						|| action == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXMultiplicativeExpressionRule()
						|| action == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXUnaryOperationRule()
						|| rule == grammarAccess.getXCastedExpressionRule()
						|| action == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0()
						|| rule == grammarAccess.getXPostfixOperationRule()
						|| action == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0()
						|| rule == grammarAccess.getXMemberFeatureCallRule()
						|| action == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0()
						|| action == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0()
						|| rule == grammarAccess.getXPrimaryExpressionRule()
						|| rule == grammarAccess.getXParenthesizedExpressionRule()
						|| rule == grammarAccess.getXBlockExpressionRule()
						|| rule == grammarAccess.getXExpressionOrVarDeclarationRule()) {
					sequence_XBlockExpression(context, (XBlockExpression) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getXExpressionInClosureRule()) {
					sequence_XExpressionInClosure(context, (XBlockExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XBOOLEAN_LITERAL:
				sequence_XBooleanLiteral(context, (XBooleanLiteral) semanticObject); 
				return; 
			case XbasePackage.XCASE_PART:
				sequence_XCasePart(context, (XCasePart) semanticObject); 
				return; 
			case XbasePackage.XCASTED_EXPRESSION:
				sequence_XCastedExpression(context, (XCastedExpression) semanticObject); 
				return; 
			case XbasePackage.XCATCH_CLAUSE:
				sequence_XCatchClause(context, (XCatchClause) semanticObject); 
				return; 
			case XbasePackage.XCLOSURE:
				if (rule == grammarAccess.getXExpressionRule()
						|| rule == grammarAccess.getXAssignmentRule()
						|| action == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0()
						|| rule == grammarAccess.getXOrExpressionRule()
						|| action == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXAndExpressionRule()
						|| action == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXEqualityExpressionRule()
						|| action == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXRelationalExpressionRule()
						|| action == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0()
						|| action == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0()
						|| rule == grammarAccess.getXOtherOperatorExpressionRule()
						|| action == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXAdditiveExpressionRule()
						|| action == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXMultiplicativeExpressionRule()
						|| action == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXUnaryOperationRule()
						|| rule == grammarAccess.getXCastedExpressionRule()
						|| action == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0()
						|| rule == grammarAccess.getXPostfixOperationRule()
						|| action == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0()
						|| rule == grammarAccess.getXMemberFeatureCallRule()
						|| action == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0()
						|| action == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0()
						|| rule == grammarAccess.getXPrimaryExpressionRule()
						|| rule == grammarAccess.getXLiteralRule()
						|| rule == grammarAccess.getXClosureRule()
						|| rule == grammarAccess.getXParenthesizedExpressionRule()
						|| rule == grammarAccess.getXExpressionOrVarDeclarationRule()) {
					sequence_XClosure(context, (XClosure) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getXShortClosureRule()) {
					sequence_XShortClosure(context, (XClosure) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XCONSTRUCTOR_CALL:
				sequence_XConstructorCall(context, (XConstructorCall) semanticObject); 
				return; 
			case XbasePackage.XDO_WHILE_EXPRESSION:
				sequence_XDoWhileExpression(context, (XDoWhileExpression) semanticObject); 
				return; 
			case XbasePackage.XFEATURE_CALL:
				sequence_XFeatureCall(context, (XFeatureCall) semanticObject); 
				return; 
			case XbasePackage.XFOR_LOOP_EXPRESSION:
				sequence_XForLoopExpression(context, (XForLoopExpression) semanticObject); 
				return; 
			case XbasePackage.XIF_EXPRESSION:
				sequence_XIfExpression(context, (XIfExpression) semanticObject); 
				return; 
			case XbasePackage.XINSTANCE_OF_EXPRESSION:
				sequence_XRelationalExpression(context, (XInstanceOfExpression) semanticObject); 
				return; 
			case XbasePackage.XLIST_LITERAL:
				sequence_XListLiteral(context, (XListLiteral) semanticObject); 
				return; 
			case XbasePackage.XMEMBER_FEATURE_CALL:
				sequence_XMemberFeatureCall(context, (XMemberFeatureCall) semanticObject); 
				return; 
			case XbasePackage.XNULL_LITERAL:
				sequence_XNullLiteral(context, (XNullLiteral) semanticObject); 
				return; 
			case XbasePackage.XNUMBER_LITERAL:
				sequence_XNumberLiteral(context, (XNumberLiteral) semanticObject); 
				return; 
			case XbasePackage.XPOSTFIX_OPERATION:
				sequence_XPostfixOperation(context, (XPostfixOperation) semanticObject); 
				return; 
			case XbasePackage.XRETURN_EXPRESSION:
				sequence_XReturnExpression(context, (XReturnExpression) semanticObject); 
				return; 
			case XbasePackage.XSET_LITERAL:
				sequence_XSetLiteral(context, (XSetLiteral) semanticObject); 
				return; 
			case XbasePackage.XSTRING_LITERAL:
				sequence_XStringLiteral(context, (XStringLiteral) semanticObject); 
				return; 
			case XbasePackage.XSWITCH_EXPRESSION:
				sequence_XSwitchExpression(context, (XSwitchExpression) semanticObject); 
				return; 
			case XbasePackage.XSYNCHRONIZED_EXPRESSION:
				sequence_XSynchronizedExpression(context, (XSynchronizedExpression) semanticObject); 
				return; 
			case XbasePackage.XTHROW_EXPRESSION:
				sequence_XThrowExpression(context, (XThrowExpression) semanticObject); 
				return; 
			case XbasePackage.XTRY_CATCH_FINALLY_EXPRESSION:
				sequence_XTryCatchFinallyExpression(context, (XTryCatchFinallyExpression) semanticObject); 
				return; 
			case XbasePackage.XTYPE_LITERAL:
				sequence_XTypeLiteral(context, (XTypeLiteral) semanticObject); 
				return; 
			case XbasePackage.XUNARY_OPERATION:
				sequence_XUnaryOperation(context, (XUnaryOperation) semanticObject); 
				return; 
			case XbasePackage.XVARIABLE_DECLARATION:
				sequence_XVariableDeclaration(context, (XVariableDeclaration) semanticObject); 
				return; 
			case XbasePackage.XWHILE_EXPRESSION:
				sequence_XWhileExpression(context, (XWhileExpression) semanticObject); 
				return; 
			}
		else if (epackage == XtypePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case XtypePackage.XFUNCTION_TYPE_REF:
				sequence_XFunctionTypeRef(context, (XFunctionTypeRef) semanticObject); 
				return; 
			case XtypePackage.XIMPORT_DECLARATION:
				sequence_XImportDeclaration(context, (XImportDeclaration) semanticObject); 
				return; 
			case XtypePackage.XIMPORT_SECTION:
				sequence_XImportSection(context, (XImportSection) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Annotation returns Annotation
	 *
	 * Constraint:
	 *     (key=STRING value=STRING)
	 */
	protected void sequence_Annotation(ISerializationContext context, Annotation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MelangePackage.Literals.ANNOTATION__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MelangePackage.Literals.ANNOTATION__KEY));
			if (transientValues.isValueTransient(semanticObject, MelangePackage.Literals.ANNOTATION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MelangePackage.Literals.ANNOTATION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAnnotationAccess().getKeySTRINGTerminalRuleCall_1_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getAnnotationAccess().getValueSTRINGTerminalRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Operator returns Weave
	 *     Weave returns Weave
	 *
	 * Constraint:
	 *     (aspectTypeRef=JvmTypeReference | aspectWildcardImport=QualifiedNameWithWildcard)
	 */
	protected void sequence_AspectTypeRef_AspectWildcard(ISerializationContext context, Weave semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AspectTypeRef returns Weave
	 *
	 * Constraint:
	 *     aspectTypeRef=JvmTypeReference
	 */
	protected void sequence_AspectTypeRef(ISerializationContext context, Weave semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MelangePackage.Literals.WEAVE__ASPECT_TYPE_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MelangePackage.Literals.WEAVE__ASPECT_TYPE_REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAspectTypeRefAccess().getAspectTypeRefJvmTypeReferenceParserRuleCall_1_0(), semanticObject.getAspectTypeRef());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AspectWildcard returns Weave
	 *
	 * Constraint:
	 *     aspectWildcardImport=QualifiedNameWithWildcard
	 */
	protected void sequence_AspectWildcard(ISerializationContext context, Weave semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MelangePackage.Literals.WEAVE__ASPECT_WILDCARD_IMPORT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MelangePackage.Literals.WEAVE__ASPECT_WILDCARD_IMPORT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAspectWildcardAccess().getAspectWildcardImportQualifiedNameWithWildcardParserRuleCall_1_0(), semanticObject.getAspectWildcardImport());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ClassMapping returns ClassBinding
	 *
	 * Constraint:
	 *     (from=STRING to=STRING properties+=PropertyMapping*)
	 */
	protected void sequence_ClassMapping(ISerializationContext context, ClassBinding semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns ModelType
	 *     EcoreModelType returns ModelType
	 *
	 * Constraint:
	 *     (mtUri=STRING? (name=ValidID ecoreUri=STRING)?)+
	 */
	protected void sequence_EcoreModelType(ISerializationContext context, ModelType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ExternalImport returns Import
	 *
	 * Constraint:
	 *     (ecoreUri=STRING (genmodelUris+=STRING genmodelUris+=STRING*)?)
	 */
	protected void sequence_ExternalImport(ISerializationContext context, Import semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns ExternalLanguage
	 *     ExternalLanguage returns ExternalLanguage
	 *
	 * Constraint:
	 *     (
	 *         (operators+=Weave | xmof=STRING | fileExtension=STRING)? 
	 *         (ecl+=STRING ecl+=STRING*)? 
	 *         (xtext+=STRING xtext+=STRING*)? 
	 *         (sirius+=STRING sirius+=STRING*)? 
	 *         (exactTypeName=ValidID exactTypeUri=STRING?)? 
	 *         (name=ValidID (implements+=[ModelType|QualifiedName] implements+=[ModelType|QualifiedName]*)? operators+=ExternalImport)?
	 *     )+
	 */
	protected void sequence_ExternalLanguage(ISerializationContext context, ExternalLanguage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Variability returns Feature
	 *     Feature returns Feature
	 *
	 * Constraint:
	 *     (optional?='?'? name=ID)
	 */
	protected void sequence_Feature(ISerializationContext context, Feature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns ImportDsl
	 *     ImportDsl returns ImportDsl
	 *
	 * Constraint:
	 *     dsl=[Dsl|QualifiedName]
	 */
	protected void sequence_ImportDsl(ISerializationContext context, ImportDsl semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MelangePackage.Literals.IMPORT_DSL__DSL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MelangePackage.Literals.IMPORT_DSL__DSL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImportDslAccess().getDslDslQualifiedNameParserRuleCall_1_0_1(), semanticObject.eGet(MelangePackage.Literals.IMPORT_DSL__DSL, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Operator returns Import
	 *     Import returns Import
	 *
	 * Constraint:
	 *     (ecoreUri=STRING (genmodelUris+=STRING genmodelUris+=STRING*)? mappingRules+=PackageMapping*)
	 */
	protected void sequence_Import(ISerializationContext context, Import semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Inherit returns Inheritance
	 *
	 * Constraint:
	 *     targetLanguage=[Language|QualifiedName]
	 */
	protected void sequence_Inherit(ISerializationContext context, Inheritance semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MelangePackage.Literals.LANGUAGE_OPERATOR__TARGET_LANGUAGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MelangePackage.Literals.LANGUAGE_OPERATOR__TARGET_LANGUAGE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getInheritAccess().getTargetLanguageLanguageQualifiedNameParserRuleCall_0_1(), semanticObject.eGet(MelangePackage.Literals.LANGUAGE_OPERATOR__TARGET_LANGUAGE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Element returns LanguageConcern
	 *     LanguageConcern returns LanguageConcern
	 *
	 * Constraint:
	 *     (name=ValidID vm=Variability operators+=TaggedOperator*)
	 */
	protected void sequence_LanguageConcern(ISerializationContext context, LanguageConcern semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns Language
	 *     Language returns Language
	 *
	 * Constraint:
	 *     (
	 *         (xmof=STRING | fileExtension=STRING | annotations+=Annotation)? 
	 *         (ecl+=STRING ecl+=STRING*)? 
	 *         (xtext+=STRING xtext+=STRING*)? 
	 *         (sirius+=STRING sirius+=STRING*)? 
	 *         (exactTypeName=ValidID exactTypeUri=STRING?)? 
	 *         (resourceType=ResourceType (resourceUri=STRING | xtextSetupRef=JvmTypeReference)?)? 
	 *         (
	 *             name=ValidID 
	 *             (operators+=Inherit operators+=Inherit*)? 
	 *             (implements+=[ModelType|QualifiedName] implements+=[ModelType|QualifiedName]*)? 
	 *             (requires+=[ModelType|QualifiedName] requires+=[ModelType|QualifiedName]*)? 
	 *             operators+=Operator*
	 *         )?
	 *     )+
	 */
	protected void sequence_Language(ISerializationContext context, Language semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns Mapping
	 *     Mapping returns Mapping
	 *
	 * Constraint:
	 *     (from=[Language|QualifiedName] to=[ModelType|QualifiedName] rules+=ClassMapping*)
	 */
	protected void sequence_Mapping(ISerializationContext context, Mapping semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Operator returns Merge
	 *     Merge returns Merge
	 *
	 * Constraint:
	 *     (targetLanguage=[Language|QualifiedName] mappingRules+=PackageMapping*)
	 */
	protected void sequence_Merge(ISerializationContext context, Merge semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ModelTypingSpace returns ModelTypingSpace
	 *
	 * Constraint:
	 *     (name=QualifiedName imports=XImportSection? elements+=Element*)
	 */
	protected void sequence_ModelTypingSpace(ISerializationContext context, ModelTypingSpace semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Variability returns OneOf
	 *     OneOf returns OneOf
	 *
	 * Constraint:
	 *     (optional?='?'? name=ID children+=Variability*)
	 */
	protected void sequence_OneOf(ISerializationContext context, OneOf semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PackageMapping returns PackageBinding
	 *
	 * Constraint:
	 *     (from=STRING to=STRING classes+=ClassMapping*)
	 */
	protected void sequence_PackageMapping(ISerializationContext context, PackageBinding semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PropertyMapping returns PropertyBinding
	 *
	 * Constraint:
	 *     (from=STRING to=STRING)
	 */
	protected void sequence_PropertyMapping(ISerializationContext context, PropertyBinding semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MelangePackage.Literals.PROPERTY_BINDING__FROM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MelangePackage.Literals.PROPERTY_BINDING__FROM));
			if (transientValues.isValueTransient(semanticObject, MelangePackage.Literals.PROPERTY_BINDING__TO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MelangePackage.Literals.PROPERTY_BINDING__TO));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPropertyMappingAccess().getFromSTRINGTerminalRuleCall_0_0(), semanticObject.getFrom());
		feeder.accept(grammarAccess.getPropertyMappingAccess().getToSTRINGTerminalRuleCall_2_0(), semanticObject.getTo());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Operator returns Slice
	 *     Slice returns Slice
	 *
	 * Constraint:
	 *     (targetLanguage=[Language|QualifiedName] roots+=STRING roots+=STRING* mappingRules+=PackageMapping*)
	 */
	protected void sequence_Slice(ISerializationContext context, Slice semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Variability returns SomeOf
	 *     SomeOf returns SomeOf
	 *
	 * Constraint:
	 *     (optional?='?'? name=ID children+=Variability*)
	 */
	protected void sequence_SomeOf(ISerializationContext context, SomeOf semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TaggedOperator returns TaggedOperator
	 *
	 * Constraint:
	 *     (tag=ID? operator=Operator)
	 */
	protected void sequence_TaggedOperator(ISerializationContext context, TaggedOperator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns XbaseTransformation
	 *     TransformationDecl returns XbaseTransformation
	 *     XbaseTransformation returns XbaseTransformation
	 *
	 * Constraint:
	 *     (
	 *         main?='@Main'? 
	 *         returnTypeRef=JvmTypeReference? 
	 *         name=ValidID 
	 *         (parameters+=FullJvmFormalParameter parameters+=FullJvmFormalParameter*)? 
	 *         body=XBlockExpression
	 *     )
	 */
	protected void sequence_XbaseTransformation(ISerializationContext context, XbaseTransformation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
