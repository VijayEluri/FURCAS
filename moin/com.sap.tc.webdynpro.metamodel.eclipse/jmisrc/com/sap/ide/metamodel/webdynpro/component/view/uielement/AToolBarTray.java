/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.component.view.uielement;
/**
 * A tray may contain a toolbar.
 * This interface is not intended to be implemented by clients.
 */
public interface AToolBarTray extends com.sap.tc.moin.repository.mmi.reflect.RefAssociation
{
    // association extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.ide.metamodel.webdynpro.component.view.uielement.AToolBarTray> ASSOCIATION_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.ide.metamodel.webdynpro.component.view.uielement.AToolBarTray>("45DDACEEC5F2AB97672D4D973C72DA649D237478", "sap.com/tc/moin/webdynpro", "WebDynpro", "component", "view", "uielement", "A_ToolBar_Tray"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ 


    // association interface
    public boolean exists(com.sap.ide.metamodel.webdynpro.component.view.uielement.ToolBar _ToolBar, com.sap.ide.metamodel.webdynpro.component.view.uielement.Tray _Tray) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.ide.metamodel.webdynpro.component.view.uielement.ToolBar getToolBar(com.sap.ide.metamodel.webdynpro.component.view.uielement.Tray _Tray) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.ide.metamodel.webdynpro.component.view.uielement.Tray getTray(com.sap.ide.metamodel.webdynpro.component.view.uielement.ToolBar _ToolBar) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean add(com.sap.ide.metamodel.webdynpro.component.view.uielement.ToolBar _ToolBar, com.sap.ide.metamodel.webdynpro.component.view.uielement.Tray _Tray) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean remove(com.sap.ide.metamodel.webdynpro.component.view.uielement.ToolBar _ToolBar, com.sap.ide.metamodel.webdynpro.component.view.uielement.Tray _Tray) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
}