/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.accessibility.__impl;

public class AccessibilityPackageWrapper extends com.sap.tc.moin.repository.core.jmi.reflect.RefPackageWrapperImpl<com.sap.ide.metamodel.webdynpro.accessibility.__impl.AccessibilityPackageImpl> implements com.sap.ide.metamodel.webdynpro.accessibility.AccessibilityPackage,com.sap.tc.moin.repository.Partitionable
{

    /**
     * The AccessibilityPackage wrapper
     */
    public AccessibilityPackageWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, com.sap.ide.metamodel.webdynpro.accessibility.__impl.AccessibilityPackageImpl baseObject, boolean synchronize) {
        super(conn, baseObject, synchronize);
    }

    private com.sap.ide.metamodel.webdynpro.accessibility.__impl.AccessibilityPackageImpl getCastWrappedObject() {
        return (com.sap.ide.metamodel.webdynpro.accessibility.__impl.AccessibilityPackageImpl) getWrappedObject();
    }
    
    public com.sap.ide.metamodel.webdynpro.accessibility.__impl.AccessibilityPackageImpl unwrap() {
        return (com.sap.ide.metamodel.webdynpro.accessibility.__impl.AccessibilityPackageImpl) getWrappedObject();
    }
    
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getAccessibilityInfo()
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.tc.moin.repository.mmi.reflect.RefClass) wrapResult(getCastWrappedObject().getAccessibilityInfo(connection));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.tc.moin.repository.mmi.reflect.RefClass) wrapResult(getCastWrappedObject().getAccessibilityInfo(connection)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    // methods for structure type creators
    
    @SuppressWarnings("unchecked")
    public java.lang.Class<com.sap.ide.metamodel.webdynpro.accessibility.AccessibilityPackage> get___JmiInterface() {
        return com.sap.ide.metamodel.webdynpro.accessibility.AccessibilityPackage.class;
    }
    
    protected String metaObjectToString() {
        return "com.sap.ide.metamodel.webdynpro.accessibility.AccessibilityPackage (Java Type)\nWebDynpro.accessibility (MOF Type)"; //$NON-NLS-1$
    }
}