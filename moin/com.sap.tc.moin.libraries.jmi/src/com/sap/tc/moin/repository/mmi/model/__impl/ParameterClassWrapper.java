/**
 * Generated by the MOIN JMI Generator Version 3.0
 **/

package com.sap.tc.moin.repository.mmi.model.__impl;

public final class ParameterClassWrapper extends com.sap.tc.moin.repository.core.jmi.reflect.RefClassWrapperImpl<com.sap.tc.moin.repository.mmi.model.__impl.ParameterClassImpl> implements com.sap.tc.moin.repository.mmi.model.ParameterClass,com.sap.tc.moin.repository.Partitionable {

    
    static {
    }

    public ParameterClassWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, com.sap.tc.moin.repository.mmi.model.__impl.ParameterClassImpl baseObject, boolean synchronize) {
        super(conn, baseObject, synchronize);
    }
    
    private com.sap.tc.moin.repository.mmi.model.__impl.ParameterClassImpl getCastWrappedObject() {
        return (com.sap.tc.moin.repository.mmi.model.__impl.ParameterClassImpl) getWrappedObject();
    }
    
    public com.sap.tc.moin.repository.mmi.model.__impl.ParameterClassImpl unwrap() {
        return (com.sap.tc.moin.repository.mmi.model.__impl.ParameterClassImpl) getWrappedObject();
    }
    
    public com.sap.tc.moin.repository.mmi.model.Parameter createParameter() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return  wrapResult(getCastWrappedObject().createParameter(connection));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return  wrapResult(getCastWrappedObject().createParameter(connection)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public com.sap.tc.moin.repository.mmi.model.Parameter createParameterInPartition(com.sap.tc.moin.repository.ModelPartition partition) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return  wrapResult(getCastWrappedObject().createParameterInPartition(connection, unwrapArg(partition)));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return  wrapResult(getCastWrappedObject().createParameterInPartition(connection, unwrapArg(partition))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public com.sap.tc.moin.repository.mmi.model.Parameter createParameter(java.lang.String name, java.lang.String annotation, com.sap.tc.moin.repository.mmi.model.DirectionKind direction, com.sap.tc.moin.repository.mmi.model.MultiplicityType multiplicity) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return  wrapResult(getCastWrappedObject().createParameter(connection, name, annotation, direction, multiplicity));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return  wrapResult(getCastWrappedObject().createParameter(connection, name, annotation, direction, multiplicity)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public com.sap.tc.moin.repository.mmi.model.Parameter createParameterInPartition(java.lang.String name, java.lang.String annotation, com.sap.tc.moin.repository.mmi.model.DirectionKind direction, com.sap.tc.moin.repository.mmi.model.MultiplicityType multiplicity, com.sap.tc.moin.repository.ModelPartition partition) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return  wrapResult(getCastWrappedObject().createParameterInPartition(connection, name, annotation, direction, multiplicity, unwrapArg(partition)));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return  wrapResult(getCastWrappedObject().createParameterInPartition(connection, name, annotation, direction, multiplicity, unwrapArg(partition))); 
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
    public java.lang.Class<com.sap.tc.moin.repository.mmi.model.ParameterClass> get___JmiInterface() {
        return com.sap.tc.moin.repository.mmi.model.ParameterClass.class;
    }
    
    // to String
    protected String metaObjectToString() {
        return "com.sap.tc.moin.repository.mmi.model.ParameterClass (Java Type)\nModel.Parameter (MOF Type)"; //$NON-NLS-1$
    }    
}