/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.component.__impl;

public class AWindowDefaultViewsetHierarchyRootNodeWrapper extends com.sap.tc.moin.repository.core.jmi.reflect.RefAssociationWrapperImpl<com.sap.ide.metamodel.webdynpro.component.AWindowDefaultViewsetHierarchyRootNode> implements com.sap.ide.metamodel.webdynpro.component.AWindowDefaultViewsetHierarchyRootNode,com.sap.tc.moin.repository.Partitionable
{

    /**
     * The AWindowDefaultViewsetHierarchyRootNode wrapper
     */
    public AWindowDefaultViewsetHierarchyRootNodeWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, com.sap.ide.metamodel.webdynpro.component.__impl.AWindowDefaultViewsetHierarchyRootNodeImpl baseObject, boolean synchronize) {
        super(conn, baseObject, synchronize);
    }
    
    private com.sap.ide.metamodel.webdynpro.component.__impl.AWindowDefaultViewsetHierarchyRootNodeImpl getCastWrappedObject() {
        return (com.sap.ide.metamodel.webdynpro.component.__impl.AWindowDefaultViewsetHierarchyRootNodeImpl) getWrappedObject();
    }

    public com.sap.ide.metamodel.webdynpro.component.AWindowDefaultViewsetHierarchyRootNode unwrap() {
        return (com.sap.ide.metamodel.webdynpro.component.AWindowDefaultViewsetHierarchyRootNode) getWrappedObject();
    }
    
    public boolean exists(com.sap.ide.metamodel.webdynpro.component.Window _Window, com.sap.ide.metamodel.webdynpro.component.viewset.ViewsetHierarchyNode _DefaultViewsetHierarchyRootNode) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().exists(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Window), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _DefaultViewsetHierarchyRootNode));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().exists(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Window), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _DefaultViewsetHierarchyRootNode)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public com.sap.ide.metamodel.webdynpro.component.Window getWindow(com.sap.ide.metamodel.webdynpro.component.viewset.ViewsetHierarchyNode _DefaultViewsetHierarchyRootNode) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.ide.metamodel.webdynpro.component.Window) wrapResult(getCastWrappedObject().getWindow(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _DefaultViewsetHierarchyRootNode)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.ide.metamodel.webdynpro.component.Window) wrapResult(getCastWrappedObject().getWindow(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _DefaultViewsetHierarchyRootNode))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public com.sap.ide.metamodel.webdynpro.component.viewset.ViewsetHierarchyNode getDefaultViewsetHierarchyRootNode(com.sap.ide.metamodel.webdynpro.component.Window _Window) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.ide.metamodel.webdynpro.component.viewset.ViewsetHierarchyNode) wrapResult(getCastWrappedObject().getDefaultViewsetHierarchyRootNode(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Window)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.ide.metamodel.webdynpro.component.viewset.ViewsetHierarchyNode) wrapResult(getCastWrappedObject().getDefaultViewsetHierarchyRootNode(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Window))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean add(com.sap.ide.metamodel.webdynpro.component.Window _Window, com.sap.ide.metamodel.webdynpro.component.viewset.ViewsetHierarchyNode _DefaultViewsetHierarchyRootNode) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().add(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Window), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _DefaultViewsetHierarchyRootNode));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().add(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Window), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _DefaultViewsetHierarchyRootNode)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean remove(com.sap.ide.metamodel.webdynpro.component.Window _Window, com.sap.ide.metamodel.webdynpro.component.viewset.ViewsetHierarchyNode _DefaultViewsetHierarchyRootNode) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().remove(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Window), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _DefaultViewsetHierarchyRootNode));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().remove(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Window), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _DefaultViewsetHierarchyRootNode)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }   

    @SuppressWarnings("unchecked")
    public java.lang.Class<com.sap.ide.metamodel.webdynpro.component.AWindowDefaultViewsetHierarchyRootNode> get___JmiInterface() {
        return com.sap.ide.metamodel.webdynpro.component.AWindowDefaultViewsetHierarchyRootNode.class;
    }

    protected String metaObjectToString() {
        return "com.sap.ide.metamodel.webdynpro.component.AWindowDefaultViewsetHierarchyRootNode (Java Type)\nWebDynpro.component.A_window_DefaultViewsetHierarchyRootNode (MOF Type)"; //$NON-NLS-1$
    }    
}