/**
 * <copyright>
 *
 * Copyright (c) 2010 E.D.Willink and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *
 * </copyright>
 *
 * $Id: OCLinEcoreParser.java,v 1.1 2010/04/13 06:41:30 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.oclinecore.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.eclipse.ocl.examples.xtext.oclinecore.services.OCLinEcoreGrammarAccess;

public class OCLinEcoreParser extends AbstractContentAssistParser {
	
	@Inject
	private OCLinEcoreGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.eclipse.ocl.examples.xtext.oclinecore.ui.contentassist.antlr.internal.InternalOCLinEcoreParser createParser() {
		org.eclipse.ocl.examples.xtext.oclinecore.ui.contentassist.antlr.internal.InternalOCLinEcoreParser result = new org.eclipse.ocl.examples.xtext.oclinecore.ui.contentassist.antlr.internal.InternalOCLinEcoreParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getUPPERAccess().getAlternatives(), "rule__UPPER__Alternatives");
					put(grammarAccess.getBodyConstraintCSAccess().getAlternatives_3(), "rule__BodyConstraintCS__Alternatives_3");
					put(grammarAccess.getDerivedConstraintCSAccess().getAlternatives_2(), "rule__DerivedConstraintCS__Alternatives_2");
					put(grammarAccess.getInitialConstraintCSAccess().getAlternatives_2(), "rule__InitialConstraintCS__Alternatives_2");
					put(grammarAccess.getInvariantConstraintCSAccess().getAlternatives_3(), "rule__InvariantConstraintCS__Alternatives_3");
					put(grammarAccess.getPostconditionConstraintCSAccess().getAlternatives_3(), "rule__PostconditionConstraintCS__Alternatives_3");
					put(grammarAccess.getPreconditionConstraintCSAccess().getAlternatives_3(), "rule__PreconditionConstraintCS__Alternatives_3");
					put(grammarAccess.getAnnotationCSAccess().getAlternatives_1(), "rule__AnnotationCS__Alternatives_1");
					put(grammarAccess.getAttributeCSAccess().getAlternatives_1(), "rule__AttributeCS__Alternatives_1");
					put(grammarAccess.getAttributeCSAccess().getAlternatives_4_2_1(), "rule__AttributeCS__Alternatives_4_2_1");
					put(grammarAccess.getAttributeCSAccess().getMultiplicityAlternatives_4_2_1_1_0(), "rule__AttributeCS__MultiplicityAlternatives_4_2_1_1_0");
					put(grammarAccess.getAttributeCSAccess().getAlternatives_6(), "rule__AttributeCS__Alternatives_6");
					put(grammarAccess.getAttributeCSAccess().getConstraintsAlternatives_6_0_1_0(), "rule__AttributeCS__ConstraintsAlternatives_6_0_1_0");
					put(grammarAccess.getClassCSAccess().getAlternatives_1(), "rule__ClassCS__Alternatives_1");
					put(grammarAccess.getClassCSAccess().getAlternatives_7(), "rule__ClassCS__Alternatives_7");
					put(grammarAccess.getClassCSAccess().getAlternatives_7_0_1(), "rule__ClassCS__Alternatives_7_0_1");
					put(grammarAccess.getClassRefAccess().getAlternatives(), "rule__ClassRef__Alternatives");
					put(grammarAccess.getClassifierCSAccess().getAlternatives(), "rule__ClassifierCS__Alternatives");
					put(grammarAccess.getDataTypeCSAccess().getAlternatives_1(), "rule__DataTypeCS__Alternatives_1");
					put(grammarAccess.getDataTypeCSAccess().getAlternatives_6(), "rule__DataTypeCS__Alternatives_6");
					put(grammarAccess.getDataTypeRefAccess().getAlternatives(), "rule__DataTypeRef__Alternatives");
					put(grammarAccess.getDetailCSAccess().getAlternatives_0(), "rule__DetailCS__Alternatives_0");
					put(grammarAccess.getEnumCSAccess().getAlternatives_5(), "rule__EnumCS__Alternatives_5");
					put(grammarAccess.getEnumCSAccess().getAlternatives_5_0_1(), "rule__EnumCS__Alternatives_5_0_1");
					put(grammarAccess.getOperationCSAccess().getAlternatives_1(), "rule__OperationCS__Alternatives_1");
					put(grammarAccess.getOperationCSAccess().getAlternatives_8_2_1(), "rule__OperationCS__Alternatives_8_2_1");
					put(grammarAccess.getOperationCSAccess().getMultiplicityAlternatives_8_2_1_1_0(), "rule__OperationCS__MultiplicityAlternatives_8_2_1_1_0");
					put(grammarAccess.getOperationCSAccess().getAlternatives_9(), "rule__OperationCS__Alternatives_9");
					put(grammarAccess.getOperationCSAccess().getConstraintsAlternatives_9_0_1_0(), "rule__OperationCS__ConstraintsAlternatives_9_0_1_0");
					put(grammarAccess.getPackageCSAccess().getAlternatives_4(), "rule__PackageCS__Alternatives_4");
					put(grammarAccess.getParameterCSAccess().getAlternatives_1(), "rule__ParameterCS__Alternatives_1");
					put(grammarAccess.getParameterCSAccess().getAlternatives_3_2_1(), "rule__ParameterCS__Alternatives_3_2_1");
					put(grammarAccess.getParameterCSAccess().getMultiplicityAlternatives_3_2_1_1_0(), "rule__ParameterCS__MultiplicityAlternatives_3_2_1_1_0");
					put(grammarAccess.getReferenceCSAccess().getAlternatives_1(), "rule__ReferenceCS__Alternatives_1");
					put(grammarAccess.getReferenceCSAccess().getAlternatives_2(), "rule__ReferenceCS__Alternatives_2");
					put(grammarAccess.getReferenceCSAccess().getAlternatives_5_2_1(), "rule__ReferenceCS__Alternatives_5_2_1");
					put(grammarAccess.getReferenceCSAccess().getMultiplicityAlternatives_5_2_1_1_0(), "rule__ReferenceCS__MultiplicityAlternatives_5_2_1_1_0");
					put(grammarAccess.getReferenceCSAccess().getAlternatives_7(), "rule__ReferenceCS__Alternatives_7");
					put(grammarAccess.getReferenceCSAccess().getConstraintsAlternatives_7_0_1_0(), "rule__ReferenceCS__ConstraintsAlternatives_7_0_1_0");
					put(grammarAccess.getReferenceRefAccess().getAlternatives(), "rule__ReferenceRef__Alternatives");
					put(grammarAccess.getStructuralFeatureCSAccess().getAlternatives(), "rule__StructuralFeatureCS__Alternatives");
					put(grammarAccess.getTypeParameterCSAccess().getAlternatives_1(), "rule__TypeParameterCS__Alternatives_1");
					put(grammarAccess.getTypeRefAccess().getAlternatives(), "rule__TypeRef__Alternatives");
					put(grammarAccess.getTypeRefCSAccess().getAlternatives(), "rule__TypeRefCS__Alternatives");
					put(grammarAccess.getWildcardTypeRefCSAccess().getAlternatives_2(), "rule__WildcardTypeRefCS__Alternatives_2");
					put(grammarAccess.getREAL_LITERALAccess().getAlternatives_1(), "rule__REAL_LITERAL__Alternatives_1");
					put(grammarAccess.getREAL_LITERALAccess().getAlternatives_1_1_1(), "rule__REAL_LITERAL__Alternatives_1_1_1");
					put(grammarAccess.getREAL_LITERALAccess().getAlternatives_1_1_2(), "rule__REAL_LITERAL__Alternatives_1_1_2");
					put(grammarAccess.getRestrictedKeywordCSAccess().getAlternatives(), "rule__RestrictedKeywordCS__Alternatives");
					put(grammarAccess.getUnreservedSimpleNameCSAccess().getAlternatives(), "rule__UnreservedSimpleNameCS__Alternatives");
					put(grammarAccess.getPrimitiveTypeCSAccess().getAlternatives(), "rule__PrimitiveTypeCS__Alternatives");
					put(grammarAccess.getCollectionTypeIdentifierCSAccess().getAlternatives(), "rule__CollectionTypeIdentifierCS__Alternatives");
					put(grammarAccess.getTypeCSAccess().getAlternatives(), "rule__TypeCS__Alternatives");
					put(grammarAccess.getLiteralExpCSAccess().getAlternatives(), "rule__LiteralExpCS__Alternatives");
					put(grammarAccess.getCollectionLiteralExpCSAccess().getAlternatives_0(), "rule__CollectionLiteralExpCS__Alternatives_0");
					put(grammarAccess.getPrimitiveLiteralExpCSAccess().getAlternatives(), "rule__PrimitiveLiteralExpCS__Alternatives");
					put(grammarAccess.getBooleanLiteralExpCSAccess().getAlternatives(), "rule__BooleanLiteralExpCS__Alternatives");
					put(grammarAccess.getTypeLiteralExpCSAccess().getAlternatives(), "rule__TypeLiteralExpCS__Alternatives");
					put(grammarAccess.getOclExpressionCSAccess().getAlternatives(), "rule__OclExpressionCS__Alternatives");
					put(grammarAccess.getImpliesCSAccess().getRightAlternatives_1_2_0(), "rule__ImpliesCS__RightAlternatives_1_2_0");
					put(grammarAccess.getXorCSAccess().getRightAlternatives_1_2_0(), "rule__XorCS__RightAlternatives_1_2_0");
					put(grammarAccess.getOrCSAccess().getRightAlternatives_1_2_0(), "rule__OrCS__RightAlternatives_1_2_0");
					put(grammarAccess.getAndCSAccess().getRightAlternatives_1_2_0(), "rule__AndCS__RightAlternatives_1_2_0");
					put(grammarAccess.getEqualityCSAccess().getOpAlternatives_1_1_0(), "rule__EqualityCS__OpAlternatives_1_1_0");
					put(grammarAccess.getEqualityCSAccess().getRightAlternatives_1_2_0(), "rule__EqualityCS__RightAlternatives_1_2_0");
					put(grammarAccess.getRelationalCSAccess().getOpAlternatives_1_1_0(), "rule__RelationalCS__OpAlternatives_1_1_0");
					put(grammarAccess.getRelationalCSAccess().getRightAlternatives_1_2_0(), "rule__RelationalCS__RightAlternatives_1_2_0");
					put(grammarAccess.getAdditiveCSAccess().getOpAlternatives_1_1_0(), "rule__AdditiveCS__OpAlternatives_1_1_0");
					put(grammarAccess.getAdditiveCSAccess().getRightAlternatives_1_2_0(), "rule__AdditiveCS__RightAlternatives_1_2_0");
					put(grammarAccess.getMultiplicativeCSAccess().getOpAlternatives_1_1_0(), "rule__MultiplicativeCS__OpAlternatives_1_1_0");
					put(grammarAccess.getMultiplicativeCSAccess().getRightAlternatives_1_2_0(), "rule__MultiplicativeCS__RightAlternatives_1_2_0");
					put(grammarAccess.getUnaryCSAccess().getAlternatives(), "rule__UnaryCS__Alternatives");
					put(grammarAccess.getUnaryCSAccess().getOpAlternatives_1_1_0(), "rule__UnaryCS__OpAlternatives_1_1_0");
					put(grammarAccess.getCallArgumentsCSAccess().getAlternatives(), "rule__CallArgumentsCS__Alternatives");
					put(grammarAccess.getCallArgumentsCSAccess().getAlternatives_0_4(), "rule__CallArgumentsCS__Alternatives_0_4");
					put(grammarAccess.getCallArgumentsCSAccess().getAlternatives_0_4_0_1(), "rule__CallArgumentsCS__Alternatives_0_4_0_1");
					put(grammarAccess.getPrimaryExpCSAccess().getAlternatives(), "rule__PrimaryExpCS__Alternatives");
					put(grammarAccess.getDocumentCSAccess().getGroup(), "rule__DocumentCS__Group__0");
					put(grammarAccess.getFQNAccess().getGroup(), "rule__FQN__Group__0");
					put(grammarAccess.getFQNAccess().getGroup_1(), "rule__FQN__Group_1__0");
					put(grammarAccess.getBodyConstraintCSAccess().getGroup(), "rule__BodyConstraintCS__Group__0");
					put(grammarAccess.getDerivedConstraintCSAccess().getGroup(), "rule__DerivedConstraintCS__Group__0");
					put(grammarAccess.getInitialConstraintCSAccess().getGroup(), "rule__InitialConstraintCS__Group__0");
					put(grammarAccess.getInvariantConstraintCSAccess().getGroup(), "rule__InvariantConstraintCS__Group__0");
					put(grammarAccess.getPostconditionConstraintCSAccess().getGroup(), "rule__PostconditionConstraintCS__Group__0");
					put(grammarAccess.getPreconditionConstraintCSAccess().getGroup(), "rule__PreconditionConstraintCS__Group__0");
					put(grammarAccess.getAnnotationCSAccess().getGroup(), "rule__AnnotationCS__Group__0");
					put(grammarAccess.getAnnotationCSAccess().getGroup_2(), "rule__AnnotationCS__Group_2__0");
					put(grammarAccess.getAnnotationCSAccess().getGroup_2_2(), "rule__AnnotationCS__Group_2_2__0");
					put(grammarAccess.getAttributeCSAccess().getGroup(), "rule__AttributeCS__Group__0");
					put(grammarAccess.getAttributeCSAccess().getGroup_4(), "rule__AttributeCS__Group_4__0");
					put(grammarAccess.getAttributeCSAccess().getGroup_4_2(), "rule__AttributeCS__Group_4_2__0");
					put(grammarAccess.getAttributeCSAccess().getGroup_4_2_1_0(), "rule__AttributeCS__Group_4_2_1_0__0");
					put(grammarAccess.getAttributeCSAccess().getGroup_4_2_1_0_1(), "rule__AttributeCS__Group_4_2_1_0_1__0");
					put(grammarAccess.getAttributeCSAccess().getGroup_5(), "rule__AttributeCS__Group_5__0");
					put(grammarAccess.getAttributeCSAccess().getGroup_6_0(), "rule__AttributeCS__Group_6_0__0");
					put(grammarAccess.getClassCSAccess().getGroup(), "rule__ClassCS__Group__0");
					put(grammarAccess.getClassCSAccess().getGroup_4(), "rule__ClassCS__Group_4__0");
					put(grammarAccess.getClassCSAccess().getGroup_4_2(), "rule__ClassCS__Group_4_2__0");
					put(grammarAccess.getClassCSAccess().getGroup_5(), "rule__ClassCS__Group_5__0");
					put(grammarAccess.getClassCSAccess().getGroup_5_2(), "rule__ClassCS__Group_5_2__0");
					put(grammarAccess.getClassCSAccess().getGroup_6(), "rule__ClassCS__Group_6__0");
					put(grammarAccess.getClassCSAccess().getGroup_7_0(), "rule__ClassCS__Group_7_0__0");
					put(grammarAccess.getDataTypeCSAccess().getGroup(), "rule__DataTypeCS__Group__0");
					put(grammarAccess.getDataTypeCSAccess().getGroup_4(), "rule__DataTypeCS__Group_4__0");
					put(grammarAccess.getDataTypeCSAccess().getGroup_4_2(), "rule__DataTypeCS__Group_4_2__0");
					put(grammarAccess.getDataTypeCSAccess().getGroup_5(), "rule__DataTypeCS__Group_5__0");
					put(grammarAccess.getDataTypeCSAccess().getGroup_6_0(), "rule__DataTypeCS__Group_6_0__0");
					put(grammarAccess.getDetailCSAccess().getGroup(), "rule__DetailCS__Group__0");
					put(grammarAccess.getEClassifierCSRefAccess().getGroup(), "rule__EClassifierCSRef__Group__0");
					put(grammarAccess.getEnumCSAccess().getGroup(), "rule__EnumCS__Group__0");
					put(grammarAccess.getEnumCSAccess().getGroup_3(), "rule__EnumCS__Group_3__0");
					put(grammarAccess.getEnumCSAccess().getGroup_3_2(), "rule__EnumCS__Group_3_2__0");
					put(grammarAccess.getEnumCSAccess().getGroup_4(), "rule__EnumCS__Group_4__0");
					put(grammarAccess.getEnumCSAccess().getGroup_5_0(), "rule__EnumCS__Group_5_0__0");
					put(grammarAccess.getEnumLiteralCSAccess().getGroup(), "rule__EnumLiteralCS__Group__0");
					put(grammarAccess.getEnumLiteralCSAccess().getGroup_2(), "rule__EnumLiteralCS__Group_2__0");
					put(grammarAccess.getImportCSAccess().getGroup(), "rule__ImportCS__Group__0");
					put(grammarAccess.getImportCSAccess().getGroup_1(), "rule__ImportCS__Group_1__0");
					put(grammarAccess.getOperationCSAccess().getGroup(), "rule__OperationCS__Group__0");
					put(grammarAccess.getOperationCSAccess().getGroup_4(), "rule__OperationCS__Group_4__0");
					put(grammarAccess.getOperationCSAccess().getGroup_4_2(), "rule__OperationCS__Group_4_2__0");
					put(grammarAccess.getOperationCSAccess().getGroup_6(), "rule__OperationCS__Group_6__0");
					put(grammarAccess.getOperationCSAccess().getGroup_6_1(), "rule__OperationCS__Group_6_1__0");
					put(grammarAccess.getOperationCSAccess().getGroup_8(), "rule__OperationCS__Group_8__0");
					put(grammarAccess.getOperationCSAccess().getGroup_8_2(), "rule__OperationCS__Group_8_2__0");
					put(grammarAccess.getOperationCSAccess().getGroup_8_2_1_0(), "rule__OperationCS__Group_8_2_1_0__0");
					put(grammarAccess.getOperationCSAccess().getGroup_8_2_1_0_1(), "rule__OperationCS__Group_8_2_1_0_1__0");
					put(grammarAccess.getOperationCSAccess().getGroup_9_0(), "rule__OperationCS__Group_9_0__0");
					put(grammarAccess.getPackageCSAccess().getGroup(), "rule__PackageCS__Group__0");
					put(grammarAccess.getParameterCSAccess().getGroup(), "rule__ParameterCS__Group__0");
					put(grammarAccess.getParameterCSAccess().getGroup_3(), "rule__ParameterCS__Group_3__0");
					put(grammarAccess.getParameterCSAccess().getGroup_3_2(), "rule__ParameterCS__Group_3_2__0");
					put(grammarAccess.getParameterCSAccess().getGroup_3_2_1_0(), "rule__ParameterCS__Group_3_2_1_0__0");
					put(grammarAccess.getParameterCSAccess().getGroup_3_2_1_0_1(), "rule__ParameterCS__Group_3_2_1_0_1__0");
					put(grammarAccess.getReferenceCSAccess().getGroup(), "rule__ReferenceCS__Group__0");
					put(grammarAccess.getReferenceCSAccess().getGroup_4(), "rule__ReferenceCS__Group_4__0");
					put(grammarAccess.getReferenceCSAccess().getGroup_5(), "rule__ReferenceCS__Group_5__0");
					put(grammarAccess.getReferenceCSAccess().getGroup_5_2(), "rule__ReferenceCS__Group_5_2__0");
					put(grammarAccess.getReferenceCSAccess().getGroup_5_2_1_0(), "rule__ReferenceCS__Group_5_2_1_0__0");
					put(grammarAccess.getReferenceCSAccess().getGroup_5_2_1_0_1(), "rule__ReferenceCS__Group_5_2_1_0_1__0");
					put(grammarAccess.getReferenceCSAccess().getGroup_6(), "rule__ReferenceCS__Group_6__0");
					put(grammarAccess.getReferenceCSAccess().getGroup_7_0(), "rule__ReferenceCS__Group_7_0__0");
					put(grammarAccess.getTypeParameterCSAccess().getGroup(), "rule__TypeParameterCS__Group__0");
					put(grammarAccess.getTypeParameterCSAccess().getGroup_1_0(), "rule__TypeParameterCS__Group_1_0__0");
					put(grammarAccess.getTypeParameterCSAccess().getGroup_1_0_2(), "rule__TypeParameterCS__Group_1_0_2__0");
					put(grammarAccess.getTypeParameterCSAccess().getGroup_1_1(), "rule__TypeParameterCS__Group_1_1__0");
					put(grammarAccess.getTypedTypeRefCSAccess().getGroup(), "rule__TypedTypeRefCS__Group__0");
					put(grammarAccess.getTypedTypeRefCSAccess().getGroup_1(), "rule__TypedTypeRefCS__Group_1__0");
					put(grammarAccess.getTypedTypeRefCSAccess().getGroup_1_2(), "rule__TypedTypeRefCS__Group_1_2__0");
					put(grammarAccess.getWildcardTypeRefCSAccess().getGroup(), "rule__WildcardTypeRefCS__Group__0");
					put(grammarAccess.getWildcardTypeRefCSAccess().getGroup_2_0(), "rule__WildcardTypeRefCS__Group_2_0__0");
					put(grammarAccess.getWildcardTypeRefCSAccess().getGroup_2_1(), "rule__WildcardTypeRefCS__Group_2_1__0");
					put(grammarAccess.getREAL_LITERALAccess().getGroup(), "rule__REAL_LITERAL__Group__0");
					put(grammarAccess.getREAL_LITERALAccess().getGroup_1_0(), "rule__REAL_LITERAL__Group_1_0__0");
					put(grammarAccess.getREAL_LITERALAccess().getGroup_1_1(), "rule__REAL_LITERAL__Group_1_1__0");
					put(grammarAccess.getREAL_LITERALAccess().getGroup_1_1_0(), "rule__REAL_LITERAL__Group_1_1_0__0");
					put(grammarAccess.getPathNameCSAccess().getGroup(), "rule__PathNameCS__Group__0");
					put(grammarAccess.getPathNameCSAccess().getGroup_1(), "rule__PathNameCS__Group_1__0");
					put(grammarAccess.getCollectionTypeCSAccess().getGroup(), "rule__CollectionTypeCS__Group__0");
					put(grammarAccess.getTupleTypeCSAccess().getGroup(), "rule__TupleTypeCS__Group__0");
					put(grammarAccess.getTupleTypeCSAccess().getGroup_2(), "rule__TupleTypeCS__Group_2__0");
					put(grammarAccess.getTupleTypeCSAccess().getGroup_2_1(), "rule__TupleTypeCS__Group_2_1__0");
					put(grammarAccess.getTuplePartCSAccess().getGroup(), "rule__TuplePartCS__Group__0");
					put(grammarAccess.getCollectionLiteralExpCSAccess().getGroup(), "rule__CollectionLiteralExpCS__Group__0");
					put(grammarAccess.getCollectionLiteralExpCSAccess().getGroup_2(), "rule__CollectionLiteralExpCS__Group_2__0");
					put(grammarAccess.getCollectionLiteralExpCSAccess().getGroup_2_1(), "rule__CollectionLiteralExpCS__Group_2_1__0");
					put(grammarAccess.getCollectionLiteralPartCSAccess().getGroup(), "rule__CollectionLiteralPartCS__Group__0");
					put(grammarAccess.getCollectionLiteralPartCSAccess().getGroup_1(), "rule__CollectionLiteralPartCS__Group_1__0");
					put(grammarAccess.getTupleLiteralExpCSAccess().getGroup(), "rule__TupleLiteralExpCS__Group__0");
					put(grammarAccess.getTupleLiteralExpCSAccess().getGroup_3(), "rule__TupleLiteralExpCS__Group_3__0");
					put(grammarAccess.getTupleLiteralPartCSAccess().getGroup(), "rule__TupleLiteralPartCS__Group__0");
					put(grammarAccess.getTupleLiteralPartCSAccess().getGroup_1(), "rule__TupleLiteralPartCS__Group_1__0");
					put(grammarAccess.getUnlimitedNaturalLiteralExpCSAccess().getGroup(), "rule__UnlimitedNaturalLiteralExpCS__Group__0");
					put(grammarAccess.getInvalidLiteralExpCSAccess().getGroup(), "rule__InvalidLiteralExpCS__Group__0");
					put(grammarAccess.getNullLiteralExpCSAccess().getGroup(), "rule__NullLiteralExpCS__Group__0");
					put(grammarAccess.getImpliesCSAccess().getGroup(), "rule__ImpliesCS__Group__0");
					put(grammarAccess.getImpliesCSAccess().getGroup_1(), "rule__ImpliesCS__Group_1__0");
					put(grammarAccess.getXorCSAccess().getGroup(), "rule__XorCS__Group__0");
					put(grammarAccess.getXorCSAccess().getGroup_1(), "rule__XorCS__Group_1__0");
					put(grammarAccess.getOrCSAccess().getGroup(), "rule__OrCS__Group__0");
					put(grammarAccess.getOrCSAccess().getGroup_1(), "rule__OrCS__Group_1__0");
					put(grammarAccess.getAndCSAccess().getGroup(), "rule__AndCS__Group__0");
					put(grammarAccess.getAndCSAccess().getGroup_1(), "rule__AndCS__Group_1__0");
					put(grammarAccess.getEqualityCSAccess().getGroup(), "rule__EqualityCS__Group__0");
					put(grammarAccess.getEqualityCSAccess().getGroup_1(), "rule__EqualityCS__Group_1__0");
					put(grammarAccess.getRelationalCSAccess().getGroup(), "rule__RelationalCS__Group__0");
					put(grammarAccess.getRelationalCSAccess().getGroup_1(), "rule__RelationalCS__Group_1__0");
					put(grammarAccess.getAdditiveCSAccess().getGroup(), "rule__AdditiveCS__Group__0");
					put(grammarAccess.getAdditiveCSAccess().getGroup_1(), "rule__AdditiveCS__Group_1__0");
					put(grammarAccess.getMultiplicativeCSAccess().getGroup(), "rule__MultiplicativeCS__Group__0");
					put(grammarAccess.getMultiplicativeCSAccess().getGroup_1(), "rule__MultiplicativeCS__Group_1__0");
					put(grammarAccess.getUnaryCSAccess().getGroup_1(), "rule__UnaryCS__Group_1__0");
					put(grammarAccess.getCalledExpCSAccess().getGroup(), "rule__CalledExpCS__Group__0");
					put(grammarAccess.getCalledExpCSAccess().getGroup_1(), "rule__CalledExpCS__Group_1__0");
					put(grammarAccess.getCallArgumentsCSAccess().getGroup_0(), "rule__CallArgumentsCS__Group_0__0");
					put(grammarAccess.getCallArgumentsCSAccess().getGroup_0_4_0(), "rule__CallArgumentsCS__Group_0_4_0__0");
					put(grammarAccess.getCallArgumentsCSAccess().getGroup_0_4_0_1_0(), "rule__CallArgumentsCS__Group_0_4_0_1_0__0");
					put(grammarAccess.getCallArgumentsCSAccess().getGroup_0_4_0_1_1(), "rule__CallArgumentsCS__Group_0_4_0_1_1__0");
					put(grammarAccess.getCallArgumentsCSAccess().getGroup_0_4_1(), "rule__CallArgumentsCS__Group_0_4_1__0");
					put(grammarAccess.getCallArgumentsCSAccess().getGroup_0_4_1_1(), "rule__CallArgumentsCS__Group_0_4_1_1__0");
					put(grammarAccess.getCallArgumentsCSAccess().getGroup_1(), "rule__CallArgumentsCS__Group_1__0");
					put(grammarAccess.getCallArgumentsCSAccess().getGroup_1_3(), "rule__CallArgumentsCS__Group_1_3__0");
					put(grammarAccess.getCallArgumentsCSAccess().getGroup_1_3_2(), "rule__CallArgumentsCS__Group_1_3_2__0");
					put(grammarAccess.getCallArgumentsCSAccess().getGroup_1_5(), "rule__CallArgumentsCS__Group_1_5__0");
					put(grammarAccess.getCallArgumentsCSAccess().getGroup_1_5_1(), "rule__CallArgumentsCS__Group_1_5_1__0");
					put(grammarAccess.getCallArgumentsCSAccess().getGroup_1_5_1_1(), "rule__CallArgumentsCS__Group_1_5_1_1__0");
					put(grammarAccess.getIteratorVariableCSAccess().getGroup(), "rule__IteratorVariableCS__Group__0");
					put(grammarAccess.getIteratorVariableCSAccess().getGroup_1(), "rule__IteratorVariableCS__Group_1__0");
					put(grammarAccess.getIteratorAccumulatorCSAccess().getGroup(), "rule__IteratorAccumulatorCS__Group__0");
					put(grammarAccess.getPrimaryExpCSAccess().getGroup_3(), "rule__PrimaryExpCS__Group_3__0");
					put(grammarAccess.getIfExpCSAccess().getGroup(), "rule__IfExpCS__Group__0");
					put(grammarAccess.getLetExpCSAccess().getGroup(), "rule__LetExpCS__Group__0");
					put(grammarAccess.getLetExpCSAccess().getGroup_2(), "rule__LetExpCS__Group_2__0");
					put(grammarAccess.getLetVariableCSAccess().getGroup(), "rule__LetVariableCS__Group__0");
					put(grammarAccess.getDocumentCSAccess().getImportsAssignment_0(), "rule__DocumentCS__ImportsAssignment_0");
					put(grammarAccess.getDocumentCSAccess().getPackagesAssignment_1(), "rule__DocumentCS__PackagesAssignment_1");
					put(grammarAccess.getBodyConstraintCSAccess().getStereotypeAssignment_0(), "rule__BodyConstraintCS__StereotypeAssignment_0");
					put(grammarAccess.getBodyConstraintCSAccess().getNameAssignment_1(), "rule__BodyConstraintCS__NameAssignment_1");
					put(grammarAccess.getBodyConstraintCSAccess().getExprValueAssignment_3_0(), "rule__BodyConstraintCS__ExprValueAssignment_3_0");
					put(grammarAccess.getBodyConstraintCSAccess().getExprStringAssignment_3_1(), "rule__BodyConstraintCS__ExprStringAssignment_3_1");
					put(grammarAccess.getDerivedConstraintCSAccess().getStereotypeAssignment_0(), "rule__DerivedConstraintCS__StereotypeAssignment_0");
					put(grammarAccess.getDerivedConstraintCSAccess().getExprValueAssignment_2_0(), "rule__DerivedConstraintCS__ExprValueAssignment_2_0");
					put(grammarAccess.getDerivedConstraintCSAccess().getExprStringAssignment_2_1(), "rule__DerivedConstraintCS__ExprStringAssignment_2_1");
					put(grammarAccess.getInitialConstraintCSAccess().getStereotypeAssignment_0(), "rule__InitialConstraintCS__StereotypeAssignment_0");
					put(grammarAccess.getInitialConstraintCSAccess().getExprValueAssignment_2_0(), "rule__InitialConstraintCS__ExprValueAssignment_2_0");
					put(grammarAccess.getInitialConstraintCSAccess().getExprStringAssignment_2_1(), "rule__InitialConstraintCS__ExprStringAssignment_2_1");
					put(grammarAccess.getInvariantConstraintCSAccess().getStereotypeAssignment_0(), "rule__InvariantConstraintCS__StereotypeAssignment_0");
					put(grammarAccess.getInvariantConstraintCSAccess().getNameAssignment_1(), "rule__InvariantConstraintCS__NameAssignment_1");
					put(grammarAccess.getInvariantConstraintCSAccess().getExprValueAssignment_3_0(), "rule__InvariantConstraintCS__ExprValueAssignment_3_0");
					put(grammarAccess.getInvariantConstraintCSAccess().getExprStringAssignment_3_1(), "rule__InvariantConstraintCS__ExprStringAssignment_3_1");
					put(grammarAccess.getPostconditionConstraintCSAccess().getStereotypeAssignment_0(), "rule__PostconditionConstraintCS__StereotypeAssignment_0");
					put(grammarAccess.getPostconditionConstraintCSAccess().getNameAssignment_1(), "rule__PostconditionConstraintCS__NameAssignment_1");
					put(grammarAccess.getPostconditionConstraintCSAccess().getExprValueAssignment_3_0(), "rule__PostconditionConstraintCS__ExprValueAssignment_3_0");
					put(grammarAccess.getPostconditionConstraintCSAccess().getExprStringAssignment_3_1(), "rule__PostconditionConstraintCS__ExprStringAssignment_3_1");
					put(grammarAccess.getPreconditionConstraintCSAccess().getStereotypeAssignment_0(), "rule__PreconditionConstraintCS__StereotypeAssignment_0");
					put(grammarAccess.getPreconditionConstraintCSAccess().getNameAssignment_1(), "rule__PreconditionConstraintCS__NameAssignment_1");
					put(grammarAccess.getPreconditionConstraintCSAccess().getExprValueAssignment_3_0(), "rule__PreconditionConstraintCS__ExprValueAssignment_3_0");
					put(grammarAccess.getPreconditionConstraintCSAccess().getExprStringAssignment_3_1(), "rule__PreconditionConstraintCS__ExprStringAssignment_3_1");
					put(grammarAccess.getEClassRefAccess().getRefAssignment(), "rule__EClassRef__RefAssignment");
					put(grammarAccess.getEClassifierRefAccess().getRefAssignment(), "rule__EClassifierRef__RefAssignment");
					put(grammarAccess.getEDataTypeRefAccess().getRefAssignment(), "rule__EDataTypeRef__RefAssignment");
					put(grammarAccess.getEReferenceRefAccess().getRefAssignment(), "rule__EReferenceRef__RefAssignment");
					put(grammarAccess.getAnnotationCSAccess().getIdSourceAssignment_1_0(), "rule__AnnotationCS__IdSourceAssignment_1_0");
					put(grammarAccess.getAnnotationCSAccess().getStringSourceAssignment_1_1(), "rule__AnnotationCS__StringSourceAssignment_1_1");
					put(grammarAccess.getAnnotationCSAccess().getDetailsAssignment_2_1(), "rule__AnnotationCS__DetailsAssignment_2_1");
					put(grammarAccess.getAnnotationCSAccess().getDetailsAssignment_2_2_1(), "rule__AnnotationCS__DetailsAssignment_2_2_1");
					put(grammarAccess.getAttributeCSAccess().getAnnotationsAssignment_0(), "rule__AttributeCS__AnnotationsAssignment_0");
					put(grammarAccess.getAttributeCSAccess().getQualifiersAssignment_1_0(), "rule__AttributeCS__QualifiersAssignment_1_0");
					put(grammarAccess.getAttributeCSAccess().getQualifiersAssignment_1_1(), "rule__AttributeCS__QualifiersAssignment_1_1");
					put(grammarAccess.getAttributeCSAccess().getQualifiersAssignment_1_2(), "rule__AttributeCS__QualifiersAssignment_1_2");
					put(grammarAccess.getAttributeCSAccess().getQualifiersAssignment_1_3(), "rule__AttributeCS__QualifiersAssignment_1_3");
					put(grammarAccess.getAttributeCSAccess().getQualifiersAssignment_1_4(), "rule__AttributeCS__QualifiersAssignment_1_4");
					put(grammarAccess.getAttributeCSAccess().getQualifiersAssignment_1_5(), "rule__AttributeCS__QualifiersAssignment_1_5");
					put(grammarAccess.getAttributeCSAccess().getQualifiersAssignment_1_6(), "rule__AttributeCS__QualifiersAssignment_1_6");
					put(grammarAccess.getAttributeCSAccess().getQualifiersAssignment_1_7(), "rule__AttributeCS__QualifiersAssignment_1_7");
					put(grammarAccess.getAttributeCSAccess().getQualifiersAssignment_1_8(), "rule__AttributeCS__QualifiersAssignment_1_8");
					put(grammarAccess.getAttributeCSAccess().getQualifiersAssignment_1_9(), "rule__AttributeCS__QualifiersAssignment_1_9");
					put(grammarAccess.getAttributeCSAccess().getQualifiersAssignment_1_10(), "rule__AttributeCS__QualifiersAssignment_1_10");
					put(grammarAccess.getAttributeCSAccess().getQualifiersAssignment_1_11(), "rule__AttributeCS__QualifiersAssignment_1_11");
					put(grammarAccess.getAttributeCSAccess().getQualifiersAssignment_1_12(), "rule__AttributeCS__QualifiersAssignment_1_12");
					put(grammarAccess.getAttributeCSAccess().getQualifiersAssignment_1_13(), "rule__AttributeCS__QualifiersAssignment_1_13");
					put(grammarAccess.getAttributeCSAccess().getQualifiersAssignment_1_14(), "rule__AttributeCS__QualifiersAssignment_1_14");
					put(grammarAccess.getAttributeCSAccess().getQualifiersAssignment_1_15(), "rule__AttributeCS__QualifiersAssignment_1_15");
					put(grammarAccess.getAttributeCSAccess().getNameAssignment_3(), "rule__AttributeCS__NameAssignment_3");
					put(grammarAccess.getAttributeCSAccess().getTypeAssignment_4_1(), "rule__AttributeCS__TypeAssignment_4_1");
					put(grammarAccess.getAttributeCSAccess().getLowerAssignment_4_2_1_0_0(), "rule__AttributeCS__LowerAssignment_4_2_1_0_0");
					put(grammarAccess.getAttributeCSAccess().getUpperAssignment_4_2_1_0_1_1(), "rule__AttributeCS__UpperAssignment_4_2_1_0_1_1");
					put(grammarAccess.getAttributeCSAccess().getMultiplicityAssignment_4_2_1_1(), "rule__AttributeCS__MultiplicityAssignment_4_2_1_1");
					put(grammarAccess.getAttributeCSAccess().getDefaultValueLiteralAssignment_5_1(), "rule__AttributeCS__DefaultValueLiteralAssignment_5_1");
					put(grammarAccess.getAttributeCSAccess().getConstraintsAssignment_6_0_1(), "rule__AttributeCS__ConstraintsAssignment_6_0_1");
					put(grammarAccess.getClassCSAccess().getAnnotationsAssignment_0(), "rule__ClassCS__AnnotationsAssignment_0");
					put(grammarAccess.getClassCSAccess().getQualifiersAssignment_1_0(), "rule__ClassCS__QualifiersAssignment_1_0");
					put(grammarAccess.getClassCSAccess().getQualifiersAssignment_1_1(), "rule__ClassCS__QualifiersAssignment_1_1");
					put(grammarAccess.getClassCSAccess().getQualifiersAssignment_1_2(), "rule__ClassCS__QualifiersAssignment_1_2");
					put(grammarAccess.getClassCSAccess().getQualifiersAssignment_1_3(), "rule__ClassCS__QualifiersAssignment_1_3");
					put(grammarAccess.getClassCSAccess().getNameAssignment_3(), "rule__ClassCS__NameAssignment_3");
					put(grammarAccess.getClassCSAccess().getTypeParametersAssignment_4_1(), "rule__ClassCS__TypeParametersAssignment_4_1");
					put(grammarAccess.getClassCSAccess().getTypeParametersAssignment_4_2_1(), "rule__ClassCS__TypeParametersAssignment_4_2_1");
					put(grammarAccess.getClassCSAccess().getSuperTypesAssignment_5_1(), "rule__ClassCS__SuperTypesAssignment_5_1");
					put(grammarAccess.getClassCSAccess().getSuperTypesAssignment_5_2_1(), "rule__ClassCS__SuperTypesAssignment_5_2_1");
					put(grammarAccess.getClassCSAccess().getInstanceClassNameAssignment_6_1(), "rule__ClassCS__InstanceClassNameAssignment_6_1");
					put(grammarAccess.getClassCSAccess().getOperationsAssignment_7_0_1_0(), "rule__ClassCS__OperationsAssignment_7_0_1_0");
					put(grammarAccess.getClassCSAccess().getStructuralFeaturesAssignment_7_0_1_1(), "rule__ClassCS__StructuralFeaturesAssignment_7_0_1_1");
					put(grammarAccess.getClassCSAccess().getConstraintsAssignment_7_0_1_2(), "rule__ClassCS__ConstraintsAssignment_7_0_1_2");
					put(grammarAccess.getClassCSRefAccess().getRefAssignment(), "rule__ClassCSRef__RefAssignment");
					put(grammarAccess.getDataTypeCSAccess().getAnnotationsAssignment_0(), "rule__DataTypeCS__AnnotationsAssignment_0");
					put(grammarAccess.getDataTypeCSAccess().getQualifiersAssignment_1_0(), "rule__DataTypeCS__QualifiersAssignment_1_0");
					put(grammarAccess.getDataTypeCSAccess().getQualifiersAssignment_1_1(), "rule__DataTypeCS__QualifiersAssignment_1_1");
					put(grammarAccess.getDataTypeCSAccess().getNameAssignment_3(), "rule__DataTypeCS__NameAssignment_3");
					put(grammarAccess.getDataTypeCSAccess().getTypeParametersAssignment_4_1(), "rule__DataTypeCS__TypeParametersAssignment_4_1");
					put(grammarAccess.getDataTypeCSAccess().getTypeParametersAssignment_4_2_1(), "rule__DataTypeCS__TypeParametersAssignment_4_2_1");
					put(grammarAccess.getDataTypeCSAccess().getInstanceClassNameAssignment_5_1(), "rule__DataTypeCS__InstanceClassNameAssignment_5_1");
					put(grammarAccess.getDataTypeCSAccess().getConstraintsAssignment_6_0_1(), "rule__DataTypeCS__ConstraintsAssignment_6_0_1");
					put(grammarAccess.getDataTypeCSRefAccess().getRefAssignment(), "rule__DataTypeCSRef__RefAssignment");
					put(grammarAccess.getDetailCSAccess().getIdNameAssignment_0_0(), "rule__DetailCS__IdNameAssignment_0_0");
					put(grammarAccess.getDetailCSAccess().getStringNameAssignment_0_1(), "rule__DetailCS__StringNameAssignment_0_1");
					put(grammarAccess.getDetailCSAccess().getValueAssignment_2(), "rule__DetailCS__ValueAssignment_2");
					put(grammarAccess.getEClassifierCSRefAccess().getModelNameAssignment_0(), "rule__EClassifierCSRef__ModelNameAssignment_0");
					put(grammarAccess.getEClassifierCSRefAccess().getRefAssignment_2(), "rule__EClassifierCSRef__RefAssignment_2");
					put(grammarAccess.getEnumCSAccess().getAnnotationsAssignment_0(), "rule__EnumCS__AnnotationsAssignment_0");
					put(grammarAccess.getEnumCSAccess().getNameAssignment_2(), "rule__EnumCS__NameAssignment_2");
					put(grammarAccess.getEnumCSAccess().getTypeParametersAssignment_3_1(), "rule__EnumCS__TypeParametersAssignment_3_1");
					put(grammarAccess.getEnumCSAccess().getTypeParametersAssignment_3_2_1(), "rule__EnumCS__TypeParametersAssignment_3_2_1");
					put(grammarAccess.getEnumCSAccess().getInstanceClassNameAssignment_4_1(), "rule__EnumCS__InstanceClassNameAssignment_4_1");
					put(grammarAccess.getEnumCSAccess().getLiteralsAssignment_5_0_1_0(), "rule__EnumCS__LiteralsAssignment_5_0_1_0");
					put(grammarAccess.getEnumCSAccess().getConstraintsAssignment_5_0_1_1(), "rule__EnumCS__ConstraintsAssignment_5_0_1_1");
					put(grammarAccess.getEnumLiteralCSAccess().getAnnotationsAssignment_0(), "rule__EnumLiteralCS__AnnotationsAssignment_0");
					put(grammarAccess.getEnumLiteralCSAccess().getNameAssignment_1(), "rule__EnumLiteralCS__NameAssignment_1");
					put(grammarAccess.getEnumLiteralCSAccess().getValueAssignment_2_1(), "rule__EnumLiteralCS__ValueAssignment_2_1");
					put(grammarAccess.getImportCSAccess().getAliasAssignment_1_0(), "rule__ImportCS__AliasAssignment_1_0");
					put(grammarAccess.getImportCSAccess().getEPackageAssignment_2(), "rule__ImportCS__EPackageAssignment_2");
					put(grammarAccess.getOperationCSAccess().getAnnotationsAssignment_0(), "rule__OperationCS__AnnotationsAssignment_0");
					put(grammarAccess.getOperationCSAccess().getQualifiersAssignment_1_0(), "rule__OperationCS__QualifiersAssignment_1_0");
					put(grammarAccess.getOperationCSAccess().getQualifiersAssignment_1_1(), "rule__OperationCS__QualifiersAssignment_1_1");
					put(grammarAccess.getOperationCSAccess().getQualifiersAssignment_1_2(), "rule__OperationCS__QualifiersAssignment_1_2");
					put(grammarAccess.getOperationCSAccess().getQualifiersAssignment_1_3(), "rule__OperationCS__QualifiersAssignment_1_3");
					put(grammarAccess.getOperationCSAccess().getQualifiersAssignment_1_4(), "rule__OperationCS__QualifiersAssignment_1_4");
					put(grammarAccess.getOperationCSAccess().getQualifiersAssignment_1_5(), "rule__OperationCS__QualifiersAssignment_1_5");
					put(grammarAccess.getOperationCSAccess().getNameAssignment_3(), "rule__OperationCS__NameAssignment_3");
					put(grammarAccess.getOperationCSAccess().getTypeParametersAssignment_4_1(), "rule__OperationCS__TypeParametersAssignment_4_1");
					put(grammarAccess.getOperationCSAccess().getTypeParametersAssignment_4_2_1(), "rule__OperationCS__TypeParametersAssignment_4_2_1");
					put(grammarAccess.getOperationCSAccess().getParametersAssignment_6_0(), "rule__OperationCS__ParametersAssignment_6_0");
					put(grammarAccess.getOperationCSAccess().getParametersAssignment_6_1_1(), "rule__OperationCS__ParametersAssignment_6_1_1");
					put(grammarAccess.getOperationCSAccess().getTypeAssignment_8_1(), "rule__OperationCS__TypeAssignment_8_1");
					put(grammarAccess.getOperationCSAccess().getLowerAssignment_8_2_1_0_0(), "rule__OperationCS__LowerAssignment_8_2_1_0_0");
					put(grammarAccess.getOperationCSAccess().getUpperAssignment_8_2_1_0_1_1(), "rule__OperationCS__UpperAssignment_8_2_1_0_1_1");
					put(grammarAccess.getOperationCSAccess().getMultiplicityAssignment_8_2_1_1(), "rule__OperationCS__MultiplicityAssignment_8_2_1_1");
					put(grammarAccess.getOperationCSAccess().getConstraintsAssignment_9_0_1(), "rule__OperationCS__ConstraintsAssignment_9_0_1");
					put(grammarAccess.getPackageCSAccess().getAnnotationsAssignment_0(), "rule__PackageCS__AnnotationsAssignment_0");
					put(grammarAccess.getPackageCSAccess().getNameAssignment_2(), "rule__PackageCS__NameAssignment_2");
					put(grammarAccess.getPackageCSAccess().getSubpackagesAssignment_4_0(), "rule__PackageCS__SubpackagesAssignment_4_0");
					put(grammarAccess.getPackageCSAccess().getClassifiersAssignment_4_1(), "rule__PackageCS__ClassifiersAssignment_4_1");
					put(grammarAccess.getParameterCSAccess().getAnnotationsAssignment_0(), "rule__ParameterCS__AnnotationsAssignment_0");
					put(grammarAccess.getParameterCSAccess().getQualifiersAssignment_1_0(), "rule__ParameterCS__QualifiersAssignment_1_0");
					put(grammarAccess.getParameterCSAccess().getQualifiersAssignment_1_1(), "rule__ParameterCS__QualifiersAssignment_1_1");
					put(grammarAccess.getParameterCSAccess().getQualifiersAssignment_1_2(), "rule__ParameterCS__QualifiersAssignment_1_2");
					put(grammarAccess.getParameterCSAccess().getQualifiersAssignment_1_3(), "rule__ParameterCS__QualifiersAssignment_1_3");
					put(grammarAccess.getParameterCSAccess().getNameAssignment_2(), "rule__ParameterCS__NameAssignment_2");
					put(grammarAccess.getParameterCSAccess().getTypeAssignment_3_1(), "rule__ParameterCS__TypeAssignment_3_1");
					put(grammarAccess.getParameterCSAccess().getLowerAssignment_3_2_1_0_0(), "rule__ParameterCS__LowerAssignment_3_2_1_0_0");
					put(grammarAccess.getParameterCSAccess().getUpperAssignment_3_2_1_0_1_1(), "rule__ParameterCS__UpperAssignment_3_2_1_0_1_1");
					put(grammarAccess.getParameterCSAccess().getMultiplicityAssignment_3_2_1_1(), "rule__ParameterCS__MultiplicityAssignment_3_2_1_1");
					put(grammarAccess.getReferenceCSAccess().getAnnotationsAssignment_0(), "rule__ReferenceCS__AnnotationsAssignment_0");
					put(grammarAccess.getReferenceCSAccess().getQualifiersAssignment_1_0(), "rule__ReferenceCS__QualifiersAssignment_1_0");
					put(grammarAccess.getReferenceCSAccess().getQualifiersAssignment_1_1(), "rule__ReferenceCS__QualifiersAssignment_1_1");
					put(grammarAccess.getReferenceCSAccess().getQualifiersAssignment_1_2(), "rule__ReferenceCS__QualifiersAssignment_1_2");
					put(grammarAccess.getReferenceCSAccess().getQualifiersAssignment_1_3(), "rule__ReferenceCS__QualifiersAssignment_1_3");
					put(grammarAccess.getReferenceCSAccess().getQualifiersAssignment_1_4(), "rule__ReferenceCS__QualifiersAssignment_1_4");
					put(grammarAccess.getReferenceCSAccess().getQualifiersAssignment_1_5(), "rule__ReferenceCS__QualifiersAssignment_1_5");
					put(grammarAccess.getReferenceCSAccess().getQualifiersAssignment_1_6(), "rule__ReferenceCS__QualifiersAssignment_1_6");
					put(grammarAccess.getReferenceCSAccess().getQualifiersAssignment_1_7(), "rule__ReferenceCS__QualifiersAssignment_1_7");
					put(grammarAccess.getReferenceCSAccess().getQualifiersAssignment_1_8(), "rule__ReferenceCS__QualifiersAssignment_1_8");
					put(grammarAccess.getReferenceCSAccess().getQualifiersAssignment_1_9(), "rule__ReferenceCS__QualifiersAssignment_1_9");
					put(grammarAccess.getReferenceCSAccess().getQualifiersAssignment_1_10(), "rule__ReferenceCS__QualifiersAssignment_1_10");
					put(grammarAccess.getReferenceCSAccess().getQualifiersAssignment_1_11(), "rule__ReferenceCS__QualifiersAssignment_1_11");
					put(grammarAccess.getReferenceCSAccess().getQualifiersAssignment_1_12(), "rule__ReferenceCS__QualifiersAssignment_1_12");
					put(grammarAccess.getReferenceCSAccess().getQualifiersAssignment_1_13(), "rule__ReferenceCS__QualifiersAssignment_1_13");
					put(grammarAccess.getReferenceCSAccess().getQualifiersAssignment_1_14(), "rule__ReferenceCS__QualifiersAssignment_1_14");
					put(grammarAccess.getReferenceCSAccess().getQualifiersAssignment_1_15(), "rule__ReferenceCS__QualifiersAssignment_1_15");
					put(grammarAccess.getReferenceCSAccess().getContainmentAssignment_2_1(), "rule__ReferenceCS__ContainmentAssignment_2_1");
					put(grammarAccess.getReferenceCSAccess().getNameAssignment_3(), "rule__ReferenceCS__NameAssignment_3");
					put(grammarAccess.getReferenceCSAccess().getOppositeAssignment_4_1(), "rule__ReferenceCS__OppositeAssignment_4_1");
					put(grammarAccess.getReferenceCSAccess().getTypeAssignment_5_1(), "rule__ReferenceCS__TypeAssignment_5_1");
					put(grammarAccess.getReferenceCSAccess().getLowerAssignment_5_2_1_0_0(), "rule__ReferenceCS__LowerAssignment_5_2_1_0_0");
					put(grammarAccess.getReferenceCSAccess().getUpperAssignment_5_2_1_0_1_1(), "rule__ReferenceCS__UpperAssignment_5_2_1_0_1_1");
					put(grammarAccess.getReferenceCSAccess().getMultiplicityAssignment_5_2_1_1(), "rule__ReferenceCS__MultiplicityAssignment_5_2_1_1");
					put(grammarAccess.getReferenceCSAccess().getDefaultValueLiteralAssignment_6_1(), "rule__ReferenceCS__DefaultValueLiteralAssignment_6_1");
					put(grammarAccess.getReferenceCSAccess().getConstraintsAssignment_7_0_1(), "rule__ReferenceCS__ConstraintsAssignment_7_0_1");
					put(grammarAccess.getReferenceCSRefAccess().getRefAssignment(), "rule__ReferenceCSRef__RefAssignment");
					put(grammarAccess.getTypeCSRefAccess().getRefAssignment(), "rule__TypeCSRef__RefAssignment");
					put(grammarAccess.getTypeParameterCSAccess().getNameAssignment_0(), "rule__TypeParameterCS__NameAssignment_0");
					put(grammarAccess.getTypeParameterCSAccess().getExtendsAssignment_1_0_1(), "rule__TypeParameterCS__ExtendsAssignment_1_0_1");
					put(grammarAccess.getTypeParameterCSAccess().getExtendsAssignment_1_0_2_1(), "rule__TypeParameterCS__ExtendsAssignment_1_0_2_1");
					put(grammarAccess.getTypeParameterCSAccess().getSuperAssignment_1_1_1(), "rule__TypeParameterCS__SuperAssignment_1_1_1");
					put(grammarAccess.getTypedTypeRefCSAccess().getTypeAssignment_0(), "rule__TypedTypeRefCS__TypeAssignment_0");
					put(grammarAccess.getTypedTypeRefCSAccess().getTypeArgumentsAssignment_1_1(), "rule__TypedTypeRefCS__TypeArgumentsAssignment_1_1");
					put(grammarAccess.getTypedTypeRefCSAccess().getTypeArgumentsAssignment_1_2_1(), "rule__TypedTypeRefCS__TypeArgumentsAssignment_1_2_1");
					put(grammarAccess.getWildcardTypeRefCSAccess().getExtendsAssignment_2_0_1(), "rule__WildcardTypeRefCS__ExtendsAssignment_2_0_1");
					put(grammarAccess.getWildcardTypeRefCSAccess().getSuperAssignment_2_1_1(), "rule__WildcardTypeRefCS__SuperAssignment_2_1_1");
					put(grammarAccess.getTupleKeywordCSAccess().getValueAssignment(), "rule__TupleKeywordCS__ValueAssignment");
					put(grammarAccess.getSelfKeywordCSAccess().getValueAssignment(), "rule__SelfKeywordCS__ValueAssignment");
					put(grammarAccess.getSimpleNameCSAccess().getValueAssignment(), "rule__SimpleNameCS__ValueAssignment");
					put(grammarAccess.getPathNameCSAccess().getSimpleNamesAssignment_0(), "rule__PathNameCS__SimpleNamesAssignment_0");
					put(grammarAccess.getPathNameCSAccess().getSimpleNamesAssignment_1_1(), "rule__PathNameCS__SimpleNamesAssignment_1_1");
					put(grammarAccess.getPrimitiveTypeCSAccess().getValueAssignment_0(), "rule__PrimitiveTypeCS__ValueAssignment_0");
					put(grammarAccess.getPrimitiveTypeCSAccess().getValueAssignment_1(), "rule__PrimitiveTypeCS__ValueAssignment_1");
					put(grammarAccess.getPrimitiveTypeCSAccess().getValueAssignment_2(), "rule__PrimitiveTypeCS__ValueAssignment_2");
					put(grammarAccess.getPrimitiveTypeCSAccess().getValueAssignment_3(), "rule__PrimitiveTypeCS__ValueAssignment_3");
					put(grammarAccess.getPrimitiveTypeCSAccess().getValueAssignment_4(), "rule__PrimitiveTypeCS__ValueAssignment_4");
					put(grammarAccess.getPrimitiveTypeCSAccess().getValueAssignment_5(), "rule__PrimitiveTypeCS__ValueAssignment_5");
					put(grammarAccess.getPrimitiveTypeCSAccess().getValueAssignment_6(), "rule__PrimitiveTypeCS__ValueAssignment_6");
					put(grammarAccess.getPrimitiveTypeCSAccess().getValueAssignment_7(), "rule__PrimitiveTypeCS__ValueAssignment_7");
					put(grammarAccess.getCollectionTypeIdentifierCSAccess().getValueAssignment_0(), "rule__CollectionTypeIdentifierCS__ValueAssignment_0");
					put(grammarAccess.getCollectionTypeIdentifierCSAccess().getValueAssignment_1(), "rule__CollectionTypeIdentifierCS__ValueAssignment_1");
					put(grammarAccess.getCollectionTypeIdentifierCSAccess().getValueAssignment_2(), "rule__CollectionTypeIdentifierCS__ValueAssignment_2");
					put(grammarAccess.getCollectionTypeIdentifierCSAccess().getValueAssignment_3(), "rule__CollectionTypeIdentifierCS__ValueAssignment_3");
					put(grammarAccess.getCollectionTypeIdentifierCSAccess().getValueAssignment_4(), "rule__CollectionTypeIdentifierCS__ValueAssignment_4");
					put(grammarAccess.getCollectionTypeCSAccess().getValueAssignment_0(), "rule__CollectionTypeCS__ValueAssignment_0");
					put(grammarAccess.getCollectionTypeCSAccess().getTypeCSAssignment_2(), "rule__CollectionTypeCS__TypeCSAssignment_2");
					put(grammarAccess.getTupleTypeCSAccess().getValueAssignment_0(), "rule__TupleTypeCS__ValueAssignment_0");
					put(grammarAccess.getTupleTypeCSAccess().getPartAssignment_2_0(), "rule__TupleTypeCS__PartAssignment_2_0");
					put(grammarAccess.getTupleTypeCSAccess().getPartAssignment_2_1_1(), "rule__TupleTypeCS__PartAssignment_2_1_1");
					put(grammarAccess.getTuplePartCSAccess().getNameAssignment_0(), "rule__TuplePartCS__NameAssignment_0");
					put(grammarAccess.getTuplePartCSAccess().getTypeAssignment_2(), "rule__TuplePartCS__TypeAssignment_2");
					put(grammarAccess.getCollectionLiteralExpCSAccess().getCollectionLiteralPartsAssignment_2_0(), "rule__CollectionLiteralExpCS__CollectionLiteralPartsAssignment_2_0");
					put(grammarAccess.getCollectionLiteralExpCSAccess().getCollectionLiteralPartsAssignment_2_1_1(), "rule__CollectionLiteralExpCS__CollectionLiteralPartsAssignment_2_1_1");
					put(grammarAccess.getCollectionLiteralPartCSAccess().getExpressionCSAssignment_0(), "rule__CollectionLiteralPartCS__ExpressionCSAssignment_0");
					put(grammarAccess.getCollectionLiteralPartCSAccess().getLastExpressionCSAssignment_1_1(), "rule__CollectionLiteralPartCS__LastExpressionCSAssignment_1_1");
					put(grammarAccess.getTupleLiteralExpCSAccess().getPartAssignment_2(), "rule__TupleLiteralExpCS__PartAssignment_2");
					put(grammarAccess.getTupleLiteralExpCSAccess().getPartAssignment_3_1(), "rule__TupleLiteralExpCS__PartAssignment_3_1");
					put(grammarAccess.getTupleLiteralPartCSAccess().getNameAssignment_0(), "rule__TupleLiteralPartCS__NameAssignment_0");
					put(grammarAccess.getTupleLiteralPartCSAccess().getTypeAssignment_1_1(), "rule__TupleLiteralPartCS__TypeAssignment_1_1");
					put(grammarAccess.getTupleLiteralPartCSAccess().getInitExpressionAssignment_3(), "rule__TupleLiteralPartCS__InitExpressionAssignment_3");
					put(grammarAccess.getIntegerLiteralExpCSAccess().getIntegerSymbolAssignment(), "rule__IntegerLiteralExpCS__IntegerSymbolAssignment");
					put(grammarAccess.getRealLiteralExpCSAccess().getRealSymbolAssignment(), "rule__RealLiteralExpCS__RealSymbolAssignment");
					put(grammarAccess.getStringLiteralExpCSAccess().getStringSymbolAssignment(), "rule__StringLiteralExpCS__StringSymbolAssignment");
					put(grammarAccess.getBooleanLiteralExpCSAccess().getValueAssignment_0(), "rule__BooleanLiteralExpCS__ValueAssignment_0");
					put(grammarAccess.getBooleanLiteralExpCSAccess().getValueAssignment_1(), "rule__BooleanLiteralExpCS__ValueAssignment_1");
					put(grammarAccess.getImpliesCSAccess().getOpAssignment_1_1(), "rule__ImpliesCS__OpAssignment_1_1");
					put(grammarAccess.getImpliesCSAccess().getRightAssignment_1_2(), "rule__ImpliesCS__RightAssignment_1_2");
					put(grammarAccess.getXorCSAccess().getOpAssignment_1_1(), "rule__XorCS__OpAssignment_1_1");
					put(grammarAccess.getXorCSAccess().getRightAssignment_1_2(), "rule__XorCS__RightAssignment_1_2");
					put(grammarAccess.getOrCSAccess().getOpAssignment_1_1(), "rule__OrCS__OpAssignment_1_1");
					put(grammarAccess.getOrCSAccess().getRightAssignment_1_2(), "rule__OrCS__RightAssignment_1_2");
					put(grammarAccess.getAndCSAccess().getOpAssignment_1_1(), "rule__AndCS__OpAssignment_1_1");
					put(grammarAccess.getAndCSAccess().getRightAssignment_1_2(), "rule__AndCS__RightAssignment_1_2");
					put(grammarAccess.getEqualityCSAccess().getOpAssignment_1_1(), "rule__EqualityCS__OpAssignment_1_1");
					put(grammarAccess.getEqualityCSAccess().getRightAssignment_1_2(), "rule__EqualityCS__RightAssignment_1_2");
					put(grammarAccess.getRelationalCSAccess().getOpAssignment_1_1(), "rule__RelationalCS__OpAssignment_1_1");
					put(grammarAccess.getRelationalCSAccess().getRightAssignment_1_2(), "rule__RelationalCS__RightAssignment_1_2");
					put(grammarAccess.getAdditiveCSAccess().getOpAssignment_1_1(), "rule__AdditiveCS__OpAssignment_1_1");
					put(grammarAccess.getAdditiveCSAccess().getRightAssignment_1_2(), "rule__AdditiveCS__RightAssignment_1_2");
					put(grammarAccess.getMultiplicativeCSAccess().getOpAssignment_1_1(), "rule__MultiplicativeCS__OpAssignment_1_1");
					put(grammarAccess.getMultiplicativeCSAccess().getRightAssignment_1_2(), "rule__MultiplicativeCS__RightAssignment_1_2");
					put(grammarAccess.getUnaryCSAccess().getOpAssignment_1_1(), "rule__UnaryCS__OpAssignment_1_1");
					put(grammarAccess.getUnaryCSAccess().getSourceAssignment_1_2(), "rule__UnaryCS__SourceAssignment_1_2");
					put(grammarAccess.getCalledExpCSAccess().getCallArgumentsAssignment_1_1(), "rule__CalledExpCS__CallArgumentsAssignment_1_1");
					put(grammarAccess.getCallArgumentsCSAccess().getPathNameAssignment_0_2(), "rule__CallArgumentsCS__PathNameAssignment_0_2");
					put(grammarAccess.getCallArgumentsCSAccess().getVariable1Assignment_0_4_0_0(), "rule__CallArgumentsCS__Variable1Assignment_0_4_0_0");
					put(grammarAccess.getCallArgumentsCSAccess().getVariable2Assignment_0_4_0_1_0_1(), "rule__CallArgumentsCS__Variable2Assignment_0_4_0_1_0_1");
					put(grammarAccess.getCallArgumentsCSAccess().getVariable2Assignment_0_4_0_1_1_1(), "rule__CallArgumentsCS__Variable2Assignment_0_4_0_1_1_1");
					put(grammarAccess.getCallArgumentsCSAccess().getBodyAssignment_0_4_0_3(), "rule__CallArgumentsCS__BodyAssignment_0_4_0_3");
					put(grammarAccess.getCallArgumentsCSAccess().getArgumentsAssignment_0_4_1_0(), "rule__CallArgumentsCS__ArgumentsAssignment_0_4_1_0");
					put(grammarAccess.getCallArgumentsCSAccess().getArgumentsAssignment_0_4_1_1_1(), "rule__CallArgumentsCS__ArgumentsAssignment_0_4_1_1_1");
					put(grammarAccess.getCallArgumentsCSAccess().getPathNameAssignment_1_2(), "rule__CallArgumentsCS__PathNameAssignment_1_2");
					put(grammarAccess.getCallArgumentsCSAccess().getIndexesAssignment_1_3_1(), "rule__CallArgumentsCS__IndexesAssignment_1_3_1");
					put(grammarAccess.getCallArgumentsCSAccess().getIndexesAssignment_1_3_2_1(), "rule__CallArgumentsCS__IndexesAssignment_1_3_2_1");
					put(grammarAccess.getCallArgumentsCSAccess().getIsPreAssignment_1_4(), "rule__CallArgumentsCS__IsPreAssignment_1_4");
					put(grammarAccess.getCallArgumentsCSAccess().getArgumentsAssignment_1_5_1_0(), "rule__CallArgumentsCS__ArgumentsAssignment_1_5_1_0");
					put(grammarAccess.getCallArgumentsCSAccess().getArgumentsAssignment_1_5_1_1_1(), "rule__CallArgumentsCS__ArgumentsAssignment_1_5_1_1_1");
					put(grammarAccess.getIteratorVariableCSAccess().getNameAssignment_0(), "rule__IteratorVariableCS__NameAssignment_0");
					put(grammarAccess.getIteratorVariableCSAccess().getTypeAssignment_1_1(), "rule__IteratorVariableCS__TypeAssignment_1_1");
					put(grammarAccess.getIteratorAccumulatorCSAccess().getNameAssignment_0(), "rule__IteratorAccumulatorCS__NameAssignment_0");
					put(grammarAccess.getIteratorAccumulatorCSAccess().getTypeAssignment_2(), "rule__IteratorAccumulatorCS__TypeAssignment_2");
					put(grammarAccess.getIteratorAccumulatorCSAccess().getInitExpressionAssignment_4(), "rule__IteratorAccumulatorCS__InitExpressionAssignment_4");
					put(grammarAccess.getIfExpCSAccess().getConditionAssignment_1(), "rule__IfExpCS__ConditionAssignment_1");
					put(grammarAccess.getIfExpCSAccess().getThenExpressionAssignment_3(), "rule__IfExpCS__ThenExpressionAssignment_3");
					put(grammarAccess.getIfExpCSAccess().getElseExpressionAssignment_5(), "rule__IfExpCS__ElseExpressionAssignment_5");
					put(grammarAccess.getLetExpCSAccess().getVariableAssignment_1(), "rule__LetExpCS__VariableAssignment_1");
					put(grammarAccess.getLetExpCSAccess().getVariableAssignment_2_1(), "rule__LetExpCS__VariableAssignment_2_1");
					put(grammarAccess.getLetExpCSAccess().getInAssignment_4(), "rule__LetExpCS__InAssignment_4");
					put(grammarAccess.getLetVariableCSAccess().getNameAssignment_0(), "rule__LetVariableCS__NameAssignment_0");
					put(grammarAccess.getLetVariableCSAccess().getTypeAssignment_2(), "rule__LetVariableCS__TypeAssignment_2");
					put(grammarAccess.getLetVariableCSAccess().getInitExpressionAssignment_4(), "rule__LetVariableCS__InitExpressionAssignment_4");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.eclipse.ocl.examples.xtext.oclinecore.ui.contentassist.antlr.internal.InternalOCLinEcoreParser typedParser = (org.eclipse.ocl.examples.xtext.oclinecore.ui.contentassist.antlr.internal.InternalOCLinEcoreParser) parser;
			typedParser.entryRuleDocumentCS();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public OCLinEcoreGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(OCLinEcoreGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}