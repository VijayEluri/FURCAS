/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.framework.viewsetdefinition.__impl;

public final class AViewAreaDefinitionsViewsetDefinitionImpl extends com.sap.tc.moin.repository.core.jmi.reflect.RefAssociationImpl
{
    // default constructor
    public AViewAreaDefinitionsViewsetDefinitionImpl() {
        super();
    }

    // specific constructor
    public AViewAreaDefinitionsViewsetDefinitionImpl(java.lang.Object workspace, java.lang.String mofId, com.sap.tc.moin.repository.mmi.reflect.RefPackage immediatePackage, com.sap.tc.moin.repository.mmi.reflect.RefObject metaObject) {
        super(workspace, mofId, immediatePackage, metaObject);
    }
    
    public boolean exists(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ViewAreaDefinitions, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ViewsetDefinition) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return exists(get___CurrentConnection(), _ViewAreaDefinitions, _ViewsetDefinition);
    }
    public boolean exists(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ViewAreaDefinitions, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ViewsetDefinition) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return ___existsMultN( connection, _ViewsetDefinition, _ViewAreaDefinitions, "45DDACEE7BB0E8A6885E4D3922A2A2559109237D"); //$NON-NLS-1$
    }
    public java.util.List<com.sap.tc.moin.repository.mmi.reflect.RefBaseObject> getViewAreaDefinitions(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ViewsetDefinition) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return getViewAreaDefinitions(get___CurrentConnection(), _ViewsetDefinition);
    }
    public java.util.List<com.sap.tc.moin.repository.mmi.reflect.RefBaseObject> getViewAreaDefinitions(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ViewsetDefinition) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (java.util.List<com.sap.tc.moin.repository.mmi.reflect.RefBaseObject>) ___getElementsAtOtherLinkEnd( connection, (com.sap.tc.moin.repository.core.CorePartitionable) _ViewsetDefinition, get___EndAndMetaObject( 1 ) );
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getViewsetDefinition(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ViewAreaDefinitions) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return getViewsetDefinition(get___CurrentConnection(), _ViewAreaDefinitions);
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getViewsetDefinition(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ViewAreaDefinitions) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        com.sap.tc.moin.repository.core.EndAndMetaObject endAndMetaObject = get___EndAndMetaObject( 0 );
        return (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) get___CompositeParentForEndAndMetaObject( connection, _ViewAreaDefinitions, endAndMetaObject );
    }
    public boolean add(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ViewAreaDefinitions, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ViewsetDefinition) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          return refAddLink((com.sap.tc.moin.repository.mmi.reflect.RefObject)_ViewAreaDefinitions, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_ViewsetDefinition);
    }
    public boolean add(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ViewAreaDefinitions, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ViewsetDefinition) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          return refAddLink(connection, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_ViewAreaDefinitions, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_ViewsetDefinition);
    }
    public boolean remove(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ViewAreaDefinitions, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ViewsetDefinition) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return refRemoveLink((com.sap.tc.moin.repository.mmi.reflect.RefObject)_ViewAreaDefinitions, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_ViewsetDefinition);
    }
    public boolean remove(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ViewAreaDefinitions, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ViewsetDefinition) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return refRemoveLink(connection, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_ViewAreaDefinitions, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_ViewsetDefinition);
    }
    public boolean refLinkExists(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefObject firstEnd, com.sap.tc.moin.repository.mmi.reflect.RefObject secondEnd) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        if ( firstEnd == null || secondEnd == null ) { return false; }
        checkTypesForRefLinkExists( connection, firstEnd, secondEnd );
        return exists( connection, (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) firstEnd, (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) secondEnd );
    }

    @SuppressWarnings("unchecked")
    public java.lang.Class<com.sap.ide.metamodel.webdynpro.framework.viewsetdefinition.AViewAreaDefinitionsViewsetDefinition> get___JmiInterface() {
        return com.sap.ide.metamodel.webdynpro.framework.viewsetdefinition.AViewAreaDefinitionsViewsetDefinition.class;
    }
    
    @Override
    public com.sap.tc.moin.repository.spi.core.Wrapper<com.sap.ide.metamodel.webdynpro.framework.viewsetdefinition.AViewAreaDefinitionsViewsetDefinition> createWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, boolean synchronize) {
        return new com.sap.ide.metamodel.webdynpro.framework.viewsetdefinition.__impl.AViewAreaDefinitionsViewsetDefinitionWrapper(conn, this, synchronize);
    }
}