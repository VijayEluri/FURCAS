/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.mi.gfw.mm.pictograms.__impl;

public final class FontImpl extends com.sap.tc.moin.repository.core.jmi.reflect.RefObjectImpl {

        
    public static final java.util.Map<java.lang.String, java.lang.Integer> FEATURE_IDS;
    
    static {
        
        FEATURE_IDS = new java.util.HashMap<java.lang.String, java.lang.Integer>(6);
        FEATURE_IDS.put("name", Integer.valueOf(0)); //$NON-NLS-1$
        FEATURE_IDS.put("size", Integer.valueOf(1)); //$NON-NLS-1$
        FEATURE_IDS.put("italic", Integer.valueOf(2)); //$NON-NLS-1$
        FEATURE_IDS.put("bold", Integer.valueOf(3)); //$NON-NLS-1$
    }
    
    
    // variable declarations
    private java.lang.String __name = null;
    private int __size = 0;
    private boolean __italic = false;
    private boolean __bold = false;

    // default constructor
    public FontImpl() {
        super();
    }
    
    // specific constructor
    public FontImpl(java.lang.Object workspace, String mofId, com.sap.tc.moin.repository.mmi.reflect.RefPackage immediatePackage, com.sap.tc.moin.repository.mmi.reflect.RefObject metaObject, com.sap.tc.moin.repository.mmi.reflect.RefClass refClass) {
        super(workspace, mofId, immediatePackage, metaObject, refClass);
    }
    
