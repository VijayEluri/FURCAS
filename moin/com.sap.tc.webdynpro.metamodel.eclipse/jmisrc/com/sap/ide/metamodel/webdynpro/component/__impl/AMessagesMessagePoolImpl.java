/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.component.__impl;

public final class AMessagesMessagePoolImpl extends com.sap.tc.moin.repository.core.jmi.reflect.RefAssociationImpl
{
    // default constructor
    public AMessagesMessagePoolImpl() {
        super();
    }

    // specific constructor
    public AMessagesMessagePoolImpl(java.lang.Object workspace, java.lang.String mofId, com.sap.tc.moin.repository.mmi.reflect.RefPackage immediatePackage, com.sap.tc.moin.repository.mmi.reflect.RefObject metaObject) {
        super(workspace, mofId, immediatePackage, metaObject);
    }
    
    public boolean exists(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Messages, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _MessagePool) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return exists(get___CurrentConnection(), _Messages, _MessagePool);
    }
    public boolean exists(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Messages, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _MessagePool) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return ___existsMultN( connection, _MessagePool, _Messages, "45DDACEE504582B2C29D46A52114DEFE45225F7C"); //$NON-NLS-1$
    }
    public java.util.List<com.sap.tc.moin.repository.mmi.reflect.RefBaseObject> getMessages(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _MessagePool) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return getMessages(get___CurrentConnection(), _MessagePool);
    }
    public java.util.List<com.sap.tc.moin.repository.mmi.reflect.RefBaseObject> getMessages(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _MessagePool) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (java.util.List<com.sap.tc.moin.repository.mmi.reflect.RefBaseObject>) ___getElementsAtOtherLinkEnd( connection, (com.sap.tc.moin.repository.core.CorePartitionable) _MessagePool, get___EndAndMetaObject( 1 ) );
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getMessagePool(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Messages) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return getMessagePool(get___CurrentConnection(), _Messages);
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getMessagePool(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Messages) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        com.sap.tc.moin.repository.core.EndAndMetaObject endAndMetaObject = get___EndAndMetaObject( 0 );
        return (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) get___CompositeParentForEndAndMetaObject( connection, _Messages, endAndMetaObject );
    }
    public boolean add(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Messages, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _MessagePool) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          return refAddLink((com.sap.tc.moin.repository.mmi.reflect.RefObject)_Messages, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_MessagePool);
    }
    public boolean add(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Messages, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _MessagePool) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          return refAddLink(connection, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_Messages, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_MessagePool);
    }
    public boolean remove(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Messages, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _MessagePool) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return refRemoveLink((com.sap.tc.moin.repository.mmi.reflect.RefObject)_Messages, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_MessagePool);
    }
    public boolean remove(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Messages, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _MessagePool) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return refRemoveLink(connection, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_Messages, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_MessagePool);
    }
    public boolean refLinkExists(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefObject firstEnd, com.sap.tc.moin.repository.mmi.reflect.RefObject secondEnd) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        if ( firstEnd == null || secondEnd == null ) { return false; }
        checkTypesForRefLinkExists( connection, firstEnd, secondEnd );
        return exists( connection, (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) firstEnd, (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) secondEnd );
    }

    @SuppressWarnings("unchecked")
    public java.lang.Class<com.sap.ide.metamodel.webdynpro.component.AMessagesMessagePool> get___JmiInterface() {
        return com.sap.ide.metamodel.webdynpro.component.AMessagesMessagePool.class;
    }
    
    @Override
    public com.sap.tc.moin.repository.spi.core.Wrapper<com.sap.ide.metamodel.webdynpro.component.AMessagesMessagePool> createWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, boolean synchronize) {
        return new com.sap.ide.metamodel.webdynpro.component.__impl.AMessagesMessagePoolWrapper(conn, this, synchronize);
    }
}