package com.sap.ide.refactoring.test.allsuites;

import org.junit.runner.RunWith;

import com.sap.ide.cts.editor.test.util.ExtSuite;
import com.sap.ide.refactoring.action.rename.TestRename;
import com.sap.ide.refactoring.core.model.validation.TestValidationCommands;

@RunWith(ExtSuite.class)
@ExtSuite.SuiteClasses( {TestValidationCommands.class, TestRename.class})
@ExtSuite.SuitePackages( {})
public class RefactoringSuite {
    // needed to  hold annotation
}