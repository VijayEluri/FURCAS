/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.dictionary.datatype.__impl;

public final class AExclusiveFieldsOwnerImpl extends com.sap.tc.moin.repository.core.jmi.reflect.RefAssociationImpl
{
    // default constructor
    public AExclusiveFieldsOwnerImpl() {
        super();
    }

    // specific constructor
    public AExclusiveFieldsOwnerImpl(java.lang.Object workspace, java.lang.String mofId, com.sap.tc.moin.repository.mmi.reflect.RefPackage immediatePackage, com.sap.tc.moin.repository.mmi.reflect.RefObject metaObject) {
        super(workspace, mofId, immediatePackage, metaObject);
    }
    
    public boolean exists(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ExclusiveFields, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Owner) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return exists(get___CurrentConnection(), _ExclusiveFields, _Owner);
    }
    public boolean exists(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ExclusiveFields, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Owner) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return ___existsMultN( connection, _Owner, _ExclusiveFields, "45DDACEF776CC8B9AEAD4A34365CC93E15174812"); //$NON-NLS-1$
    }
    public java.util.List<com.sap.tc.moin.repository.mmi.reflect.RefBaseObject> getExclusiveFields(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Owner) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return getExclusiveFields(get___CurrentConnection(), _Owner);
    }
    public java.util.List<com.sap.tc.moin.repository.mmi.reflect.RefBaseObject> getExclusiveFields(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Owner) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (java.util.List<com.sap.tc.moin.repository.mmi.reflect.RefBaseObject>) ___getElementsAtOtherLinkEnd( connection, (com.sap.tc.moin.repository.core.CorePartitionable) _Owner, get___EndAndMetaObject( 1 ) );
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getOwner(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ExclusiveFields) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return getOwner(get___CurrentConnection(), _ExclusiveFields);
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getOwner(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ExclusiveFields) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        com.sap.tc.moin.repository.core.EndAndMetaObject endAndMetaObject = get___EndAndMetaObject( 0 );
        return (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) get___CompositeParentForEndAndMetaObject( connection, _ExclusiveFields, endAndMetaObject );
    }
    public boolean add(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ExclusiveFields, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Owner) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          return refAddLink((com.sap.tc.moin.repository.mmi.reflect.RefObject)_ExclusiveFields, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_Owner);
    }
    public boolean add(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ExclusiveFields, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Owner) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          return refAddLink(connection, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_ExclusiveFields, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_Owner);
    }
    public boolean remove(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ExclusiveFields, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Owner) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return refRemoveLink((com.sap.tc.moin.repository.mmi.reflect.RefObject)_ExclusiveFields, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_Owner);
    }
    public boolean remove(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ExclusiveFields, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Owner) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return refRemoveLink(connection, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_ExclusiveFields, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_Owner);
    }
    public boolean refLinkExists(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefObject firstEnd, com.sap.tc.moin.repository.mmi.reflect.RefObject secondEnd) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        if ( firstEnd == null || secondEnd == null ) { return false; }
        checkTypesForRefLinkExists( connection, firstEnd, secondEnd );
        return exists( connection, (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) firstEnd, (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) secondEnd );
    }

    @SuppressWarnings("unchecked")
    public java.lang.Class<com.sap.ide.metamodel.dictionary.datatype.AExclusiveFieldsOwner> get___JmiInterface() {
        return com.sap.ide.metamodel.dictionary.datatype.AExclusiveFieldsOwner.class;
    }
    
    @Override
    public com.sap.tc.moin.repository.spi.core.Wrapper<com.sap.ide.metamodel.dictionary.datatype.AExclusiveFieldsOwner> createWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, boolean synchronize) {
        return new com.sap.ide.metamodel.dictionary.datatype.__impl.AExclusiveFieldsOwnerWrapper(conn, this, synchronize);
    }
}