/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.common.__impl;

public class TranslatableTextWrapper extends com.sap.tc.moin.repository.core.jmi.reflect.RefObjectWrapperImpl<com.sap.ide.metamodel.common.__impl.TranslatableTextImpl> implements com.sap.ide.metamodel.common.TranslatableText,com.sap.tc.moin.repository.Partitionable {


    static {
    }

    public TranslatableTextWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, com.sap.ide.metamodel.common.__impl.TranslatableTextImpl baseObject, boolean synchronize) {
        super(conn, baseObject, synchronize);
    }

    @SuppressWarnings("unused")
    private com.sap.ide.metamodel.common.__impl.TranslatableTextImpl getCastWrappedObject() {
        return (com.sap.ide.metamodel.common.__impl.TranslatableTextImpl) getWrappedObject();
    }
    
    private com.sap.ide.metamodel.common.__impl.TranslatableTextImpl getCastWrappedObject(com.sap.tc.moin.repository.core.CorePartitionable resolved) {
        return (com.sap.ide.metamodel.common.__impl.TranslatableTextImpl) resolved;
    }
    
    public com.sap.ide.metamodel.common.__impl.TranslatableTextImpl unwrap() {
        return (com.sap.ide.metamodel.common.__impl.TranslatableTextImpl) getWrappedObject();
    }
        
    // methods for attributes
    public java.lang.String getText() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        com.sap.tc.moin.repository.core.CorePartitionable resolved = mriReference.getIfResolved();
        if (resolved != null) {
            return getCastWrappedObject(resolved).getText();
        }
            try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().getText();
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().getText(); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public void setText(java.lang.String newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    getCastWrappedObject().setText(connection, newValue);
                }       
            }
            else {
                assertConnectionAlive();
                attachConnectionIfRequired();
                getCastWrappedObject().setText(connection, newValue);
            } 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }

     
    // methods for references
   
    // methods for modeled operations
    
    // methods for internal modeled operations

    // reflective methods
    

    // get the JMI interface
    @SuppressWarnings("unchecked")
    public java.lang.Class<com.sap.ide.metamodel.common.TranslatableText> get___JmiInterface() {
        return com.sap.ide.metamodel.common.TranslatableText.class;
    }

    // to String
    protected String metaObjectToString() {
        return "com.sap.ide.metamodel.common.TranslatableText (Java Type)\nCommon.TranslatableText (MOF Type)"; //$NON-NLS-1$
    }    
}