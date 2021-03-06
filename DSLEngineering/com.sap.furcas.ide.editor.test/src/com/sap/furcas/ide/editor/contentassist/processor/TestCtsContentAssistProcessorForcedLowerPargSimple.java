package com.sap.furcas.ide.editor.contentassist.processor;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCtsContentAssistProcessorForcedLowerPargSimple extends CtsContentAssistProcessorEditorTestMetamodelTestBase {

    @BeforeClass
    public static void generateParser() throws Exception {
        initMetamodelTestbase("ForcedLowerParg");
    }

    @Before
    public void initProcessor() throws Exception {
        initProcessorForPrefix("Simple");
    }

    @Test
    public void beginningOfFile() {
        List<String> expected = new ArrayList<String>();
        expected.add("library");
        expected.add("library { authors name }");

        assertDisplayStrings(expected, 0, 0);
    }

    @Test
    public void atForcedLowerProperty() {
        List<String> expected = new ArrayList<String>();
        expected.add("name");

        // should not list bracket

        assertDisplayStrings(expected, 0, 18);
    }

    @Test
    public void afterForcedLowerProperty() {
        List<String> expected = new ArrayList<String>();
        expected.add("name");
        expected.add("}");

        assertDisplayStrings(expected, 0, 24);
    }
}
