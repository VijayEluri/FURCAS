/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.tc.moin.testcases.case019.serializationcallback.__impl;

public final class A19SerializationImpl extends com.sap.tc.moin.repository.core.jmi.reflect.RefObjectImpl {

        
    public static final java.util.Map<java.lang.String, java.lang.Integer> FEATURE_IDS;
    
    static {
        
        FEATURE_IDS = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
        FEATURE_IDS.put("testTranslatableTextF", Integer.valueOf(0)); //$NON-NLS-1$
        FEATURE_IDS.put("testTranslatableTextFragmentF", Integer.valueOf(1)); //$NON-NLS-1$
    }
    
    
    // variable declarations
    private com.sap.tc.moin.testcasesfoundation.case004f.TranslatableTextF __testTranslatableTextF = null;
    private com.sap.tc.moin.testcasesfoundation.case004f.TranslatableTextFragmentF __testTranslatableTextFragmentF = null;

    // default constructor
    public A19SerializationImpl() {
        super();
    }
    
    // specific constructor
    public A19SerializationImpl(java.lang.Object workspace, String mofId, com.sap.tc.moin.repository.mmi.reflect.RefPackage immediatePackage, com.sap.tc.moin.repository.mmi.reflect.RefObject metaObject, com.sap.tc.moin.repository.mmi.reflect.RefClass refClass) {
        super(workspace, mofId, immediatePackage, metaObject, refClass);
    }
    
    // methods for attributes
    public com.sap.tc.moin.testcasesfoundation.case004f.TranslatableTextF getTestTranslatableTextF() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return __testTranslatableTextF;
    }
    public void setTestTranslatableTextF(com.sap.tc.moin.testcasesfoundation.case004f.TranslatableTextF newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeDataTypeAttribute(get___CurrentConnection(), 0, "48DA2D8A6172FFA08A3111DDACFF0019993BAD15", __testTranslatableTextF, newValue); //$NON-NLS-1$
    }
    public void setTestTranslatableTextF(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.testcasesfoundation.case004f.TranslatableTextF newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeDataTypeAttribute(connection, 0, "48DA2D8A6172FFA08A3111DDACFF0019993BAD15", __testTranslatableTextF, newValue); //$NON-NLS-1$
    }
    public com.sap.tc.moin.testcasesfoundation.case004f.TranslatableTextFragmentF getTestTranslatableTextFragmentF() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return __testTranslatableTextFragmentF;
    }
    public void setTestTranslatableTextFragmentF(com.sap.tc.moin.testcasesfoundation.case004f.TranslatableTextFragmentF newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeDataTypeAttribute(get___CurrentConnection(), 1, "48DA2D8A6172FFA18A3111DD95800019993BAD15", __testTranslatableTextFragmentF, newValue); //$NON-NLS-1$
    }
    public void setTestTranslatableTextFragmentF(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.testcasesfoundation.case004f.TranslatableTextFragmentF newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeDataTypeAttribute(connection, 1, "48DA2D8A6172FFA18A3111DD95800019993BAD15", __testTranslatableTextFragmentF, newValue); //$NON-NLS-1$
    }

    // methods for internal attribute setter
    private void set__TestTranslatableTextF(com.sap.tc.moin.testcasesfoundation.case004f.TranslatableTextF newValue) {
            __testTranslatableTextF = newValue;
    }

    private void set__TestTranslatableTextFragmentF(com.sap.tc.moin.testcasesfoundation.case004f.TranslatableTextFragmentF newValue) {
            __testTranslatableTextFragmentF = newValue;
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
                result = getTestTranslatableTextF();
                break;
            case 1: 
                result = getTestTranslatableTextFragmentF();
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
                ___changeDataTypeAttribute(connection, 0, "48DA2D8A6172FFA08A3111DDACFF0019993BAD15", __testTranslatableTextF, value); //$NON-NLS-1$
                break;
                    
            case 1:
                ___changeDataTypeAttribute(connection, 1, "48DA2D8A6172FFA18A3111DD95800019993BAD15", __testTranslatableTextFragmentF, value); //$NON-NLS-1$
                break;
                    
        default:
            throw new com.sap.tc.moin.repository.mmi.reflect.InvalidCallException(featureName, null, "refSetValue(String)"); //$NON-NLS-1$
        }
    }
    
    public void set___Value(com.sap.tc.moin.repository.core.CoreSession session, java.lang.String featureName, java.lang.Object value) {
        switch (FEATURE_IDS.get(featureName)) {
            case 0:
                set__TestTranslatableTextF((com.sap.tc.moin.testcasesfoundation.case004f.TranslatableTextF) value);     
                break;
            case 1:
                set__TestTranslatableTextFragmentF((com.sap.tc.moin.testcasesfoundation.case004f.TranslatableTextFragmentF) value);     
                break;
            default:
                throw new com.sap.tc.moin.repository.mmi.reflect.InvalidCallException(featureName, refMetaObject(), "set___Value(String)"); //$NON-NLS-1$
        }
    }
    
    public void set___Value(com.sap.tc.moin.repository.core.CoreSession session, int featureId, java.lang.Object value) {
        switch (featureId) {
            case 0:
                set__TestTranslatableTextF((com.sap.tc.moin.testcasesfoundation.case004f.TranslatableTextF) value);     
                break;
            case 1:
                set__TestTranslatableTextFragmentF((com.sap.tc.moin.testcasesfoundation.case004f.TranslatableTextFragmentF) value);     
                break;
            default:
                throw new com.sap.tc.moin.repository.mmi.reflect.InvalidCallException(featureId, refMetaObject(), "set___Value(int)"); //$NON-NLS-1$
        }
    }
    
    public void addOrSet___Value(com.sap.tc.moin.repository.core.CoreSession session, java.lang.String featureName, java.lang.Object value) {
        switch (FEATURE_IDS.get(featureName)) {
            case 0:
                set__TestTranslatableTextF((com.sap.tc.moin.testcasesfoundation.case004f.TranslatableTextF) value);     
                break;
            case 1:
                set__TestTranslatableTextFragmentF((com.sap.tc.moin.testcasesfoundation.case004f.TranslatableTextFragmentF) value);     
                break;
            default:
                throw new com.sap.tc.moin.repository.mmi.reflect.InvalidCallException(featureName, refMetaObject(), "addOrSet___Value(String)"); //$NON-NLS-1$
        }
    }    
    


    // get the JMI interface
    public java.lang.Class<com.sap.tc.moin.testcases.case019.serializationcallback.A19Serialization> get___JmiInterface() {
        return com.sap.tc.moin.testcases.case019.serializationcallback.A19Serialization.class;
    }

    // create the wrapper
    @Override
    public com.sap.tc.moin.repository.spi.core.Wrapper<com.sap.tc.moin.testcases.case019.serializationcallback.__impl.A19SerializationImpl> createWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, boolean synchronize) {
        return new com.sap.tc.moin.testcases.case019.serializationcallback.__impl.A19SerializationWrapper(conn, this, synchronize);
    }
    
}