/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.model.__impl;

public class AStructureModelClassWrapper extends com.sap.tc.moin.repository.core.jmi.reflect.RefAssociationWrapperImpl<com.sap.ide.metamodel.webdynpro.model.AStructureModelClass> implements com.sap.ide.metamodel.webdynpro.model.AStructureModelClass,com.sap.tc.moin.repository.Partitionable
{

    /**
     * The AStructureModelClass wrapper
     */
    public AStructureModelClassWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, com.sap.ide.metamodel.webdynpro.model.__impl.AStructureModelClassImpl baseObject, boolean synchronize) {
        super(conn, baseObject, synchronize);
    }
    
    private com.sap.ide.metamodel.webdynpro.model.__impl.AStructureModelClassImpl getCastWrappedObject() {
        return (com.sap.ide.metamodel.webdynpro.model.__impl.AStructureModelClassImpl) getWrappedObject();
    }

    public com.sap.ide.metamodel.webdynpro.model.AStructureModelClass unwrap() {
        return (com.sap.ide.metamodel.webdynpro.model.AStructureModelClass) getWrappedObject();
    }
    
    public boolean exists(com.sap.ide.metamodel.dictionary.datatype.DtStructure _Structure, com.sap.ide.metamodel.webdynpro.model.Mclass _ModelClass) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().exists(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Structure), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ModelClass));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().exists(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Structure), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ModelClass)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public com.sap.ide.metamodel.dictionary.datatype.DtStructure getStructure(com.sap.ide.metamodel.webdynpro.model.Mclass _ModelClass) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.ide.metamodel.dictionary.datatype.DtStructure) wrapResult(getCastWrappedObject().getStructure(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ModelClass)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.ide.metamodel.dictionary.datatype.DtStructure) wrapResult(getCastWrappedObject().getStructure(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ModelClass))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public java.util.Collection getModelClass(com.sap.ide.metamodel.dictionary.datatype.DtStructure _Structure) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (java.util.Collection) wrapResult(getCastWrappedObject().getModelClass(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Structure)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (java.util.Collection) wrapResult(getCastWrappedObject().getModelClass(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Structure))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean add(com.sap.ide.metamodel.dictionary.datatype.DtStructure _Structure, com.sap.ide.metamodel.webdynpro.model.Mclass _ModelClass) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().add(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Structure), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ModelClass));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().add(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Structure), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ModelClass)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean remove(com.sap.ide.metamodel.dictionary.datatype.DtStructure _Structure, com.sap.ide.metamodel.webdynpro.model.Mclass _ModelClass) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().remove(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Structure), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ModelClass));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().remove(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Structure), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ModelClass)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }   

    @SuppressWarnings("unchecked")
    public java.lang.Class<com.sap.ide.metamodel.webdynpro.model.AStructureModelClass> get___JmiInterface() {
        return com.sap.ide.metamodel.webdynpro.model.AStructureModelClass.class;
    }

    protected String metaObjectToString() {
        return "com.sap.ide.metamodel.webdynpro.model.AStructureModelClass (Java Type)\nWebDynpro.model.A_Structure_modelClass (MOF Type)"; //$NON-NLS-1$
    }    
}