/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.common.diagram.__impl;

public final class AReferencedObjectDiagramImpl extends com.sap.tc.moin.repository.core.jmi.reflect.RefAssociationImpl
{
    // default constructor
    public AReferencedObjectDiagramImpl() {
        super();
    }

    // specific constructor
    public AReferencedObjectDiagramImpl(java.lang.Object workspace, java.lang.String mofId, com.sap.tc.moin.repository.mmi.reflect.RefPackage immediatePackage, com.sap.tc.moin.repository.mmi.reflect.RefObject metaObject) {
        super(workspace, mofId, immediatePackage, metaObject);
    }
    
    public boolean exists(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ReferencedObject, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Diagram) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return exists(get___CurrentConnection(), _ReferencedObject, _Diagram);
    }
    public boolean exists(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ReferencedObject, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Diagram) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return ___existsMult1( connection, _Diagram, _ReferencedObject, "460CC65C297AB025157B4CC301158948FBAD2F3E"); //$NON-NLS-1$
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getReferencedObject(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Diagram) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return getReferencedObject(get___CurrentConnection(), _Diagram);
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getReferencedObject(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Diagram) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) ___getElementAtOtherLinkEnd( connection, (com.sap.tc.moin.repository.core.CorePartitionable) _Diagram, "460CC65C297AB025157B4CC301158948FBAD2F3E"); //$NON-NLS-1$
    }
    public java.util.Collection<com.sap.tc.moin.repository.mmi.reflect.RefBaseObject> getDiagram(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ReferencedObject) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return getDiagram(get___CurrentConnection(), _ReferencedObject);
    }
    public java.util.Collection<com.sap.tc.moin.repository.mmi.reflect.RefBaseObject> getDiagram(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ReferencedObject) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (java.util.Collection<com.sap.tc.moin.repository.mmi.reflect.RefBaseObject>) ___queryElementsAtOtherLinkEnd( connection, (com.sap.tc.moin.repository.core.CorePartitionable) _ReferencedObject, get___EndAndMetaObject( 0 ) );
    }
    public boolean add(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ReferencedObject, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Diagram) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          return refAddLink((com.sap.tc.moin.repository.mmi.reflect.RefObject)_ReferencedObject, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_Diagram);
    }
    public boolean add(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ReferencedObject, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Diagram) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          return refAddLink(connection, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_ReferencedObject, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_Diagram);
    }
    public boolean remove(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ReferencedObject, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Diagram) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return refRemoveLink((com.sap.tc.moin.repository.mmi.reflect.RefObject)_ReferencedObject, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_Diagram);
    }
    public boolean remove(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _ReferencedObject, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _Diagram) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return refRemoveLink(connection, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_ReferencedObject, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_Diagram);
    }
    public boolean refLinkExists(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefObject firstEnd, com.sap.tc.moin.repository.mmi.reflect.RefObject secondEnd) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        if ( firstEnd == null || secondEnd == null ) { return false; }
        checkTypesForRefLinkExists( connection, firstEnd, secondEnd );
        return exists( connection, (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) firstEnd, (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) secondEnd );
    }

    @SuppressWarnings("unchecked")
    public java.lang.Class<com.sap.ide.metamodel.common.diagram.AReferencedObjectDiagram> get___JmiInterface() {
        return com.sap.ide.metamodel.common.diagram.AReferencedObjectDiagram.class;
    }
    
    @Override
    public com.sap.tc.moin.repository.spi.core.Wrapper<com.sap.ide.metamodel.common.diagram.AReferencedObjectDiagram> createWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, boolean synchronize) {
        return new com.sap.ide.metamodel.common.diagram.__impl.AReferencedObjectDiagramWrapper(conn, this, synchronize);
    }
}