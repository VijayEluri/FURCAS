/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.configuration.__impl;

public final class AOutgoingAssociationsParentObjectImpl extends com.sap.tc.moin.repository.core.jmi.reflect.RefAssociationImpl
{
    // default constructor
    public AOutgoingAssociationsParentObjectImpl() {
        super();
    }

    // specific constructor
    public AOutgoingAssociationsParentObjectImpl(java.lang.Object workspace, java.lang.String mofId, com.sap.tc.moin.repository.mmi.reflect.RefPackage immediatePackage, com.sap.tc.moin.repository.mmi.reflect.RefObject metaObject) {
        super(workspace, mofId, immediatePackage, metaObject);
    }
    
    public boolean exists(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _OutgoingAssociations, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ParentObject) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return exists(get___CurrentConnection(), _OutgoingAssociations, _ParentObject);
    }
    public boolean exists(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _OutgoingAssociations, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ParentObject) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return ___existsMultN( connection, _ParentObject, _OutgoingAssociations, "45DDACEE2EFDBD5B0CE546373B65CEA5602C1D35"); //$NON-NLS-1$
    }
    public java.util.List<com.sap.tc.moin.repository.mmi.reflect.RefBaseObject> getOutgoingAssociations(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ParentObject) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return getOutgoingAssociations(get___CurrentConnection(), _ParentObject);
    }
    public java.util.List<com.sap.tc.moin.repository.mmi.reflect.RefBaseObject> getOutgoingAssociations(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ParentObject) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (java.util.List<com.sap.tc.moin.repository.mmi.reflect.RefBaseObject>) ___getElementsAtOtherLinkEnd( connection, (com.sap.tc.moin.repository.core.CorePartitionable) _ParentObject, get___EndAndMetaObject( 1 ) );
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getParentObject(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _OutgoingAssociations) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return getParentObject(get___CurrentConnection(), _OutgoingAssociations);
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getParentObject(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _OutgoingAssociations) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        com.sap.tc.moin.repository.core.EndAndMetaObject endAndMetaObject = get___EndAndMetaObject( 0 );
        return (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) get___CompositeParentForEndAndMetaObject( connection, _OutgoingAssociations, endAndMetaObject );
    }
    public boolean add(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _OutgoingAssociations, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ParentObject) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          return refAddLink((com.sap.tc.moin.repository.mmi.reflect.RefObject)_OutgoingAssociations, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_ParentObject);
    }
    public boolean add(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _OutgoingAssociations, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ParentObject) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          return refAddLink(connection, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_OutgoingAssociations, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_ParentObject);
    }
    public boolean remove(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _OutgoingAssociations, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ParentObject) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return refRemoveLink((com.sap.tc.moin.repository.mmi.reflect.RefObject)_OutgoingAssociations, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_ParentObject);
    }
    public boolean remove(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _OutgoingAssociations, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ParentObject) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return refRemoveLink(connection, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_OutgoingAssociations, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_ParentObject);
    }
    public boolean refLinkExists(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefObject firstEnd, com.sap.tc.moin.repository.mmi.reflect.RefObject secondEnd) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        if ( firstEnd == null || secondEnd == null ) { return false; }
        checkTypesForRefLinkExists( connection, firstEnd, secondEnd );
        return exists( connection, (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) firstEnd, (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) secondEnd );
    }

    @SuppressWarnings("unchecked")
    public java.lang.Class<com.sap.ide.metamodel.webdynpro.configuration.AOutgoingAssociationsParentObject> get___JmiInterface() {
        return com.sap.ide.metamodel.webdynpro.configuration.AOutgoingAssociationsParentObject.class;
    }
    
    @Override
    public com.sap.tc.moin.repository.spi.core.Wrapper<com.sap.ide.metamodel.webdynpro.configuration.AOutgoingAssociationsParentObject> createWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, boolean synchronize) {
        return new com.sap.ide.metamodel.webdynpro.configuration.__impl.AOutgoingAssociationsParentObjectWrapper(conn, this, synchronize);
    }
}