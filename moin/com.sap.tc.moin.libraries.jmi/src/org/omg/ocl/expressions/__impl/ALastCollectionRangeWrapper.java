/**
 * Generated by the MOIN Generator Version 3.0
 **/

package org.omg.ocl.expressions.__impl;

public class ALastCollectionRangeWrapper extends com.sap.tc.moin.repository.core.jmi.reflect.RefAssociationWrapperImpl<org.omg.ocl.expressions.ALastCollectionRange> implements org.omg.ocl.expressions.ALastCollectionRange,com.sap.tc.moin.repository.Partitionable
{

    /**
     * The ALastCollectionRange wrapper
     */
    public ALastCollectionRangeWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, org.omg.ocl.expressions.__impl.ALastCollectionRangeImpl baseObject, boolean synchronize) {
        super(conn, baseObject, synchronize);
    }
    
    private org.omg.ocl.expressions.__impl.ALastCollectionRangeImpl getCastWrappedObject() {
        return (org.omg.ocl.expressions.__impl.ALastCollectionRangeImpl) getWrappedObject();
    }

    public org.omg.ocl.expressions.ALastCollectionRange unwrap() {
        return (org.omg.ocl.expressions.ALastCollectionRange) getWrappedObject();
    }
    
    public boolean exists(org.omg.ocl.expressions.OclExpression _Last, org.omg.ocl.expressions.CollectionRange _CollectionRange) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().exists(connection, unwrapArg(_Last), unwrapArg(_CollectionRange));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().exists(connection, unwrapArg(_Last), unwrapArg(_CollectionRange)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public org.omg.ocl.expressions.OclExpression getLast(org.omg.ocl.expressions.CollectionRange _CollectionRange) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return  wrapResult(getCastWrappedObject().getLast(connection, unwrapArg(_CollectionRange)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return  wrapResult(getCastWrappedObject().getLast(connection, unwrapArg(_CollectionRange))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public org.omg.ocl.expressions.CollectionRange getCollectionRange(org.omg.ocl.expressions.OclExpression _Last) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return  wrapResult(getCastWrappedObject().getCollectionRange(connection, unwrapArg(_Last)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return  wrapResult(getCastWrappedObject().getCollectionRange(connection, unwrapArg(_Last))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean add(org.omg.ocl.expressions.OclExpression _Last, org.omg.ocl.expressions.CollectionRange _CollectionRange) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().add(connection, unwrapArg(_Last), unwrapArg(_CollectionRange));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().add(connection, unwrapArg(_Last), unwrapArg(_CollectionRange)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean remove(org.omg.ocl.expressions.OclExpression _Last, org.omg.ocl.expressions.CollectionRange _CollectionRange) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().remove(connection, unwrapArg(_Last), unwrapArg(_CollectionRange));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().remove(connection, unwrapArg(_Last), unwrapArg(_CollectionRange)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }   

    public java.lang.Class<org.omg.ocl.expressions.ALastCollectionRange> get___JmiInterface() {
        return org.omg.ocl.expressions.ALastCollectionRange.class;
    }

    protected String metaObjectToString() {
        return "org.omg.ocl.expressions.ALastCollectionRange (Java Type)\nOCL.Expressions.A_last_collectionRange (MOF Type)"; //$NON-NLS-1$
    }    
}