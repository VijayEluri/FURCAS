/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.component.view.uielement.__impl;

public class APropertiesOwnerWrapper extends com.sap.tc.moin.repository.core.jmi.reflect.RefAssociationWrapperImpl<com.sap.ide.metamodel.webdynpro.component.view.uielement.APropertiesOwner> implements com.sap.ide.metamodel.webdynpro.component.view.uielement.APropertiesOwner,com.sap.tc.moin.repository.Partitionable
{

    /**
     * The APropertiesOwner wrapper
     */
    public APropertiesOwnerWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, com.sap.ide.metamodel.webdynpro.component.view.uielement.__impl.APropertiesOwnerImpl baseObject, boolean synchronize) {
        super(conn, baseObject, synchronize);
    }
    
    private com.sap.ide.metamodel.webdynpro.component.view.uielement.__impl.APropertiesOwnerImpl getCastWrappedObject() {
        return (com.sap.ide.metamodel.webdynpro.component.view.uielement.__impl.APropertiesOwnerImpl) getWrappedObject();
    }

    public com.sap.ide.metamodel.webdynpro.component.view.uielement.APropertiesOwner unwrap() {
        return (com.sap.ide.metamodel.webdynpro.component.view.uielement.APropertiesOwner) getWrappedObject();
    }
    
    public boolean exists(com.sap.ide.metamodel.webdynpro.component.view.uielement.AbstractViewElementProperty _Properties, com.sap.ide.metamodel.webdynpro.component.view.uielement.ViewElement _Owner) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().exists(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Properties), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Owner));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().exists(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Properties), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Owner)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public java.util.List getProperties(com.sap.ide.metamodel.webdynpro.component.view.uielement.ViewElement _Owner) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (java.util.List) wrapResult(getCastWrappedObject().getProperties(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Owner)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (java.util.List) wrapResult(getCastWrappedObject().getProperties(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Owner))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public com.sap.ide.metamodel.webdynpro.component.view.uielement.ViewElement getOwner(com.sap.ide.metamodel.webdynpro.component.view.uielement.AbstractViewElementProperty _Properties) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.ide.metamodel.webdynpro.component.view.uielement.ViewElement) wrapResult(getCastWrappedObject().getOwner(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Properties)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.ide.metamodel.webdynpro.component.view.uielement.ViewElement) wrapResult(getCastWrappedObject().getOwner(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Properties))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean add(com.sap.ide.metamodel.webdynpro.component.view.uielement.AbstractViewElementProperty _Properties, com.sap.ide.metamodel.webdynpro.component.view.uielement.ViewElement _Owner) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().add(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Properties), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Owner));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().add(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Properties), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Owner)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean remove(com.sap.ide.metamodel.webdynpro.component.view.uielement.AbstractViewElementProperty _Properties, com.sap.ide.metamodel.webdynpro.component.view.uielement.ViewElement _Owner) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().remove(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Properties), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Owner));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().remove(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Properties), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Owner)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }   

    @SuppressWarnings("unchecked")
    public java.lang.Class<com.sap.ide.metamodel.webdynpro.component.view.uielement.APropertiesOwner> get___JmiInterface() {
        return com.sap.ide.metamodel.webdynpro.component.view.uielement.APropertiesOwner.class;
    }

    protected String metaObjectToString() {
        return "com.sap.ide.metamodel.webdynpro.component.view.uielement.APropertiesOwner (Java Type)\nWebDynpro.component.view.uielement.A_Properties_Owner (MOF Type)"; //$NON-NLS-1$
    }    
}