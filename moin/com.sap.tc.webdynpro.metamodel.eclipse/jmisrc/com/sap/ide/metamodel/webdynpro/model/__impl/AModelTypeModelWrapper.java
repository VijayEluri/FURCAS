/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.model.__impl;

public class AModelTypeModelWrapper extends com.sap.tc.moin.repository.core.jmi.reflect.RefAssociationWrapperImpl<com.sap.ide.metamodel.webdynpro.model.AModelTypeModel> implements com.sap.ide.metamodel.webdynpro.model.AModelTypeModel,com.sap.tc.moin.repository.Partitionable
{

    /**
     * The AModelTypeModel wrapper
     */
    public AModelTypeModelWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, com.sap.ide.metamodel.webdynpro.model.__impl.AModelTypeModelImpl baseObject, boolean synchronize) {
        super(conn, baseObject, synchronize);
    }
    
    private com.sap.ide.metamodel.webdynpro.model.__impl.AModelTypeModelImpl getCastWrappedObject() {
        return (com.sap.ide.metamodel.webdynpro.model.__impl.AModelTypeModelImpl) getWrappedObject();
    }

    public com.sap.ide.metamodel.webdynpro.model.AModelTypeModel unwrap() {
        return (com.sap.ide.metamodel.webdynpro.model.AModelTypeModel) getWrappedObject();
    }
    
    public boolean exists(com.sap.ide.metamodel.webdynpro.framework.ModelType _ModelType, com.sap.ide.metamodel.webdynpro.model.Model _Model) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().exists(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ModelType), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Model));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().exists(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ModelType), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Model)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public com.sap.ide.metamodel.webdynpro.framework.ModelType getModelType(com.sap.ide.metamodel.webdynpro.model.Model _Model) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.ide.metamodel.webdynpro.framework.ModelType) wrapResult(getCastWrappedObject().getModelType(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Model)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.ide.metamodel.webdynpro.framework.ModelType) wrapResult(getCastWrappedObject().getModelType(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Model))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public java.util.Collection getModel(com.sap.ide.metamodel.webdynpro.framework.ModelType _ModelType) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (java.util.Collection) wrapResult(getCastWrappedObject().getModel(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ModelType)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (java.util.Collection) wrapResult(getCastWrappedObject().getModel(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ModelType))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean add(com.sap.ide.metamodel.webdynpro.framework.ModelType _ModelType, com.sap.ide.metamodel.webdynpro.model.Model _Model) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().add(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ModelType), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Model));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().add(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ModelType), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Model)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean remove(com.sap.ide.metamodel.webdynpro.framework.ModelType _ModelType, com.sap.ide.metamodel.webdynpro.model.Model _Model) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().remove(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ModelType), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Model));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().remove(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ModelType), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Model)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }   

    @SuppressWarnings("unchecked")
    public java.lang.Class<com.sap.ide.metamodel.webdynpro.model.AModelTypeModel> get___JmiInterface() {
        return com.sap.ide.metamodel.webdynpro.model.AModelTypeModel.class;
    }

    protected String metaObjectToString() {
        return "com.sap.ide.metamodel.webdynpro.model.AModelTypeModel (Java Type)\nWebDynpro.model.A_ModelType_model (MOF Type)"; //$NON-NLS-1$
    }    
}