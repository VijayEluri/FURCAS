package com.sap.furcas.ide.projectwizard.test;

import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.junit.BeforeClass;
import org.junit.Test;

import com.sap.furcas.ide.projectwizard.util.CodeGenerationException;
import com.sap.furcas.ide.projectwizard.util.ProjectInfo;
import com.sap.furcas.ide.projectwizard.util.SourceCodeFactory;
import com.sap.furcas.parsergenerator.TCSSyntaxContainerBean;
import com.sap.furcas.runtime.parser.ParserFacade;
import com.sap.furcas.runtime.parser.exceptions.UnknownProductionRuleException;
import com.sap.furcas.runtime.parser.testbase.GeneratedParserBasedTest;
import com.sap.furcas.runtime.parser.testbase.GeneratedParserTestConfiguration;
import com.sap.furcas.runtime.parser.testbase.stubs.StubParsingHelper;

/**
 * Simple Test for the .tcs file generated by the projectwizard, using the ForcedLower property arg.
 */
public class ProjectWizardTCSTest extends GeneratedParserBasedTest {

    private static final String LANGUAGE = "Mydsl";
    private static final File[] METAMODELS = { new File("../com.sap.furcas.ide.projectwizard.test/model/Mydsl.ecore") };

    private static StubParsingHelper parsingHelper;

    @BeforeClass
    public static void setupParser() throws Exception {
        GeneratedParserTestConfiguration testConfig = new GeneratedParserTestConfiguration(LANGUAGE, getTCS(), METAMODELS);
        TCSSyntaxContainerBean syntaxBean = parseSyntax(testConfig);
        ParserFacade facade = generateParserForLanguage(syntaxBean, testConfig, new ClassLookupImpl());
        parsingHelper = new StubParsingHelper(facade);
    }

    /**
     * Tests references are set, this protects against bugs relating to naming of classes.
     * 
     * @throws Exception
     */
    @Test
    public void testForcedLower() {
        // Expect no errors
        String sample = "ExampleClass";
        
        /*StubModelAdapter result = */try {
            parsingHelper.parseString(sample, 0);
        } catch (IOException e) {
            fail("parsing failed due to IOException");
            e.printStackTrace();
        } catch (UnknownProductionRuleException e) {
            fail("parsing failed due to UnknownProductionRuleException");
            e.printStackTrace();
        }

    }

    public static File getTCS() {
        File TCS = new File("../com.sap.furcas.ide.projectwizard.test/generationTemp/generated/Mydsl.tcs");
        SourceCodeFactory scf = new SourceCodeFactory();
        ProjectInfo pi = new ProjectInfo();
        pi.setLanguageName("Mydsl");
        pi.setClassName("ExampleClass");
        String newContent;
        try {
            newContent = scf.createSampleTCS(pi);
            InputStream newStream = new ByteArrayInputStream(newContent.getBytes("UTF-8"));
            scf.writeToFile(newStream, TCS);
            newStream.close();
        } catch (CodeGenerationException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
        
        return TCS;
    }

}