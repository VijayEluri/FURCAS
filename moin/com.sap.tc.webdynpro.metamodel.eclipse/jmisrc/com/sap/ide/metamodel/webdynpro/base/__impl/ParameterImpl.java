/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.base.__impl;

public final class ParameterImpl extends com.sap.tc.moin.repository.core.jmi.reflect.RefObjectImpl {

        
    public static final java.util.Map<java.lang.String, java.lang.Integer> FEATURE_IDS;

    static {
        
        FEATURE_IDS = new java.util.HashMap<java.lang.String, java.lang.Integer>(18);
        FEATURE_IDS.put("TemplateInstances", Integer.valueOf(0)); //$NON-NLS-1$
        FEATURE_IDS.put("Diagrams", Integer.valueOf(1)); //$NON-NLS-1$
        FEATURE_IDS.put("DocumentationObject", Integer.valueOf(2)); //$NON-NLS-1$
        FEATURE_IDS.put("name", Integer.valueOf(3)); //$NON-NLS-1$
        FEATURE_IDS.put("Type", Integer.valueOf(4)); //$NON-NLS-1$
        FEATURE_IDS.put("NativeType", Integer.valueOf(5)); //$NON-NLS-1$
        FEATURE_IDS.put("Owner", Integer.valueOf(6)); //$NON-NLS-1$
        FEATURE_IDS.put("abapType", Integer.valueOf(7)); //$NON-NLS-1$
        FEATURE_IDS.put("abapTyping", Integer.valueOf(8)); //$NON-NLS-1$
        FEATURE_IDS.put("declarationType", Integer.valueOf(9)); //$NON-NLS-1$
        FEATURE_IDS.put("documentation", Integer.valueOf(10)); //$NON-NLS-1$
        FEATURE_IDS.put("deprecatedSince", Integer.valueOf(11)); //$NON-NLS-1$
        FEATURE_IDS.put("deprecatedDescription", Integer.valueOf(12)); //$NON-NLS-1$
    }
    
    
    // variable declarations
    private java.lang.String __name = null;
    private java.lang.String __abapType = null;
    private com.sap.ide.metamodel.webdynpro.enums.AbapTypingEnum __abapTyping = null;
    private com.sap.ide.metamodel.webdynpro.enums.DeclarationTypeEnum __declarationType = null;
    private int __deprecatedSince = 0;

    // links for multiplicity-1 association ends
    private com.sap.tc.moin.repository.core.EndStorageLink __A_Type_parameter_Type_45DDACEE0C0D5B0741514EEE133FACDBE4F264DF;
    private com.sap.tc.moin.repository.core.EndStorageLink __A_DocumentationObject_commonDevelopmentObject_DocumentationObject_45DDACEFC2A0C1CA72084C5D2DCACA7DBD913372;
    private com.sap.tc.moin.repository.core.EndStorageLink __A_NativeType_parameter_NativeType_460CC65BABEB933F1C9D45B319E6E068D8F8B3D4;

    // links for multiplicity-n association ends
    private java.util.Collection<com.sap.tc.moin.repository.core.EndStorageLink> __A_Diagrams_commonDevelopmentObject_Diagrams_45DDACEF343D00986BE441800112F0B99C0A53DC;
    private java.util.Collection<com.sap.tc.moin.repository.core.EndStorageLink> __A_TemplateInstances_commonDevelopmentObject_TemplateInstances_45DDACEF51C64A56A56C444C381C966D26ED4A10;

    // links for multiplicity-1 object-valued attributes
    private com.sap.tc.moin.repository.core.EndStorageLink __documentation;
    private com.sap.tc.moin.repository.core.EndStorageLink __deprecatedDescription;

    // default constructor
    public ParameterImpl() {
        super();
    }
    
    // specific constructor
    public ParameterImpl(java.lang.Object workspace, String mofId, com.sap.tc.moin.repository.mmi.reflect.RefPackage immediatePackage, com.sap.tc.moin.repository.mmi.reflect.RefObject metaObject, com.sap.tc.moin.repository.mmi.reflect.RefClass refClass) {
        super(workspace, mofId, immediatePackage, metaObject, refClass);
    }
    
