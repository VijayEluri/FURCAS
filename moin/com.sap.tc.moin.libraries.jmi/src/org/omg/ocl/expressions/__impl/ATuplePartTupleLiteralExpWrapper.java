/**
 * Generated by the MOIN Generator Version 3.0
 **/

package org.omg.ocl.expressions.__impl;

public class ATuplePartTupleLiteralExpWrapper extends com.sap.tc.moin.repository.core.jmi.reflect.RefAssociationWrapperImpl<org.omg.ocl.expressions.ATuplePartTupleLiteralExp> implements org.omg.ocl.expressions.ATuplePartTupleLiteralExp,com.sap.tc.moin.repository.Partitionable
{

    /**
     * The ATuplePartTupleLiteralExp wrapper
     */
    public ATuplePartTupleLiteralExpWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, org.omg.ocl.expressions.__impl.ATuplePartTupleLiteralExpImpl baseObject, boolean synchronize) {
        super(conn, baseObject, synchronize);
    }
    
    private org.omg.ocl.expressions.__impl.ATuplePartTupleLiteralExpImpl getCastWrappedObject() {
        return (org.omg.ocl.expressions.__impl.ATuplePartTupleLiteralExpImpl) getWrappedObject();
    }

    public org.omg.ocl.expressions.ATuplePartTupleLiteralExp unwrap() {
        return (org.omg.ocl.expressions.ATuplePartTupleLiteralExp) getWrappedObject();
    }
    
    public boolean exists(org.omg.ocl.expressions.VariableDeclaration _TuplePart, org.omg.ocl.expressions.TupleLiteralExp _TupleLiteralExp) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().exists(connection, unwrapArg(_TuplePart), unwrapArg(_TupleLiteralExp));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().exists(connection, unwrapArg(_TuplePart), unwrapArg(_TupleLiteralExp)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public java.util.Collection<org.omg.ocl.expressions.VariableDeclaration> getTuplePart(org.omg.ocl.expressions.TupleLiteralExp _TupleLiteralExp) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return  wrapResult(getCastWrappedObject().getTuplePart(connection, unwrapArg(_TupleLiteralExp)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return  wrapResult(getCastWrappedObject().getTuplePart(connection, unwrapArg(_TupleLiteralExp))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public java.util.Collection<org.omg.ocl.expressions.TupleLiteralExp> getTupleLiteralExp(org.omg.ocl.expressions.VariableDeclaration _TuplePart) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return  wrapResult(getCastWrappedObject().getTupleLiteralExp(connection, unwrapArg(_TuplePart)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return  wrapResult(getCastWrappedObject().getTupleLiteralExp(connection, unwrapArg(_TuplePart))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean add(org.omg.ocl.expressions.VariableDeclaration _TuplePart, org.omg.ocl.expressions.TupleLiteralExp _TupleLiteralExp) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().add(connection, unwrapArg(_TuplePart), unwrapArg(_TupleLiteralExp));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().add(connection, unwrapArg(_TuplePart), unwrapArg(_TupleLiteralExp)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean remove(org.omg.ocl.expressions.VariableDeclaration _TuplePart, org.omg.ocl.expressions.TupleLiteralExp _TupleLiteralExp) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().remove(connection, unwrapArg(_TuplePart), unwrapArg(_TupleLiteralExp));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().remove(connection, unwrapArg(_TuplePart), unwrapArg(_TupleLiteralExp)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }   

    public java.lang.Class<org.omg.ocl.expressions.ATuplePartTupleLiteralExp> get___JmiInterface() {
        return org.omg.ocl.expressions.ATuplePartTupleLiteralExp.class;
    }

    protected String metaObjectToString() {
        return "org.omg.ocl.expressions.ATuplePartTupleLiteralExp (Java Type)\nOCL.Expressions.A_tuplePart_tupleLiteralExp (MOF Type)"; //$NON-NLS-1$
    }    
}