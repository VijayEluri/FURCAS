/**
 * Generated by the MOIN Generator Version 3.0
 **/

package org.omg.ocl.attaching.__impl;

public class AssociationEndInitialValueWrapper extends com.sap.tc.moin.repository.core.jmi.reflect.RefAssociationWrapperImpl<org.omg.ocl.attaching.AssociationEndInitialValue> implements org.omg.ocl.attaching.AssociationEndInitialValue,com.sap.tc.moin.repository.Partitionable
{

    /**
     * The AssociationEndInitialValue wrapper
     */
    public AssociationEndInitialValueWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, org.omg.ocl.attaching.__impl.AssociationEndInitialValueImpl baseObject, boolean synchronize) {
        super(conn, baseObject, synchronize);
    }
    
    private org.omg.ocl.attaching.__impl.AssociationEndInitialValueImpl getCastWrappedObject() {
        return (org.omg.ocl.attaching.__impl.AssociationEndInitialValueImpl) getWrappedObject();
    }

    public org.omg.ocl.attaching.AssociationEndInitialValue unwrap() {
        return (org.omg.ocl.attaching.AssociationEndInitialValue) getWrappedObject();
    }
    
    public boolean exists(org.omg.ocl.expressions.OclExpression _InitialValue, com.sap.tc.moin.repository.mmi.model.AssociationEnd _AssociationEndForInitialValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().exists(connection, unwrapArg(_InitialValue), unwrapArg(_AssociationEndForInitialValue));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().exists(connection, unwrapArg(_InitialValue), unwrapArg(_AssociationEndForInitialValue)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public org.omg.ocl.expressions.OclExpression getInitialValue(com.sap.tc.moin.repository.mmi.model.AssociationEnd _AssociationEndForInitialValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return  wrapResult(getCastWrappedObject().getInitialValue(connection, unwrapArg(_AssociationEndForInitialValue)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return  wrapResult(getCastWrappedObject().getInitialValue(connection, unwrapArg(_AssociationEndForInitialValue))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public com.sap.tc.moin.repository.mmi.model.AssociationEnd getAssociationEndForInitialValue(org.omg.ocl.expressions.OclExpression _InitialValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return  wrapResult(getCastWrappedObject().getAssociationEndForInitialValue(connection, unwrapArg(_InitialValue)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return  wrapResult(getCastWrappedObject().getAssociationEndForInitialValue(connection, unwrapArg(_InitialValue))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean add(org.omg.ocl.expressions.OclExpression _InitialValue, com.sap.tc.moin.repository.mmi.model.AssociationEnd _AssociationEndForInitialValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().add(connection, unwrapArg(_InitialValue), unwrapArg(_AssociationEndForInitialValue));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().add(connection, unwrapArg(_InitialValue), unwrapArg(_AssociationEndForInitialValue)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean remove(org.omg.ocl.expressions.OclExpression _InitialValue, com.sap.tc.moin.repository.mmi.model.AssociationEnd _AssociationEndForInitialValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().remove(connection, unwrapArg(_InitialValue), unwrapArg(_AssociationEndForInitialValue));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().remove(connection, unwrapArg(_InitialValue), unwrapArg(_AssociationEndForInitialValue)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }   

    public java.lang.Class<org.omg.ocl.attaching.AssociationEndInitialValue> get___JmiInterface() {
        return org.omg.ocl.attaching.AssociationEndInitialValue.class;
    }

    protected String metaObjectToString() {
        return "org.omg.ocl.attaching.AssociationEndInitialValue (Java Type)\nOCL.Attaching.AssociationEndInitialValue (MOF Type)"; //$NON-NLS-1$
    }    
}