    // methods for attributes
    public java.lang.String getName() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return __name;
    }
    public void setName(java.lang.String newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeDataTypeAttribute(get___CurrentConnection(), 3, "45DDACEF7AD45CA8B4074CC228ACBF28086BB8EF", __name, newValue); //$NON-NLS-1$
    }
    public void setName(com.sap.tc.moin.repository.core.CoreConnection connection, java.lang.String newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeDataTypeAttribute(connection, 3, "45DDACEF7AD45CA8B4074CC228ACBF28086BB8EF", __name, newValue); //$NON-NLS-1$
    }
    public java.lang.String getAbapType() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return __abapType;
    }
    public void setAbapType(java.lang.String newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeDataTypeAttribute(get___CurrentConnection(), 7, "45DDACEE283CE675E230402D27DF9F62DB56109B", __abapType, newValue); //$NON-NLS-1$
    }
    public void setAbapType(com.sap.tc.moin.repository.core.CoreConnection connection, java.lang.String newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeDataTypeAttribute(connection, 7, "45DDACEE283CE675E230402D27DF9F62DB56109B", __abapType, newValue); //$NON-NLS-1$
    }
    public com.sap.ide.metamodel.webdynpro.enums.AbapTypingEnum getAbapTyping() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return __abapTyping;
    }
    public void setAbapTyping(com.sap.ide.metamodel.webdynpro.enums.AbapTypingEnum newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeDataTypeAttribute(get___CurrentConnection(), 8, "45DDACEE39408B298EFF462223889B5F98B8CCAF", __abapTyping, newValue); //$NON-NLS-1$
    }
    public void setAbapTyping(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.ide.metamodel.webdynpro.enums.AbapTypingEnum newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeDataTypeAttribute(connection, 8, "45DDACEE39408B298EFF462223889B5F98B8CCAF", __abapTyping, newValue); //$NON-NLS-1$
    }
    public com.sap.ide.metamodel.webdynpro.enums.DeclarationTypeEnum getDeclarationType() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return __declarationType;
    }
    public void setDeclarationType(com.sap.ide.metamodel.webdynpro.enums.DeclarationTypeEnum newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeDataTypeAttribute(get___CurrentConnection(), 9, "45DDACEE236CE3CC692042B71957F2A86D989E8C", __declarationType, newValue); //$NON-NLS-1$
    }
    public void setDeclarationType(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.ide.metamodel.webdynpro.enums.DeclarationTypeEnum newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeDataTypeAttribute(connection, 9, "45DDACEE236CE3CC692042B71957F2A86D989E8C", __declarationType, newValue); //$NON-NLS-1$
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getDocumentation() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) ___getElementAtOtherLinkEnd( get___CurrentConnection(), __documentation);
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getDocumentation(com.sap.tc.moin.repository.core.CoreConnection connection) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) ___getElementAtOtherLinkEnd( connection, __documentation);
    }
    public void setDocumentation(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeObjectAttribute(get___CurrentConnection(), "45DDACEE4F0AD2904C78487D2D3FBB73DE17FCCC", newValue); //$NON-NLS-1$
    }
    public void setDocumentation(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeObjectAttribute(connection, "45DDACEE4F0AD2904C78487D2D3FBB73DE17FCCC", newValue); //$NON-NLS-1$
    }
    public int getDeprecatedSince() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return __deprecatedSince;
    }
    public void setDeprecatedSince(int newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeDataTypeAttribute(get___CurrentConnection(), 11, "45DDACEE3F68AF4702934C32162DC288356C5B47", __deprecatedSince, newValue); //$NON-NLS-1$
    }
    public void setDeprecatedSince(com.sap.tc.moin.repository.core.CoreConnection connection, int newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeDataTypeAttribute(connection, 11, "45DDACEE3F68AF4702934C32162DC288356C5B47", __deprecatedSince, newValue); //$NON-NLS-1$
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getDeprecatedDescription() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) ___getElementAtOtherLinkEnd( get___CurrentConnection(), __deprecatedDescription);
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getDeprecatedDescription(com.sap.tc.moin.repository.core.CoreConnection connection) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) ___getElementAtOtherLinkEnd( connection, __deprecatedDescription);
    }
    public void setDeprecatedDescription(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeObjectAttribute(get___CurrentConnection(), "45DDACEE637995B539424ED636BF832A6F45B840", newValue); //$NON-NLS-1$
    }
    public void setDeprecatedDescription(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeObjectAttribute(connection, "45DDACEE637995B539424ED636BF832A6F45B840", newValue); //$NON-NLS-1$
    }

    // methods for references
    public java.util.List getTemplateInstances() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (java.util.List) ___getElementsAtOtherLinkEnd( get___CurrentConnection(), this, get___EndAndMetaObject( "45DDACEF5D6AA31876724E9D050E8A792ABF3C1F" /* attribute or association */, 0 ) ) ; //$NON-NLS-1$
       
    }
    public java.util.List getTemplateInstances(com.sap.tc.moin.repository.core.CoreConnection connection) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (java.util.List) ___getElementsAtOtherLinkEnd( connection, this, get___EndAndMetaObject( "45DDACEF5D6AA31876724E9D050E8A792ABF3C1F" /* attribute or association */, 0 ) ) ; //$NON-NLS-1$
       
    }


    public java.util.List getDiagrams() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (java.util.List) ___getElementsAtOtherLinkEnd( get___CurrentConnection(), this, get___EndAndMetaObject( "45DDACEFFC6326E6552540E90D69D77671C93CAB" /* attribute or association */, 0 ) ) ; //$NON-NLS-1$
       
    }
    public java.util.List getDiagrams(com.sap.tc.moin.repository.core.CoreConnection connection) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (java.util.List) ___getElementsAtOtherLinkEnd( connection, this, get___EndAndMetaObject( "45DDACEFFC6326E6552540E90D69D77671C93CAB" /* attribute or association */, 0 ) ) ; //$NON-NLS-1$
       
    }


    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getDocumentationObject() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) ___getElementAtOtherLinkEnd( get___CurrentConnection(), __A_DocumentationObject_commonDevelopmentObject_DocumentationObject_45DDACEFC2A0C1CA72084C5D2DCACA7DBD913372);
       
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getDocumentationObject(com.sap.tc.moin.repository.core.CoreConnection connection) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) ___getElementAtOtherLinkEnd( connection, __A_DocumentationObject_commonDevelopmentObject_DocumentationObject_45DDACEFC2A0C1CA72084C5D2DCACA7DBD913372);
       
    }
    public void setDocumentationObject(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeReference(get___CurrentConnection(), /* mofId of association */ "45DDACEF25BD4550C67B4AB935F3FC97CD733BBC", /* mofId of reference */ "45DDACEFD1979D36777F4DA60404842A9D1D00C1" , newValue, 0); //$NON-NLS-1$ //$NON-NLS-2$

    }
    public void setDocumentationObject(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeReference(connection, /* mofId of association */ "45DDACEF25BD4550C67B4AB935F3FC97CD733BBC", /* mofId of reference */ "45DDACEFD1979D36777F4DA60404842A9D1D00C1" , newValue, 0); //$NON-NLS-1$ //$NON-NLS-2$

    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getType() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) ___getElementAtOtherLinkEnd( get___CurrentConnection(), __A_Type_parameter_Type_45DDACEE0C0D5B0741514EEE133FACDBE4F264DF);
       
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getType(com.sap.tc.moin.repository.core.CoreConnection connection) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) ___getElementAtOtherLinkEnd( connection, __A_Type_parameter_Type_45DDACEE0C0D5B0741514EEE133FACDBE4F264DF);
       
    }
    public void setType(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeReference(get___CurrentConnection(), /* mofId of association */ "45DDACEE6CC1F8FA068F41A73E0FF90E95FFF814", /* mofId of reference */ "45DDACEE73468FD9ACC44F8C3B14A101D24EF8FA" , newValue, 0); //$NON-NLS-1$ //$NON-NLS-2$

    }
    public void setType(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeReference(connection, /* mofId of association */ "45DDACEE6CC1F8FA068F41A73E0FF90E95FFF814", /* mofId of reference */ "45DDACEE73468FD9ACC44F8C3B14A101D24EF8FA" , newValue, 0); //$NON-NLS-1$ //$NON-NLS-2$

    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getNativeType() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) ___getElementAtOtherLinkEnd( get___CurrentConnection(), __A_NativeType_parameter_NativeType_460CC65BABEB933F1C9D45B319E6E068D8F8B3D4);
       
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getNativeType(com.sap.tc.moin.repository.core.CoreConnection connection) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) ___getElementAtOtherLinkEnd( connection, __A_NativeType_parameter_NativeType_460CC65BABEB933F1C9D45B319E6E068D8F8B3D4);
       
    }
    public void setNativeType(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeReference(get___CurrentConnection(), /* mofId of association */ "460CC65B07FD7565B4274A6616BDD516D1896F66", /* mofId of reference */ "460CC65B9D1EC7DF1127495507BFE8722D9C9A82" , newValue, 0); //$NON-NLS-1$ //$NON-NLS-2$

    }
    public void setNativeType(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeReference(connection, /* mofId of association */ "460CC65B07FD7565B4274A6616BDD516D1896F66", /* mofId of reference */ "460CC65B9D1EC7DF1127495507BFE8722D9C9A82" , newValue, 0); //$NON-NLS-1$ //$NON-NLS-2$

    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getOwner() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        com.sap.tc.moin.repository.core.EndAndMetaObject endAndMetaObject = get___EndAndMetaObject( "460CC65B5940A113E52F4D750BEED592C4496ECD" /* attribute or association */, 1 ); //$NON-NLS-1$
        return (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) get___CompositeParentForEndAndMetaObject( get___CurrentConnection(), endAndMetaObject );   
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getOwner(com.sap.tc.moin.repository.core.CoreConnection connection) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        com.sap.tc.moin.repository.core.EndAndMetaObject endAndMetaObject = get___EndAndMetaObject( "460CC65B5940A113E52F4D750BEED592C4496ECD" /* attribute or association */, 1 ); //$NON-NLS-1$
        return (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) get___CompositeParentForEndAndMetaObject( connection, endAndMetaObject );   
    }
    public void setOwner(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeReference(get___CurrentConnection(), /* mofId of association */ "460CC65B5940A113E52F4D750BEED592C4496ECD", /* mofId of reference */ "460CC65B3608101D5DD840832BEFACB30FB57E06" , newValue, 1); //$NON-NLS-1$ //$NON-NLS-2$

    }
    public void setOwner(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeReference(connection, /* mofId of association */ "460CC65B5940A113E52F4D750BEED592C4496ECD", /* mofId of reference */ "460CC65B3608101D5DD840832BEFACB30FB57E06" , newValue, 1); //$NON-NLS-1$ //$NON-NLS-2$

    }

    // methods for internal attribute setter
    private void set__Name(java.lang.String newValue) {
            __name = newValue;
    }

    private void set__AbapType(java.lang.String newValue) {
            __abapType = newValue;
    }

    private void set__AbapTyping(com.sap.ide.metamodel.webdynpro.enums.AbapTypingEnum newValue) {
            __abapTyping = newValue;
    }

    private void set__DeclarationType(com.sap.ide.metamodel.webdynpro.enums.DeclarationTypeEnum newValue) {
            __declarationType = newValue;
    }

    private void set__Documentation(com.sap.tc.moin.repository.core.CoreSession session, java.lang.Object newValue) {
        ___loadLinks(session, "45DDACEE4F0AD2904C78487D2D3FBB73DE17FCCC" /* "documentation" */, newValue, 1); //$NON-NLS-1$ //$NON-NLS-2$
    }

    private void set__DeprecatedSince(int newValue) {
            __deprecatedSince = newValue;
    }

    private void set__DeprecatedDescription(com.sap.tc.moin.repository.core.CoreSession session, java.lang.Object newValue) {
        ___loadLinks(session, "45DDACEE637995B539424ED636BF832A6F45B840" /* "deprecatedDescription" */, newValue, 1); //$NON-NLS-1$ //$NON-NLS-2$
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
                result = getTemplateInstances(connection);
                break;
            case 1: 
                result = getDiagrams(connection);
                break;
            case 2: 
                result = getDocumentationObject(connection);
                break;
            case 3: 
                result = getName();
                break;
            case 4: 
                result = getType(connection);
                break;
            case 5: 
                result = getNativeType(connection);
                break;
            case 6: 
                result = getOwner(connection);
                break;
            case 7: 
                result = getAbapType();
                break;
            case 8: 
                result = getAbapTyping();
                break;
            case 9: 
                result = getDeclarationType();
                break;
            case 10: 
                result = getDocumentation(connection);
                break;
            case 11: 
                result = getDeprecatedSince();
                break;
            case 12: 
                result = getDeprecatedDescription(connection);
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
                ___changeReference(connection, "45DDACEF5D6AA31876724E9D050E8A792ABF3C1F" /* mofId of association */, "45DDACEF72A33755751245E2354081CE4E44AA0A" /* mofId of reference */, value, 0); //$NON-NLS-1$ //$NON-NLS-2$     
                break;
                    
            case 1:
                ___changeReference(connection, "45DDACEFFC6326E6552540E90D69D77671C93CAB" /* mofId of association */, "45DDACEFF9AB3E07722F469B0041D4302046455F" /* mofId of reference */, value, 0); //$NON-NLS-1$ //$NON-NLS-2$     
                break;
                    
            case 2:
                ___changeReference(connection, "45DDACEF25BD4550C67B4AB935F3FC97CD733BBC" /* mofId of association */, "45DDACEFD1979D36777F4DA60404842A9D1D00C1" /* mofId of reference */, value, 0); //$NON-NLS-1$ //$NON-NLS-2$     
                break;
                    
            case 3:
                ___changeDataTypeAttribute(connection, 3, "45DDACEF7AD45CA8B4074CC228ACBF28086BB8EF", __name, value); //$NON-NLS-1$
                break;
                    
            case 4:
                ___changeReference(connection, "45DDACEE6CC1F8FA068F41A73E0FF90E95FFF814" /* mofId of association */, "45DDACEE73468FD9ACC44F8C3B14A101D24EF8FA" /* mofId of reference */, value, 0); //$NON-NLS-1$ //$NON-NLS-2$     
                break;
                    
            case 5:
                ___changeReference(connection, "460CC65B07FD7565B4274A6616BDD516D1896F66" /* mofId of association */, "460CC65B9D1EC7DF1127495507BFE8722D9C9A82" /* mofId of reference */, value, 0); //$NON-NLS-1$ //$NON-NLS-2$     
                break;
                    
            case 6:
                ___changeReference(connection, "460CC65B5940A113E52F4D750BEED592C4496ECD" /* mofId of association */, "460CC65B3608101D5DD840832BEFACB30FB57E06" /* mofId of reference */, value, 1); //$NON-NLS-1$ //$NON-NLS-2$     
                break;
                    
            case 7:
                ___changeDataTypeAttribute(connection, 7, "45DDACEE283CE675E230402D27DF9F62DB56109B", __abapType, value); //$NON-NLS-1$
                break;
                    
            case 8:
                ___changeDataTypeAttribute(connection, 8, "45DDACEE39408B298EFF462223889B5F98B8CCAF", __abapTyping, value); //$NON-NLS-1$
                break;
                    
            case 9:
                ___changeDataTypeAttribute(connection, 9, "45DDACEE236CE3CC692042B71957F2A86D989E8C", __declarationType, value); //$NON-NLS-1$
                break;
                    
            case 10:
                ___changeObjectAttribute(connection, "45DDACEE4F0AD2904C78487D2D3FBB73DE17FCCC", value); //$NON-NLS-1$
                break;
                    
            case 11:
                ___changeDataTypeAttribute(connection, 11, "45DDACEE3F68AF4702934C32162DC288356C5B47", __deprecatedSince, value); //$NON-NLS-1$
                break;
                    
            case 12:
                ___changeObjectAttribute(connection, "45DDACEE637995B539424ED636BF832A6F45B840", value); //$NON-NLS-1$
                break;
                    
        default:
            throw new com.sap.tc.moin.repository.mmi.reflect.InvalidCallException(featureName, null, "refSetValue(String)"); //$NON-NLS-1$
        }
    }

    public void set___Value(com.sap.tc.moin.repository.core.CoreSession session, java.lang.String featureName, java.lang.Object value) {
        switch (FEATURE_IDS.get(featureName)) {
            case 3:
                set__Name((java.lang.String) value);     
                break;
            case 7:
                set__AbapType((java.lang.String) value);     
                break;
            case 8:
                set__AbapTyping((com.sap.ide.metamodel.webdynpro.enums.AbapTypingEnum) value);     
                break;
            case 9:
                set__DeclarationType((com.sap.ide.metamodel.webdynpro.enums.DeclarationTypeEnum) value);     
                break;
            case 10:
                set__Documentation(session, value);     
                break;
            case 11:
                set__DeprecatedSince((java.lang.Integer) value);     
                break;
            case 12:
                set__DeprecatedDescription(session, value);     
                break;
            default:
                throw new com.sap.tc.moin.repository.mmi.reflect.InvalidCallException(featureName, refMetaObject(), "set___Value(String)"); //$NON-NLS-1$
        }
    }

    public void set___Value(com.sap.tc.moin.repository.core.CoreSession session, int featureId, java.lang.Object value) {
        switch (featureId) {
            case 3:
                set__Name((java.lang.String) value);     
                break;
            case 7:
                set__AbapType((java.lang.String) value);     
                break;
            case 8:
                set__AbapTyping((com.sap.ide.metamodel.webdynpro.enums.AbapTypingEnum) value);     
                break;
            case 9:
                set__DeclarationType((com.sap.ide.metamodel.webdynpro.enums.DeclarationTypeEnum) value);     
                break;
            case 10:
                set__Documentation(session, value);     
                break;
            case 11:
                set__DeprecatedSince((java.lang.Integer) value);     
                break;
            case 12:
                set__DeprecatedDescription(session, value);     
                break;
            default:
                throw new com.sap.tc.moin.repository.mmi.reflect.InvalidCallException(featureId, refMetaObject(), "set___Value(int)"); //$NON-NLS-1$
        }
    }

    public void addOrSet___Value(com.sap.tc.moin.repository.core.CoreSession session, java.lang.String featureName, java.lang.Object value) {
        switch (FEATURE_IDS.get(featureName)) {
            case 3:
                set__Name((java.lang.String) value);     
                break;
            case 7:
                set__AbapType((java.lang.String) value);     
                break;
            case 8:
                set__AbapTyping((com.sap.ide.metamodel.webdynpro.enums.AbapTypingEnum) value);     
                break;
            case 9:
                set__DeclarationType((com.sap.ide.metamodel.webdynpro.enums.DeclarationTypeEnum) value);     
                break;
            case 10:
                set__Documentation(session, value);         
                break;
            case 11:
                set__DeprecatedSince((java.lang.Integer) value);     
                break;
            case 12:
                set__DeprecatedDescription(session, value);         
                break;
            default:
                throw new com.sap.tc.moin.repository.mmi.reflect.InvalidCallException(featureName, refMetaObject(), "addOrSet___Value(String)"); //$NON-NLS-1$
        }
    }    



    public void set___AssociationLink( String associationEndMofId, com.sap.tc.moin.repository.core.EndStorageLink value ) {
        if ( associationEndMofId == "45DDACEE0C0D5B0741514EEE133FACDBE4F264DF" ) { __A_Type_parameter_Type_45DDACEE0C0D5B0741514EEE133FACDBE4F264DF = value; return; } //$NON-NLS-1$ 
        if ( associationEndMofId == "45DDACEFC2A0C1CA72084C5D2DCACA7DBD913372" ) { __A_DocumentationObject_commonDevelopmentObject_DocumentationObject_45DDACEFC2A0C1CA72084C5D2DCACA7DBD913372 = value; return; } //$NON-NLS-1$ 
        if ( associationEndMofId == "460CC65BABEB933F1C9D45B319E6E068D8F8B3D4" ) { __A_NativeType_parameter_NativeType_460CC65BABEB933F1C9D45B319E6E068D8F8B3D4 = value; return; } //$NON-NLS-1$ 
    }
    
    public com.sap.tc.moin.repository.core.EndStorageLink get___AssociationLink( String associationEndMofId ) {
        if ( associationEndMofId == "45DDACEE0C0D5B0741514EEE133FACDBE4F264DF" ) { return __A_Type_parameter_Type_45DDACEE0C0D5B0741514EEE133FACDBE4F264DF; } //$NON-NLS-1$ 
        if ( associationEndMofId == "45DDACEFC2A0C1CA72084C5D2DCACA7DBD913372" ) { return __A_DocumentationObject_commonDevelopmentObject_DocumentationObject_45DDACEFC2A0C1CA72084C5D2DCACA7DBD913372; } //$NON-NLS-1$ 
        if ( associationEndMofId == "460CC65BABEB933F1C9D45B319E6E068D8F8B3D4" ) { return __A_NativeType_parameter_NativeType_460CC65BABEB933F1C9D45B319E6E068D8F8B3D4; } //$NON-NLS-1$ 
        return null;
    }
    public void set___AttributeLink( String attributeMofId, com.sap.tc.moin.repository.core.EndStorageLink value ) {
        if ( attributeMofId == "45DDACEE4F0AD2904C78487D2D3FBB73DE17FCCC" ) { __documentation = value; return; } //$NON-NLS-1$ 
        if ( attributeMofId == "45DDACEE637995B539424ED636BF832A6F45B840" ) { __deprecatedDescription = value; return; } //$NON-NLS-1$ 
    }

    public com.sap.tc.moin.repository.core.EndStorageLink get___AttributeLink( String attributeMofId ) {
        if ( attributeMofId == "45DDACEE4F0AD2904C78487D2D3FBB73DE17FCCC" ) { return __documentation; } //$NON-NLS-1$ 
        if ( attributeMofId == "45DDACEE637995B539424ED636BF832A6F45B840" ) { return __deprecatedDescription; } //$NON-NLS-1$ 
        return null;
    }
    public java.util.List<com.sap.tc.moin.repository.core.EndStorageLink> get___AllStoredLinks( ) {
        java.util.List<com.sap.tc.moin.repository.core.EndStorageLink> result = null;
        if ( __A_Type_parameter_Type_45DDACEE0C0D5B0741514EEE133FACDBE4F264DF != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __A_Type_parameter_Type_45DDACEE0C0D5B0741514EEE133FACDBE4F264DF); } 
        if ( __A_DocumentationObject_commonDevelopmentObject_DocumentationObject_45DDACEFC2A0C1CA72084C5D2DCACA7DBD913372 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __A_DocumentationObject_commonDevelopmentObject_DocumentationObject_45DDACEFC2A0C1CA72084C5D2DCACA7DBD913372); } 
        if ( __A_NativeType_parameter_NativeType_460CC65BABEB933F1C9D45B319E6E068D8F8B3D4 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __A_NativeType_parameter_NativeType_460CC65BABEB933F1C9D45B319E6E068D8F8B3D4); } 
        if ( __A_Diagrams_commonDevelopmentObject_Diagrams_45DDACEF343D00986BE441800112F0B99C0A53DC != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.addAll( __A_Diagrams_commonDevelopmentObject_Diagrams_45DDACEF343D00986BE441800112F0B99C0A53DC); } 
        if ( __A_TemplateInstances_commonDevelopmentObject_TemplateInstances_45DDACEF51C64A56A56C444C381C966D26ED4A10 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.addAll( __A_TemplateInstances_commonDevelopmentObject_TemplateInstances_45DDACEF51C64A56A56C444C381C966D26ED4A10); } 
        if ( __documentation != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __documentation); } 
        if ( __deprecatedDescription != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __deprecatedDescription); } 
        return result;

    }

    public java.util.List<com.sap.tc.moin.repository.core.EndStorageLink> get___AllStoredAssociationLinks( ) {
        java.util.List<com.sap.tc.moin.repository.core.EndStorageLink> result = null;
        if ( __A_Type_parameter_Type_45DDACEE0C0D5B0741514EEE133FACDBE4F264DF != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __A_Type_parameter_Type_45DDACEE0C0D5B0741514EEE133FACDBE4F264DF); } 
        if ( __A_DocumentationObject_commonDevelopmentObject_DocumentationObject_45DDACEFC2A0C1CA72084C5D2DCACA7DBD913372 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __A_DocumentationObject_commonDevelopmentObject_DocumentationObject_45DDACEFC2A0C1CA72084C5D2DCACA7DBD913372); } 
        if ( __A_NativeType_parameter_NativeType_460CC65BABEB933F1C9D45B319E6E068D8F8B3D4 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __A_NativeType_parameter_NativeType_460CC65BABEB933F1C9D45B319E6E068D8F8B3D4); } 
        if ( __A_Diagrams_commonDevelopmentObject_Diagrams_45DDACEF343D00986BE441800112F0B99C0A53DC != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.addAll( __A_Diagrams_commonDevelopmentObject_Diagrams_45DDACEF343D00986BE441800112F0B99C0A53DC); } 
        if ( __A_TemplateInstances_commonDevelopmentObject_TemplateInstances_45DDACEF51C64A56A56C444C381C966D26ED4A10 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.addAll( __A_TemplateInstances_commonDevelopmentObject_TemplateInstances_45DDACEF51C64A56A56C444C381C966D26ED4A10); } 
        return result;

    }
    public java.util.Collection<com.sap.tc.moin.repository.core.EndStorageLink> get___AssociationLinks( String associationEndMofId ) {
        if ( associationEndMofId == "45DDACEF343D00986BE441800112F0B99C0A53DC" ) { return __A_Diagrams_commonDevelopmentObject_Diagrams_45DDACEF343D00986BE441800112F0B99C0A53DC; } //$NON-NLS-1$ 
        if ( associationEndMofId == "45DDACEF51C64A56A56C444C381C966D26ED4A10" ) { return __A_TemplateInstances_commonDevelopmentObject_TemplateInstances_45DDACEF51C64A56A56C444C381C966D26ED4A10; } //$NON-NLS-1$ 
        return null;
    }

    public void set___AssociationLinks( java.util.Collection<com.sap.tc.moin.repository.core.EndStorageLink> links, String associationEndMofId ) {
        if ( associationEndMofId == "45DDACEF343D00986BE441800112F0B99C0A53DC" ) { __A_Diagrams_commonDevelopmentObject_Diagrams_45DDACEF343D00986BE441800112F0B99C0A53DC = links; return; } //$NON-NLS-1$ 
        if ( associationEndMofId == "45DDACEF51C64A56A56C444C381C966D26ED4A10" ) { __A_TemplateInstances_commonDevelopmentObject_TemplateInstances_45DDACEF51C64A56A56C444C381C966D26ED4A10 = links; return; } //$NON-NLS-1$ 
    }    
    public java.util.List<com.sap.tc.moin.repository.core.EndStorageLink> clear___AllLinks( ) {
        reset___CompositeParentLink( );
        java.util.List<com.sap.tc.moin.repository.core.EndStorageLink> result = null;
        if ( __A_Type_parameter_Type_45DDACEE0C0D5B0741514EEE133FACDBE4F264DF != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __A_Type_parameter_Type_45DDACEE0C0D5B0741514EEE133FACDBE4F264DF); __A_Type_parameter_Type_45DDACEE0C0D5B0741514EEE133FACDBE4F264DF = null; } 
        if ( __A_DocumentationObject_commonDevelopmentObject_DocumentationObject_45DDACEFC2A0C1CA72084C5D2DCACA7DBD913372 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __A_DocumentationObject_commonDevelopmentObject_DocumentationObject_45DDACEFC2A0C1CA72084C5D2DCACA7DBD913372); __A_DocumentationObject_commonDevelopmentObject_DocumentationObject_45DDACEFC2A0C1CA72084C5D2DCACA7DBD913372 = null; } 
        if ( __A_NativeType_parameter_NativeType_460CC65BABEB933F1C9D45B319E6E068D8F8B3D4 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __A_NativeType_parameter_NativeType_460CC65BABEB933F1C9D45B319E6E068D8F8B3D4); __A_NativeType_parameter_NativeType_460CC65BABEB933F1C9D45B319E6E068D8F8B3D4 = null; } 
        if ( __A_Diagrams_commonDevelopmentObject_Diagrams_45DDACEF343D00986BE441800112F0B99C0A53DC != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.addAll( __A_Diagrams_commonDevelopmentObject_Diagrams_45DDACEF343D00986BE441800112F0B99C0A53DC); __A_Diagrams_commonDevelopmentObject_Diagrams_45DDACEF343D00986BE441800112F0B99C0A53DC = null; } 
        if ( __A_TemplateInstances_commonDevelopmentObject_TemplateInstances_45DDACEF51C64A56A56C444C381C966D26ED4A10 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.addAll( __A_TemplateInstances_commonDevelopmentObject_TemplateInstances_45DDACEF51C64A56A56C444C381C966D26ED4A10); __A_TemplateInstances_commonDevelopmentObject_TemplateInstances_45DDACEF51C64A56A56C444C381C966D26ED4A10 = null; } 
        if ( __documentation != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __documentation); __documentation = null; } 
        if ( __deprecatedDescription != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __deprecatedDescription); __deprecatedDescription = null; } 
        return result;

    }
    // get the JMI interface
    @SuppressWarnings("unchecked")
    public java.lang.Class<com.sap.ide.metamodel.webdynpro.base.Parameter> get___JmiInterface() {
        return com.sap.ide.metamodel.webdynpro.base.Parameter.class;
    }

    // create the wrapper
    @Override
    public com.sap.tc.moin.repository.spi.core.Wrapper<com.sap.ide.metamodel.webdynpro.base.__impl.ParameterImpl> createWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, boolean synchronize) {
        return new com.sap.ide.metamodel.webdynpro.base.__impl.ParameterWrapper(conn, this, synchronize);
    }
    
}