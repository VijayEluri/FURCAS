/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.component;
/**
 * This interface is not intended to be implemented by clients.
 */
public interface AUsedBackendResourcesComponent extends com.sap.tc.moin.repository.mmi.reflect.RefAssociation
{
    // association extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.ide.metamodel.webdynpro.component.AUsedBackendResourcesComponent> ASSOCIATION_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.ide.metamodel.webdynpro.component.AUsedBackendResourcesComponent>("45DDACEE4C739331BCAE4B5D1740905FD439D784", "sap.com/tc/moin/webdynpro", "WebDynpro", "component", "A_UsedBackendResources_component"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ 


    // association interface
    public boolean exists(com.sap.ide.metamodel.webdynpro.component.BackendResource _UsedBackendResources, com.sap.ide.metamodel.webdynpro.component.Component _Component) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public java.util.List<com.sap.ide.metamodel.webdynpro.component.BackendResource> getUsedBackendResources(com.sap.ide.metamodel.webdynpro.component.Component _Component) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.ide.metamodel.webdynpro.component.Component getComponent(com.sap.ide.metamodel.webdynpro.component.BackendResource _UsedBackendResources) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean add(com.sap.ide.metamodel.webdynpro.component.BackendResource _UsedBackendResources, com.sap.ide.metamodel.webdynpro.component.Component _Component) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean remove(com.sap.ide.metamodel.webdynpro.component.BackendResource _UsedBackendResources, com.sap.ide.metamodel.webdynpro.component.Component _Component) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
}