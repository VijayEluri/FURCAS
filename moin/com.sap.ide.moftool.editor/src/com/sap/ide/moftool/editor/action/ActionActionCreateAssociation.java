/*******************************************************************************
 * Copyright (c) 2005-2006 SAP AG (MITG-Version0.1) (ActionClass_DEFAULTEMPTY.xsl)
 *******************************************************************************/
package com.sap.ide.moftool.editor.action;

import com.sap.tc.moin.repository.mmi.model.MofPackage;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;

import com.sap.ide.moftool.editor.plugin.MOFToolEditorPlugin;

/**
 * Implementation of an (IAction based) Action, the action will be used to dynamically (via code) construct
 * contextMenus.
 * 
 * The Action may be independently constructed (Default Constructor) and runWithContext() called in a typed manner
 * directly This action is typically invoked on an EMPTY Table or Tree control, (e.g. for the Create New ... entry ), It
 * has an explicit constructor where the ROOT object ( Table/Tree Input, may be a RefObject or a ModelEditorInput) is
 * passed which is then handed to the implementation call!
 * 
 * @author SAP AG
 * @generated modified
 */
public class ActionActionCreateAssociation extends AbstractMoftoolAction<MofPackage> {

	public ActionActionCreateAssociation(IStructuredSelection selection, MofPackage inputObject) {
		super(selection, inputObject, Messages.ActionActionCreateAssociation_0_xbut, "ACTION_ActionCreateAssociation"); //$NON-NLS-1$
	}

	public ActionActionCreateAssociation() {
		this(StructuredSelection.EMPTY, null);
	}

	/**
	 * For DEFAULTEMPTY, only one call, passing the full selection is executed
	 * 
	 * @param structuredSelection
	 */
	public void runWithSelection(MofPackage inputObject, IStructuredSelection structuredSelection) {
		MOFToolEditorPlugin.getDefault().getExecMOFToolDefault().execActionCreateAssociation(inputObject);

	}
}