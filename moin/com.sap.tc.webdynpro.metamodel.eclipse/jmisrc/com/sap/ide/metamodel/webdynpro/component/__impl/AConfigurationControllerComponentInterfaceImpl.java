/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.component.__impl;

public final class AConfigurationControllerComponentInterfaceImpl extends com.sap.tc.moin.repository.core.jmi.reflect.RefAssociationImpl
{
    // default constructor
    public AConfigurationControllerComponentInterfaceImpl() {
        super();
    }

    // specific constructor
    public AConfigurationControllerComponentInterfaceImpl(java.lang.Object workspace, java.lang.String mofId, com.sap.tc.moin.repository.mmi.reflect.RefPackage immediatePackage, com.sap.tc.moin.repository.mmi.reflect.RefObject metaObject) {
        super(workspace, mofId, immediatePackage, metaObject);
    }
    
    public boolean exists(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ConfigurationController, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ComponentInterface) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return exists(get___CurrentConnection(), _ConfigurationController, _ComponentInterface);
    }
    public boolean exists(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ConfigurationController, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ComponentInterface) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return ___existsMult1( connection, _ComponentInterface, _ConfigurationController, "45DDACEEE102A4AB0D5A4EC12B42E1F13F135252"); //$NON-NLS-1$
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getConfigurationController(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ComponentInterface) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return getConfigurationController(get___CurrentConnection(), _ComponentInterface);
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getConfigurationController(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ComponentInterface) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) ___getElementAtOtherLinkEnd( connection, (com.sap.tc.moin.repository.core.CorePartitionable) _ComponentInterface, "45DDACEEE102A4AB0D5A4EC12B42E1F13F135252"); //$NON-NLS-1$
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getComponentInterface(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ConfigurationController) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return getComponentInterface(get___CurrentConnection(), _ConfigurationController);
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getComponentInterface(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ConfigurationController) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        com.sap.tc.moin.repository.core.EndAndMetaObject endAndMetaObject = get___EndAndMetaObject( 0 );
        return (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) ___queryElementAtOtherLinkEnd( connection, (com.sap.tc.moin.repository.core.CorePartitionable) _ConfigurationController, endAndMetaObject );
    }
    public boolean add(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ConfigurationController, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ComponentInterface) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          return refAddLink((com.sap.tc.moin.repository.mmi.reflect.RefObject)_ConfigurationController, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_ComponentInterface);
    }
    public boolean add(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ConfigurationController, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ComponentInterface) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          return refAddLink(connection, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_ConfigurationController, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_ComponentInterface);
    }
    public boolean remove(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ConfigurationController, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ComponentInterface) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return refRemoveLink((com.sap.tc.moin.repository.mmi.reflect.RefObject)_ConfigurationController, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_ComponentInterface);
    }
    public boolean remove(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ConfigurationController, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ComponentInterface) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return refRemoveLink(connection, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_ConfigurationController, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_ComponentInterface);
    }
    public boolean refLinkExists(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefObject firstEnd, com.sap.tc.moin.repository.mmi.reflect.RefObject secondEnd) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        if ( firstEnd == null || secondEnd == null ) { return false; }
        checkTypesForRefLinkExists( connection, firstEnd, secondEnd );
        return exists( connection, (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) firstEnd, (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) secondEnd );
    }

    @SuppressWarnings("unchecked")
    public java.lang.Class<com.sap.ide.metamodel.webdynpro.component.AConfigurationControllerComponentInterface> get___JmiInterface() {
        return com.sap.ide.metamodel.webdynpro.component.AConfigurationControllerComponentInterface.class;
    }
    
    @Override
    public com.sap.tc.moin.repository.spi.core.Wrapper<com.sap.ide.metamodel.webdynpro.component.AConfigurationControllerComponentInterface> createWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, boolean synchronize) {
        return new com.sap.ide.metamodel.webdynpro.component.__impl.AConfigurationControllerComponentInterfaceWrapper(conn, this, synchronize);
    }
}