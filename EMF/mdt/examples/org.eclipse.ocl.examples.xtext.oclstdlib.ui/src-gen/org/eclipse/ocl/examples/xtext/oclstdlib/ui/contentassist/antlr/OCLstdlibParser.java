/*
* generated by Xtext
*/
package org.eclipse.ocl.examples.xtext.oclstdlib.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.eclipse.ocl.examples.xtext.oclstdlib.services.OCLstdlibGrammarAccess;

public class OCLstdlibParser extends AbstractContentAssistParser {
	
	@Inject
	private OCLstdlibGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.eclipse.ocl.examples.xtext.oclstdlib.ui.contentassist.antlr.internal.InternalOCLstdlibParser createParser() {
		org.eclipse.ocl.examples.xtext.oclstdlib.ui.contentassist.antlr.internal.InternalOCLstdlibParser result = new org.eclipse.ocl.examples.xtext.oclstdlib.ui.contentassist.antlr.internal.InternalOCLstdlibParser(null);
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
					put(grammarAccess.getIdentifierAccess().getAlternatives(), "rule__Identifier__Alternatives");
					put(grammarAccess.getRestrictedKeywordsAccess().getAlternatives(), "rule__RestrictedKeywords__Alternatives");
					put(grammarAccess.getNameAccess().getAlternatives(), "rule__Name__Alternatives");
					put(grammarAccess.getLibClassCSAccess().getAlternatives_5(), "rule__LibClassCS__Alternatives_5");
					put(grammarAccess.getLibClassCSAccess().getOperationsAlternatives_5_0_0(), "rule__LibClassCS__OperationsAlternatives_5_0_0");
					put(grammarAccess.getLibPackageCSAccess().getAlternatives_3(), "rule__LibPackageCS__Alternatives_3");
					put(grammarAccess.getLibParameterCSAccess().getAlternatives_3_1(), "rule__LibParameterCS__Alternatives_3_1");
					put(grammarAccess.getLibParameterCSAccess().getMultiplicityAlternatives_3_1_1_0(), "rule__LibParameterCS__MultiplicityAlternatives_3_1_1_0");
					put(grammarAccess.getLibTypeParameterCSAccess().getAlternatives_1(), "rule__LibTypeParameterCS__Alternatives_1");
					put(grammarAccess.getLibTypeRefCSAccess().getAlternatives(), "rule__LibTypeRefCS__Alternatives");
					put(grammarAccess.getLibTypedRefCSAccess().getAlternatives(), "rule__LibTypedRefCS__Alternatives");
					put(grammarAccess.getLibWildcardTypeRefCSAccess().getAlternatives_2(), "rule__LibWildcardTypeRefCS__Alternatives_2");
					put(grammarAccess.getLibraryAccess().getGroup(), "rule__Library__Group__0");
					put(grammarAccess.getLibImportCSAccess().getGroup(), "rule__LibImportCS__Group__0");
					put(grammarAccess.getLibImportCSAccess().getGroup_1(), "rule__LibImportCS__Group_1__0");
					put(grammarAccess.getLibClassCSAccess().getGroup(), "rule__LibClassCS__Group__0");
					put(grammarAccess.getLibClassCSAccess().getGroup_2(), "rule__LibClassCS__Group_2__0");
					put(grammarAccess.getLibClassCSAccess().getGroup_2_2(), "rule__LibClassCS__Group_2_2__0");
					put(grammarAccess.getLibClassCSAccess().getGroup_3(), "rule__LibClassCS__Group_3__0");
					put(grammarAccess.getLibClassCSAccess().getGroup_3_2(), "rule__LibClassCS__Group_3_2__0");
					put(grammarAccess.getLibIterationCSAccess().getGroup(), "rule__LibIterationCS__Group__0");
					put(grammarAccess.getLibIterationCSAccess().getGroup_2(), "rule__LibIterationCS__Group_2__0");
					put(grammarAccess.getLibIterationCSAccess().getGroup_2_2(), "rule__LibIterationCS__Group_2_2__0");
					put(grammarAccess.getLibIterationCSAccess().getGroup_5(), "rule__LibIterationCS__Group_5__0");
					put(grammarAccess.getLibOperationCSAccess().getGroup(), "rule__LibOperationCS__Group__0");
					put(grammarAccess.getLibOperationCSAccess().getGroup_2(), "rule__LibOperationCS__Group_2__0");
					put(grammarAccess.getLibOperationCSAccess().getGroup_2_2(), "rule__LibOperationCS__Group_2_2__0");
					put(grammarAccess.getLibOperationCSAccess().getGroup_4(), "rule__LibOperationCS__Group_4__0");
					put(grammarAccess.getLibOperationCSAccess().getGroup_4_1(), "rule__LibOperationCS__Group_4_1__0");
					put(grammarAccess.getLibPackageCSAccess().getGroup(), "rule__LibPackageCS__Group__0");
					put(grammarAccess.getLibParameterCSAccess().getGroup(), "rule__LibParameterCS__Group__0");
					put(grammarAccess.getLibParameterCSAccess().getGroup_3(), "rule__LibParameterCS__Group_3__0");
					put(grammarAccess.getLibParameterCSAccess().getGroup_3_1_0(), "rule__LibParameterCS__Group_3_1_0__0");
					put(grammarAccess.getLibParameterCSAccess().getGroup_3_1_0_1(), "rule__LibParameterCS__Group_3_1_0_1__0");
					put(grammarAccess.getLibPropertyCSAccess().getGroup(), "rule__LibPropertyCS__Group__0");
					put(grammarAccess.getLibQualifiedTypeRefCSAccess().getGroup(), "rule__LibQualifiedTypeRefCS__Group__0");
					put(grammarAccess.getLibQualifiedTypeRefCSAccess().getGroup_1(), "rule__LibQualifiedTypeRefCS__Group_1__0");
					put(grammarAccess.getLibQualifiedTypeRefCSAccess().getGroup_1_2(), "rule__LibQualifiedTypeRefCS__Group_1_2__0");
					put(grammarAccess.getLibTypeParameterCSAccess().getGroup(), "rule__LibTypeParameterCS__Group__0");
					put(grammarAccess.getLibTypeParameterCSAccess().getGroup_1_0(), "rule__LibTypeParameterCS__Group_1_0__0");
					put(grammarAccess.getLibTypeParameterCSAccess().getGroup_1_0_2(), "rule__LibTypeParameterCS__Group_1_0_2__0");
					put(grammarAccess.getLibTypeParameterCSAccess().getGroup_1_1(), "rule__LibTypeParameterCS__Group_1_1__0");
					put(grammarAccess.getLibTypedTypeRefCSAccess().getGroup(), "rule__LibTypedTypeRefCS__Group__0");
					put(grammarAccess.getLibTypedTypeRefCSAccess().getGroup_1(), "rule__LibTypedTypeRefCS__Group_1__0");
					put(grammarAccess.getLibTypedTypeRefCSAccess().getGroup_1_2(), "rule__LibTypedTypeRefCS__Group_1_2__0");
					put(grammarAccess.getLibWildcardTypeRefCSAccess().getGroup(), "rule__LibWildcardTypeRefCS__Group__0");
					put(grammarAccess.getLibWildcardTypeRefCSAccess().getGroup_2_0(), "rule__LibWildcardTypeRefCS__Group_2_0__0");
					put(grammarAccess.getLibWildcardTypeRefCSAccess().getGroup_2_1(), "rule__LibWildcardTypeRefCS__Group_2_1__0");
					put(grammarAccess.getLibraryAccess().getNameAssignment_1(), "rule__Library__NameAssignment_1");
					put(grammarAccess.getLibraryAccess().getImportsAssignment_2(), "rule__Library__ImportsAssignment_2");
					put(grammarAccess.getLibraryAccess().getPackagesAssignment_4(), "rule__Library__PackagesAssignment_4");
					put(grammarAccess.getLibImportCSAccess().getNameAssignment_1_0(), "rule__LibImportCS__NameAssignment_1_0");
					put(grammarAccess.getLibImportCSAccess().getNamespaceAssignment_2(), "rule__LibImportCS__NamespaceAssignment_2");
					put(grammarAccess.getLibClassCSAccess().getNameAssignment_1(), "rule__LibClassCS__NameAssignment_1");
					put(grammarAccess.getLibClassCSAccess().getTypeParametersAssignment_2_1(), "rule__LibClassCS__TypeParametersAssignment_2_1");
					put(grammarAccess.getLibClassCSAccess().getTypeParametersAssignment_2_2_1(), "rule__LibClassCS__TypeParametersAssignment_2_2_1");
					put(grammarAccess.getLibClassCSAccess().getConformsToAssignment_3_1(), "rule__LibClassCS__ConformsToAssignment_3_1");
					put(grammarAccess.getLibClassCSAccess().getConformsToAssignment_3_2_1(), "rule__LibClassCS__ConformsToAssignment_3_2_1");
					put(grammarAccess.getLibClassCSAccess().getOperationsAssignment_5_0(), "rule__LibClassCS__OperationsAssignment_5_0");
					put(grammarAccess.getLibClassCSAccess().getStructuralFeaturesAssignment_5_1(), "rule__LibClassCS__StructuralFeaturesAssignment_5_1");
					put(grammarAccess.getLibIterationCSAccess().getNameAssignment_1(), "rule__LibIterationCS__NameAssignment_1");
					put(grammarAccess.getLibIterationCSAccess().getTypeParametersAssignment_2_1(), "rule__LibIterationCS__TypeParametersAssignment_2_1");
					put(grammarAccess.getLibIterationCSAccess().getTypeParametersAssignment_2_2_1(), "rule__LibIterationCS__TypeParametersAssignment_2_2_1");
					put(grammarAccess.getLibIterationCSAccess().getParametersAssignment_4(), "rule__LibIterationCS__ParametersAssignment_4");
					put(grammarAccess.getLibIterationCSAccess().getParametersAssignment_5_1(), "rule__LibIterationCS__ParametersAssignment_5_1");
					put(grammarAccess.getLibIterationCSAccess().getTypeAssignment_8(), "rule__LibIterationCS__TypeAssignment_8");
					put(grammarAccess.getLibIterationCSAccess().getClassAssignment_10(), "rule__LibIterationCS__ClassAssignment_10");
					put(grammarAccess.getLibOperationCSAccess().getNameAssignment_1(), "rule__LibOperationCS__NameAssignment_1");
					put(grammarAccess.getLibOperationCSAccess().getTypeParametersAssignment_2_1(), "rule__LibOperationCS__TypeParametersAssignment_2_1");
					put(grammarAccess.getLibOperationCSAccess().getTypeParametersAssignment_2_2_1(), "rule__LibOperationCS__TypeParametersAssignment_2_2_1");
					put(grammarAccess.getLibOperationCSAccess().getParametersAssignment_4_0(), "rule__LibOperationCS__ParametersAssignment_4_0");
					put(grammarAccess.getLibOperationCSAccess().getParametersAssignment_4_1_1(), "rule__LibOperationCS__ParametersAssignment_4_1_1");
					put(grammarAccess.getLibOperationCSAccess().getTypeAssignment_7(), "rule__LibOperationCS__TypeAssignment_7");
					put(grammarAccess.getLibOperationCSAccess().getClassAssignment_9(), "rule__LibOperationCS__ClassAssignment_9");
					put(grammarAccess.getLibPackageCSAccess().getNameAssignment_1(), "rule__LibPackageCS__NameAssignment_1");
					put(grammarAccess.getLibPackageCSAccess().getSubpackagesAssignment_3_0(), "rule__LibPackageCS__SubpackagesAssignment_3_0");
					put(grammarAccess.getLibPackageCSAccess().getClassifiersAssignment_3_1(), "rule__LibPackageCS__ClassifiersAssignment_3_1");
					put(grammarAccess.getLibParameterCSAccess().getNameAssignment_0(), "rule__LibParameterCS__NameAssignment_0");
					put(grammarAccess.getLibParameterCSAccess().getTypeAssignment_2(), "rule__LibParameterCS__TypeAssignment_2");
					put(grammarAccess.getLibParameterCSAccess().getLowerAssignment_3_1_0_0(), "rule__LibParameterCS__LowerAssignment_3_1_0_0");
					put(grammarAccess.getLibParameterCSAccess().getUpperAssignment_3_1_0_1_1(), "rule__LibParameterCS__UpperAssignment_3_1_0_1_1");
					put(grammarAccess.getLibParameterCSAccess().getMultiplicityAssignment_3_1_1(), "rule__LibParameterCS__MultiplicityAssignment_3_1_1");
					put(grammarAccess.getLibPropertyCSAccess().getNameAssignment_1(), "rule__LibPropertyCS__NameAssignment_1");
					put(grammarAccess.getLibPropertyCSAccess().getTypeAssignment_3(), "rule__LibPropertyCS__TypeAssignment_3");
					put(grammarAccess.getLibPropertyCSAccess().getClassAssignment_5(), "rule__LibPropertyCS__ClassAssignment_5");
					put(grammarAccess.getLibQualifiedTypeRefCSAccess().getNamespaceAssignment_0(), "rule__LibQualifiedTypeRefCS__NamespaceAssignment_0");
					put(grammarAccess.getLibQualifiedTypeRefCSAccess().getTypeArgumentsAssignment_1_1(), "rule__LibQualifiedTypeRefCS__TypeArgumentsAssignment_1_1");
					put(grammarAccess.getLibQualifiedTypeRefCSAccess().getTypeArgumentsAssignment_1_2_1(), "rule__LibQualifiedTypeRefCS__TypeArgumentsAssignment_1_2_1");
					put(grammarAccess.getLibQualifiedTypeRefCSAccess().getElementAssignment_3(), "rule__LibQualifiedTypeRefCS__ElementAssignment_3");
					put(grammarAccess.getLibTypeParameterCSAccess().getNameAssignment_0(), "rule__LibTypeParameterCS__NameAssignment_0");
					put(grammarAccess.getLibTypeParameterCSAccess().getExtendsAssignment_1_0_1(), "rule__LibTypeParameterCS__ExtendsAssignment_1_0_1");
					put(grammarAccess.getLibTypeParameterCSAccess().getExtendsAssignment_1_0_2_1(), "rule__LibTypeParameterCS__ExtendsAssignment_1_0_2_1");
					put(grammarAccess.getLibTypeParameterCSAccess().getSuperAssignment_1_1_1(), "rule__LibTypeParameterCS__SuperAssignment_1_1_1");
					put(grammarAccess.getLibTypedTypeRefCSAccess().getTypeAssignment_0(), "rule__LibTypedTypeRefCS__TypeAssignment_0");
					put(grammarAccess.getLibTypedTypeRefCSAccess().getTypeArgumentsAssignment_1_1(), "rule__LibTypedTypeRefCS__TypeArgumentsAssignment_1_1");
					put(grammarAccess.getLibTypedTypeRefCSAccess().getTypeArgumentsAssignment_1_2_1(), "rule__LibTypedTypeRefCS__TypeArgumentsAssignment_1_2_1");
					put(grammarAccess.getLibWildcardTypeRefCSAccess().getExtendsAssignment_2_0_1(), "rule__LibWildcardTypeRefCS__ExtendsAssignment_2_0_1");
					put(grammarAccess.getLibWildcardTypeRefCSAccess().getSuperAssignment_2_1_1(), "rule__LibWildcardTypeRefCS__SuperAssignment_2_1_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.eclipse.ocl.examples.xtext.oclstdlib.ui.contentassist.antlr.internal.InternalOCLstdlibParser typedParser = (org.eclipse.ocl.examples.xtext.oclstdlib.ui.contentassist.antlr.internal.InternalOCLstdlibParser) parser;
			typedParser.entryRuleLibrary();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public OCLstdlibGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(OCLstdlibGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}