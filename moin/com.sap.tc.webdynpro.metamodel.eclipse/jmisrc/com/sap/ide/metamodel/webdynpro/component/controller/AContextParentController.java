/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.component.controller;
/**
 * This interface is not intended to be implemented by clients.
 */
public interface AContextParentController extends com.sap.tc.moin.repository.mmi.reflect.RefAssociation
{
    // association extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.ide.metamodel.webdynpro.component.controller.AContextParentController> ASSOCIATION_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.ide.metamodel.webdynpro.component.controller.AContextParentController>("45DDACEE25B995EA9EFA4B673268C64CE18F78DF", "sap.com/tc/moin/webdynpro", "WebDynpro", "component", "controller", "A_Context_ParentController"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 


    // association interface
    public boolean exists(com.sap.ide.metamodel.webdynpro.component.controller.ContextNode _Context, com.sap.ide.metamodel.webdynpro.component.controller.Controller _ParentController) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.ide.metamodel.webdynpro.component.controller.ContextNode getContext(com.sap.ide.metamodel.webdynpro.component.controller.Controller _ParentController) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.ide.metamodel.webdynpro.component.controller.Controller getParentController(com.sap.ide.metamodel.webdynpro.component.controller.ContextNode _Context) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean add(com.sap.ide.metamodel.webdynpro.component.controller.ContextNode _Context, com.sap.ide.metamodel.webdynpro.component.controller.Controller _ParentController) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean remove(com.sap.ide.metamodel.webdynpro.component.controller.ContextNode _Context, com.sap.ide.metamodel.webdynpro.component.controller.Controller _ParentController) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
}