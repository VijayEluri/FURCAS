/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.component.controller;
/**
 * This interface is not intended to be implemented by clients.
 */
public interface AContextNodeStructure extends com.sap.tc.moin.repository.mmi.reflect.RefAssociation
{
    // association extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.ide.metamodel.webdynpro.component.controller.AContextNodeStructure> ASSOCIATION_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.ide.metamodel.webdynpro.component.controller.AContextNodeStructure>("45DDACEEDE5D1184C251435010EBF77D9A27CC2C", "sap.com/tc/moin/webdynpro", "WebDynpro", "component", "controller", "A_contextNode_Structure"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 


    // association interface
    public boolean exists(com.sap.ide.metamodel.webdynpro.component.controller.ContextNode _ContextNode, com.sap.ide.metamodel.dictionary.datatype.DtStructure _Structure) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public java.util.Collection<com.sap.ide.metamodel.webdynpro.component.controller.ContextNode> getContextNode(com.sap.ide.metamodel.dictionary.datatype.DtStructure _Structure) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.ide.metamodel.dictionary.datatype.DtStructure getStructure(com.sap.ide.metamodel.webdynpro.component.controller.ContextNode _ContextNode) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean add(com.sap.ide.metamodel.webdynpro.component.controller.ContextNode _ContextNode, com.sap.ide.metamodel.dictionary.datatype.DtStructure _Structure) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean remove(com.sap.ide.metamodel.webdynpro.component.controller.ContextNode _ContextNode, com.sap.ide.metamodel.dictionary.datatype.DtStructure _Structure) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
}