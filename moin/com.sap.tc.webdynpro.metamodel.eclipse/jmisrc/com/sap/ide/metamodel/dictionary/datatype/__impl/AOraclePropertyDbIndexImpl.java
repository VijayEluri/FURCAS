/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.dictionary.datatype.__impl;

public final class AOraclePropertyDbIndexImpl extends com.sap.tc.moin.repository.core.jmi.reflect.RefAssociationImpl
{
    // default constructor
    public AOraclePropertyDbIndexImpl() {
        super();
    }

    // specific constructor
    public AOraclePropertyDbIndexImpl(java.lang.Object workspace, java.lang.String mofId, com.sap.tc.moin.repository.mmi.reflect.RefPackage immediatePackage, com.sap.tc.moin.repository.mmi.reflect.RefObject metaObject) {
        super(workspace, mofId, immediatePackage, metaObject);
    }
    
    public boolean exists(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _OracleProperty, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _DbIndex) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return exists(get___CurrentConnection(), _OracleProperty, _DbIndex);
    }
    public boolean exists(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _OracleProperty, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _DbIndex) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return ___existsMult1( connection, _DbIndex, _OracleProperty, "45DDACEF6B0BA6DAA9C4410F348CED73E2FA86EB"); //$NON-NLS-1$
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getOracleProperty(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _DbIndex) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return getOracleProperty(get___CurrentConnection(), _DbIndex);
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getOracleProperty(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _DbIndex) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) ___getElementAtOtherLinkEnd( connection, (com.sap.tc.moin.repository.core.CorePartitionable) _DbIndex, "45DDACEF6B0BA6DAA9C4410F348CED73E2FA86EB"); //$NON-NLS-1$
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getDbIndex(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _OracleProperty) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return getDbIndex(get___CurrentConnection(), _OracleProperty);
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getDbIndex(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _OracleProperty) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        com.sap.tc.moin.repository.core.EndAndMetaObject endAndMetaObject = get___EndAndMetaObject( 0 );
        return (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) get___CompositeParentForEndAndMetaObject( connection, _OracleProperty, endAndMetaObject );
    }
    public boolean add(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _OracleProperty, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _DbIndex) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          return refAddLink((com.sap.tc.moin.repository.mmi.reflect.RefObject)_OracleProperty, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_DbIndex);
    }
    public boolean add(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _OracleProperty, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _DbIndex) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          return refAddLink(connection, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_OracleProperty, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_DbIndex);
    }
    public boolean remove(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _OracleProperty, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _DbIndex) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return refRemoveLink((com.sap.tc.moin.repository.mmi.reflect.RefObject)_OracleProperty, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_DbIndex);
    }
    public boolean remove(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _OracleProperty, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _DbIndex) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return refRemoveLink(connection, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_OracleProperty, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_DbIndex);
    }
    public boolean refLinkExists(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefObject firstEnd, com.sap.tc.moin.repository.mmi.reflect.RefObject secondEnd) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        if ( firstEnd == null || secondEnd == null ) { return false; }
        checkTypesForRefLinkExists( connection, firstEnd, secondEnd );
        return exists( connection, (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) firstEnd, (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) secondEnd );
    }

    @SuppressWarnings("unchecked")
    public java.lang.Class<com.sap.ide.metamodel.dictionary.datatype.AOraclePropertyDbIndex> get___JmiInterface() {
        return com.sap.ide.metamodel.dictionary.datatype.AOraclePropertyDbIndex.class;
    }
    
    @Override
    public com.sap.tc.moin.repository.spi.core.Wrapper<com.sap.ide.metamodel.dictionary.datatype.AOraclePropertyDbIndex> createWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, boolean synchronize) {
        return new com.sap.ide.metamodel.dictionary.datatype.__impl.AOraclePropertyDbIndexWrapper(conn, this, synchronize);
    }
}