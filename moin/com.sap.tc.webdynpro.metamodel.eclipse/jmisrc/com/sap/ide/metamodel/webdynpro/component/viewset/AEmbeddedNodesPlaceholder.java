/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.component.viewset;
/**
 * This interface is not intended to be implemented by clients.
 */
public interface AEmbeddedNodesPlaceholder extends com.sap.tc.moin.repository.mmi.reflect.RefAssociation
{
    // association extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.ide.metamodel.webdynpro.component.viewset.AEmbeddedNodesPlaceholder> ASSOCIATION_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.ide.metamodel.webdynpro.component.viewset.AEmbeddedNodesPlaceholder>("45DDACEE329178D75AF245B705D88738B6910163", "sap.com/tc/moin/webdynpro", "WebDynpro", "component", "viewset", "A_EmbeddedNodes_Placeholder"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 


    // association interface
    public boolean exists(com.sap.ide.metamodel.webdynpro.component.viewset.ViewsetHierarchyNode _EmbeddedNodes, com.sap.ide.metamodel.webdynpro.component.viewset.Placeholder _Placeholder) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public java.util.List<com.sap.ide.metamodel.webdynpro.component.viewset.ViewsetHierarchyNode> getEmbeddedNodes(com.sap.ide.metamodel.webdynpro.component.viewset.Placeholder _Placeholder) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.ide.metamodel.webdynpro.component.viewset.Placeholder getPlaceholder(com.sap.ide.metamodel.webdynpro.component.viewset.ViewsetHierarchyNode _EmbeddedNodes) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean add(com.sap.ide.metamodel.webdynpro.component.viewset.ViewsetHierarchyNode _EmbeddedNodes, com.sap.ide.metamodel.webdynpro.component.viewset.Placeholder _Placeholder) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean remove(com.sap.ide.metamodel.webdynpro.component.viewset.ViewsetHierarchyNode _EmbeddedNodes, com.sap.ide.metamodel.webdynpro.component.viewset.Placeholder _Placeholder) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
}