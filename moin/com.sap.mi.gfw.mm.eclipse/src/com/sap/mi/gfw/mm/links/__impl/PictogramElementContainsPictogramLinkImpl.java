/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.mi.gfw.mm.links.__impl;

public final class PictogramElementContainsPictogramLinkImpl extends com.sap.tc.moin.repository.core.jmi.reflect.RefAssociationImpl
{
    // default constructor
    public PictogramElementContainsPictogramLinkImpl() {
        super();
    }

    // specific constructor
    public PictogramElementContainsPictogramLinkImpl(java.lang.Object workspace, java.lang.String mofId, com.sap.tc.moin.repository.mmi.reflect.RefPackage immediatePackage, com.sap.tc.moin.repository.mmi.reflect.RefObject metaObject) {
        super(workspace, mofId, immediatePackage, metaObject);
    }
    
    public boolean exists(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _PictogramElement, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Link) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return exists(get___CurrentConnection(), _PictogramElement, _Link);
    }
    public boolean exists(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _PictogramElement, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Link) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return ___existsMult1( connection, _PictogramElement, _Link, "45E806E31139B106E4C3417E27DBB20E0A624E91"); //$NON-NLS-1$
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getPictogramElement(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Link) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return getPictogramElement(get___CurrentConnection(), _Link);
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getPictogramElement(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Link) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        com.sap.tc.moin.repository.core.EndAndMetaObject endAndMetaObject = get___EndAndMetaObject( 1 );
        return (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) get___CompositeParentForEndAndMetaObject( connection, _Link, endAndMetaObject );
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getLink(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _PictogramElement) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return getLink(get___CurrentConnection(), _PictogramElement);
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getLink(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _PictogramElement) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) ___getElementAtOtherLinkEnd( connection, (com.sap.tc.moin.repository.core.CorePartitionable) _PictogramElement, "45E806E31139B106E4C3417E27DBB20E0A624E91"); //$NON-NLS-1$
    }
    public boolean add(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _PictogramElement, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Link) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          return refAddLink((com.sap.tc.moin.repository.mmi.reflect.RefObject)_PictogramElement, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_Link);
    }
    public boolean add(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _PictogramElement, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Link) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          return refAddLink(connection, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_PictogramElement, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_Link);
    }
    public boolean remove(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _PictogramElement, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Link) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return refRemoveLink((com.sap.tc.moin.repository.mmi.reflect.RefObject)_PictogramElement, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_Link);
    }
    public boolean remove(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _PictogramElement, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Link) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return refRemoveLink(connection, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_PictogramElement, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_Link);
    }
    public boolean refLinkExists(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefObject firstEnd, com.sap.tc.moin.repository.mmi.reflect.RefObject secondEnd) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        if ( firstEnd == null || secondEnd == null ) { return false; }
        checkTypesForRefLinkExists( connection, firstEnd, secondEnd );
        return exists( connection, (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) firstEnd, (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) secondEnd );
    }

    public java.lang.Class<com.sap.mi.gfw.mm.links.PictogramElementContainsPictogramLink> get___JmiInterface() {
        return com.sap.mi.gfw.mm.links.PictogramElementContainsPictogramLink.class;
    }
    
    @Override
    public com.sap.tc.moin.repository.spi.core.Wrapper<com.sap.mi.gfw.mm.links.PictogramElementContainsPictogramLink> createWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, boolean synchronize) {
        return new com.sap.mi.gfw.mm.links.__impl.PictogramElementContainsPictogramLinkWrapper(conn, this, synchronize);
    }
}