    // methods for attributes
    public java.lang.String getName() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return __name;
    }
    public void setName(java.lang.String newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeDataTypeAttribute(get___CurrentConnection(), 0, "45E806E3C5BD54C6DE1C49AA15E1D1525E62478F", __name, newValue); //$NON-NLS-1$
    }
    public void setName(com.sap.tc.moin.repository.core.CoreConnection connection, java.lang.String newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeDataTypeAttribute(connection, 0, "45E806E3C5BD54C6DE1C49AA15E1D1525E62478F", __name, newValue); //$NON-NLS-1$
    }
    public int getSize() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return __size;
    }
    public void setSize(int newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeDataTypeAttribute(get___CurrentConnection(), 1, "45E806E31407CAA6D6FF44D806C9C63BFBCE0DE2", __size, newValue); //$NON-NLS-1$
    }
    public void setSize(com.sap.tc.moin.repository.core.CoreConnection connection, int newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeDataTypeAttribute(connection, 1, "45E806E31407CAA6D6FF44D806C9C63BFBCE0DE2", __size, newValue); //$NON-NLS-1$
    }
    public boolean isItalic() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return __italic;
    }
    public void setItalic(boolean newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeDataTypeAttribute(get___CurrentConnection(), 2, "45E806E39A5D75081A824AA33B74C2A8BA1E18F8", __italic, newValue); //$NON-NLS-1$
    }
    public void setItalic(com.sap.tc.moin.repository.core.CoreConnection connection, boolean newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeDataTypeAttribute(connection, 2, "45E806E39A5D75081A824AA33B74C2A8BA1E18F8", __italic, newValue); //$NON-NLS-1$
    }
    public boolean isBold() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return __bold;
    }
    public void setBold(boolean newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeDataTypeAttribute(get___CurrentConnection(), 3, "45E806E365E29AEF83CF4E1D11ABA577D5522A79", __bold, newValue); //$NON-NLS-1$
    }
    public void setBold(com.sap.tc.moin.repository.core.CoreConnection connection, boolean newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeDataTypeAttribute(connection, 3, "45E806E365E29AEF83CF4E1D11ABA577D5522A79", __bold, newValue); //$NON-NLS-1$
    }

    // methods for internal attribute setter
    private void set__Name(java.lang.String newValue) {
            __name = newValue;
    }

    private void set__Size(int newValue) {
            __size = newValue;
    }

    private void set__Italic(boolean newValue) {
            __italic = newValue;
    }

    private void set__Bold(boolean newValue) {
            __bold = newValue;
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
                result = getName();
                break;
            case 1: 
                result = getSize();
                break;
            case 2: 
                result = isItalic();
                break;
            case 3: 
                result = isBold();
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
                ___changeDataTypeAttribute(connection, 0, "45E806E3C5BD54C6DE1C49AA15E1D1525E62478F", __name, value); //$NON-NLS-1$
                break;
                    
            case 1:
                ___changeDataTypeAttribute(connection, 1, "45E806E31407CAA6D6FF44D806C9C63BFBCE0DE2", __size, value); //$NON-NLS-1$
                break;
                    
            case 2:
                ___changeDataTypeAttribute(connection, 2, "45E806E39A5D75081A824AA33B74C2A8BA1E18F8", __italic, value); //$NON-NLS-1$
                break;
                    
            case 3:
                ___changeDataTypeAttribute(connection, 3, "45E806E365E29AEF83CF4E1D11ABA577D5522A79", __bold, value); //$NON-NLS-1$
                break;
                    
        default:
            throw new com.sap.tc.moin.repository.mmi.reflect.InvalidCallException(featureName, null, "refSetValue(String)"); //$NON-NLS-1$
        }
    }
    
    public void set___Value(com.sap.tc.moin.repository.core.CoreSession session, java.lang.String featureName, java.lang.Object value) {
        switch (FEATURE_IDS.get(featureName)) {
            case 0:
                set__Name((java.lang.String) value);     
                break;
            case 1:
                set__Size((java.lang.Integer) value);     
                break;
            case 2:
                set__Italic((java.lang.Boolean) value);     
                break;
            case 3:
                set__Bold((java.lang.Boolean) value);     
                break;
            default:
                throw new com.sap.tc.moin.repository.mmi.reflect.InvalidCallException(featureName, refMetaObject(), "set___Value(String)"); //$NON-NLS-1$
        }
    }
    
    public void set___Value(com.sap.tc.moin.repository.core.CoreSession session, int featureId, java.lang.Object value) {
        switch (featureId) {
            case 0:
                set__Name((java.lang.String) value);     
                break;
            case 1:
                set__Size((java.lang.Integer) value);     
                break;
            case 2:
                set__Italic((java.lang.Boolean) value);     
                break;
            case 3:
                set__Bold((java.lang.Boolean) value);     
                break;
            default:
                throw new com.sap.tc.moin.repository.mmi.reflect.InvalidCallException(featureId, refMetaObject(), "set___Value(int)"); //$NON-NLS-1$
        }
    }
    
    public void addOrSet___Value(com.sap.tc.moin.repository.core.CoreSession session, java.lang.String featureName, java.lang.Object value) {
        switch (FEATURE_IDS.get(featureName)) {
            case 0:
                set__Name((java.lang.String) value);     
                break;
            case 1:
                set__Size((java.lang.Integer) value);     
                break;
            case 2:
                set__Italic((java.lang.Boolean) value);     
                break;
            case 3:
                set__Bold((java.lang.Boolean) value);     
                break;
            default:
                throw new com.sap.tc.moin.repository.mmi.reflect.InvalidCallException(featureName, refMetaObject(), "addOrSet___Value(String)"); //$NON-NLS-1$
        }
    }    
    


    // get the JMI interface
    public java.lang.Class<com.sap.mi.gfw.mm.pictograms.Font> get___JmiInterface() {
        return com.sap.mi.gfw.mm.pictograms.Font.class;
    }

    // create the wrapper
    @Override
    public com.sap.tc.moin.repository.spi.core.Wrapper<com.sap.mi.gfw.mm.pictograms.__impl.FontImpl> createWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, boolean synchronize) {
        return new com.sap.mi.gfw.mm.pictograms.__impl.FontWrapper(conn, this, synchronize);
    }
    
}