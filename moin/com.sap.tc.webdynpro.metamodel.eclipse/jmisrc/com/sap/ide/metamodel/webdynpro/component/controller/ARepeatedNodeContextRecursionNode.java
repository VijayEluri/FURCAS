/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.component.controller;
/**
 * This interface is not intended to be implemented by clients.
 */
public interface ARepeatedNodeContextRecursionNode extends com.sap.tc.moin.repository.mmi.reflect.RefAssociation
{
    // association extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.ide.metamodel.webdynpro.component.controller.ARepeatedNodeContextRecursionNode> ASSOCIATION_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.ide.metamodel.webdynpro.component.controller.ARepeatedNodeContextRecursionNode>("45DDACEEBDA05D393D514C213322AE5C4C0F8F6C", "sap.com/tc/moin/webdynpro", "WebDynpro", "component", "controller", "A_RepeatedNode_contextRecursionNode"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 


    // association interface
    public boolean exists(com.sap.ide.metamodel.webdynpro.component.controller.ContextNode _RepeatedNode, com.sap.ide.metamodel.webdynpro.component.controller.ContextRecursionNode _ContextRecursionNode) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.ide.metamodel.webdynpro.component.controller.ContextNode getRepeatedNode(com.sap.ide.metamodel.webdynpro.component.controller.ContextRecursionNode _ContextRecursionNode) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public java.util.Collection<com.sap.ide.metamodel.webdynpro.component.controller.ContextRecursionNode> getContextRecursionNode(com.sap.ide.metamodel.webdynpro.component.controller.ContextNode _RepeatedNode) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean add(com.sap.ide.metamodel.webdynpro.component.controller.ContextNode _RepeatedNode, com.sap.ide.metamodel.webdynpro.component.controller.ContextRecursionNode _ContextRecursionNode) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean remove(com.sap.ide.metamodel.webdynpro.component.controller.ContextNode _RepeatedNode, com.sap.ide.metamodel.webdynpro.component.controller.ContextRecursionNode _ContextRecursionNode) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
}