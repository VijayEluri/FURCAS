/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.framework.__impl;

public final class GenerationInfoImpl extends com.sap.tc.moin.repository.core.jmi.reflect.RefObjectImpl {

        
    public static final java.util.Map<java.lang.String, java.lang.Integer> FEATURE_IDS;

    static {
        
        FEATURE_IDS = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
        FEATURE_IDS.put("implementationLanguage", Integer.valueOf(0)); //$NON-NLS-1$
        FEATURE_IDS.put("generationInfoProvider", Integer.valueOf(1)); //$NON-NLS-1$
    }
    
    
    // variable declarations
    private com.sap.ide.metamodel.webdynpro.enums.ImplementationLanguageEnum __implementationLanguage = null;
    private java.lang.String __generationInfoProvider = null;

    // default constructor
    public GenerationInfoImpl() {
        super();
    }
    
    // specific constructor
    public GenerationInfoImpl(java.lang.Object workspace, String mofId, com.sap.tc.moin.repository.mmi.reflect.RefPackage immediatePackage, com.sap.tc.moin.repository.mmi.reflect.RefObject metaObject, com.sap.tc.moin.repository.mmi.reflect.RefClass refClass) {
        super(workspace, mofId, immediatePackage, metaObject, refClass);
    }
    
    // methods for attributes
    public com.sap.ide.metamodel.webdynpro.enums.ImplementationLanguageEnum getImplementationLanguage() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return __implementationLanguage;
    }
    public void setImplementationLanguage(com.sap.ide.metamodel.webdynpro.enums.ImplementationLanguageEnum newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeDataTypeAttribute(get___CurrentConnection(), 0, "45DDACEF6A1A34FB51F04E3E3230D5121337FF10", __implementationLanguage, newValue); //$NON-NLS-1$
    }
    public void setImplementationLanguage(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.ide.metamodel.webdynpro.enums.ImplementationLanguageEnum newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeDataTypeAttribute(connection, 0, "45DDACEF6A1A34FB51F04E3E3230D5121337FF10", __implementationLanguage, newValue); //$NON-NLS-1$
    }
    public java.lang.String getGenerationInfoProvider() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return __generationInfoProvider;
    }
    public void setGenerationInfoProvider(java.lang.String newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeDataTypeAttribute(get___CurrentConnection(), 1, "45DDACEF9556F70F88B44CE92176F5F627218466", __generationInfoProvider, newValue); //$NON-NLS-1$
    }
    public void setGenerationInfoProvider(com.sap.tc.moin.repository.core.CoreConnection connection, java.lang.String newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeDataTypeAttribute(connection, 1, "45DDACEF9556F70F88B44CE92176F5F627218466", __generationInfoProvider, newValue); //$NON-NLS-1$
    }

    // methods for internal attribute setter
    private void set__ImplementationLanguage(com.sap.ide.metamodel.webdynpro.enums.ImplementationLanguageEnum newValue) {
            __implementationLanguage = newValue;
    }

    private void set__GenerationInfoProvider(java.lang.String newValue) {
            __generationInfoProvider = newValue;
    }


    // reflective methods
    public java.lang.Object refGetValue(com.sap.tc.moin.repository.core.CoreConnection connection, java.lang.String featureName) {
        if (featureName == null) {
            throw new com.sap.tc.moin.repository.mmi.reflect.InvalidNameException(featureName);
        }
        java.lang.Object result = null;
        java.lang.Integer featureId = FEATURE_IDS.get(featureName);
        if (featureId == null) {
            throw new com.sap.tc.moin.repository.mmi.reflect.InvalidCallException(featureName, refMetaObject(), "refGetValue(String)"); //$NON-NLS-1$
        }
        switch (featureId) {
            case 0: 
                result = getImplementationLanguage();
                break;
            case 1: 
                result = getGenerationInfoProvider();
                break;
        default:
            throw new com.sap.tc.moin.repository.mmi.reflect.InvalidCallException(featureName, refMetaObject(), "refGetValue(String)"); //$NON-NLS-1$
        }
        return result;
    }

    public void refSetValue(com.sap.tc.moin.repository.core.CoreConnection connection, java.lang.String featureName, java.lang.Object value) {
        if (featureName == null) {
            throw new com.sap.tc.moin.repository.mmi.reflect.InvalidNameException(featureName);
        }
        java.lang.Integer featureId = FEATURE_IDS.get(featureName);
        if (featureId == null) {
            throw new com.sap.tc.moin.repository.mmi.reflect.InvalidCallException(featureName, refMetaObject(), "refSetValue(String)"); //$NON-NLS-1$
        }
        switch (featureId) {
            case 0:
                ___changeDataTypeAttribute(connection, 0, "45DDACEF6A1A34FB51F04E3E3230D5121337FF10", __implementationLanguage, value); //$NON-NLS-1$
                break;
                    
            case 1:
                ___changeDataTypeAttribute(connection, 1, "45DDACEF9556F70F88B44CE92176F5F627218466", __generationInfoProvider, value); //$NON-NLS-1$
                break;
                    
        default:
            throw new com.sap.tc.moin.repository.mmi.reflect.InvalidCallException(featureName, null, "refSetValue(String)"); //$NON-NLS-1$
        }
    }

    public void set___Value(com.sap.tc.moin.repository.core.CoreSession session, java.lang.String featureName, java.lang.Object value) {
        switch (FEATURE_IDS.get(featureName)) {
            case 0:
                set__ImplementationLanguage((com.sap.ide.metamodel.webdynpro.enums.ImplementationLanguageEnum) value);     
                break;
            case 1:
                set__GenerationInfoProvider((java.lang.String) value);     
                break;
            default:
                throw new com.sap.tc.moin.repository.mmi.reflect.InvalidCallException(featureName, refMetaObject(), "set___Value(String)"); //$NON-NLS-1$
        }
    }

    public void set___Value(com.sap.tc.moin.repository.core.CoreSession session, int featureId, java.lang.Object value) {
        switch (featureId) {
            case 0:
                set__ImplementationLanguage((com.sap.ide.metamodel.webdynpro.enums.ImplementationLanguageEnum) value);     
                break;
            case 1:
                set__GenerationInfoProvider((java.lang.String) value);     
                break;
            default:
                throw new com.sap.tc.moin.repository.mmi.reflect.InvalidCallException(featureId, refMetaObject(), "set___Value(int)"); //$NON-NLS-1$
        }
    }

    public void addOrSet___Value(com.sap.tc.moin.repository.core.CoreSession session, java.lang.String featureName, java.lang.Object value) {
        switch (FEATURE_IDS.get(featureName)) {
            case 0:
                set__ImplementationLanguage((com.sap.ide.metamodel.webdynpro.enums.ImplementationLanguageEnum) value);     
                break;
            case 1:
                set__GenerationInfoProvider((java.lang.String) value);     
                break;
            default:
                throw new com.sap.tc.moin.repository.mmi.reflect.InvalidCallException(featureName, refMetaObject(), "addOrSet___Value(String)"); //$NON-NLS-1$
        }
    }    



    // get the JMI interface
    @SuppressWarnings("unchecked")
    public java.lang.Class<com.sap.ide.metamodel.webdynpro.framework.GenerationInfo> get___JmiInterface() {
        return com.sap.ide.metamodel.webdynpro.framework.GenerationInfo.class;
    }

    // create the wrapper
    @Override
    public com.sap.tc.moin.repository.spi.core.Wrapper<com.sap.ide.metamodel.webdynpro.framework.__impl.GenerationInfoImpl> createWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, boolean synchronize) {
        return new com.sap.ide.metamodel.webdynpro.framework.__impl.GenerationInfoWrapper(conn, this, synchronize);
    }
    
}