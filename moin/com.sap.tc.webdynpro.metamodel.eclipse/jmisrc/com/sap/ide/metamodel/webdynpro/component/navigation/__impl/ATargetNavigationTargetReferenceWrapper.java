/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.component.navigation.__impl;

public class ATargetNavigationTargetReferenceWrapper extends com.sap.tc.moin.repository.core.jmi.reflect.RefAssociationWrapperImpl<com.sap.ide.metamodel.webdynpro.component.navigation.ATargetNavigationTargetReference> implements com.sap.ide.metamodel.webdynpro.component.navigation.ATargetNavigationTargetReference,com.sap.tc.moin.repository.Partitionable
{

    /**
     * The ATargetNavigationTargetReference wrapper
     */
    public ATargetNavigationTargetReferenceWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, com.sap.ide.metamodel.webdynpro.component.navigation.__impl.ATargetNavigationTargetReferenceImpl baseObject, boolean synchronize) {
        super(conn, baseObject, synchronize);
    }
    
    private com.sap.ide.metamodel.webdynpro.component.navigation.__impl.ATargetNavigationTargetReferenceImpl getCastWrappedObject() {
        return (com.sap.ide.metamodel.webdynpro.component.navigation.__impl.ATargetNavigationTargetReferenceImpl) getWrappedObject();
    }

    public com.sap.ide.metamodel.webdynpro.component.navigation.ATargetNavigationTargetReference unwrap() {
        return (com.sap.ide.metamodel.webdynpro.component.navigation.ATargetNavigationTargetReference) getWrappedObject();
    }
    
    public boolean exists(com.sap.ide.metamodel.webdynpro.component.navigation.InboundPlug _Target, com.sap.ide.metamodel.webdynpro.component.navigation.NavigationTargetReference _NavigationTargetReference) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().exists(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Target), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _NavigationTargetReference));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().exists(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Target), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _NavigationTargetReference)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public com.sap.ide.metamodel.webdynpro.component.navigation.InboundPlug getTarget(com.sap.ide.metamodel.webdynpro.component.navigation.NavigationTargetReference _NavigationTargetReference) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.ide.metamodel.webdynpro.component.navigation.InboundPlug) wrapResult(getCastWrappedObject().getTarget(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _NavigationTargetReference)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.ide.metamodel.webdynpro.component.navigation.InboundPlug) wrapResult(getCastWrappedObject().getTarget(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _NavigationTargetReference))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public java.util.Collection getNavigationTargetReference(com.sap.ide.metamodel.webdynpro.component.navigation.InboundPlug _Target) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (java.util.Collection) wrapResult(getCastWrappedObject().getNavigationTargetReference(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Target)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (java.util.Collection) wrapResult(getCastWrappedObject().getNavigationTargetReference(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Target))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean add(com.sap.ide.metamodel.webdynpro.component.navigation.InboundPlug _Target, com.sap.ide.metamodel.webdynpro.component.navigation.NavigationTargetReference _NavigationTargetReference) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().add(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Target), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _NavigationTargetReference));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().add(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Target), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _NavigationTargetReference)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean remove(com.sap.ide.metamodel.webdynpro.component.navigation.InboundPlug _Target, com.sap.ide.metamodel.webdynpro.component.navigation.NavigationTargetReference _NavigationTargetReference) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().remove(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Target), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _NavigationTargetReference));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().remove(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Target), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _NavigationTargetReference)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }   

    @SuppressWarnings("unchecked")
    public java.lang.Class<com.sap.ide.metamodel.webdynpro.component.navigation.ATargetNavigationTargetReference> get___JmiInterface() {
        return com.sap.ide.metamodel.webdynpro.component.navigation.ATargetNavigationTargetReference.class;
    }

    protected String metaObjectToString() {
        return "com.sap.ide.metamodel.webdynpro.component.navigation.ATargetNavigationTargetReference (Java Type)\nWebDynpro.component.navigation.A_Target_navigationTargetReference (MOF Type)"; //$NON-NLS-1$
    }    
}