/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.mi.gfw.mm.pictograms.__impl;

public class DiagramAggregatesConnectionsWrapper extends com.sap.tc.moin.repository.core.jmi.reflect.RefAssociationWrapperImpl<com.sap.mi.gfw.mm.pictograms.DiagramAggregatesConnections> implements com.sap.mi.gfw.mm.pictograms.DiagramAggregatesConnections,com.sap.tc.moin.repository.Partitionable
{

    /**
     * The DiagramAggregatesConnections wrapper
     */
    public DiagramAggregatesConnectionsWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, com.sap.mi.gfw.mm.pictograms.__impl.DiagramAggregatesConnectionsImpl baseObject, boolean synchronize) {
        super(conn, baseObject, synchronize);
    }
    
    private com.sap.mi.gfw.mm.pictograms.__impl.DiagramAggregatesConnectionsImpl getCastWrappedObject() {
        return (com.sap.mi.gfw.mm.pictograms.__impl.DiagramAggregatesConnectionsImpl) getWrappedObject();
    }

    public com.sap.mi.gfw.mm.pictograms.DiagramAggregatesConnections unwrap() {
        return (com.sap.mi.gfw.mm.pictograms.DiagramAggregatesConnections) getWrappedObject();
    }
    
    public boolean exists(com.sap.mi.gfw.mm.pictograms.Connection _Connections, com.sap.mi.gfw.mm.pictograms.Diagram _Parent) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().exists(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Connections), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Parent));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().exists(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Connections), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Parent)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public java.util.Collection getConnections(com.sap.mi.gfw.mm.pictograms.Diagram _Parent) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (java.util.Collection) wrapResult(getCastWrappedObject().getConnections(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Parent)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (java.util.Collection) wrapResult(getCastWrappedObject().getConnections(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Parent))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public com.sap.mi.gfw.mm.pictograms.Diagram getParent(com.sap.mi.gfw.mm.pictograms.Connection _Connections) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.mi.gfw.mm.pictograms.Diagram) wrapResult(getCastWrappedObject().getParent(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Connections)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.mi.gfw.mm.pictograms.Diagram) wrapResult(getCastWrappedObject().getParent(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Connections))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean add(com.sap.mi.gfw.mm.pictograms.Connection _Connections, com.sap.mi.gfw.mm.pictograms.Diagram _Parent) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().add(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Connections), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Parent));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().add(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Connections), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Parent)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean remove(com.sap.mi.gfw.mm.pictograms.Connection _Connections, com.sap.mi.gfw.mm.pictograms.Diagram _Parent) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().remove(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Connections), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Parent));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().remove(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Connections), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Parent)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }   

    public java.lang.Class<com.sap.mi.gfw.mm.pictograms.DiagramAggregatesConnections> get___JmiInterface() {
        return com.sap.mi.gfw.mm.pictograms.DiagramAggregatesConnections.class;
    }

    protected String metaObjectToString() {
        return "com.sap.mi.gfw.mm.pictograms.DiagramAggregatesConnections (Java Type)\npictograms.DiagramAggregatesConnections (MOF Type)"; //$NON-NLS-1$
    }    
}