/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.dictionary.datatype.__impl;

public final class ATextsComposedTypeImpl extends com.sap.tc.moin.repository.core.jmi.reflect.RefAssociationImpl
{
    // default constructor
    public ATextsComposedTypeImpl() {
        super();
    }

    // specific constructor
    public ATextsComposedTypeImpl(java.lang.Object workspace, java.lang.String mofId, com.sap.tc.moin.repository.mmi.reflect.RefPackage immediatePackage, com.sap.tc.moin.repository.mmi.reflect.RefObject metaObject) {
        super(workspace, mofId, immediatePackage, metaObject);
    }
    
    public boolean exists(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Texts, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ComposedType) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return exists(get___CurrentConnection(), _Texts, _ComposedType);
    }
    public boolean exists(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Texts, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ComposedType) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return ___existsMult1( connection, _ComposedType, _Texts, "45DDACEF165FB153A8104BA30D97C509572651BE"); //$NON-NLS-1$
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getTexts(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ComposedType) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return getTexts(get___CurrentConnection(), _ComposedType);
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getTexts(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ComposedType) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) ___getElementAtOtherLinkEnd( connection, (com.sap.tc.moin.repository.core.CorePartitionable) _ComposedType, "45DDACEF165FB153A8104BA30D97C509572651BE"); //$NON-NLS-1$
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getComposedType(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Texts) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return getComposedType(get___CurrentConnection(), _Texts);
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getComposedType(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Texts) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        com.sap.tc.moin.repository.core.EndAndMetaObject endAndMetaObject = get___EndAndMetaObject( 0 );
        return (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) get___CompositeParentForEndAndMetaObject( connection, _Texts, endAndMetaObject );
    }
    public boolean add(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Texts, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ComposedType) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          return refAddLink((com.sap.tc.moin.repository.mmi.reflect.RefObject)_Texts, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_ComposedType);
    }
    public boolean add(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Texts, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ComposedType) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          return refAddLink(connection, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_Texts, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_ComposedType);
    }
    public boolean remove(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Texts, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ComposedType) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return refRemoveLink((com.sap.tc.moin.repository.mmi.reflect.RefObject)_Texts, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_ComposedType);
    }
    public boolean remove(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Texts, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ComposedType) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return refRemoveLink(connection, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_Texts, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_ComposedType);
    }
    public boolean refLinkExists(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefObject firstEnd, com.sap.tc.moin.repository.mmi.reflect.RefObject secondEnd) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        if ( firstEnd == null || secondEnd == null ) { return false; }
        checkTypesForRefLinkExists( connection, firstEnd, secondEnd );
        return exists( connection, (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) firstEnd, (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) secondEnd );
    }

    @SuppressWarnings("unchecked")
    public java.lang.Class<com.sap.ide.metamodel.dictionary.datatype.ATextsComposedType> get___JmiInterface() {
        return com.sap.ide.metamodel.dictionary.datatype.ATextsComposedType.class;
    }
    
    @Override
    public com.sap.tc.moin.repository.spi.core.Wrapper<com.sap.ide.metamodel.dictionary.datatype.ATextsComposedType> createWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, boolean synchronize) {
        return new com.sap.ide.metamodel.dictionary.datatype.__impl.ATextsComposedTypeWrapper(conn, this, synchronize);
    }
}