/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.tc.moin.testcases.case023.__impl;

public class AaWrapper extends com.sap.tc.moin.repository.core.jmi.reflect.RefAssociationWrapperImpl<com.sap.tc.moin.testcases.case023.Aa> implements com.sap.tc.moin.testcases.case023.Aa,com.sap.tc.moin.repository.Partitionable
{

    /**
     * The Aa wrapper
     */
    public AaWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, com.sap.tc.moin.testcases.case023.__impl.AaImpl baseObject, boolean synchronize) {
        super(conn, baseObject, synchronize);
    }
    
    private com.sap.tc.moin.testcases.case023.__impl.AaImpl getCastWrappedObject() {
        return (com.sap.tc.moin.testcases.case023.__impl.AaImpl) getWrappedObject();
    }

    public com.sap.tc.moin.testcases.case023.Aa unwrap() {
        return (com.sap.tc.moin.testcases.case023.Aa) getWrappedObject();
    }
    
    public boolean exists(com.sap.tc.moin.testcases.case023.A23 _ADown, com.sap.tc.moin.testcases.case023.A23 _AUp) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().exists(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ADown), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _AUp));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().exists(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ADown), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _AUp)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public java.util.Collection getADown(com.sap.tc.moin.testcases.case023.A23 _AUp) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (java.util.Collection) wrapResult(getCastWrappedObject().getADown(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _AUp)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (java.util.Collection) wrapResult(getCastWrappedObject().getADown(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _AUp))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public java.util.Collection getAUp(com.sap.tc.moin.testcases.case023.A23 _ADown) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (java.util.Collection) wrapResult(getCastWrappedObject().getAUp(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ADown)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (java.util.Collection) wrapResult(getCastWrappedObject().getAUp(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ADown))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean add(com.sap.tc.moin.testcases.case023.A23 _ADown, com.sap.tc.moin.testcases.case023.A23 _AUp) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().add(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ADown), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _AUp));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().add(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ADown), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _AUp)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean remove(com.sap.tc.moin.testcases.case023.A23 _ADown, com.sap.tc.moin.testcases.case023.A23 _AUp) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().remove(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ADown), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _AUp));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().remove(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ADown), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _AUp)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }   

    public java.lang.Class<com.sap.tc.moin.testcases.case023.Aa> get___JmiInterface() {
        return com.sap.tc.moin.testcases.case023.Aa.class;
    }

    protected String metaObjectToString() {
        return "com.sap.tc.moin.testcases.case023.Aa (Java Type)\ntestcases.case023.aa (MOF Type)"; //$NON-NLS-1$
    }    
}