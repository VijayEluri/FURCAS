/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.component;
/**
 * This interface is not intended to be implemented by clients.
 */
public interface AComponentControllerComponent extends com.sap.tc.moin.repository.mmi.reflect.RefAssociation
{
    // association extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.ide.metamodel.webdynpro.component.AComponentControllerComponent> ASSOCIATION_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.ide.metamodel.webdynpro.component.AComponentControllerComponent>("45DDACEEBBBDCB129C1C4BEA3D86D1AEF3564F8F", "sap.com/tc/moin/webdynpro", "WebDynpro", "component", "A_ComponentController_component"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ 


    // association interface
    public boolean exists(com.sap.ide.metamodel.webdynpro.component.controller.Controller _ComponentController, com.sap.ide.metamodel.webdynpro.component.Component _Component) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.ide.metamodel.webdynpro.component.controller.Controller getComponentController(com.sap.ide.metamodel.webdynpro.component.Component _Component) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.ide.metamodel.webdynpro.component.Component getComponent(com.sap.ide.metamodel.webdynpro.component.controller.Controller _ComponentController) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean add(com.sap.ide.metamodel.webdynpro.component.controller.Controller _ComponentController, com.sap.ide.metamodel.webdynpro.component.Component _Component) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean remove(com.sap.ide.metamodel.webdynpro.component.controller.Controller _ComponentController, com.sap.ide.metamodel.webdynpro.component.Component _Component) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
}