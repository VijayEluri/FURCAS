/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.model.__impl;

public class AModelRelationRolesModelRelationWrapper extends com.sap.tc.moin.repository.core.jmi.reflect.RefAssociationWrapperImpl<com.sap.ide.metamodel.webdynpro.model.AModelRelationRolesModelRelation> implements com.sap.ide.metamodel.webdynpro.model.AModelRelationRolesModelRelation,com.sap.tc.moin.repository.Partitionable
{

    /**
     * The AModelRelationRolesModelRelation wrapper
     */
    public AModelRelationRolesModelRelationWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, com.sap.ide.metamodel.webdynpro.model.__impl.AModelRelationRolesModelRelationImpl baseObject, boolean synchronize) {
        super(conn, baseObject, synchronize);
    }
    
    private com.sap.ide.metamodel.webdynpro.model.__impl.AModelRelationRolesModelRelationImpl getCastWrappedObject() {
        return (com.sap.ide.metamodel.webdynpro.model.__impl.AModelRelationRolesModelRelationImpl) getWrappedObject();
    }

    public com.sap.ide.metamodel.webdynpro.model.AModelRelationRolesModelRelation unwrap() {
        return (com.sap.ide.metamodel.webdynpro.model.AModelRelationRolesModelRelation) getWrappedObject();
    }
    
    public boolean exists(com.sap.ide.metamodel.webdynpro.model.ModelRelationRole _ModelRelationRoles, com.sap.ide.metamodel.webdynpro.model.ModelRelation _ModelRelation) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().exists(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ModelRelationRoles), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ModelRelation));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().exists(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ModelRelationRoles), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ModelRelation)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public java.util.List getModelRelationRoles(com.sap.ide.metamodel.webdynpro.model.ModelRelation _ModelRelation) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (java.util.List) wrapResult(getCastWrappedObject().getModelRelationRoles(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ModelRelation)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (java.util.List) wrapResult(getCastWrappedObject().getModelRelationRoles(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ModelRelation))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public com.sap.ide.metamodel.webdynpro.model.ModelRelation getModelRelation(com.sap.ide.metamodel.webdynpro.model.ModelRelationRole _ModelRelationRoles) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.ide.metamodel.webdynpro.model.ModelRelation) wrapResult(getCastWrappedObject().getModelRelation(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ModelRelationRoles)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.ide.metamodel.webdynpro.model.ModelRelation) wrapResult(getCastWrappedObject().getModelRelation(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ModelRelationRoles))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean add(com.sap.ide.metamodel.webdynpro.model.ModelRelationRole _ModelRelationRoles, com.sap.ide.metamodel.webdynpro.model.ModelRelation _ModelRelation) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().add(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ModelRelationRoles), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ModelRelation));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().add(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ModelRelationRoles), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ModelRelation)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean remove(com.sap.ide.metamodel.webdynpro.model.ModelRelationRole _ModelRelationRoles, com.sap.ide.metamodel.webdynpro.model.ModelRelation _ModelRelation) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().remove(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ModelRelationRoles), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ModelRelation));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().remove(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ModelRelationRoles), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ModelRelation)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }   

    @SuppressWarnings("unchecked")
    public java.lang.Class<com.sap.ide.metamodel.webdynpro.model.AModelRelationRolesModelRelation> get___JmiInterface() {
        return com.sap.ide.metamodel.webdynpro.model.AModelRelationRolesModelRelation.class;
    }

    protected String metaObjectToString() {
        return "com.sap.ide.metamodel.webdynpro.model.AModelRelationRolesModelRelation (Java Type)\nWebDynpro.model.A_ModelRelationRoles_ModelRelation (MOF Type)"; //$NON-NLS-1$
    }    
}