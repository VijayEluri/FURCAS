package com.sap.ide.cts.editor.prettyprint.incremental;

import junit.framework.Assert;

import org.eclipse.core.runtime.Path;
import org.junit.Ignore;
import org.junit.Test;

import com.sap.furcas.metamodel.FURCAS.textblocks.TextBlock;
import com.sap.furcas.runtime.textblocks.TbNavigationUtil;
import com.sap.ide.cts.editor.AbstractGrammarBasedEditor;
import com.sap.ide.cts.editor.action.PrettyPrintAction;

/**
 * This class needs a total rewrite. It requires user interaction...
 * 
 */
public class IncrementalPrettyPrinterTest extends IncrementalPrettyPrinterHelperTest {
    @Test
    @Ignore
    public void prettyPrintEmptyClass() {
	NgpmPackage rootPkg = connection.getPackage(NgpmPackage.PACKAGE_DESCRIPTOR);
	SapClass clazz = (SapClass) rootPkg.getData().getClasses().getSapClass().refCreateInstanceInPartition(
		ModelManager.getPartitionService().getPartition(connection, getProject(),
			new Path("src/Package1235568260162.types")));
	clazz.setName("IppTestClass1");
	PrettyPrintAction action = new PrettyPrintAction((MofClass) clazz.refMetaObject(), clazz, true);
	action.runWithEvent(null);
	AbstractGrammarBasedEditor editor = openEditor(clazz);

	String ppClazz = action.getRootBlock().getCachedString();
	if (ppClazz != null) {
	    this.printTextBlock(action.getRootBlock());
	    Assert.assertTrue(ppClazz.contains("class " + clazz.getName()));
	}

	close(editor);
    }

    @Test
    @Ignore
    public void prettyPrintMethodWithinClass() {
	NgpmPackage rootPkg = connection.getPackage(NgpmPackage.PACKAGE_DESCRIPTOR);
	SapClass clazz = (SapClass) rootPkg.getData().getClasses().getSapClass().refCreateInstanceInPartition(
		ModelManager.getPartitionService().getPartition(connection, getProject(),
			new Path("src/Package1235568260162.types")));
	clazz.setName("IppTestClass2");
	MethodSignature method = (MethodSignature) rootPkg.getData().getClasses().getMethodSignature()
		.refCreateInstanceInPartition(
			ModelManager.getPartitionService().getPartition(connection, getProject(),
				new Path("src/Package1235568260162.types")));
	method.setName("testMethod");
	clazz.getOwnedSignatures().add(method);
	try {
	    connection.save();
	} catch (Exception e) {
	    e.printStackTrace();
	}
	PrettyPrintAction action = new PrettyPrintAction((MofClass) clazz.refMetaObject(), clazz, true);
	action.runWithEvent(null);
	AbstractGrammarBasedEditor editor = openEditor(clazz);
	this.printTextBlock(action.getRootBlock());
	close(editor);
    }

    @Test
    @Ignore
    public void prettyPrintMethodAfterChangesInDomainModel() {
	NgpmPackage rootPkg = connection.getPackage(NgpmPackage.PACKAGE_DESCRIPTOR);
	SapClass clazz = (SapClass) rootPkg.getData().getClasses().getSapClass().refCreateInstanceInPartition(
		ModelManager.getPartitionService().getPartition(connection, getProject(),
			new Path("src/Package1235568260162.types")));
	clazz.setName("IppTestClass3");
	MethodSignature method = (MethodSignature) rootPkg.getData().getClasses().getMethodSignature()
		.refCreateInstanceInPartition(
			ModelManager.getPartitionService().getPartition(connection, getProject(),
				new Path("src/Package1235568260162.types")));
	method.setName("testMethod");

	clazz.getOwnedSignatures().add(method);

	PrettyPrintAction action = new PrettyPrintAction((MofClass) clazz.refMetaObject(), clazz, false);
	action.runWithEvent(null);

	try {
	    connection.save();
	} catch (Exception e) {
	    e.printStackTrace();
	    return;
	}

	method.setName("testMethodChanged");

	PrettyPrintAction action2 = new PrettyPrintAction((MofClass) method.refMetaObject(), method, true);
	action2.runWithEvent(null);

	try {
	    connection.save();
	} catch (Exception e) {
	    e.printStackTrace();
	    return;
	}

	this.printTextBlock(action.getRootBlock());
    }

