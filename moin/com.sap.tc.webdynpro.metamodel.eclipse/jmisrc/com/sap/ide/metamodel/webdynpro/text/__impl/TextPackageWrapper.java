/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.text.__impl;

public class TextPackageWrapper extends com.sap.tc.moin.repository.core.jmi.reflect.RefPackageWrapperImpl<com.sap.ide.metamodel.webdynpro.text.__impl.TextPackageImpl> implements com.sap.ide.metamodel.webdynpro.text.TextPackage,com.sap.tc.moin.repository.Partitionable
{

    /**
     * The TextPackage wrapper
     */
    public TextPackageWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, com.sap.ide.metamodel.webdynpro.text.__impl.TextPackageImpl baseObject, boolean synchronize) {
        super(conn, baseObject, synchronize);
    }

    private com.sap.ide.metamodel.webdynpro.text.__impl.TextPackageImpl getCastWrappedObject() {
        return (com.sap.ide.metamodel.webdynpro.text.__impl.TextPackageImpl) getWrappedObject();
    }
    
    public com.sap.ide.metamodel.webdynpro.text.__impl.TextPackageImpl unwrap() {
        return (com.sap.ide.metamodel.webdynpro.text.__impl.TextPackageImpl) getWrappedObject();
    }
    
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getUitext()
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.tc.moin.repository.mmi.reflect.RefClass) wrapResult(getCastWrappedObject().getUitext(connection));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.tc.moin.repository.mmi.reflect.RefClass) wrapResult(getCastWrappedObject().getUitext(connection)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    // methods for structure type creators
    
    @SuppressWarnings("unchecked")
    public java.lang.Class<com.sap.ide.metamodel.webdynpro.text.TextPackage> get___JmiInterface() {
        return com.sap.ide.metamodel.webdynpro.text.TextPackage.class;
    }
    
    protected String metaObjectToString() {
        return "com.sap.ide.metamodel.webdynpro.text.TextPackage (Java Type)\nWebDynpro.text (MOF Type)"; //$NON-NLS-1$
    }
}