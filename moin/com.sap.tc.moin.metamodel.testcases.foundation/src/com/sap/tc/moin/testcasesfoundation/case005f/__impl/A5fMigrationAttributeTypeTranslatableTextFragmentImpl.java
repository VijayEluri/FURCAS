/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.tc.moin.testcasesfoundation.case005f.__impl;

public final class A5fMigrationAttributeTypeTranslatableTextFragmentImpl extends com.sap.tc.moin.repository.core.jmi.reflect.RefObjectImpl {

        
    public static final java.util.Map<java.lang.String, java.lang.Integer> FEATURE_IDS;
    
    static {
        
        FEATURE_IDS = new java.util.HashMap<java.lang.String, java.lang.Integer>(4);
        FEATURE_IDS.put("translatableTextFragment", Integer.valueOf(0)); //$NON-NLS-1$
        FEATURE_IDS.put("generalTranslatableTextFragment", Integer.valueOf(1)); //$NON-NLS-1$
        FEATURE_IDS.put("specializedTranslatableTextFragment", Integer.valueOf(2)); //$NON-NLS-1$
    }
    
    
    // variable declarations
    private com.sap.tc.moin.textverticalization.TranslatableTextFragment __translatableTextFragment = null;
    private com.sap.tc.moin.testcasesfoundation.case005f.structurebasedtexts.GeneralTranslatableTextFragment __generalTranslatableTextFragment = null;
    private com.sap.tc.moin.testcasesfoundation.case005f.structurebasedtexts.SpecializedTranslatableTextFragment __specializedTranslatableTextFragment = null;

    // default constructor
    public A5fMigrationAttributeTypeTranslatableTextFragmentImpl() {
        super();
    }
    
    // specific constructor
    public A5fMigrationAttributeTypeTranslatableTextFragmentImpl(java.lang.Object workspace, String mofId, com.sap.tc.moin.repository.mmi.reflect.RefPackage immediatePackage, com.sap.tc.moin.repository.mmi.reflect.RefObject metaObject, com.sap.tc.moin.repository.mmi.reflect.RefClass refClass) {
        super(workspace, mofId, immediatePackage, metaObject, refClass);
    }
    