    @Test
    @Ignore
    public void prettyPrintAssociationAfterRename() {
	NgpmPackage rootPkg = connection.getPackage(NgpmPackage.PACKAGE_DESCRIPTOR);
	SapClass clazz = (SapClass) rootPkg.getData().getClasses().getSapClass().refCreateInstanceInPartition(
		ModelManager.getPartitionService().getPartition(connection, getProject(),
			new Path("src/Package1235568260162.types")));
	clazz.setName("IppClass4");
	SapClass clazz2 = (SapClass) rootPkg.getData().getClasses().getSapClass().refCreateInstanceInPartition(
		ModelManager.getPartitionService().getPartition(connection, getProject(),
			new Path("src/Package1235568260162.types")));
	clazz2.setName("IppClass5");
	Association assoc = (Association) rootPkg.getData().getClasses().getAssociation().refCreateInstanceInPartition(
		ModelManager.getPartitionService().getPartition(connection, getProject(),
			new Path("src/Package1235568260162.types")));
	AssociationEnd a1 = (AssociationEnd) rootPkg.getData().getClasses().getAssociationEnd().refCreateInstance();
	AssociationEnd a2 = (AssociationEnd) rootPkg.getData().getClasses().getAssociationEnd().refCreateInstance();
	a1.setName("a1");
	a1.setNavigable(true);
	a2.setName("a2");
	a2.setNavigable(true);
	ClassTypeDefinition a1ctd = (ClassTypeDefinition) rootPkg.getData().getClasses().getClassTypeDefinition()
		.refCreateInstance();
	a1ctd.setLowerMultiplicity(0);
	a1ctd.setUpperMultiplicity(1);
	a1ctd.setClazz(clazz2);
	ClassTypeDefinition a2ctd = (ClassTypeDefinition) rootPkg.getData().getClasses().getClassTypeDefinition()
		.refCreateInstance();
	a2ctd.setLowerMultiplicity(0);
	a2ctd.setUpperMultiplicity(1);
	a2ctd.setClazz(clazz);
	a1.setType(a1ctd);
	a2.setType(a2ctd);
	assoc.getEnds().add(a1);
	assoc.getEnds().add(a2);

	PrettyPrintAction action = new PrettyPrintAction((MofClass) clazz.refMetaObject(), clazz, false);
	action.runWithEvent(null);

	String ppClazz = action.getRootBlock().getCachedString();
	if (ppClazz != null) {
	    System.out.println(ppClazz);
	} else {
	    Assert.assertTrue("Pretty Printing not successfull!", false);
	}

	try {
	    connection.save();
	} catch (Exception e) {
	    e.printStackTrace();
	    return;
	}

	a1.setName("new_a1");

	PrettyPrintAction action2 = new PrettyPrintAction((MofClass) a2ctd.refMetaObject(), a2ctd, true);
	action2.runWithEvent(null);

	try {
	    connection.save();
	} catch (Exception e) {
	    e.printStackTrace();
	    return;
	}

	this.printTextBlock(action.getRootBlock());
    }

    @Test
    @Ignore
    public void prettyPrintAfterMethodRelocation() {
	NgpmPackage rootPkg = connection.getPackage(NgpmPackage.PACKAGE_DESCRIPTOR);
	SapClass clazz = (SapClass) rootPkg.getData().getClasses().getSapClass().refCreateInstanceInPartition(
		ModelManager.getPartitionService().getPartition(connection, getProject(),
			new Path("src/Package1235568260162.types")));
	clazz.setName("IppClass6");
	SapClass clazz2 = (SapClass) rootPkg.getData().getClasses().getSapClass().refCreateInstanceInPartition(
		ModelManager.getPartitionService().getPartition(connection, getProject(),
			new Path("src/Package1235568260162.types")));
	clazz2.setName("IppClass7");
	MethodSignature method = (MethodSignature) rootPkg.getData().getClasses().getMethodSignature()
		.refCreateInstanceInPartition(
			ModelManager.getPartitionService().getPartition(connection, getProject(),
				new Path("src/Package1235568260162.types")));
	method.setName("methodFromClass6");

	clazz.getOwnedSignatures().add(method);

	PrettyPrintAction action = new PrettyPrintAction((MofClass) clazz.refMetaObject(), clazz, false);
	action.runWithEvent(null);

	this.printTextBlock(action.getRootBlock());

	action = new PrettyPrintAction((MofClass) clazz2.refMetaObject(), clazz2, false);
	action.runWithEvent(null);

	this.printTextBlock(action.getRootBlock());

	clazz.getOwnedSignatures().add(method);

	action = new PrettyPrintAction((MofClass) clazz.refMetaObject(), clazz, false);
	action.runWithEvent(null);

	this.printTextBlock(action.getRootBlock());

	action = new PrettyPrintAction((MofClass) clazz2.refMetaObject(), clazz2, false);
	action.runWithEvent(null);

	this.printTextBlock(action.getRootBlock());
    }

    @Test
    @Ignore
    public void prettyPrintAfterTernaryChange() {
	NgpmPackage rootPkg = connection.getPackage(NgpmPackage.PACKAGE_DESCRIPTOR);
	SapClass clazz = (SapClass) rootPkg.getData().getClasses().getSapClass().refCreateInstanceInPartition(
		ModelManager.getPartitionService().getPartition(connection, getProject(),
			new Path("src/Package1235568260162.types")));
	clazz.setName("IppTestClass8");
	PrettyPrintAction action = new PrettyPrintAction((MofClass) clazz.refMetaObject(), clazz, false);
	action.runWithEvent(null);
	AbstractGrammarBasedEditor editor = openEditor(clazz);
	String ppClazz = action.getRootBlock().getCachedString();
	if (ppClazz != null) {
	    this.printTextBlock(action.getRootBlock());
	    Assert.assertTrue(ppClazz.contains("class " + clazz.getName()));
	}
	clazz.setValueType(true);
	action = new PrettyPrintAction((MofClass) clazz.refMetaObject(), clazz, false);
	action.runWithEvent(null);
	editor = openEditor(clazz);

	ppClazz = action.getRootBlock().getCachedString();
	if (ppClazz != null) {
	    this.printTextBlock(action.getRootBlock());
	    Assert.assertTrue(ppClazz.contains("value class " + clazz.getName()));
	}
	close(editor);
    }

    private void printTextBlock(TextBlock textblock) {
	if (textblock != null) {
	    String classString = TbNavigationUtil.getUltraRoot(textblock).getCachedString();
	    System.out.println(classString);
	}
    }
}