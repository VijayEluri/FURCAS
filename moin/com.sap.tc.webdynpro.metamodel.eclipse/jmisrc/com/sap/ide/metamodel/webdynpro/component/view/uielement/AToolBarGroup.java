/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.component.view.uielement;
/**
 * A group may contain a toolbar.
 * This interface is not intended to be implemented by clients.
 */
public interface AToolBarGroup extends com.sap.tc.moin.repository.mmi.reflect.RefAssociation
{
    // association extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.ide.metamodel.webdynpro.component.view.uielement.AToolBarGroup> ASSOCIATION_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.ide.metamodel.webdynpro.component.view.uielement.AToolBarGroup>("45DDACEECA0B48C030E140000B28CB2DEE38EE28", "sap.com/tc/moin/webdynpro", "WebDynpro", "component", "view", "uielement", "A_ToolBar_Group"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ 


    // association interface
    public boolean exists(com.sap.ide.metamodel.webdynpro.component.view.uielement.ToolBar _ToolBar, com.sap.ide.metamodel.webdynpro.component.view.uielement.Group _Group) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.ide.metamodel.webdynpro.component.view.uielement.ToolBar getToolBar(com.sap.ide.metamodel.webdynpro.component.view.uielement.Group _Group) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.ide.metamodel.webdynpro.component.view.uielement.Group getGroup(com.sap.ide.metamodel.webdynpro.component.view.uielement.ToolBar _ToolBar) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean add(com.sap.ide.metamodel.webdynpro.component.view.uielement.ToolBar _ToolBar, com.sap.ide.metamodel.webdynpro.component.view.uielement.Group _Group) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean remove(com.sap.ide.metamodel.webdynpro.component.view.uielement.ToolBar _ToolBar, com.sap.ide.metamodel.webdynpro.component.view.uielement.Group _Group) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
}