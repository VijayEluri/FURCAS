/**
 * Generated by the MOIN JMI Generator Version 3.0
 **/

package org.omg.ocl.types.__impl;

public final class BagTypeClassWrapper extends com.sap.tc.moin.repository.core.jmi.reflect.RefClassWrapperImpl<org.omg.ocl.types.__impl.BagTypeClassImpl> implements org.omg.ocl.types.BagTypeClass,com.sap.tc.moin.repository.Partitionable {

    
    static {
    }

    public BagTypeClassWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, org.omg.ocl.types.__impl.BagTypeClassImpl baseObject, boolean synchronize) {
        super(conn, baseObject, synchronize);
    }
    
    private org.omg.ocl.types.__impl.BagTypeClassImpl getCastWrappedObject() {
        return (org.omg.ocl.types.__impl.BagTypeClassImpl) getWrappedObject();
    }
    
    public org.omg.ocl.types.__impl.BagTypeClassImpl unwrap() {
        return (org.omg.ocl.types.__impl.BagTypeClassImpl) getWrappedObject();
    }
    
    public org.omg.ocl.types.BagType createBagType() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return  wrapResult(getCastWrappedObject().createBagType(connection));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return  wrapResult(getCastWrappedObject().createBagType(connection)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public org.omg.ocl.types.BagType createBagTypeInPartition(com.sap.tc.moin.repository.ModelPartition partition) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return  wrapResult(getCastWrappedObject().createBagTypeInPartition(connection, unwrapArg(partition)));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return  wrapResult(getCastWrappedObject().createBagTypeInPartition(connection, unwrapArg(partition))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public org.omg.ocl.types.BagType createBagType(java.lang.String name, java.lang.String annotation, boolean isRoot, boolean isLeaf, boolean isAbstract, com.sap.tc.moin.repository.mmi.model.VisibilityKind visibility) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return  wrapResult(getCastWrappedObject().createBagType(connection, name, annotation, isRoot, isLeaf, isAbstract, visibility));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return  wrapResult(getCastWrappedObject().createBagType(connection, name, annotation, isRoot, isLeaf, isAbstract, visibility)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public org.omg.ocl.types.BagType createBagTypeInPartition(java.lang.String name, java.lang.String annotation, boolean isRoot, boolean isLeaf, boolean isAbstract, com.sap.tc.moin.repository.mmi.model.VisibilityKind visibility, com.sap.tc.moin.repository.ModelPartition partition) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return  wrapResult(getCastWrappedObject().createBagTypeInPartition(connection, name, annotation, isRoot, isLeaf, isAbstract, visibility, unwrapArg(partition)));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return  wrapResult(getCastWrappedObject().createBagTypeInPartition(connection, name, annotation, isRoot, isLeaf, isAbstract, visibility, unwrapArg(partition))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }    

    // methods for static attributes
    

    // methods for modeled static operations

    // methods for structure type creators

    
    // methods for internal modeled operations

    // reflective methods
    

    // get the JMI interface
    public java.lang.Class<org.omg.ocl.types.BagTypeClass> get___JmiInterface() {
        return org.omg.ocl.types.BagTypeClass.class;
    }
    
    // to String
    protected String metaObjectToString() {
        return "org.omg.ocl.types.BagTypeClass (Java Type)\nOCL.Types.BagType (MOF Type)"; //$NON-NLS-1$
    }    
}