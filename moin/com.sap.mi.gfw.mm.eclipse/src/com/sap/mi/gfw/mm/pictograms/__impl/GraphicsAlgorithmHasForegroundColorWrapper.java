/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.mi.gfw.mm.pictograms.__impl;

public class GraphicsAlgorithmHasForegroundColorWrapper extends com.sap.tc.moin.repository.core.jmi.reflect.RefAssociationWrapperImpl<com.sap.mi.gfw.mm.pictograms.GraphicsAlgorithmHasForegroundColor> implements com.sap.mi.gfw.mm.pictograms.GraphicsAlgorithmHasForegroundColor,com.sap.tc.moin.repository.Partitionable
{

    /**
     * The GraphicsAlgorithmHasForegroundColor wrapper
     */
    public GraphicsAlgorithmHasForegroundColorWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, com.sap.mi.gfw.mm.pictograms.__impl.GraphicsAlgorithmHasForegroundColorImpl baseObject, boolean synchronize) {
        super(conn, baseObject, synchronize);
    }
    
    private com.sap.mi.gfw.mm.pictograms.__impl.GraphicsAlgorithmHasForegroundColorImpl getCastWrappedObject() {
        return (com.sap.mi.gfw.mm.pictograms.__impl.GraphicsAlgorithmHasForegroundColorImpl) getWrappedObject();
    }

    public com.sap.mi.gfw.mm.pictograms.GraphicsAlgorithmHasForegroundColor unwrap() {
        return (com.sap.mi.gfw.mm.pictograms.GraphicsAlgorithmHasForegroundColor) getWrappedObject();
    }
    
    public boolean exists(com.sap.mi.gfw.mm.datatypes.Color _Foreground, com.sap.mi.gfw.mm.pictograms.AbstractStyle _AbstractStyle) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().exists(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Foreground), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _AbstractStyle));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().exists(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Foreground), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _AbstractStyle)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public com.sap.mi.gfw.mm.datatypes.Color getForeground(com.sap.mi.gfw.mm.pictograms.AbstractStyle _AbstractStyle) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.mi.gfw.mm.datatypes.Color) wrapResult(getCastWrappedObject().getForeground(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _AbstractStyle)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.mi.gfw.mm.datatypes.Color) wrapResult(getCastWrappedObject().getForeground(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _AbstractStyle))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public java.util.Collection getAbstractStyle(com.sap.mi.gfw.mm.datatypes.Color _Foreground) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (java.util.Collection) wrapResult(getCastWrappedObject().getAbstractStyle(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Foreground)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (java.util.Collection) wrapResult(getCastWrappedObject().getAbstractStyle(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Foreground))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean add(com.sap.mi.gfw.mm.datatypes.Color _Foreground, com.sap.mi.gfw.mm.pictograms.AbstractStyle _AbstractStyle) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().add(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Foreground), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _AbstractStyle));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().add(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Foreground), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _AbstractStyle)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean remove(com.sap.mi.gfw.mm.datatypes.Color _Foreground, com.sap.mi.gfw.mm.pictograms.AbstractStyle _AbstractStyle) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().remove(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Foreground), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _AbstractStyle));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().remove(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Foreground), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _AbstractStyle)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }   

    public java.lang.Class<com.sap.mi.gfw.mm.pictograms.GraphicsAlgorithmHasForegroundColor> get___JmiInterface() {
        return com.sap.mi.gfw.mm.pictograms.GraphicsAlgorithmHasForegroundColor.class;
    }

    protected String metaObjectToString() {
        return "com.sap.mi.gfw.mm.pictograms.GraphicsAlgorithmHasForegroundColor (Java Type)\npictograms.GraphicsAlgorithmHasForegroundColor (MOF Type)"; //$NON-NLS-1$
    }    
}