/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.dictionary.datatype.__impl;

public final class AReferencedTypeDtFieldImpl extends com.sap.tc.moin.repository.core.jmi.reflect.RefAssociationImpl
{
    // default constructor
    public AReferencedTypeDtFieldImpl() {
        super();
    }

    // specific constructor
    public AReferencedTypeDtFieldImpl(java.lang.Object workspace, java.lang.String mofId, com.sap.tc.moin.repository.mmi.reflect.RefPackage immediatePackage, com.sap.tc.moin.repository.mmi.reflect.RefObject metaObject) {
        super(workspace, mofId, immediatePackage, metaObject);
    }
    
    public boolean exists(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ReferencedType, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _DtField) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return exists(get___CurrentConnection(), _ReferencedType, _DtField);
    }
    public boolean exists(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ReferencedType, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _DtField) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return ___existsMult1( connection, _DtField, _ReferencedType, "45DDACEFBA52DEB35418443C136F959C0512F642"); //$NON-NLS-1$
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getReferencedType(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _DtField) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return getReferencedType(get___CurrentConnection(), _DtField);
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getReferencedType(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _DtField) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) ___getElementAtOtherLinkEnd( connection, (com.sap.tc.moin.repository.core.CorePartitionable) _DtField, "45DDACEFBA52DEB35418443C136F959C0512F642"); //$NON-NLS-1$
    }
    public java.util.Collection<com.sap.tc.moin.repository.mmi.reflect.RefBaseObject> getDtField(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ReferencedType) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return getDtField(get___CurrentConnection(), _ReferencedType);
    }
    public java.util.Collection<com.sap.tc.moin.repository.mmi.reflect.RefBaseObject> getDtField(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ReferencedType) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (java.util.Collection<com.sap.tc.moin.repository.mmi.reflect.RefBaseObject>) ___queryElementsAtOtherLinkEnd( connection, (com.sap.tc.moin.repository.core.CorePartitionable) _ReferencedType, get___EndAndMetaObject( 0 ) );
    }
    public boolean add(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ReferencedType, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _DtField) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          return refAddLink((com.sap.tc.moin.repository.mmi.reflect.RefObject)_ReferencedType, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_DtField);
    }
    public boolean add(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ReferencedType, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _DtField) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          return refAddLink(connection, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_ReferencedType, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_DtField);
    }
    public boolean remove(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ReferencedType, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _DtField) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return refRemoveLink((com.sap.tc.moin.repository.mmi.reflect.RefObject)_ReferencedType, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_DtField);
    }
    public boolean remove(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ReferencedType, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _DtField) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return refRemoveLink(connection, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_ReferencedType, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_DtField);
    }
    public boolean refLinkExists(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefObject firstEnd, com.sap.tc.moin.repository.mmi.reflect.RefObject secondEnd) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        if ( firstEnd == null || secondEnd == null ) { return false; }
        checkTypesForRefLinkExists( connection, firstEnd, secondEnd );
        return exists( connection, (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) firstEnd, (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) secondEnd );
    }

    @SuppressWarnings("unchecked")
    public java.lang.Class<com.sap.ide.metamodel.dictionary.datatype.AReferencedTypeDtField> get___JmiInterface() {
        return com.sap.ide.metamodel.dictionary.datatype.AReferencedTypeDtField.class;
    }
    
    @Override
    public com.sap.tc.moin.repository.spi.core.Wrapper<com.sap.ide.metamodel.dictionary.datatype.AReferencedTypeDtField> createWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, boolean synchronize) {
        return new com.sap.ide.metamodel.dictionary.datatype.__impl.AReferencedTypeDtFieldWrapper(conn, this, synchronize);
    }
}