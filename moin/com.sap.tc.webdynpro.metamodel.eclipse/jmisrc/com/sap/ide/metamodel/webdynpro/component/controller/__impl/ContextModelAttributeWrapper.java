/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.component.controller.__impl;

public class ContextModelAttributeWrapper extends com.sap.tc.moin.repository.core.jmi.reflect.RefObjectWrapperImpl<com.sap.ide.metamodel.webdynpro.component.controller.__impl.ContextModelAttributeImpl> implements com.sap.ide.metamodel.webdynpro.component.controller.ContextModelAttribute,com.sap.tc.moin.repository.Partitionable {


    static {
    }

    public ContextModelAttributeWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, com.sap.ide.metamodel.webdynpro.component.controller.__impl.ContextModelAttributeImpl baseObject, boolean synchronize) {
        super(conn, baseObject, synchronize);
    }

    @SuppressWarnings("unused")
    private com.sap.ide.metamodel.webdynpro.component.controller.__impl.ContextModelAttributeImpl getCastWrappedObject() {
        return (com.sap.ide.metamodel.webdynpro.component.controller.__impl.ContextModelAttributeImpl) getWrappedObject();
    }
    
    private com.sap.ide.metamodel.webdynpro.component.controller.__impl.ContextModelAttributeImpl getCastWrappedObject(com.sap.tc.moin.repository.core.CorePartitionable resolved) {
        return (com.sap.ide.metamodel.webdynpro.component.controller.__impl.ContextModelAttributeImpl) resolved;
    }
    
    public com.sap.ide.metamodel.webdynpro.component.controller.__impl.ContextModelAttributeImpl unwrap() {
        return (com.sap.ide.metamodel.webdynpro.component.controller.__impl.ContextModelAttributeImpl) getWrappedObject();
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

    public boolean isInputElement() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        com.sap.tc.moin.repository.core.CorePartitionable resolved = mriReference.getIfResolved();
        if (resolved != null) {
            return getCastWrappedObject(resolved).isInputElement();
        }
            try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().isInputElement();
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().isInputElement(); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public void setInputElement(boolean newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    getCastWrappedObject().setInputElement(connection, newValue);
                }       
            }
            else {
                assertConnectionAlive();
                attachConnectionIfRequired();
                getCastWrappedObject().setInputElement(connection, newValue);
            } 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }

    public boolean isReadOnly() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        com.sap.tc.moin.repository.core.CorePartitionable resolved = mriReference.getIfResolved();
        if (resolved != null) {
            return getCastWrappedObject(resolved).isReadOnly();
        }
            try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().isReadOnly();
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().isReadOnly(); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public void setReadOnly(boolean newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    getCastWrappedObject().setReadOnly(connection, newValue);
                }       
            }
            else {
                assertConnectionAlive();
                attachConnectionIfRequired();
                getCastWrappedObject().setReadOnly(connection, newValue);
            } 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }

    public java.lang.String getValueHelpId() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        com.sap.tc.moin.repository.core.CorePartitionable resolved = mriReference.getIfResolved();
        if (resolved != null) {
            return getCastWrappedObject(resolved).getValueHelpId();
        }
            try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().getValueHelpId();
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().getValueHelpId(); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public void setValueHelpId(java.lang.String newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    getCastWrappedObject().setValueHelpId(connection, newValue);
                }       
            }
            else {
                assertConnectionAlive();
                attachConnectionIfRequired();
                getCastWrappedObject().setValueHelpId(connection, newValue);
            } 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }

    public com.sap.ide.metamodel.webdynpro.enums.ValueHelpModeEnum getValueHelpMode() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        com.sap.tc.moin.repository.core.CorePartitionable resolved = mriReference.getIfResolved();
        if (resolved != null) {
            return getCastWrappedObject(resolved).getValueHelpMode();
        }
            try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().getValueHelpMode();
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().getValueHelpMode(); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public void setValueHelpMode(com.sap.ide.metamodel.webdynpro.enums.ValueHelpModeEnum newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    getCastWrappedObject().setValueHelpMode(connection, newValue);
                }       
            }
            else {
                assertConnectionAlive();
                attachConnectionIfRequired();
                getCastWrappedObject().setValueHelpMode(connection, newValue);
            } 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }

    public java.lang.String getPath() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        com.sap.tc.moin.repository.core.CorePartitionable resolved = mriReference.getIfResolved();
        if (resolved != null) {
            return getCastWrappedObject(resolved).getPath();
        }
            try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().getPath();
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().getPath(); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public void setPath(java.lang.String newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    getCastWrappedObject().setPath(connection, newValue);
                }       
            }
            else {
                assertConnectionAlive();
                attachConnectionIfRequired();
                getCastWrappedObject().setPath(connection, newValue);
            } 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }

    public java.lang.String getDefaultValue() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        com.sap.tc.moin.repository.core.CorePartitionable resolved = mriReference.getIfResolved();
        if (resolved != null) {
            return getCastWrappedObject(resolved).getDefaultValue();
        }
            try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().getDefaultValue();
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().getDefaultValue(); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public void setDefaultValue(java.lang.String newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    getCastWrappedObject().setDefaultValue(connection, newValue);
                }       
            }
            else {
                assertConnectionAlive();
                attachConnectionIfRequired();
                getCastWrappedObject().setDefaultValue(connection, newValue);
            } 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }

    public boolean isNullable() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        com.sap.tc.moin.repository.core.CorePartitionable resolved = mriReference.getIfResolved();
        if (resolved != null) {
            return getCastWrappedObject(resolved).isNullable();
        }
            try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().isNullable();
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().isNullable(); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public void setNullable(boolean newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    getCastWrappedObject().setNullable(connection, newValue);
                }       
            }
            else {
                assertConnectionAlive();
                attachConnectionIfRequired();
                getCastWrappedObject().setNullable(connection, newValue);
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

    public com.sap.ide.metamodel.webdynpro.component.controller.ContextNode getNode() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.ide.metamodel.webdynpro.component.controller.ContextNode) wrapResult(getCastWrappedObject().getNode(connection));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.ide.metamodel.webdynpro.component.controller.ContextNode) wrapResult(getCastWrappedObject().getNode(connection)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }

    public void setNode(com.sap.ide.metamodel.webdynpro.component.controller.ContextNode newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    getCastWrappedObject().setNode(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) newValue));
                }       
            }
            else {
                assertConnectionAlive();
                attachConnectionIfRequired();
                getCastWrappedObject().setNode(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) newValue));
            } 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }

    public com.sap.ide.metamodel.webdynpro.base.Property getReferencedProperty() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.ide.metamodel.webdynpro.base.Property) wrapResult(getCastWrappedObject().getReferencedProperty(connection));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.ide.metamodel.webdynpro.base.Property) wrapResult(getCastWrappedObject().getReferencedProperty(connection)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }

    public void setReferencedProperty(com.sap.ide.metamodel.webdynpro.base.Property newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    getCastWrappedObject().setReferencedProperty(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) newValue));
                }       
            }
            else {
                assertConnectionAlive();
                attachConnectionIfRequired();
                getCastWrappedObject().setReferencedProperty(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) newValue));
            } 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }

    public com.sap.ide.metamodel.webdynpro.component.controller.FieldGroup getFieldGroup() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.ide.metamodel.webdynpro.component.controller.FieldGroup) wrapResult(getCastWrappedObject().getFieldGroup(connection));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.ide.metamodel.webdynpro.component.controller.FieldGroup) wrapResult(getCastWrappedObject().getFieldGroup(connection)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }

    public void setFieldGroup(com.sap.ide.metamodel.webdynpro.component.controller.FieldGroup newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    getCastWrappedObject().setFieldGroup(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) newValue));
                }       
            }
            else {
                assertConnectionAlive();
                attachConnectionIfRequired();
                getCastWrappedObject().setFieldGroup(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) newValue));
            } 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }

    public com.sap.ide.metamodel.webdynpro.component.controller.CalculatedAttributeProvider getCalculatedAttributeProvider() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.ide.metamodel.webdynpro.component.controller.CalculatedAttributeProvider) wrapResult(getCastWrappedObject().getCalculatedAttributeProvider(connection));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.ide.metamodel.webdynpro.component.controller.CalculatedAttributeProvider) wrapResult(getCastWrappedObject().getCalculatedAttributeProvider(connection)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }

    public void setCalculatedAttributeProvider(com.sap.ide.metamodel.webdynpro.component.controller.CalculatedAttributeProvider newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    getCastWrappedObject().setCalculatedAttributeProvider(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) newValue));
                }       
            }
            else {
                assertConnectionAlive();
                attachConnectionIfRequired();
                getCastWrappedObject().setCalculatedAttributeProvider(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) newValue));
            } 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }

    public com.sap.ide.metamodel.dictionary.datatype.DtStructureElement getStructureElement() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.ide.metamodel.dictionary.datatype.DtStructureElement) wrapResult(getCastWrappedObject().getStructureElement(connection));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.ide.metamodel.dictionary.datatype.DtStructureElement) wrapResult(getCastWrappedObject().getStructureElement(connection)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }

    public void setStructureElement(com.sap.ide.metamodel.dictionary.datatype.DtStructureElement newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    getCastWrappedObject().setStructureElement(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) newValue));
                }       
            }
            else {
                assertConnectionAlive();
                attachConnectionIfRequired();
                getCastWrappedObject().setStructureElement(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) newValue));
            } 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }

    public com.sap.ide.metamodel.webdynpro.type.DataType getType() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.ide.metamodel.webdynpro.type.DataType) wrapResult(getCastWrappedObject().getType(connection));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.ide.metamodel.webdynpro.type.DataType) wrapResult(getCastWrappedObject().getType(connection)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }

    public void setType(com.sap.ide.metamodel.webdynpro.type.DataType newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    getCastWrappedObject().setType(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) newValue));
                }       
            }
            else {
                assertConnectionAlive();
                attachConnectionIfRequired();
                getCastWrappedObject().setType(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) newValue));
            } 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }

    public com.sap.ide.metamodel.webdynpro.type.NativeType getNativeType() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.ide.metamodel.webdynpro.type.NativeType) wrapResult(getCastWrappedObject().getNativeType(connection));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.ide.metamodel.webdynpro.type.NativeType) wrapResult(getCastWrappedObject().getNativeType(connection)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }

    public void setNativeType(com.sap.ide.metamodel.webdynpro.type.NativeType newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    getCastWrappedObject().setNativeType(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) newValue));
                }       
            }
            else {
                assertConnectionAlive();
                attachConnectionIfRequired();
                getCastWrappedObject().setNativeType(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) newValue));
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
    public java.lang.Class<com.sap.ide.metamodel.webdynpro.component.controller.ContextModelAttribute> get___JmiInterface() {
        return com.sap.ide.metamodel.webdynpro.component.controller.ContextModelAttribute.class;
    }

    // to String
    protected String metaObjectToString() {
        return "com.sap.ide.metamodel.webdynpro.component.controller.ContextModelAttribute (Java Type)\nWebDynpro.component.controller.ContextModelAttribute (MOF Type)"; //$NON-NLS-1$
    }    
}