/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.mi.gfw.mm.pictograms.__impl;

public class DiagramContainsColorsWrapper extends com.sap.tc.moin.repository.core.jmi.reflect.RefAssociationWrapperImpl<com.sap.mi.gfw.mm.pictograms.DiagramContainsColors> implements com.sap.mi.gfw.mm.pictograms.DiagramContainsColors,com.sap.tc.moin.repository.Partitionable
{

    /**
     * The DiagramContainsColors wrapper
     */
    public DiagramContainsColorsWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, com.sap.mi.gfw.mm.pictograms.__impl.DiagramContainsColorsImpl baseObject, boolean synchronize) {
        super(conn, baseObject, synchronize);
    }
    
    private com.sap.mi.gfw.mm.pictograms.__impl.DiagramContainsColorsImpl getCastWrappedObject() {
        return (com.sap.mi.gfw.mm.pictograms.__impl.DiagramContainsColorsImpl) getWrappedObject();
    }

    public com.sap.mi.gfw.mm.pictograms.DiagramContainsColors unwrap() {
        return (com.sap.mi.gfw.mm.pictograms.DiagramContainsColors) getWrappedObject();
    }
    
    public boolean exists(com.sap.mi.gfw.mm.datatypes.Color _Colors, com.sap.mi.gfw.mm.pictograms.Diagram _Diagram) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().exists(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Colors), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Diagram));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().exists(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Colors), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Diagram)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public java.util.Collection getColors(com.sap.mi.gfw.mm.pictograms.Diagram _Diagram) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (java.util.Collection) wrapResult(getCastWrappedObject().getColors(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Diagram)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (java.util.Collection) wrapResult(getCastWrappedObject().getColors(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Diagram))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public com.sap.mi.gfw.mm.pictograms.Diagram getDiagram(com.sap.mi.gfw.mm.datatypes.Color _Colors) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.mi.gfw.mm.pictograms.Diagram) wrapResult(getCastWrappedObject().getDiagram(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Colors)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.mi.gfw.mm.pictograms.Diagram) wrapResult(getCastWrappedObject().getDiagram(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Colors))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean add(com.sap.mi.gfw.mm.datatypes.Color _Colors, com.sap.mi.gfw.mm.pictograms.Diagram _Diagram) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().add(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Colors), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Diagram));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().add(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Colors), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Diagram)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean remove(com.sap.mi.gfw.mm.datatypes.Color _Colors, com.sap.mi.gfw.mm.pictograms.Diagram _Diagram) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().remove(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Colors), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Diagram));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().remove(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Colors), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Diagram)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }   

    public java.lang.Class<com.sap.mi.gfw.mm.pictograms.DiagramContainsColors> get___JmiInterface() {
        return com.sap.mi.gfw.mm.pictograms.DiagramContainsColors.class;
    }

    protected String metaObjectToString() {
        return "com.sap.mi.gfw.mm.pictograms.DiagramContainsColors (Java Type)\npictograms.DiagramContainsColors (MOF Type)"; //$NON-NLS-1$
    }    
}