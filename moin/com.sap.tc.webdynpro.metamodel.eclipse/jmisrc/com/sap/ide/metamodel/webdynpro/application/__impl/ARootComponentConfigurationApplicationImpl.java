/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.application.__impl;

public final class ARootComponentConfigurationApplicationImpl extends com.sap.tc.moin.repository.core.jmi.reflect.RefAssociationImpl
{
    // default constructor
    public ARootComponentConfigurationApplicationImpl() {
        super();
    }

    // specific constructor
    public ARootComponentConfigurationApplicationImpl(java.lang.Object workspace, java.lang.String mofId, com.sap.tc.moin.repository.mmi.reflect.RefPackage immediatePackage, com.sap.tc.moin.repository.mmi.reflect.RefObject metaObject) {
        super(workspace, mofId, immediatePackage, metaObject);
    }
    
    public boolean exists(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _RootComponentConfiguration, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Application) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return exists(get___CurrentConnection(), _RootComponentConfiguration, _Application);
    }
    public boolean exists(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _RootComponentConfiguration, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Application) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return ___existsMult1( connection, _Application, _RootComponentConfiguration, "460CC65C85D09C5911D243FC05598471EF75761B"); //$NON-NLS-1$
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getRootComponentConfiguration(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Application) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return getRootComponentConfiguration(get___CurrentConnection(), _Application);
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getRootComponentConfiguration(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Application) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) ___getElementAtOtherLinkEnd( connection, (com.sap.tc.moin.repository.core.CorePartitionable) _Application, "460CC65C85D09C5911D243FC05598471EF75761B"); //$NON-NLS-1$
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getApplication(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _RootComponentConfiguration) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return getApplication(get___CurrentConnection(), _RootComponentConfiguration);
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getApplication(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _RootComponentConfiguration) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        com.sap.tc.moin.repository.core.EndAndMetaObject endAndMetaObject = get___EndAndMetaObject( 0 );
        return (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) get___CompositeParentForEndAndMetaObject( connection, _RootComponentConfiguration, endAndMetaObject );
    }
    public boolean add(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _RootComponentConfiguration, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Application) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          return refAddLink((com.sap.tc.moin.repository.mmi.reflect.RefObject)_RootComponentConfiguration, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_Application);
    }
    public boolean add(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _RootComponentConfiguration, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Application) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          return refAddLink(connection, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_RootComponentConfiguration, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_Application);
    }
    public boolean remove(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _RootComponentConfiguration, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Application) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return refRemoveLink((com.sap.tc.moin.repository.mmi.reflect.RefObject)_RootComponentConfiguration, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_Application);
    }
    public boolean remove(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _RootComponentConfiguration, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Application) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return refRemoveLink(connection, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_RootComponentConfiguration, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_Application);
    }
    public boolean refLinkExists(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefObject firstEnd, com.sap.tc.moin.repository.mmi.reflect.RefObject secondEnd) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        if ( firstEnd == null || secondEnd == null ) { return false; }
        checkTypesForRefLinkExists( connection, firstEnd, secondEnd );
        return exists( connection, (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) firstEnd, (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) secondEnd );
    }

    @SuppressWarnings("unchecked")
    public java.lang.Class<com.sap.ide.metamodel.webdynpro.application.ARootComponentConfigurationApplication> get___JmiInterface() {
        return com.sap.ide.metamodel.webdynpro.application.ARootComponentConfigurationApplication.class;
    }
    
    @Override
    public com.sap.tc.moin.repository.spi.core.Wrapper<com.sap.ide.metamodel.webdynpro.application.ARootComponentConfigurationApplication> createWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, boolean synchronize) {
        return new com.sap.ide.metamodel.webdynpro.application.__impl.ARootComponentConfigurationApplicationWrapper(conn, this, synchronize);
    }
}