/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.dictionary.datatype.__impl;

public class ATechnicalSettingsDbTableWrapper extends com.sap.tc.moin.repository.core.jmi.reflect.RefAssociationWrapperImpl<com.sap.ide.metamodel.dictionary.datatype.ATechnicalSettingsDbTable> implements com.sap.ide.metamodel.dictionary.datatype.ATechnicalSettingsDbTable,com.sap.tc.moin.repository.Partitionable
{

    /**
     * The ATechnicalSettingsDbTable wrapper
     */
    public ATechnicalSettingsDbTableWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, com.sap.ide.metamodel.dictionary.datatype.__impl.ATechnicalSettingsDbTableImpl baseObject, boolean synchronize) {
        super(conn, baseObject, synchronize);
    }
    
    private com.sap.ide.metamodel.dictionary.datatype.__impl.ATechnicalSettingsDbTableImpl getCastWrappedObject() {
        return (com.sap.ide.metamodel.dictionary.datatype.__impl.ATechnicalSettingsDbTableImpl) getWrappedObject();
    }

    public com.sap.ide.metamodel.dictionary.datatype.ATechnicalSettingsDbTable unwrap() {
        return (com.sap.ide.metamodel.dictionary.datatype.ATechnicalSettingsDbTable) getWrappedObject();
    }
    
    public boolean exists(com.sap.ide.metamodel.dictionary.datatype.DtTechnicalSettings _TechnicalSettings, com.sap.ide.metamodel.dictionary.datatype.DtDbTable _DbTable) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().exists(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _TechnicalSettings), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _DbTable));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().exists(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _TechnicalSettings), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _DbTable)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public com.sap.ide.metamodel.dictionary.datatype.DtTechnicalSettings getTechnicalSettings(com.sap.ide.metamodel.dictionary.datatype.DtDbTable _DbTable) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.ide.metamodel.dictionary.datatype.DtTechnicalSettings) wrapResult(getCastWrappedObject().getTechnicalSettings(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _DbTable)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.ide.metamodel.dictionary.datatype.DtTechnicalSettings) wrapResult(getCastWrappedObject().getTechnicalSettings(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _DbTable))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public com.sap.ide.metamodel.dictionary.datatype.DtDbTable getDbTable(com.sap.ide.metamodel.dictionary.datatype.DtTechnicalSettings _TechnicalSettings) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.ide.metamodel.dictionary.datatype.DtDbTable) wrapResult(getCastWrappedObject().getDbTable(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _TechnicalSettings)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.ide.metamodel.dictionary.datatype.DtDbTable) wrapResult(getCastWrappedObject().getDbTable(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _TechnicalSettings))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean add(com.sap.ide.metamodel.dictionary.datatype.DtTechnicalSettings _TechnicalSettings, com.sap.ide.metamodel.dictionary.datatype.DtDbTable _DbTable) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().add(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _TechnicalSettings), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _DbTable));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().add(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _TechnicalSettings), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _DbTable)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean remove(com.sap.ide.metamodel.dictionary.datatype.DtTechnicalSettings _TechnicalSettings, com.sap.ide.metamodel.dictionary.datatype.DtDbTable _DbTable) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().remove(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _TechnicalSettings), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _DbTable));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().remove(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _TechnicalSettings), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _DbTable)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }   

    @SuppressWarnings("unchecked")
    public java.lang.Class<com.sap.ide.metamodel.dictionary.datatype.ATechnicalSettingsDbTable> get___JmiInterface() {
        return com.sap.ide.metamodel.dictionary.datatype.ATechnicalSettingsDbTable.class;
    }

    protected String metaObjectToString() {
        return "com.sap.ide.metamodel.dictionary.datatype.ATechnicalSettingsDbTable (Java Type)\nDictionary.datatype.A_TechnicalSettings_DbTable (MOF Type)"; //$NON-NLS-1$
    }    
}