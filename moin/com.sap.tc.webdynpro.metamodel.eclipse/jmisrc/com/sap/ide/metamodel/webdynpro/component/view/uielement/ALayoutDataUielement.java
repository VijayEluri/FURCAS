/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.component.view.uielement;
/**
 * A UI element may carry layout data that is used by the layout manager
 * of its parent container.
 * This interface is not intended to be implemented by clients.
 */
public interface ALayoutDataUielement extends com.sap.tc.moin.repository.mmi.reflect.RefAssociation
{
    // association extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.ide.metamodel.webdynpro.component.view.uielement.ALayoutDataUielement> ASSOCIATION_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.ide.metamodel.webdynpro.component.view.uielement.ALayoutDataUielement>("45DDACEE7022DBDA8724450D1D7495105B33D1D2", "sap.com/tc/moin/webdynpro", "WebDynpro", "component", "view", "uielement", "A_LayoutData_UIElement"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ 


    // association interface
    public boolean exists(com.sap.ide.metamodel.webdynpro.component.view.uielement.LayoutData _LayoutData, com.sap.ide.metamodel.webdynpro.component.view.uielement.Uielement _Uielement) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.ide.metamodel.webdynpro.component.view.uielement.LayoutData getLayoutData(com.sap.ide.metamodel.webdynpro.component.view.uielement.Uielement _Uielement) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.ide.metamodel.webdynpro.component.view.uielement.Uielement getUielement(com.sap.ide.metamodel.webdynpro.component.view.uielement.LayoutData _LayoutData) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean add(com.sap.ide.metamodel.webdynpro.component.view.uielement.LayoutData _LayoutData, com.sap.ide.metamodel.webdynpro.component.view.uielement.Uielement _Uielement) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean remove(com.sap.ide.metamodel.webdynpro.component.view.uielement.LayoutData _LayoutData, com.sap.ide.metamodel.webdynpro.component.view.uielement.Uielement _Uielement) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
}