/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.tc.moin.testcases.case018.__impl;

public final class B18Impl extends com.sap.tc.moin.repository.core.jmi.reflect.RefObjectImpl {

        
    public static final java.util.Map<java.lang.String, java.lang.Integer> FEATURE_IDS;
    
    static {
        
        FEATURE_IDS = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
        FEATURE_IDS.put("onePrimitive", Integer.valueOf(0)); //$NON-NLS-1$
        FEATURE_IDS.put("specialOnePrimitive", Integer.valueOf(1)); //$NON-NLS-1$
    }
    
    
    // variable declarations
    private java.lang.String __onePrimitive = null;
    private java.lang.String __specialOnePrimitive = null;

    // default constructor
    public B18Impl() {
        super();
    }
    
    // specific constructor
    public B18Impl(java.lang.Object workspace, String mofId, com.sap.tc.moin.repository.mmi.reflect.RefPackage immediatePackage, com.sap.tc.moin.repository.mmi.reflect.RefObject metaObject, com.sap.tc.moin.repository.mmi.reflect.RefClass refClass) {
        super(workspace, mofId, immediatePackage, metaObject, refClass);
    }
    
    // methods for attributes
    public java.lang.String getOnePrimitive() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return __onePrimitive;
    }
    public void setOnePrimitive(java.lang.String newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeDataTypeAttribute(get___CurrentConnection(), 0, "45ED922C260DB8540C7941610D52D29589423746", __onePrimitive, newValue); //$NON-NLS-1$
    }
    public void setOnePrimitive(com.sap.tc.moin.repository.core.CoreConnection connection, java.lang.String newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeDataTypeAttribute(connection, 0, "45ED922C260DB8540C7941610D52D29589423746", __onePrimitive, newValue); //$NON-NLS-1$
    }
    public java.lang.String getSpecialOnePrimitive() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return __specialOnePrimitive;
    }
    public void setSpecialOnePrimitive(java.lang.String newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeDataTypeAttribute(get___CurrentConnection(), 1, "491C8B26F9F92EB0B1BF11DD8F82001558C93B47", __specialOnePrimitive, newValue); //$NON-NLS-1$
    }
    public void setSpecialOnePrimitive(com.sap.tc.moin.repository.core.CoreConnection connection, java.lang.String newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeDataTypeAttribute(connection, 1, "491C8B26F9F92EB0B1BF11DD8F82001558C93B47", __specialOnePrimitive, newValue); //$NON-NLS-1$
    }

    // methods for internal attribute setter
    private void set__OnePrimitive(java.lang.String newValue) {
            __onePrimitive = newValue;
    }

    private void set__SpecialOnePrimitive(java.lang.String newValue) {
            __specialOnePrimitive = newValue;
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
                result = getOnePrimitive();
                break;
            case 1: 
                result = getSpecialOnePrimitive();
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
                ___changeDataTypeAttribute(connection, 0, "45ED922C260DB8540C7941610D52D29589423746", __onePrimitive, value); //$NON-NLS-1$
                break;
                    
            case 1:
                ___changeDataTypeAttribute(connection, 1, "491C8B26F9F92EB0B1BF11DD8F82001558C93B47", __specialOnePrimitive, value); //$NON-NLS-1$
                break;
                    
        default:
            throw new com.sap.tc.moin.repository.mmi.reflect.InvalidCallException(featureName, null, "refSetValue(String)"); //$NON-NLS-1$
        }
    }
    
    public void set___Value(com.sap.tc.moin.repository.core.CoreSession session, java.lang.String featureName, java.lang.Object value) {
        switch (FEATURE_IDS.get(featureName)) {
            case 0:
                set__OnePrimitive((java.lang.String) value);     
                break;
            case 1:
                set__SpecialOnePrimitive((java.lang.String) value);     
                break;
            default:
                throw new com.sap.tc.moin.repository.mmi.reflect.InvalidCallException(featureName, refMetaObject(), "set___Value(String)"); //$NON-NLS-1$
        }
    }
    
    public void set___Value(com.sap.tc.moin.repository.core.CoreSession session, int featureId, java.lang.Object value) {
        switch (featureId) {
            case 0:
                set__OnePrimitive((java.lang.String) value);     
                break;
            case 1:
                set__SpecialOnePrimitive((java.lang.String) value);     
                break;
            default:
                throw new com.sap.tc.moin.repository.mmi.reflect.InvalidCallException(featureId, refMetaObject(), "set___Value(int)"); //$NON-NLS-1$
        }
    }
    
    public void addOrSet___Value(com.sap.tc.moin.repository.core.CoreSession session, java.lang.String featureName, java.lang.Object value) {
        switch (FEATURE_IDS.get(featureName)) {
            case 0:
                set__OnePrimitive((java.lang.String) value);     
                break;
            case 1:
                set__SpecialOnePrimitive((java.lang.String) value);     
                break;
            default:
                throw new com.sap.tc.moin.repository.mmi.reflect.InvalidCallException(featureName, refMetaObject(), "addOrSet___Value(String)"); //$NON-NLS-1$
        }
    }    
    


    // get the JMI interface
    public java.lang.Class<com.sap.tc.moin.testcases.case018.B18> get___JmiInterface() {
        return com.sap.tc.moin.testcases.case018.B18.class;
    }

    // create the wrapper
    @Override
    public com.sap.tc.moin.repository.spi.core.Wrapper<com.sap.tc.moin.testcases.case018.__impl.B18Impl> createWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, boolean synchronize) {
        return new com.sap.tc.moin.testcases.case018.__impl.B18Wrapper(conn, this, synchronize);
    }
    
}