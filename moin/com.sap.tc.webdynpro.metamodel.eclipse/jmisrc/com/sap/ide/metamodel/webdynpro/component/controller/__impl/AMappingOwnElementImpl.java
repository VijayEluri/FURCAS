/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.component.controller.__impl;

public final class AMappingOwnElementImpl extends com.sap.tc.moin.repository.core.jmi.reflect.RefAssociationImpl
{
    // default constructor
    public AMappingOwnElementImpl() {
        super();
    }

    // specific constructor
    public AMappingOwnElementImpl(java.lang.Object workspace, java.lang.String mofId, com.sap.tc.moin.repository.mmi.reflect.RefPackage immediatePackage, com.sap.tc.moin.repository.mmi.reflect.RefObject metaObject) {
        super(workspace, mofId, immediatePackage, metaObject);
    }
    
    public boolean exists(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Mapping, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _OwnElement) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return exists(get___CurrentConnection(), _Mapping, _OwnElement);
    }
    public boolean exists(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Mapping, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _OwnElement) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return ___existsMult1( connection, _Mapping, _OwnElement, "45DDACEE3BB5EC5FDC9C43DC3210E97E55D9C58D"); //$NON-NLS-1$
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getMapping(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _OwnElement) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return getMapping(get___CurrentConnection(), _OwnElement);
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getMapping(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _OwnElement) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        com.sap.tc.moin.repository.core.EndAndMetaObject endAndMetaObject = get___EndAndMetaObject( 1 );
        return (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) ___queryElementAtOtherLinkEnd( connection, (com.sap.tc.moin.repository.core.CorePartitionable) _OwnElement, endAndMetaObject );
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getOwnElement(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Mapping) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return getOwnElement(get___CurrentConnection(), _Mapping);
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getOwnElement(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Mapping) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) ___getElementAtOtherLinkEnd( connection, (com.sap.tc.moin.repository.core.CorePartitionable) _Mapping, "45DDACEE3BB5EC5FDC9C43DC3210E97E55D9C58D"); //$NON-NLS-1$
    }
    public boolean add(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Mapping, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _OwnElement) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          return refAddLink((com.sap.tc.moin.repository.mmi.reflect.RefObject)_Mapping, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_OwnElement);
    }
    public boolean add(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Mapping, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _OwnElement) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          return refAddLink(connection, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_Mapping, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_OwnElement);
    }
    public boolean remove(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Mapping, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _OwnElement) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return refRemoveLink((com.sap.tc.moin.repository.mmi.reflect.RefObject)_Mapping, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_OwnElement);
    }
    public boolean remove(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Mapping, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _OwnElement) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return refRemoveLink(connection, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_Mapping, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_OwnElement);
    }
    public boolean refLinkExists(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefObject firstEnd, com.sap.tc.moin.repository.mmi.reflect.RefObject secondEnd) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        if ( firstEnd == null || secondEnd == null ) { return false; }
        checkTypesForRefLinkExists( connection, firstEnd, secondEnd );
        return exists( connection, (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) firstEnd, (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) secondEnd );
    }

    @SuppressWarnings("unchecked")
    public java.lang.Class<com.sap.ide.metamodel.webdynpro.component.controller.AMappingOwnElement> get___JmiInterface() {
        return com.sap.ide.metamodel.webdynpro.component.controller.AMappingOwnElement.class;
    }
    
    @Override
    public com.sap.tc.moin.repository.spi.core.Wrapper<com.sap.ide.metamodel.webdynpro.component.controller.AMappingOwnElement> createWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, boolean synchronize) {
        return new com.sap.ide.metamodel.webdynpro.component.controller.__impl.AMappingOwnElementWrapper(conn, this, synchronize);
    }
}