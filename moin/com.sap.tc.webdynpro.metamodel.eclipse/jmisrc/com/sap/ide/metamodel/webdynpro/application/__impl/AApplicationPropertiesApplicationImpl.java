/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.application.__impl;

public final class AApplicationPropertiesApplicationImpl extends com.sap.tc.moin.repository.core.jmi.reflect.RefAssociationImpl
{
    // default constructor
    public AApplicationPropertiesApplicationImpl() {
        super();
    }

    // specific constructor
    public AApplicationPropertiesApplicationImpl(java.lang.Object workspace, java.lang.String mofId, com.sap.tc.moin.repository.mmi.reflect.RefPackage immediatePackage, com.sap.tc.moin.repository.mmi.reflect.RefObject metaObject) {
        super(workspace, mofId, immediatePackage, metaObject);
    }
    
    public boolean exists(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ApplicationProperties, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Application) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return exists(get___CurrentConnection(), _ApplicationProperties, _Application);
    }
    public boolean exists(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ApplicationProperties, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Application) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return ___existsMultN( connection, _Application, _ApplicationProperties, "460CC65C6670AF891AE243D33C22C9D6D75D619C"); //$NON-NLS-1$
    }
    public java.util.List<com.sap.tc.moin.repository.mmi.reflect.RefBaseObject> getApplicationProperties(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Application) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return getApplicationProperties(get___CurrentConnection(), _Application);
    }
    public java.util.List<com.sap.tc.moin.repository.mmi.reflect.RefBaseObject> getApplicationProperties(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Application) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (java.util.List<com.sap.tc.moin.repository.mmi.reflect.RefBaseObject>) ___getElementsAtOtherLinkEnd( connection, (com.sap.tc.moin.repository.core.CorePartitionable) _Application, get___EndAndMetaObject( 1 ) );
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getApplication(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ApplicationProperties) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return getApplication(get___CurrentConnection(), _ApplicationProperties);
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getApplication(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ApplicationProperties) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        com.sap.tc.moin.repository.core.EndAndMetaObject endAndMetaObject = get___EndAndMetaObject( 0 );
        return (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) get___CompositeParentForEndAndMetaObject( connection, _ApplicationProperties, endAndMetaObject );
    }
    public boolean add(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ApplicationProperties, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Application) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          return refAddLink((com.sap.tc.moin.repository.mmi.reflect.RefObject)_ApplicationProperties, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_Application);
    }
    public boolean add(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ApplicationProperties, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Application) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          return refAddLink(connection, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_ApplicationProperties, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_Application);
    }
    public boolean remove(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ApplicationProperties, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Application) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return refRemoveLink((com.sap.tc.moin.repository.mmi.reflect.RefObject)_ApplicationProperties, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_Application);
    }
    public boolean remove(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ApplicationProperties, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Application) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return refRemoveLink(connection, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_ApplicationProperties, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_Application);
    }
    public boolean refLinkExists(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefObject firstEnd, com.sap.tc.moin.repository.mmi.reflect.RefObject secondEnd) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        if ( firstEnd == null || secondEnd == null ) { return false; }
        checkTypesForRefLinkExists( connection, firstEnd, secondEnd );
        return exists( connection, (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) firstEnd, (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) secondEnd );
    }

    @SuppressWarnings("unchecked")
    public java.lang.Class<com.sap.ide.metamodel.webdynpro.application.AApplicationPropertiesApplication> get___JmiInterface() {
        return com.sap.ide.metamodel.webdynpro.application.AApplicationPropertiesApplication.class;
    }
    
    @Override
    public com.sap.tc.moin.repository.spi.core.Wrapper<com.sap.ide.metamodel.webdynpro.application.AApplicationPropertiesApplication> createWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, boolean synchronize) {
        return new com.sap.ide.metamodel.webdynpro.application.__impl.AApplicationPropertiesApplicationWrapper(conn, this, synchronize);
    }
}