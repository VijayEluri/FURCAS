/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.dictionary.datatype.__impl;

public class DtEnumerationValueWrapper extends com.sap.tc.moin.repository.core.jmi.reflect.RefObjectWrapperImpl<com.sap.ide.metamodel.dictionary.datatype.__impl.DtEnumerationValueImpl> implements com.sap.ide.metamodel.dictionary.datatype.DtEnumerationValue,com.sap.tc.moin.repository.Partitionable {


    static {
    }

    public DtEnumerationValueWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, com.sap.ide.metamodel.dictionary.datatype.__impl.DtEnumerationValueImpl baseObject, boolean synchronize) {
        super(conn, baseObject, synchronize);
    }

    @SuppressWarnings("unused")
    private com.sap.ide.metamodel.dictionary.datatype.__impl.DtEnumerationValueImpl getCastWrappedObject() {
        return (com.sap.ide.metamodel.dictionary.datatype.__impl.DtEnumerationValueImpl) getWrappedObject();
    }
    
    private com.sap.ide.metamodel.dictionary.datatype.__impl.DtEnumerationValueImpl getCastWrappedObject(com.sap.tc.moin.repository.core.CorePartitionable resolved) {
        return (com.sap.ide.metamodel.dictionary.datatype.__impl.DtEnumerationValueImpl) resolved;
    }
    
    public com.sap.ide.metamodel.dictionary.datatype.__impl.DtEnumerationValueImpl unwrap() {
        return (com.sap.ide.metamodel.dictionary.datatype.__impl.DtEnumerationValueImpl) getWrappedObject();
    }
        
    // methods for attributes
    public java.lang.String getName() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        com.sap.tc.moin.repository.core.CorePartitionable resolved = mriReference.getIfResolved();
        if (resolved != null) {
            return getCastWrappedObject(resolved).getName();
        }
            try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().getName();
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().getName(); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public void setName(java.lang.String newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    getCastWrappedObject().setName(connection, newValue);
                }       
            }
            else {
                assertConnectionAlive();
                attachConnectionIfRequired();
                getCastWrappedObject().setName(connection, newValue);
            } 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }

    public java.lang.String getValue() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        com.sap.tc.moin.repository.core.CorePartitionable resolved = mriReference.getIfResolved();
        if (resolved != null) {
            return getCastWrappedObject(resolved).getValue();
        }
            try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().getValue();
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().getValue(); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public void setValue(java.lang.String newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    getCastWrappedObject().setValue(connection, newValue);
                }       
            }
            else {
                assertConnectionAlive();
                attachConnectionIfRequired();
                getCastWrappedObject().setValue(connection, newValue);
            } 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }

    public com.sap.ide.metamodel.common.TranslatableText getDescription() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.ide.metamodel.common.TranslatableText) wrapResult(getCastWrappedObject().getDescription(connection));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.ide.metamodel.common.TranslatableText) wrapResult(getCastWrappedObject().getDescription(connection)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }

    public void setDescription(com.sap.ide.metamodel.common.TranslatableText newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    getCastWrappedObject().setDescription(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) newValue));
                }       
            }
            else {
                assertConnectionAlive();
                attachConnectionIfRequired();
                getCastWrappedObject().setDescription(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) newValue));
            } 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }

     
    // methods for references
    public java.util.List<com.sap.ide.metamodel.common.template.EmbeddedTemplateInstance> getTemplateInstances() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (java.util.List<com.sap.ide.metamodel.common.template.EmbeddedTemplateInstance>) wrapResult(getCastWrappedObject().getTemplateInstances(connection));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (java.util.List<com.sap.ide.metamodel.common.template.EmbeddedTemplateInstance>) wrapResult(getCastWrappedObject().getTemplateInstances(connection)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }



    public java.util.List<com.sap.ide.metamodel.common.diagram.EmbeddedDiagram> getDiagrams() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (java.util.List<com.sap.ide.metamodel.common.diagram.EmbeddedDiagram>) wrapResult(getCastWrappedObject().getDiagrams(connection));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (java.util.List<com.sap.ide.metamodel.common.diagram.EmbeddedDiagram>) wrapResult(getCastWrappedObject().getDiagrams(connection)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }



    public com.sap.ide.metamodel.common.DocumentationObject getDocumentationObject() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.ide.metamodel.common.DocumentationObject) wrapResult(getCastWrappedObject().getDocumentationObject(connection));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.ide.metamodel.common.DocumentationObject) wrapResult(getCastWrappedObject().getDocumentationObject(connection)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }

    public void setDocumentationObject(com.sap.ide.metamodel.common.DocumentationObject newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    getCastWrappedObject().setDocumentationObject(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) newValue));
                }       
            }
            else {
                assertConnectionAlive();
                attachConnectionIfRequired();
                getCastWrappedObject().setDocumentationObject(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) newValue));
            } 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }

    public com.sap.ide.metamodel.dictionary.datatype.DtSchemaType getSchemaType() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.ide.metamodel.dictionary.datatype.DtSchemaType) wrapResult(getCastWrappedObject().getSchemaType(connection));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.ide.metamodel.dictionary.datatype.DtSchemaType) wrapResult(getCastWrappedObject().getSchemaType(connection)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }

    public void setSchemaType(com.sap.ide.metamodel.dictionary.datatype.DtSchemaType newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    getCastWrappedObject().setSchemaType(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) newValue));
                }       
            }
            else {
                assertConnectionAlive();
                attachConnectionIfRequired();
                getCastWrappedObject().setSchemaType(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) newValue));
            } 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }

   
    // methods for modeled operations
    
    // methods for internal modeled operations

    // reflective methods
    

    // get the JMI interface
    @SuppressWarnings("unchecked")
    public java.lang.Class<com.sap.ide.metamodel.dictionary.datatype.DtEnumerationValue> get___JmiInterface() {
        return com.sap.ide.metamodel.dictionary.datatype.DtEnumerationValue.class;
    }

    // to String
    protected String metaObjectToString() {
        return "com.sap.ide.metamodel.dictionary.datatype.DtEnumerationValue (Java Type)\nDictionary.datatype.DtEnumerationValue (MOF Type)"; //$NON-NLS-1$
    }    
}