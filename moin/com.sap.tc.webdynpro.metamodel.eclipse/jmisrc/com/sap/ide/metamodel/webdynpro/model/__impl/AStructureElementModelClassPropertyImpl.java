/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.model.__impl;

public final class AStructureElementModelClassPropertyImpl extends com.sap.tc.moin.repository.core.jmi.reflect.RefAssociationImpl
{
    // default constructor
    public AStructureElementModelClassPropertyImpl() {
        super();
    }

    // specific constructor
    public AStructureElementModelClassPropertyImpl(java.lang.Object workspace, java.lang.String mofId, com.sap.tc.moin.repository.mmi.reflect.RefPackage immediatePackage, com.sap.tc.moin.repository.mmi.reflect.RefObject metaObject) {
        super(workspace, mofId, immediatePackage, metaObject);
    }
    
    public boolean exists(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _StructureElement, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ModelClassProperty) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return exists(get___CurrentConnection(), _StructureElement, _ModelClassProperty);
    }
    public boolean exists(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _StructureElement, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ModelClassProperty) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return ___existsMult1( connection, _ModelClassProperty, _StructureElement, "45DDACEF86AD007B0BDD45A63973D58E3C095CCE"); //$NON-NLS-1$
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getStructureElement(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ModelClassProperty) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return getStructureElement(get___CurrentConnection(), _ModelClassProperty);
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getStructureElement(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ModelClassProperty) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) ___getElementAtOtherLinkEnd( connection, (com.sap.tc.moin.repository.core.CorePartitionable) _ModelClassProperty, "45DDACEF86AD007B0BDD45A63973D58E3C095CCE"); //$NON-NLS-1$
    }
    public java.util.Collection<com.sap.tc.moin.repository.mmi.reflect.RefBaseObject> getModelClassProperty(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _StructureElement) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return getModelClassProperty(get___CurrentConnection(), _StructureElement);
    }
    public java.util.Collection<com.sap.tc.moin.repository.mmi.reflect.RefBaseObject> getModelClassProperty(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _StructureElement) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (java.util.Collection<com.sap.tc.moin.repository.mmi.reflect.RefBaseObject>) ___queryElementsAtOtherLinkEnd( connection, (com.sap.tc.moin.repository.core.CorePartitionable) _StructureElement, get___EndAndMetaObject( 0 ) );
    }
    public boolean add(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _StructureElement, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ModelClassProperty) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          return refAddLink((com.sap.tc.moin.repository.mmi.reflect.RefObject)_StructureElement, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_ModelClassProperty);
    }
    public boolean add(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _StructureElement, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ModelClassProperty) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          return refAddLink(connection, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_StructureElement, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_ModelClassProperty);
    }
    public boolean remove(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _StructureElement, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ModelClassProperty) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return refRemoveLink((com.sap.tc.moin.repository.mmi.reflect.RefObject)_StructureElement, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_ModelClassProperty);
    }
    public boolean remove(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _StructureElement, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ModelClassProperty) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return refRemoveLink(connection, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_StructureElement, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_ModelClassProperty);
    }
    public boolean refLinkExists(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefObject firstEnd, com.sap.tc.moin.repository.mmi.reflect.RefObject secondEnd) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        if ( firstEnd == null || secondEnd == null ) { return false; }
        checkTypesForRefLinkExists( connection, firstEnd, secondEnd );
        return exists( connection, (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) firstEnd, (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) secondEnd );
    }

    @SuppressWarnings("unchecked")
    public java.lang.Class<com.sap.ide.metamodel.webdynpro.model.AStructureElementModelClassProperty> get___JmiInterface() {
        return com.sap.ide.metamodel.webdynpro.model.AStructureElementModelClassProperty.class;
    }
    
    @Override
    public com.sap.tc.moin.repository.spi.core.Wrapper<com.sap.ide.metamodel.webdynpro.model.AStructureElementModelClassProperty> createWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, boolean synchronize) {
        return new com.sap.ide.metamodel.webdynpro.model.__impl.AStructureElementModelClassPropertyWrapper(conn, this, synchronize);
    }
}