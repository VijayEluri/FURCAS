/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.dictionary.datatype.__impl;

public final class ABasetablesDbViewImpl extends com.sap.tc.moin.repository.core.jmi.reflect.RefAssociationImpl
{
    // default constructor
    public ABasetablesDbViewImpl() {
        super();
    }

    // specific constructor
    public ABasetablesDbViewImpl(java.lang.Object workspace, java.lang.String mofId, com.sap.tc.moin.repository.mmi.reflect.RefPackage immediatePackage, com.sap.tc.moin.repository.mmi.reflect.RefObject metaObject) {
        super(workspace, mofId, immediatePackage, metaObject);
    }
    
    public boolean exists(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Basetables, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _DbView) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return exists(get___CurrentConnection(), _Basetables, _DbView);
    }
    public boolean exists(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Basetables, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _DbView) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return ___existsMultN( connection, _DbView, _Basetables, "45DDACEF520E998250C04A9F327287CBDFE239A2"); //$NON-NLS-1$
    }
    public java.util.List<com.sap.tc.moin.repository.mmi.reflect.RefBaseObject> getBasetables(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _DbView) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return getBasetables(get___CurrentConnection(), _DbView);
    }
    public java.util.List<com.sap.tc.moin.repository.mmi.reflect.RefBaseObject> getBasetables(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _DbView) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (java.util.List<com.sap.tc.moin.repository.mmi.reflect.RefBaseObject>) ___getElementsAtOtherLinkEnd( connection, (com.sap.tc.moin.repository.core.CorePartitionable) _DbView, get___EndAndMetaObject( 1 ) );
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getDbView(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Basetables) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return getDbView(get___CurrentConnection(), _Basetables);
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getDbView(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Basetables) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        com.sap.tc.moin.repository.core.EndAndMetaObject endAndMetaObject = get___EndAndMetaObject( 0 );
        return (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) get___CompositeParentForEndAndMetaObject( connection, _Basetables, endAndMetaObject );
    }
    public boolean add(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Basetables, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _DbView) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          return refAddLink((com.sap.tc.moin.repository.mmi.reflect.RefObject)_Basetables, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_DbView);
    }
    public boolean add(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Basetables, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _DbView) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          return refAddLink(connection, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_Basetables, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_DbView);
    }
    public boolean remove(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Basetables, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _DbView) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return refRemoveLink((com.sap.tc.moin.repository.mmi.reflect.RefObject)_Basetables, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_DbView);
    }
    public boolean remove(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Basetables, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _DbView) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return refRemoveLink(connection, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_Basetables, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_DbView);
    }
    public boolean refLinkExists(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefObject firstEnd, com.sap.tc.moin.repository.mmi.reflect.RefObject secondEnd) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        if ( firstEnd == null || secondEnd == null ) { return false; }
        checkTypesForRefLinkExists( connection, firstEnd, secondEnd );
        return exists( connection, (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) firstEnd, (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) secondEnd );
    }

    @SuppressWarnings("unchecked")
    public java.lang.Class<com.sap.ide.metamodel.dictionary.datatype.ABasetablesDbView> get___JmiInterface() {
        return com.sap.ide.metamodel.dictionary.datatype.ABasetablesDbView.class;
    }
    
    @Override
    public com.sap.tc.moin.repository.spi.core.Wrapper<com.sap.ide.metamodel.dictionary.datatype.ABasetablesDbView> createWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, boolean synchronize) {
        return new com.sap.ide.metamodel.dictionary.datatype.__impl.ABasetablesDbViewWrapper(conn, this, synchronize);
    }
}