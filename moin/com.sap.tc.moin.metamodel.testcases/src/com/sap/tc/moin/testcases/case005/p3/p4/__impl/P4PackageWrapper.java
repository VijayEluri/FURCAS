/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.tc.moin.testcases.case005.p3.p4.__impl;

public class P4PackageWrapper extends com.sap.tc.moin.repository.core.jmi.reflect.RefPackageWrapperImpl<com.sap.tc.moin.testcases.case005.p3.p4.__impl.P4PackageImpl> implements com.sap.tc.moin.testcases.case005.p3.p4.P4Package,com.sap.tc.moin.repository.Partitionable
{

    /**
     * The P4Package wrapper
     */
    public P4PackageWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, com.sap.tc.moin.testcases.case005.p3.p4.__impl.P4PackageImpl baseObject, boolean synchronize) {
        super(conn, baseObject, synchronize);
    }

    private com.sap.tc.moin.testcases.case005.p3.p4.__impl.P4PackageImpl getCastWrappedObject() {
        return (com.sap.tc.moin.testcases.case005.p3.p4.__impl.P4PackageImpl) getWrappedObject();
    }
    
    public com.sap.tc.moin.testcases.case005.p3.p4.__impl.P4PackageImpl unwrap() {
        return (com.sap.tc.moin.testcases.case005.p3.p4.__impl.P4PackageImpl) getWrappedObject();
    }
    
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getD5()
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.tc.moin.repository.mmi.reflect.RefClass) wrapResult(getCastWrappedObject().getD5(connection));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.tc.moin.repository.mmi.reflect.RefClass) wrapResult(getCastWrappedObject().getD5(connection)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public com.sap.tc.moin.testcases.case005.p3.p4.Association2 getAssociation2()
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.tc.moin.testcases.case005.p3.p4.Association2) wrapResult(getCastWrappedObject().getAssociation2(connection));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.tc.moin.testcases.case005.p3.p4.Association2) wrapResult(getCastWrappedObject().getAssociation2(connection)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    // methods for structure type creators
    
    public java.lang.Class<com.sap.tc.moin.testcases.case005.p3.p4.P4Package> get___JmiInterface() {
        return com.sap.tc.moin.testcases.case005.p3.p4.P4Package.class;
    }
    
    protected String metaObjectToString() {
        return "com.sap.tc.moin.testcases.case005.p3.p4.P4Package (Java Type)\ntestcases.case005.p3.p4 (MOF Type)"; //$NON-NLS-1$
    }
}