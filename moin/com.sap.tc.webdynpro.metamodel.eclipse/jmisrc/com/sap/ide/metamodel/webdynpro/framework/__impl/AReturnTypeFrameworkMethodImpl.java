/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.framework.__impl;

public final class AReturnTypeFrameworkMethodImpl extends com.sap.tc.moin.repository.core.jmi.reflect.RefAssociationImpl
{
    // default constructor
    public AReturnTypeFrameworkMethodImpl() {
        super();
    }

    // specific constructor
    public AReturnTypeFrameworkMethodImpl(java.lang.Object workspace, java.lang.String mofId, com.sap.tc.moin.repository.mmi.reflect.RefPackage immediatePackage, com.sap.tc.moin.repository.mmi.reflect.RefObject metaObject) {
        super(workspace, mofId, immediatePackage, metaObject);
    }
    
    public boolean exists(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ReturnType, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _FrameworkMethod) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return exists(get___CurrentConnection(), _ReturnType, _FrameworkMethod);
    }
    public boolean exists(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ReturnType, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _FrameworkMethod) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return ___existsMult1( connection, _FrameworkMethod, _ReturnType, "45DDACEF6D1A3306381C44DD0640E559E6B1A8E1"); //$NON-NLS-1$
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getReturnType(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _FrameworkMethod) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return getReturnType(get___CurrentConnection(), _FrameworkMethod);
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getReturnType(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _FrameworkMethod) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) ___getElementAtOtherLinkEnd( connection, (com.sap.tc.moin.repository.core.CorePartitionable) _FrameworkMethod, "45DDACEF6D1A3306381C44DD0640E559E6B1A8E1"); //$NON-NLS-1$
    }
    public java.util.Collection<com.sap.tc.moin.repository.mmi.reflect.RefBaseObject> getFrameworkMethod(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ReturnType) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return getFrameworkMethod(get___CurrentConnection(), _ReturnType);
    }
    public java.util.Collection<com.sap.tc.moin.repository.mmi.reflect.RefBaseObject> getFrameworkMethod(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ReturnType) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (java.util.Collection<com.sap.tc.moin.repository.mmi.reflect.RefBaseObject>) ___queryElementsAtOtherLinkEnd( connection, (com.sap.tc.moin.repository.core.CorePartitionable) _ReturnType, get___EndAndMetaObject( 0 ) );
    }
    public boolean add(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ReturnType, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _FrameworkMethod) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          return refAddLink((com.sap.tc.moin.repository.mmi.reflect.RefObject)_ReturnType, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_FrameworkMethod);
    }
    public boolean add(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ReturnType, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _FrameworkMethod) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          return refAddLink(connection, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_ReturnType, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_FrameworkMethod);
    }
    public boolean remove(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ReturnType, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _FrameworkMethod) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return refRemoveLink((com.sap.tc.moin.repository.mmi.reflect.RefObject)_ReturnType, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_FrameworkMethod);
    }
    public boolean remove(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ReturnType, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _FrameworkMethod) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return refRemoveLink(connection, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_ReturnType, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_FrameworkMethod);
    }
    public boolean refLinkExists(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefObject firstEnd, com.sap.tc.moin.repository.mmi.reflect.RefObject secondEnd) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        if ( firstEnd == null || secondEnd == null ) { return false; }
        checkTypesForRefLinkExists( connection, firstEnd, secondEnd );
        return exists( connection, (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) firstEnd, (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) secondEnd );
    }

    @SuppressWarnings("unchecked")
    public java.lang.Class<com.sap.ide.metamodel.webdynpro.framework.AReturnTypeFrameworkMethod> get___JmiInterface() {
        return com.sap.ide.metamodel.webdynpro.framework.AReturnTypeFrameworkMethod.class;
    }
    
    @Override
    public com.sap.tc.moin.repository.spi.core.Wrapper<com.sap.ide.metamodel.webdynpro.framework.AReturnTypeFrameworkMethod> createWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, boolean synchronize) {
        return new com.sap.ide.metamodel.webdynpro.framework.__impl.AReturnTypeFrameworkMethodWrapper(conn, this, synchronize);
    }
}