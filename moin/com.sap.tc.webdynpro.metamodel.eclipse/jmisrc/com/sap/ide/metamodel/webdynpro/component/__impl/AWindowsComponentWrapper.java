/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.component.__impl;

public class AWindowsComponentWrapper extends com.sap.tc.moin.repository.core.jmi.reflect.RefAssociationWrapperImpl<com.sap.ide.metamodel.webdynpro.component.AWindowsComponent> implements com.sap.ide.metamodel.webdynpro.component.AWindowsComponent,com.sap.tc.moin.repository.Partitionable
{

    /**
     * The AWindowsComponent wrapper
     */
    public AWindowsComponentWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, com.sap.ide.metamodel.webdynpro.component.__impl.AWindowsComponentImpl baseObject, boolean synchronize) {
        super(conn, baseObject, synchronize);
    }
    
    private com.sap.ide.metamodel.webdynpro.component.__impl.AWindowsComponentImpl getCastWrappedObject() {
        return (com.sap.ide.metamodel.webdynpro.component.__impl.AWindowsComponentImpl) getWrappedObject();
    }

    public com.sap.ide.metamodel.webdynpro.component.AWindowsComponent unwrap() {
        return (com.sap.ide.metamodel.webdynpro.component.AWindowsComponent) getWrappedObject();
    }
    
    public boolean exists(com.sap.ide.metamodel.webdynpro.component.Window _Windows, com.sap.ide.metamodel.webdynpro.component.Component _Component) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().exists(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Windows), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Component));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().exists(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Windows), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Component)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public java.util.List getWindows(com.sap.ide.metamodel.webdynpro.component.Component _Component) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (java.util.List) wrapResult(getCastWrappedObject().getWindows(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Component)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (java.util.List) wrapResult(getCastWrappedObject().getWindows(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Component))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public com.sap.ide.metamodel.webdynpro.component.Component getComponent(com.sap.ide.metamodel.webdynpro.component.Window _Windows) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.ide.metamodel.webdynpro.component.Component) wrapResult(getCastWrappedObject().getComponent(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Windows)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.ide.metamodel.webdynpro.component.Component) wrapResult(getCastWrappedObject().getComponent(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Windows))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean add(com.sap.ide.metamodel.webdynpro.component.Window _Windows, com.sap.ide.metamodel.webdynpro.component.Component _Component) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().add(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Windows), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Component));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().add(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Windows), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Component)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean remove(com.sap.ide.metamodel.webdynpro.component.Window _Windows, com.sap.ide.metamodel.webdynpro.component.Component _Component) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().remove(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Windows), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Component));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().remove(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Windows), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Component)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }   

    @SuppressWarnings("unchecked")
    public java.lang.Class<com.sap.ide.metamodel.webdynpro.component.AWindowsComponent> get___JmiInterface() {
        return com.sap.ide.metamodel.webdynpro.component.AWindowsComponent.class;
    }

    protected String metaObjectToString() {
        return "com.sap.ide.metamodel.webdynpro.component.AWindowsComponent (Java Type)\nWebDynpro.component.A_Windows_Component (MOF Type)"; //$NON-NLS-1$
    }    
}