/**
 * Generated by the MOIN JMI Generator Version 3.0
 **/

package org.omg.ocl.attaching.__impl;

public final class OclConstraintClassWrapper extends com.sap.tc.moin.repository.core.jmi.reflect.RefClassWrapperImpl<org.omg.ocl.attaching.__impl.OclConstraintClassImpl> implements org.omg.ocl.attaching.OclConstraintClass,com.sap.tc.moin.repository.Partitionable {

    
    static {
    }

    public OclConstraintClassWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, org.omg.ocl.attaching.__impl.OclConstraintClassImpl baseObject, boolean synchronize) {
        super(conn, baseObject, synchronize);
    }
    
    private org.omg.ocl.attaching.__impl.OclConstraintClassImpl getCastWrappedObject() {
        return (org.omg.ocl.attaching.__impl.OclConstraintClassImpl) getWrappedObject();
    }
    
    public org.omg.ocl.attaching.__impl.OclConstraintClassImpl unwrap() {
        return (org.omg.ocl.attaching.__impl.OclConstraintClassImpl) getWrappedObject();
    }
    
    public org.omg.ocl.attaching.OclConstraint createOclConstraint() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return  wrapResult(getCastWrappedObject().createOclConstraint(connection));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return  wrapResult(getCastWrappedObject().createOclConstraint(connection)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public org.omg.ocl.attaching.OclConstraint createOclConstraintInPartition(com.sap.tc.moin.repository.ModelPartition partition) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return  wrapResult(getCastWrappedObject().createOclConstraintInPartition(connection, unwrapArg(partition)));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return  wrapResult(getCastWrappedObject().createOclConstraintInPartition(connection, unwrapArg(partition))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public org.omg.ocl.attaching.OclConstraint createOclConstraint(java.lang.String name, java.lang.String annotation, java.lang.String expression, java.lang.String language, com.sap.tc.moin.repository.mmi.model.EvaluationKind evaluationPolicy) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return  wrapResult(getCastWrappedObject().createOclConstraint(connection, name, annotation, expression, language, evaluationPolicy));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return  wrapResult(getCastWrappedObject().createOclConstraint(connection, name, annotation, expression, language, evaluationPolicy)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public org.omg.ocl.attaching.OclConstraint createOclConstraintInPartition(java.lang.String name, java.lang.String annotation, java.lang.String expression, java.lang.String language, com.sap.tc.moin.repository.mmi.model.EvaluationKind evaluationPolicy, com.sap.tc.moin.repository.ModelPartition partition) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return  wrapResult(getCastWrappedObject().createOclConstraintInPartition(connection, name, annotation, expression, language, evaluationPolicy, unwrapArg(partition)));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return  wrapResult(getCastWrappedObject().createOclConstraintInPartition(connection, name, annotation, expression, language, evaluationPolicy, unwrapArg(partition))); 
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
    public java.lang.Class<org.omg.ocl.attaching.OclConstraintClass> get___JmiInterface() {
        return org.omg.ocl.attaching.OclConstraintClass.class;
    }
    
    // to String
    protected String metaObjectToString() {
        return "org.omg.ocl.attaching.OclConstraintClass (Java Type)\nOCL.Attaching.OclConstraint (MOF Type)"; //$NON-NLS-1$
    }    
}