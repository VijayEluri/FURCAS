/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.component.viewset.__impl;

public final class AEmbeddedNodesPlaceholderImpl extends com.sap.tc.moin.repository.core.jmi.reflect.RefAssociationImpl
{
    // default constructor
    public AEmbeddedNodesPlaceholderImpl() {
        super();
    }

    // specific constructor
    public AEmbeddedNodesPlaceholderImpl(java.lang.Object workspace, java.lang.String mofId, com.sap.tc.moin.repository.mmi.reflect.RefPackage immediatePackage, com.sap.tc.moin.repository.mmi.reflect.RefObject metaObject) {
        super(workspace, mofId, immediatePackage, metaObject);
    }
    
    public boolean exists(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _EmbeddedNodes, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Placeholder) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return exists(get___CurrentConnection(), _EmbeddedNodes, _Placeholder);
    }
    public boolean exists(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _EmbeddedNodes, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Placeholder) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return ___existsMultN( connection, _Placeholder, _EmbeddedNodes, "45DDACEE9F8EE738295E46201F4C80BA4BD4694D"); //$NON-NLS-1$
    }
    public java.util.List<com.sap.tc.moin.repository.mmi.reflect.RefBaseObject> getEmbeddedNodes(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Placeholder) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return getEmbeddedNodes(get___CurrentConnection(), _Placeholder);
    }
    public java.util.List<com.sap.tc.moin.repository.mmi.reflect.RefBaseObject> getEmbeddedNodes(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Placeholder) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (java.util.List<com.sap.tc.moin.repository.mmi.reflect.RefBaseObject>) ___getElementsAtOtherLinkEnd( connection, (com.sap.tc.moin.repository.core.CorePartitionable) _Placeholder, get___EndAndMetaObject( 1 ) );
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getPlaceholder(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _EmbeddedNodes) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return getPlaceholder(get___CurrentConnection(), _EmbeddedNodes);
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getPlaceholder(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _EmbeddedNodes) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        com.sap.tc.moin.repository.core.EndAndMetaObject endAndMetaObject = get___EndAndMetaObject( 0 );
        return (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) get___CompositeParentForEndAndMetaObject( connection, _EmbeddedNodes, endAndMetaObject );
    }
    public boolean add(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _EmbeddedNodes, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Placeholder) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          return refAddLink((com.sap.tc.moin.repository.mmi.reflect.RefObject)_EmbeddedNodes, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_Placeholder);
    }
    public boolean add(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _EmbeddedNodes, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Placeholder) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          return refAddLink(connection, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_EmbeddedNodes, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_Placeholder);
    }
    public boolean remove(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _EmbeddedNodes, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Placeholder) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return refRemoveLink((com.sap.tc.moin.repository.mmi.reflect.RefObject)_EmbeddedNodes, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_Placeholder);
    }
    public boolean remove(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _EmbeddedNodes, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Placeholder) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return refRemoveLink(connection, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_EmbeddedNodes, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_Placeholder);
    }
    public boolean refLinkExists(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefObject firstEnd, com.sap.tc.moin.repository.mmi.reflect.RefObject secondEnd) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        if ( firstEnd == null || secondEnd == null ) { return false; }
        checkTypesForRefLinkExists( connection, firstEnd, secondEnd );
        return exists( connection, (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) firstEnd, (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) secondEnd );
    }

    @SuppressWarnings("unchecked")
    public java.lang.Class<com.sap.ide.metamodel.webdynpro.component.viewset.AEmbeddedNodesPlaceholder> get___JmiInterface() {
        return com.sap.ide.metamodel.webdynpro.component.viewset.AEmbeddedNodesPlaceholder.class;
    }
    
    @Override
    public com.sap.tc.moin.repository.spi.core.Wrapper<com.sap.ide.metamodel.webdynpro.component.viewset.AEmbeddedNodesPlaceholder> createWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, boolean synchronize) {
        return new com.sap.ide.metamodel.webdynpro.component.viewset.__impl.AEmbeddedNodesPlaceholderWrapper(conn, this, synchronize);
    }
}