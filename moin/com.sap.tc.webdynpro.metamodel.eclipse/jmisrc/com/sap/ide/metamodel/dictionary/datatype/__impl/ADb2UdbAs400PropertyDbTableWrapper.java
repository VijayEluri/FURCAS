/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.dictionary.datatype.__impl;

public class ADb2UdbAs400PropertyDbTableWrapper extends com.sap.tc.moin.repository.core.jmi.reflect.RefAssociationWrapperImpl<com.sap.ide.metamodel.dictionary.datatype.ADb2UdbAs400PropertyDbTable> implements com.sap.ide.metamodel.dictionary.datatype.ADb2UdbAs400PropertyDbTable,com.sap.tc.moin.repository.Partitionable
{

    /**
     * The ADb2UdbAs400PropertyDbTable wrapper
     */
    public ADb2UdbAs400PropertyDbTableWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, com.sap.ide.metamodel.dictionary.datatype.__impl.ADb2UdbAs400PropertyDbTableImpl baseObject, boolean synchronize) {
        super(conn, baseObject, synchronize);
    }
    
    private com.sap.ide.metamodel.dictionary.datatype.__impl.ADb2UdbAs400PropertyDbTableImpl getCastWrappedObject() {
        return (com.sap.ide.metamodel.dictionary.datatype.__impl.ADb2UdbAs400PropertyDbTableImpl) getWrappedObject();
    }

    public com.sap.ide.metamodel.dictionary.datatype.ADb2UdbAs400PropertyDbTable unwrap() {
        return (com.sap.ide.metamodel.dictionary.datatype.ADb2UdbAs400PropertyDbTable) getWrappedObject();
    }
    
    public boolean exists(com.sap.ide.metamodel.dictionary.datatype.DtDb2UdBas400TableProperty _Db2UdbAs400Property, com.sap.ide.metamodel.dictionary.datatype.DtDbTable _DbTable) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().exists(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Db2UdbAs400Property), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _DbTable));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().exists(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Db2UdbAs400Property), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _DbTable)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public com.sap.ide.metamodel.dictionary.datatype.DtDb2UdBas400TableProperty getDb2UdbAs400Property(com.sap.ide.metamodel.dictionary.datatype.DtDbTable _DbTable) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.ide.metamodel.dictionary.datatype.DtDb2UdBas400TableProperty) wrapResult(getCastWrappedObject().getDb2UdbAs400Property(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _DbTable)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.ide.metamodel.dictionary.datatype.DtDb2UdBas400TableProperty) wrapResult(getCastWrappedObject().getDb2UdbAs400Property(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _DbTable))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public com.sap.ide.metamodel.dictionary.datatype.DtDbTable getDbTable(com.sap.ide.metamodel.dictionary.datatype.DtDb2UdBas400TableProperty _Db2UdbAs400Property) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.ide.metamodel.dictionary.datatype.DtDbTable) wrapResult(getCastWrappedObject().getDbTable(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Db2UdbAs400Property)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.ide.metamodel.dictionary.datatype.DtDbTable) wrapResult(getCastWrappedObject().getDbTable(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Db2UdbAs400Property))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean add(com.sap.ide.metamodel.dictionary.datatype.DtDb2UdBas400TableProperty _Db2UdbAs400Property, com.sap.ide.metamodel.dictionary.datatype.DtDbTable _DbTable) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().add(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Db2UdbAs400Property), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _DbTable));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().add(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Db2UdbAs400Property), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _DbTable)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean remove(com.sap.ide.metamodel.dictionary.datatype.DtDb2UdBas400TableProperty _Db2UdbAs400Property, com.sap.ide.metamodel.dictionary.datatype.DtDbTable _DbTable) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().remove(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Db2UdbAs400Property), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _DbTable));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().remove(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Db2UdbAs400Property), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _DbTable)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }   

    @SuppressWarnings("unchecked")
    public java.lang.Class<com.sap.ide.metamodel.dictionary.datatype.ADb2UdbAs400PropertyDbTable> get___JmiInterface() {
        return com.sap.ide.metamodel.dictionary.datatype.ADb2UdbAs400PropertyDbTable.class;
    }

    protected String metaObjectToString() {
        return "com.sap.ide.metamodel.dictionary.datatype.ADb2UdbAs400PropertyDbTable (Java Type)\nDictionary.datatype.A_Db2UdbAs400Property_DbTable (MOF Type)"; //$NON-NLS-1$
    }    
}