/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.dictionary.datatype.__impl;

public class AHintsSimpleTypeWrapper extends com.sap.tc.moin.repository.core.jmi.reflect.RefAssociationWrapperImpl<com.sap.ide.metamodel.dictionary.datatype.AHintsSimpleType> implements com.sap.ide.metamodel.dictionary.datatype.AHintsSimpleType,com.sap.tc.moin.repository.Partitionable
{

    /**
     * The AHintsSimpleType wrapper
     */
    public AHintsSimpleTypeWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, com.sap.ide.metamodel.dictionary.datatype.__impl.AHintsSimpleTypeImpl baseObject, boolean synchronize) {
        super(conn, baseObject, synchronize);
    }
    
    private com.sap.ide.metamodel.dictionary.datatype.__impl.AHintsSimpleTypeImpl getCastWrappedObject() {
        return (com.sap.ide.metamodel.dictionary.datatype.__impl.AHintsSimpleTypeImpl) getWrappedObject();
    }

    public com.sap.ide.metamodel.dictionary.datatype.AHintsSimpleType unwrap() {
        return (com.sap.ide.metamodel.dictionary.datatype.AHintsSimpleType) getWrappedObject();
    }
    
    public boolean exists(com.sap.ide.metamodel.dictionary.datatype.DtHint _Hints, com.sap.ide.metamodel.dictionary.datatype.DtSimpleType _SimpleType) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().exists(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Hints), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _SimpleType));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().exists(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Hints), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _SimpleType)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public java.util.List getHints(com.sap.ide.metamodel.dictionary.datatype.DtSimpleType _SimpleType) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (java.util.List) wrapResult(getCastWrappedObject().getHints(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _SimpleType)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (java.util.List) wrapResult(getCastWrappedObject().getHints(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _SimpleType))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public com.sap.ide.metamodel.dictionary.datatype.DtSimpleType getSimpleType(com.sap.ide.metamodel.dictionary.datatype.DtHint _Hints) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.ide.metamodel.dictionary.datatype.DtSimpleType) wrapResult(getCastWrappedObject().getSimpleType(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Hints)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.ide.metamodel.dictionary.datatype.DtSimpleType) wrapResult(getCastWrappedObject().getSimpleType(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Hints))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean add(com.sap.ide.metamodel.dictionary.datatype.DtHint _Hints, com.sap.ide.metamodel.dictionary.datatype.DtSimpleType _SimpleType) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().add(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Hints), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _SimpleType));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().add(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Hints), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _SimpleType)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean remove(com.sap.ide.metamodel.dictionary.datatype.DtHint _Hints, com.sap.ide.metamodel.dictionary.datatype.DtSimpleType _SimpleType) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().remove(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Hints), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _SimpleType));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().remove(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Hints), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _SimpleType)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }   

    @SuppressWarnings("unchecked")
    public java.lang.Class<com.sap.ide.metamodel.dictionary.datatype.AHintsSimpleType> get___JmiInterface() {
        return com.sap.ide.metamodel.dictionary.datatype.AHintsSimpleType.class;
    }

    protected String metaObjectToString() {
        return "com.sap.ide.metamodel.dictionary.datatype.AHintsSimpleType (Java Type)\nDictionary.datatype.A_Hints_SimpleType (MOF Type)"; //$NON-NLS-1$
    }    
}