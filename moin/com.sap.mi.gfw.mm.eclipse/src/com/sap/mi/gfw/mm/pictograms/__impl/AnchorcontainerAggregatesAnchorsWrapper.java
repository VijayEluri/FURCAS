/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.mi.gfw.mm.pictograms.__impl;

public class AnchorcontainerAggregatesAnchorsWrapper extends com.sap.tc.moin.repository.core.jmi.reflect.RefAssociationWrapperImpl<com.sap.mi.gfw.mm.pictograms.AnchorcontainerAggregatesAnchors> implements com.sap.mi.gfw.mm.pictograms.AnchorcontainerAggregatesAnchors,com.sap.tc.moin.repository.Partitionable
{

    /**
     * The AnchorcontainerAggregatesAnchors wrapper
     */
    public AnchorcontainerAggregatesAnchorsWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, com.sap.mi.gfw.mm.pictograms.__impl.AnchorcontainerAggregatesAnchorsImpl baseObject, boolean synchronize) {
        super(conn, baseObject, synchronize);
    }
    
    private com.sap.mi.gfw.mm.pictograms.__impl.AnchorcontainerAggregatesAnchorsImpl getCastWrappedObject() {
        return (com.sap.mi.gfw.mm.pictograms.__impl.AnchorcontainerAggregatesAnchorsImpl) getWrappedObject();
    }

    public com.sap.mi.gfw.mm.pictograms.AnchorcontainerAggregatesAnchors unwrap() {
        return (com.sap.mi.gfw.mm.pictograms.AnchorcontainerAggregatesAnchors) getWrappedObject();
    }
    
    public boolean exists(com.sap.mi.gfw.mm.pictograms.Anchor _Anchors, com.sap.mi.gfw.mm.pictograms.AnchorContainer _Parent) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().exists(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Anchors), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Parent));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().exists(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Anchors), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Parent)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public java.util.Collection getAnchors(com.sap.mi.gfw.mm.pictograms.AnchorContainer _Parent) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (java.util.Collection) wrapResult(getCastWrappedObject().getAnchors(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Parent)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (java.util.Collection) wrapResult(getCastWrappedObject().getAnchors(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Parent))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public com.sap.mi.gfw.mm.pictograms.AnchorContainer getParent(com.sap.mi.gfw.mm.pictograms.Anchor _Anchors) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.mi.gfw.mm.pictograms.AnchorContainer) wrapResult(getCastWrappedObject().getParent(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Anchors)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.mi.gfw.mm.pictograms.AnchorContainer) wrapResult(getCastWrappedObject().getParent(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Anchors))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean add(com.sap.mi.gfw.mm.pictograms.Anchor _Anchors, com.sap.mi.gfw.mm.pictograms.AnchorContainer _Parent) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().add(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Anchors), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Parent));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().add(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Anchors), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Parent)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean remove(com.sap.mi.gfw.mm.pictograms.Anchor _Anchors, com.sap.mi.gfw.mm.pictograms.AnchorContainer _Parent) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().remove(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Anchors), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Parent));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().remove(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Anchors), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Parent)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }   

    public java.lang.Class<com.sap.mi.gfw.mm.pictograms.AnchorcontainerAggregatesAnchors> get___JmiInterface() {
        return com.sap.mi.gfw.mm.pictograms.AnchorcontainerAggregatesAnchors.class;
    }

    protected String metaObjectToString() {
        return "com.sap.mi.gfw.mm.pictograms.AnchorcontainerAggregatesAnchors (Java Type)\npictograms.AnchorcontainerAggregatesAnchors (MOF Type)"; //$NON-NLS-1$
    }    
}