/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.component.view.__impl;

public final class ATypeComponentPathElementsUIelementContextBindingImpl extends com.sap.tc.moin.repository.core.jmi.reflect.RefAssociationImpl
{
    // default constructor
    public ATypeComponentPathElementsUIelementContextBindingImpl() {
        super();
    }

    // specific constructor
    public ATypeComponentPathElementsUIelementContextBindingImpl(java.lang.Object workspace, java.lang.String mofId, com.sap.tc.moin.repository.mmi.reflect.RefPackage immediatePackage, com.sap.tc.moin.repository.mmi.reflect.RefObject metaObject) {
        super(workspace, mofId, immediatePackage, metaObject);
    }
    
    public boolean exists(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _TypeComponentPathElements, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _UIelementContextBinding) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return exists(get___CurrentConnection(), _TypeComponentPathElements, _UIelementContextBinding);
    }
    public boolean exists(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _TypeComponentPathElements, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _UIelementContextBinding) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return ___existsMultN( connection, _UIelementContextBinding, _TypeComponentPathElements, "45DDACEEAE487F65459E452702EFF27D47C57E7A"); //$NON-NLS-1$
    }
    public java.util.List<com.sap.tc.moin.repository.mmi.reflect.RefBaseObject> getTypeComponentPathElements(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _UIelementContextBinding) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return getTypeComponentPathElements(get___CurrentConnection(), _UIelementContextBinding);
    }
    public java.util.List<com.sap.tc.moin.repository.mmi.reflect.RefBaseObject> getTypeComponentPathElements(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _UIelementContextBinding) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (java.util.List<com.sap.tc.moin.repository.mmi.reflect.RefBaseObject>) ___getElementsAtOtherLinkEnd( connection, (com.sap.tc.moin.repository.core.CorePartitionable) _UIelementContextBinding, get___EndAndMetaObject( 1 ) );
    }
    public java.util.Collection<com.sap.tc.moin.repository.mmi.reflect.RefBaseObject> getUIelementContextBinding(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _TypeComponentPathElements) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return getUIelementContextBinding(get___CurrentConnection(), _TypeComponentPathElements);
    }
    public java.util.Collection<com.sap.tc.moin.repository.mmi.reflect.RefBaseObject> getUIelementContextBinding(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _TypeComponentPathElements) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (java.util.Collection<com.sap.tc.moin.repository.mmi.reflect.RefBaseObject>) ___queryElementsAtOtherLinkEnd( connection, (com.sap.tc.moin.repository.core.CorePartitionable) _TypeComponentPathElements, get___EndAndMetaObject( 0 ) );
    }
    public boolean add(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _TypeComponentPathElements, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _UIelementContextBinding) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          return refAddLink((com.sap.tc.moin.repository.mmi.reflect.RefObject)_TypeComponentPathElements, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_UIelementContextBinding);
    }
    public boolean add(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _TypeComponentPathElements, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _UIelementContextBinding) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          return refAddLink(connection, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_TypeComponentPathElements, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_UIelementContextBinding);
    }
    public boolean remove(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _TypeComponentPathElements, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _UIelementContextBinding) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return refRemoveLink((com.sap.tc.moin.repository.mmi.reflect.RefObject)_TypeComponentPathElements, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_UIelementContextBinding);
    }
    public boolean remove(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _TypeComponentPathElements, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _UIelementContextBinding) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return refRemoveLink(connection, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_TypeComponentPathElements, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_UIelementContextBinding);
    }
    public boolean refLinkExists(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefObject firstEnd, com.sap.tc.moin.repository.mmi.reflect.RefObject secondEnd) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        if ( firstEnd == null || secondEnd == null ) { return false; }
        checkTypesForRefLinkExists( connection, firstEnd, secondEnd );
        return exists( connection, (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) firstEnd, (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) secondEnd );
    }

    @SuppressWarnings("unchecked")
    public java.lang.Class<com.sap.ide.metamodel.webdynpro.component.view.ATypeComponentPathElementsUIelementContextBinding> get___JmiInterface() {
        return com.sap.ide.metamodel.webdynpro.component.view.ATypeComponentPathElementsUIelementContextBinding.class;
    }
    
    @Override
    public com.sap.tc.moin.repository.spi.core.Wrapper<com.sap.ide.metamodel.webdynpro.component.view.ATypeComponentPathElementsUIelementContextBinding> createWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, boolean synchronize) {
        return new com.sap.ide.metamodel.webdynpro.component.view.__impl.ATypeComponentPathElementsUIelementContextBindingWrapper(conn, this, synchronize);
    }
}