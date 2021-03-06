/**
 * 
 */
package com.sap.furcas.parsergenerator.tcs.t2m.grammar;

import static com.sap.furcas.parsergenerator.testutils.RuleComparisonHelper.tokens;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.junit.Test;

import com.sap.furcas.metamodel.FURCAS.TCS.EnumLiteralMapping;
import com.sap.furcas.metamodel.FURCAS.TCS.stubs.EnumLiteralMappingStub;
import com.sap.furcas.metamodel.FURCAS.TCS.stubs.EnumTemplateStub;
import com.sap.furcas.parsergenerator.tcs.t2m.grammar.handlerStub.ANTLR3WriterStub;
import com.sap.furcas.parsergenerator.tcs.t2m.grammar.handlerStub.MetaLookupStub;
import com.sap.furcas.parsergenerator.tcs.t2m.grammar.handlerStub.MetaModelElementResolutionHelperStub;
import com.sap.furcas.parsergenerator.tcs.t2m.grammar.handlerStub.RuleBufferFactoryStub;
import com.sap.furcas.parsergenerator.tcs.t2m.grammar.handlerStub.TemplateNamingHelperStub;
import com.sap.furcas.runtime.common.interfaces.IMetaModelLookup;
import com.sap.furcas.runtime.tcs.TemplateNamingHelper;
import com.sap.furcas.test.testutils.StringListHelper;

/**
 * Probably one of the most important tests for DSL Engineering.
 */
public class TestEnumerationTemplateHandler {

  
    @Test
    public void testAddElement() throws Exception {

        ANTLR3WriterStub writerStub = new ANTLR3WriterStub();
        TemplateNamingHelperStub namingStub = new TemplateNamingHelperStub();
        IMetaModelLookup metaLookupStub = new MetaLookupStub();
        MetaModelElementResolutionHelperStub resolutionHelperStub = new MetaModelElementResolutionHelperStub();
        // Class under test
        EnumerationTemplateHandler enumHandler = new EnumerationTemplateHandler(writerStub, metaLookupStub, namingStub, resolutionHelperStub);


        EnumTemplateStub template = new EnumTemplateStub();
        template.names = StringListHelper.list("enumerationName");
        template.automatic = false;
        EList<EnumLiteralMapping> mappings = new BasicEList<EnumLiteralMapping>();
        template.mappings = mappings ;
        mappings.add(new EnumLiteralMappingStub("literal", "'sequenceElement'"));
        mappings.add(new EnumLiteralMappingStub("literal2", "'sequenceElement2'"));
        
        RuleBodyBufferFactory ruleBodyBufferFactory = new RuleBufferFactoryStub();
        
        enumHandler.addTemplate(template, ruleBodyBufferFactory);
        
        assertTrue(writerStub.rules.size() == 1);
        String result =writerStub.rules.get(0).toString();

        String expected = "enumerationName returns[Object ret2] @init{java.lang.Object ret=null;}"
            + " :"
            + " (('sequenceElement'){ret = createEnumLiteral(\"[enumerationName]\", \"literal\");} | ('sequenceElement2'){ret = createEnumLiteral(\"[enumerationName]\", \"literal2\");}) "
            + "{ "
            + "   ret2=ret; "
            + "  } ;";
        	
        
        List tokens = tokens( expected); 
        List tokens2 = tokens( result); 

        assertEquals(expected + " != " + result, tokens, tokens2);
    }

    @Test
    public void testAutomatic() throws Exception {
        ANTLR3WriterStub writerStub = new ANTLR3WriterStub();
        MetaLookupStub metaLookupStub = new MetaLookupStub();
        TemplateNamingHelper namingStub = new TemplateNamingHelperStub();
        MetaModelElementResolutionHelperStub resolutionHelperStub = new MetaModelElementResolutionHelperStub();
        // Class under test
        EnumerationTemplateHandler enumHandler = new EnumerationTemplateHandler(writerStub, metaLookupStub, namingStub, resolutionHelperStub);


        EnumTemplateStub template = new EnumTemplateStub();
        template.names = StringListHelper.list("enumerationName");
        // not implemented yet, waiting for TCS to explain what this is for.
        template.automatic = true;
        
        metaLookupStub.enumLiterals = new ArrayList<String>();
        metaLookupStub.enumLiterals.add("test1");
        metaLookupStub.enumLiterals.add("test2");
        
        RuleBodyBufferFactory ruleBodyBufferFactory = new RuleBufferFactoryStub();
        
        enumHandler.addTemplate(template, ruleBodyBufferFactory);
        String result =writerStub.rules.get(0).toString();

        String expected = "enumerationName returns[Object ret2] @init{java.lang.Object ret=null;}"
            + " :"
            + " (('test1'){ret = createEnumLiteral(\"[enumerationName]\", \"test1\");} | ('test2'){ret = createEnumLiteral(\"[enumerationName]\", \"test2\");}) "
            + "{ "
            + "   ret2=ret; "
            + "  } ;";
        	
        
        List tokens = tokens( expected); 
        List tokens2 = tokens( result); 

        assertEquals(expected + " != " + result, tokens, tokens2);
    }
    
 
}
