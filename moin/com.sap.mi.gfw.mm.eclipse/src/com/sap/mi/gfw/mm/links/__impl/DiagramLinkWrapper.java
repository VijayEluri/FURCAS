/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.mi.gfw.mm.links.__impl;

public class DiagramLinkWrapper extends com.sap.tc.moin.repository.core.jmi.reflect.RefObjectWrapperImpl<com.sap.mi.gfw.mm.links.__impl.DiagramLinkImpl> implements com.sap.mi.gfw.mm.links.DiagramLink,com.sap.tc.moin.repository.Partitionable {

    
    static {
    }

    public DiagramLinkWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, com.sap.mi.gfw.mm.links.__impl.DiagramLinkImpl baseObject, boolean synchronize) {
        super(conn, baseObject, synchronize);
    }

    private com.sap.mi.gfw.mm.links.__impl.DiagramLinkImpl getCastWrappedObject() {
        return (com.sap.mi.gfw.mm.links.__impl.DiagramLinkImpl) getWrappedObject();
    }
    
    public com.sap.mi.gfw.mm.links.__impl.DiagramLinkImpl unwrap() {
        return (com.sap.mi.gfw.mm.links.__impl.DiagramLinkImpl) getWrappedObject();
    }
        
    // methods for attributes
     
    // methods for references
    public com.sap.mi.gfw.mm.pictograms.Diagram getDiagram() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.mi.gfw.mm.pictograms.Diagram) wrapResult(getCastWrappedObject().getDiagram(connection));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.mi.gfw.mm.pictograms.Diagram) wrapResult(getCastWrappedObject().getDiagram(connection)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }

    public void setDiagram(com.sap.mi.gfw.mm.pictograms.Diagram newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    getCastWrappedObject().setDiagram(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) newValue));
                }       
            }
            else {
                assertConnectionAlive();
                attachConnectionIfRequired();
                getCastWrappedObject().setDiagram(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) newValue));
            } 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }

    public java.util.Collection<com.sap.mi.gfw.mm.links.PictogramLink> getPictogramLinks() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (java.util.Collection<com.sap.mi.gfw.mm.links.PictogramLink>) wrapResult(getCastWrappedObject().getPictogramLinks(connection));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (java.util.Collection<com.sap.mi.gfw.mm.links.PictogramLink>) wrapResult(getCastWrappedObject().getPictogramLinks(connection)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }



   
    // methods for modeled operations
    
    // methods for internal modeled operations

    // reflective methods
    

    // get the JMI interface
    public java.lang.Class<com.sap.mi.gfw.mm.links.DiagramLink> get___JmiInterface() {
        return com.sap.mi.gfw.mm.links.DiagramLink.class;
    }

    // to String
    protected String metaObjectToString() {
        return "com.sap.mi.gfw.mm.links.DiagramLink (Java Type)\nlinks.DiagramLink (MOF Type)"; //$NON-NLS-1$
    }    
}