/**
 * Generated by the MOIN JMI Generator Version 3.0
 **/

package org.omg.ocl.expressions.__impl;

public final class NavigationCallExpClassWrapper extends com.sap.tc.moin.repository.core.jmi.reflect.RefClassWrapperImpl<org.omg.ocl.expressions.__impl.NavigationCallExpClassImpl> implements org.omg.ocl.expressions.NavigationCallExpClass,com.sap.tc.moin.repository.Partitionable {

    
    static {
    }

    public NavigationCallExpClassWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, org.omg.ocl.expressions.__impl.NavigationCallExpClassImpl baseObject, boolean synchronize) {
        super(conn, baseObject, synchronize);
    }
    
    private org.omg.ocl.expressions.__impl.NavigationCallExpClassImpl getCastWrappedObject() {
        return (org.omg.ocl.expressions.__impl.NavigationCallExpClassImpl) getWrappedObject();
    }
    
    public org.omg.ocl.expressions.__impl.NavigationCallExpClassImpl unwrap() {
        return (org.omg.ocl.expressions.__impl.NavigationCallExpClassImpl) getWrappedObject();
    }
    
    public org.omg.ocl.expressions.NavigationCallExp createNavigationCallExp() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return  wrapResult(getCastWrappedObject().createNavigationCallExp(connection));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return  wrapResult(getCastWrappedObject().createNavigationCallExp(connection)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public org.omg.ocl.expressions.NavigationCallExp createNavigationCallExpInPartition(com.sap.tc.moin.repository.ModelPartition partition) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return  wrapResult(getCastWrappedObject().createNavigationCallExpInPartition(connection, unwrapArg(partition)));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return  wrapResult(getCastWrappedObject().createNavigationCallExpInPartition(connection, unwrapArg(partition))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public org.omg.ocl.expressions.NavigationCallExp createNavigationCallExp(java.lang.String name) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return  wrapResult(getCastWrappedObject().createNavigationCallExp(connection, name));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return  wrapResult(getCastWrappedObject().createNavigationCallExp(connection, name)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public org.omg.ocl.expressions.NavigationCallExp createNavigationCallExpInPartition(java.lang.String name, com.sap.tc.moin.repository.ModelPartition partition) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return  wrapResult(getCastWrappedObject().createNavigationCallExpInPartition(connection, name, unwrapArg(partition)));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return  wrapResult(getCastWrappedObject().createNavigationCallExpInPartition(connection, name, unwrapArg(partition))); 
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
    public java.lang.Class<org.omg.ocl.expressions.NavigationCallExpClass> get___JmiInterface() {
        return org.omg.ocl.expressions.NavigationCallExpClass.class;
    }
    
    // to String
    protected String metaObjectToString() {
        return "org.omg.ocl.expressions.NavigationCallExpClass (Java Type)\nOCL.Expressions.NavigationCallExp (MOF Type)"; //$NON-NLS-1$
    }    
}