/**
 * Generated by the MOIN JMI Generator Version 3.0
 **/

package org.omg.ocl.expressions.__impl;

public final class VariableDeclarationClassWrapper extends com.sap.tc.moin.repository.core.jmi.reflect.RefClassWrapperImpl<org.omg.ocl.expressions.__impl.VariableDeclarationClassImpl> implements org.omg.ocl.expressions.VariableDeclarationClass,com.sap.tc.moin.repository.Partitionable {

    
    static {
    }

    public VariableDeclarationClassWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, org.omg.ocl.expressions.__impl.VariableDeclarationClassImpl baseObject, boolean synchronize) {
        super(conn, baseObject, synchronize);
    }
    
    private org.omg.ocl.expressions.__impl.VariableDeclarationClassImpl getCastWrappedObject() {
        return (org.omg.ocl.expressions.__impl.VariableDeclarationClassImpl) getWrappedObject();
    }
    
    public org.omg.ocl.expressions.__impl.VariableDeclarationClassImpl unwrap() {
        return (org.omg.ocl.expressions.__impl.VariableDeclarationClassImpl) getWrappedObject();
    }
    
    public org.omg.ocl.expressions.VariableDeclaration createVariableDeclaration() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return  wrapResult(getCastWrappedObject().createVariableDeclaration(connection));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return  wrapResult(getCastWrappedObject().createVariableDeclaration(connection)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public org.omg.ocl.expressions.VariableDeclaration createVariableDeclarationInPartition(com.sap.tc.moin.repository.ModelPartition partition) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return  wrapResult(getCastWrappedObject().createVariableDeclarationInPartition(connection, unwrapArg(partition)));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return  wrapResult(getCastWrappedObject().createVariableDeclarationInPartition(connection, unwrapArg(partition))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public org.omg.ocl.expressions.VariableDeclaration createVariableDeclaration(java.lang.String name, java.lang.String varName) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return  wrapResult(getCastWrappedObject().createVariableDeclaration(connection, name, varName));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return  wrapResult(getCastWrappedObject().createVariableDeclaration(connection, name, varName)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public org.omg.ocl.expressions.VariableDeclaration createVariableDeclarationInPartition(java.lang.String name, java.lang.String varName, com.sap.tc.moin.repository.ModelPartition partition) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return  wrapResult(getCastWrappedObject().createVariableDeclarationInPartition(connection, name, varName, unwrapArg(partition)));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return  wrapResult(getCastWrappedObject().createVariableDeclarationInPartition(connection, name, varName, unwrapArg(partition))); 
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
    public java.lang.Class<org.omg.ocl.expressions.VariableDeclarationClass> get___JmiInterface() {
        return org.omg.ocl.expressions.VariableDeclarationClass.class;
    }
    
    // to String
    protected String metaObjectToString() {
        return "org.omg.ocl.expressions.VariableDeclarationClass (Java Type)\nOCL.Expressions.VariableDeclaration (MOF Type)"; //$NON-NLS-1$
    }    
}