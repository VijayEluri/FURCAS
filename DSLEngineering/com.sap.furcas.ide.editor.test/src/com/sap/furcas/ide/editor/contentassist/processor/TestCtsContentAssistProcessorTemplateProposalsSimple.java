package com.sap.furcas.ide.editor.contentassist.processor;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCtsContentAssistProcessorTemplateProposalsSimple extends CtsContentAssistProcessorEditorTestMetamodelTestBase {

    @BeforeClass
    public static void generateParser() throws Exception {
        initMetamodelTestbase("TemplateProposals");
    }

    @Before
    public void initProcessor() throws Exception {
        initProcessorForPrefix("Simple");
    }

    @Test
    public void beginningOfFile() {
        List<String> expected = new ArrayList<String>();
        expected.add("library");
        expected.add("library had an author mr name that was hardly popular and always hard working");
        expected.add("library had an author mr name that was unpopular and always hard working");
        expected.add("library had an author mr name that was very popular and always hard working");
        expected.add("library has an author mr name that was hardly popular and always hard working");
        expected.add("library has an author mr name that was unpopular and always hard working");
        expected.add("library has an author mr name that was very popular and always hard working");
        expected.add("state_library");
        expected.add("state_library had an author mr name that was hardly popular and always hard working");
        expected.add("state_library had an author mr name that was unpopular and always hard working");
        expected.add("state_library had an author mr name that was very popular and always hard working");
        expected.add("state_library has an author mr name that was hardly popular and always hard working");
        expected.add("state_library has an author mr name that was unpopular and always hard working");
        expected.add("state_library has an author mr name that was very popular and always hard working");
        assertDisplayStrings(expected, 0, 0);
    }

    @Test
    public void insideFirstToken() {
        List<String> expected = new ArrayList<String>();
        expected.add("library");
        expected.add("library had an author mr name that was hardly popular and always hard working");
        expected.add("library had an author mr name that was unpopular and always hard working");
        expected.add("library had an author mr name that was very popular and always hard working");
        expected.add("library has an author mr name that was hardly popular and always hard working");
        expected.add("library has an author mr name that was unpopular and always hard working");
        expected.add("library has an author mr name that was very popular and always hard working");

        assertDisplayStrings(expected, 0, 3);
    }

    @Test
    public void atClassTemplate() {
        List<String> expected = new ArrayList<String>();
        expected.add("author");
        expected.add("author mr name");

        // should trigger when at start of a class template

        assertDisplayStrings(expected, 0, 15);
    }

    @Test
    public void atFunctionTemplate() {
        List<String> expected = new ArrayList<String>();
        expected.add("mr");
        expected.add("mr name");

        // should also trigger when at start of a function template

        assertDisplayStrings(expected, 0, 22);
    }

    @Test
    public void atAlternative() {
        List<String> expected = new ArrayList<String>();
        expected.add("hardly");
        expected.add("hardly popular");
        expected.add("unpopular");
        expected.add("very");
        expected.add("very popular");

        // should also trigger when at start of an alternative

        assertDisplayStrings(expected, 0, 39);
    }
}
