package com.sap.mi.tools.diagnostics.internal.actions;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;

import com.sap.mi.fwk.internal.tracing.MiLocations;
import com.sap.mi.tools.diagnostics.internal.model.PartitionNode;

/**
 * Clears the null partition
 * 
 * @author d031150
 */
public class ClearNullPartitionAction extends DiagnosticsViewerAction {

	private static final Logger stracer = Logger.getLogger(MiLocations.MI_DIAGNOSTICS);
	
    ClearNullPartitionAction(StructuredViewer viewer) {
        super("Clear", viewer); //$NON-NLS-1$
    }
    
    @Override
    protected boolean updateSelection(IStructuredSelection structuredSelection) {
        if (!structuredSelection.isEmpty()) {
            Object firstElement = structuredSelection.getFirstElement();
            if (firstElement instanceof PartitionNode) {
                PartitionNode partitionNode = (PartitionNode) firstElement;
                try {
					if (partitionNode.isNullPartition() && partitionNode.getParent().getNumberOfElementsInNullPartition() > 0) {
					    return true;
					}
				} catch (IOException e) {
					stracer.log(Level.SEVERE, e.getMessage(), e);
				}
            }
        }
        return false;
    }

    public boolean isAvailable() {
    	IStructuredSelection selection = getStructuredSelection();
        if (!selection.isEmpty()) {
            Object firstElement = selection.getFirstElement();
            if (firstElement instanceof PartitionNode) {
                PartitionNode partitionNode = (PartitionNode) firstElement;
                if (partitionNode.isNullPartition())
                    return true;
            }
        }
        return false;
    }

    @Override
    public void run() {
    	IStructuredSelection selection = getStructuredSelection();
    	Object firstElement = selection.getFirstElement();
        if (firstElement instanceof PartitionNode) {
        	PartitionNode partitionNode = (PartitionNode) firstElement;
            try {
				partitionNode.getParent().deleteAllElementsInNullPartition();            
			} 
            catch (IOException e) {
                ErrorDialog.openError(
                    mViewer.getControl().getShell(), 
                    "Error while deleting elements",  //$NON-NLS-1$
                    e.getMessage(), null);
            }
            mViewer.refresh();
        }
    }

}