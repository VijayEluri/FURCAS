/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.component.view.uielement.__impl;

public final class ALayoutDataUielementImpl extends com.sap.tc.moin.repository.core.jmi.reflect.RefAssociationImpl
{
    // default constructor
    public ALayoutDataUielementImpl() {
        super();
    }

    // specific constructor
    public ALayoutDataUielementImpl(java.lang.Object workspace, java.lang.String mofId, com.sap.tc.moin.repository.mmi.reflect.RefPackage immediatePackage, com.sap.tc.moin.repository.mmi.reflect.RefObject metaObject) {
        super(workspace, mofId, immediatePackage, metaObject);
    }
    
    public boolean exists(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _LayoutData, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Uielement) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return exists(get___CurrentConnection(), _LayoutData, _Uielement);
    }
    public boolean exists(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _LayoutData, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Uielement) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return ___existsMult1( connection, _Uielement, _LayoutData, "45DDACEED0AE5B8B754A4B0E2B8ABE6442C1800E"); //$NON-NLS-1$
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getLayoutData(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Uielement) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return getLayoutData(get___CurrentConnection(), _Uielement);
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getLayoutData(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Uielement) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) ___getElementAtOtherLinkEnd( connection, (com.sap.tc.moin.repository.core.CorePartitionable) _Uielement, "45DDACEED0AE5B8B754A4B0E2B8ABE6442C1800E"); //$NON-NLS-1$
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getUielement(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _LayoutData) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return getUielement(get___CurrentConnection(), _LayoutData);
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getUielement(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _LayoutData) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        com.sap.tc.moin.repository.core.EndAndMetaObject endAndMetaObject = get___EndAndMetaObject( 0 );
        return (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) get___CompositeParentForEndAndMetaObject( connection, _LayoutData, endAndMetaObject );
    }
    public boolean add(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _LayoutData, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Uielement) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          return refAddLink((com.sap.tc.moin.repository.mmi.reflect.RefObject)_LayoutData, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_Uielement);
    }
    public boolean add(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _LayoutData, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Uielement) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          return refAddLink(connection, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_LayoutData, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_Uielement);
    }
    public boolean remove(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _LayoutData, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Uielement) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return refRemoveLink((com.sap.tc.moin.repository.mmi.reflect.RefObject)_LayoutData, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_Uielement);
    }
    public boolean remove(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _LayoutData, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Uielement) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return refRemoveLink(connection, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_LayoutData, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_Uielement);
    }
    public boolean refLinkExists(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefObject firstEnd, com.sap.tc.moin.repository.mmi.reflect.RefObject secondEnd) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        if ( firstEnd == null || secondEnd == null ) { return false; }
        checkTypesForRefLinkExists( connection, firstEnd, secondEnd );
        return exists( connection, (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) firstEnd, (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) secondEnd );
    }

    @SuppressWarnings("unchecked")
    public java.lang.Class<com.sap.ide.metamodel.webdynpro.component.view.uielement.ALayoutDataUielement> get___JmiInterface() {
        return com.sap.ide.metamodel.webdynpro.component.view.uielement.ALayoutDataUielement.class;
    }
    
    @Override
    public com.sap.tc.moin.repository.spi.core.Wrapper<com.sap.ide.metamodel.webdynpro.component.view.uielement.ALayoutDataUielement> createWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, boolean synchronize) {
        return new com.sap.ide.metamodel.webdynpro.component.view.uielement.__impl.ALayoutDataUielementWrapper(conn, this, synchronize);
    }
}