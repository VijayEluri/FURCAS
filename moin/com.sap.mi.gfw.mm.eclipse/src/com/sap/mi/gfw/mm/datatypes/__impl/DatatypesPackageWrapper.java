/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.mi.gfw.mm.datatypes.__impl;

public class DatatypesPackageWrapper extends com.sap.tc.moin.repository.core.jmi.reflect.RefPackageWrapperImpl<com.sap.mi.gfw.mm.datatypes.__impl.DatatypesPackageImpl> implements com.sap.mi.gfw.mm.datatypes.DatatypesPackage,com.sap.tc.moin.repository.Partitionable
{

    /**
     * The DatatypesPackage wrapper
     */
    public DatatypesPackageWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, com.sap.mi.gfw.mm.datatypes.__impl.DatatypesPackageImpl baseObject, boolean synchronize) {
        super(conn, baseObject, synchronize);
    }

    private com.sap.mi.gfw.mm.datatypes.__impl.DatatypesPackageImpl getCastWrappedObject() {
        return (com.sap.mi.gfw.mm.datatypes.__impl.DatatypesPackageImpl) getWrappedObject();
    }
    
    public com.sap.mi.gfw.mm.datatypes.__impl.DatatypesPackageImpl unwrap() {
        return (com.sap.mi.gfw.mm.datatypes.__impl.DatatypesPackageImpl) getWrappedObject();
    }
    
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getViewPort()
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.tc.moin.repository.mmi.reflect.RefClass) wrapResult(getCastWrappedObject().getViewPort(connection));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.tc.moin.repository.mmi.reflect.RefClass) wrapResult(getCastWrappedObject().getViewPort(connection)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getColor()
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.tc.moin.repository.mmi.reflect.RefClass) wrapResult(getCastWrappedObject().getColor(connection));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.tc.moin.repository.mmi.reflect.RefClass) wrapResult(getCastWrappedObject().getColor(connection)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    // methods for structure type creators
    public com.sap.mi.gfw.mm.datatypes.Point createPoint(com.sap.tc.moin.repository.mmi.descriptors.StructureFieldContainer<? super com.sap.mi.gfw.mm.datatypes.Point> structureFieldContainer) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return wrapResult(getCastWrappedObject().createPoint(connection, structureFieldContainer));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return wrapResult(getCastWrappedObject().createPoint(connection, structureFieldContainer));
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }

    
    public java.lang.Class<com.sap.mi.gfw.mm.datatypes.DatatypesPackage> get___JmiInterface() {
        return com.sap.mi.gfw.mm.datatypes.DatatypesPackage.class;
    }
    
    protected String metaObjectToString() {
        return "com.sap.mi.gfw.mm.datatypes.DatatypesPackage (Java Type)\ndatatypes (MOF Type)"; //$NON-NLS-1$
    }
}