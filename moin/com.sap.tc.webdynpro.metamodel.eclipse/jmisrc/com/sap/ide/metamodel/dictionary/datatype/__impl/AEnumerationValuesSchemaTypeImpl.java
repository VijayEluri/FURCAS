/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.dictionary.datatype.__impl;

public final class AEnumerationValuesSchemaTypeImpl extends com.sap.tc.moin.repository.core.jmi.reflect.RefAssociationImpl
{
    // default constructor
    public AEnumerationValuesSchemaTypeImpl() {
        super();
    }

    // specific constructor
    public AEnumerationValuesSchemaTypeImpl(java.lang.Object workspace, java.lang.String mofId, com.sap.tc.moin.repository.mmi.reflect.RefPackage immediatePackage, com.sap.tc.moin.repository.mmi.reflect.RefObject metaObject) {
        super(workspace, mofId, immediatePackage, metaObject);
    }
    
    public boolean exists(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _EnumerationValues, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _SchemaType) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return exists(get___CurrentConnection(), _EnumerationValues, _SchemaType);
    }
    public boolean exists(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _EnumerationValues, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _SchemaType) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return ___existsMultN( connection, _SchemaType, _EnumerationValues, "45DDACEF62D2D8AC0D084EA202738DD9642D43A7"); //$NON-NLS-1$
    }
    public java.util.List<com.sap.tc.moin.repository.mmi.reflect.RefBaseObject> getEnumerationValues(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _SchemaType) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return getEnumerationValues(get___CurrentConnection(), _SchemaType);
    }
    public java.util.List<com.sap.tc.moin.repository.mmi.reflect.RefBaseObject> getEnumerationValues(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _SchemaType) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (java.util.List<com.sap.tc.moin.repository.mmi.reflect.RefBaseObject>) ___getElementsAtOtherLinkEnd( connection, (com.sap.tc.moin.repository.core.CorePartitionable) _SchemaType, get___EndAndMetaObject( 1 ) );
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getSchemaType(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _EnumerationValues) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return getSchemaType(get___CurrentConnection(), _EnumerationValues);
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getSchemaType(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _EnumerationValues) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        com.sap.tc.moin.repository.core.EndAndMetaObject endAndMetaObject = get___EndAndMetaObject( 0 );
        return (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) get___CompositeParentForEndAndMetaObject( connection, _EnumerationValues, endAndMetaObject );
    }
    public boolean add(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _EnumerationValues, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _SchemaType) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          return refAddLink((com.sap.tc.moin.repository.mmi.reflect.RefObject)_EnumerationValues, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_SchemaType);
    }
    public boolean add(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _EnumerationValues, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _SchemaType) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          return refAddLink(connection, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_EnumerationValues, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_SchemaType);
    }
    public boolean remove(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _EnumerationValues, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _SchemaType) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return refRemoveLink((com.sap.tc.moin.repository.mmi.reflect.RefObject)_EnumerationValues, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_SchemaType);
    }
    public boolean remove(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _EnumerationValues, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _SchemaType) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return refRemoveLink(connection, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_EnumerationValues, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_SchemaType);
    }
    public boolean refLinkExists(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefObject firstEnd, com.sap.tc.moin.repository.mmi.reflect.RefObject secondEnd) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        if ( firstEnd == null || secondEnd == null ) { return false; }
        checkTypesForRefLinkExists( connection, firstEnd, secondEnd );
        return exists( connection, (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) firstEnd, (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) secondEnd );
    }

    @SuppressWarnings("unchecked")
    public java.lang.Class<com.sap.ide.metamodel.dictionary.datatype.AEnumerationValuesSchemaType> get___JmiInterface() {
        return com.sap.ide.metamodel.dictionary.datatype.AEnumerationValuesSchemaType.class;
    }
    
    @Override
    public com.sap.tc.moin.repository.spi.core.Wrapper<com.sap.ide.metamodel.dictionary.datatype.AEnumerationValuesSchemaType> createWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, boolean synchronize) {
        return new com.sap.ide.metamodel.dictionary.datatype.__impl.AEnumerationValuesSchemaTypeWrapper(conn, this, synchronize);
    }
}