    // methods for attributes
    public com.sap.tc.moin.textverticalization.TranslatableTextFragment getTranslatableTextFragment() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return __translatableTextFragment;
    }
    public void setTranslatableTextFragment(com.sap.tc.moin.textverticalization.TranslatableTextFragment newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeDataTypeAttribute(get___CurrentConnection(), 0, "48FEDD2F3CDD1BACA00F11DD8FF8001558C93B47", __translatableTextFragment, newValue); //$NON-NLS-1$
    }
    public void setTranslatableTextFragment(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.textverticalization.TranslatableTextFragment newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeDataTypeAttribute(connection, 0, "48FEDD2F3CDD1BACA00F11DD8FF8001558C93B47", __translatableTextFragment, newValue); //$NON-NLS-1$
    }
    public com.sap.tc.moin.testcasesfoundation.case005f.structurebasedtexts.GeneralTranslatableTextFragment getGeneralTranslatableTextFragment() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return __generalTranslatableTextFragment;
    }
    public void setGeneralTranslatableTextFragment(com.sap.tc.moin.testcasesfoundation.case005f.structurebasedtexts.GeneralTranslatableTextFragment newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeDataTypeAttribute(get___CurrentConnection(), 1, "48FEDD2F3CDD1BADA00F11DDCF44001558C93B47", __generalTranslatableTextFragment, newValue); //$NON-NLS-1$
    }
    public void setGeneralTranslatableTextFragment(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.testcasesfoundation.case005f.structurebasedtexts.GeneralTranslatableTextFragment newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeDataTypeAttribute(connection, 1, "48FEDD2F3CDD1BADA00F11DDCF44001558C93B47", __generalTranslatableTextFragment, newValue); //$NON-NLS-1$
    }
    public com.sap.tc.moin.testcasesfoundation.case005f.structurebasedtexts.SpecializedTranslatableTextFragment getSpecializedTranslatableTextFragment() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return __specializedTranslatableTextFragment;
    }
    public void setSpecializedTranslatableTextFragment(com.sap.tc.moin.testcasesfoundation.case005f.structurebasedtexts.SpecializedTranslatableTextFragment newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeDataTypeAttribute(get___CurrentConnection(), 2, "48FEDD2F3CDD1BAEA00F11DD871B001558C93B47", __specializedTranslatableTextFragment, newValue); //$NON-NLS-1$
    }
    public void setSpecializedTranslatableTextFragment(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.testcasesfoundation.case005f.structurebasedtexts.SpecializedTranslatableTextFragment newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeDataTypeAttribute(connection, 2, "48FEDD2F3CDD1BAEA00F11DD871B001558C93B47", __specializedTranslatableTextFragment, newValue); //$NON-NLS-1$
    }

    // methods for internal attribute setter
    private void set__TranslatableTextFragment(com.sap.tc.moin.textverticalization.TranslatableTextFragment newValue) {
            __translatableTextFragment = newValue;
    }

    private void set__GeneralTranslatableTextFragment(com.sap.tc.moin.testcasesfoundation.case005f.structurebasedtexts.GeneralTranslatableTextFragment newValue) {
            __generalTranslatableTextFragment = newValue;
    }

    private void set__SpecializedTranslatableTextFragment(com.sap.tc.moin.testcasesfoundation.case005f.structurebasedtexts.SpecializedTranslatableTextFragment newValue) {
            __specializedTranslatableTextFragment = newValue;
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
                result = getTranslatableTextFragment();
                break;
            case 1: 
                result = getGeneralTranslatableTextFragment();
                break;
            case 2: 
                result = getSpecializedTranslatableTextFragment();
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
                ___changeDataTypeAttribute(connection, 0, "48FEDD2F3CDD1BACA00F11DD8FF8001558C93B47", __translatableTextFragment, value); //$NON-NLS-1$
                break;
                    
            case 1:
                ___changeDataTypeAttribute(connection, 1, "48FEDD2F3CDD1BADA00F11DDCF44001558C93B47", __generalTranslatableTextFragment, value); //$NON-NLS-1$
                break;
                    
            case 2:
                ___changeDataTypeAttribute(connection, 2, "48FEDD2F3CDD1BAEA00F11DD871B001558C93B47", __specializedTranslatableTextFragment, value); //$NON-NLS-1$
                break;
                    
        default:
            throw new com.sap.tc.moin.repository.mmi.reflect.InvalidCallException(featureName, null, "refSetValue(String)"); //$NON-NLS-1$
        }
    }
    
    public void set___Value(com.sap.tc.moin.repository.core.CoreSession session, java.lang.String featureName, java.lang.Object value) {
        switch (FEATURE_IDS.get(featureName)) {
            case 0:
                set__TranslatableTextFragment((com.sap.tc.moin.textverticalization.TranslatableTextFragment) value);     
                break;
            case 1:
                set__GeneralTranslatableTextFragment((com.sap.tc.moin.testcasesfoundation.case005f.structurebasedtexts.GeneralTranslatableTextFragment) value);     
                break;
            case 2:
                set__SpecializedTranslatableTextFragment((com.sap.tc.moin.testcasesfoundation.case005f.structurebasedtexts.SpecializedTranslatableTextFragment) value);     
                break;
            default:
                throw new com.sap.tc.moin.repository.mmi.reflect.InvalidCallException(featureName, refMetaObject(), "set___Value(String)"); //$NON-NLS-1$
        }
    }
    
    public void set___Value(com.sap.tc.moin.repository.core.CoreSession session, int featureId, java.lang.Object value) {
        switch (featureId) {
            case 0:
                set__TranslatableTextFragment((com.sap.tc.moin.textverticalization.TranslatableTextFragment) value);     
                break;
            case 1:
                set__GeneralTranslatableTextFragment((com.sap.tc.moin.testcasesfoundation.case005f.structurebasedtexts.GeneralTranslatableTextFragment) value);     
                break;
            case 2:
                set__SpecializedTranslatableTextFragment((com.sap.tc.moin.testcasesfoundation.case005f.structurebasedtexts.SpecializedTranslatableTextFragment) value);     
                break;
            default:
                throw new com.sap.tc.moin.repository.mmi.reflect.InvalidCallException(featureId, refMetaObject(), "set___Value(int)"); //$NON-NLS-1$
        }
    }
    
    public void addOrSet___Value(com.sap.tc.moin.repository.core.CoreSession session, java.lang.String featureName, java.lang.Object value) {
        switch (FEATURE_IDS.get(featureName)) {
            case 0:
                set__TranslatableTextFragment((com.sap.tc.moin.textverticalization.TranslatableTextFragment) value);     
                break;
            case 1:
                set__GeneralTranslatableTextFragment((com.sap.tc.moin.testcasesfoundation.case005f.structurebasedtexts.GeneralTranslatableTextFragment) value);     
                break;
            case 2:
                set__SpecializedTranslatableTextFragment((com.sap.tc.moin.testcasesfoundation.case005f.structurebasedtexts.SpecializedTranslatableTextFragment) value);     
                break;
            default:
                throw new com.sap.tc.moin.repository.mmi.reflect.InvalidCallException(featureName, refMetaObject(), "addOrSet___Value(String)"); //$NON-NLS-1$
        }
    }    
    


    // get the JMI interface
    public java.lang.Class<com.sap.tc.moin.testcasesfoundation.case005f.A5fMigrationAttributeTypeTranslatableTextFragment> get___JmiInterface() {
        return com.sap.tc.moin.testcasesfoundation.case005f.A5fMigrationAttributeTypeTranslatableTextFragment.class;
    }

    // create the wrapper
    @Override
    public com.sap.tc.moin.repository.spi.core.Wrapper<com.sap.tc.moin.testcasesfoundation.case005f.__impl.A5fMigrationAttributeTypeTranslatableTextFragmentImpl> createWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, boolean synchronize) {
        return new com.sap.tc.moin.testcasesfoundation.case005f.__impl.A5fMigrationAttributeTypeTranslatableTextFragmentWrapper(conn, this, synchronize);
    }
    
}