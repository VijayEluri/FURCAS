/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.model.__impl;

public final class ModelImpl extends com.sap.tc.moin.repository.core.jmi.reflect.RefObjectImpl {

        
    public static final java.util.Map<java.lang.String, java.lang.Integer> FEATURE_IDS;

    static {
        
        FEATURE_IDS = new java.util.HashMap<java.lang.String, java.lang.Integer>(14);
        FEATURE_IDS.put("TemplateInstances", Integer.valueOf(0)); //$NON-NLS-1$
        FEATURE_IDS.put("Diagrams", Integer.valueOf(1)); //$NON-NLS-1$
        FEATURE_IDS.put("DocumentationObject", Integer.valueOf(2)); //$NON-NLS-1$
        FEATURE_IDS.put("name", Integer.valueOf(3)); //$NON-NLS-1$
        FEATURE_IDS.put("Settings", Integer.valueOf(4)); //$NON-NLS-1$
        FEATURE_IDS.put("ModelType", Integer.valueOf(5)); //$NON-NLS-1$
        FEATURE_IDS.put("LogicalDictionary", Integer.valueOf(6)); //$NON-NLS-1$
        FEATURE_IDS.put("ModelClasses", Integer.valueOf(7)); //$NON-NLS-1$
        FEATURE_IDS.put("ModelRelations", Integer.valueOf(8)); //$NON-NLS-1$
        FEATURE_IDS.put("UsedModels", Integer.valueOf(9)); //$NON-NLS-1$
    }
    
    
    // variable declarations
    private java.lang.String __name = null;

    // links for multiplicity-1 association ends
    private com.sap.tc.moin.repository.core.EndStorageLink __A_LogicalDictionary_model_LogicalDictionary_45DDACEF4ECD67C1CB8B4F373A4FF5556C64EDD4;
    private com.sap.tc.moin.repository.core.EndStorageLink __A_ModelType_model_ModelType_45DDACEFB96F43E897A44FBC31A4F2873FAAD7F1;
    private com.sap.tc.moin.repository.core.EndStorageLink __A_DocumentationObject_commonDevelopmentObject_DocumentationObject_45DDACEFC2A0C1CA72084C5D2DCACA7DBD913372;

    // links for multiplicity-n association ends
    private java.util.Collection<com.sap.tc.moin.repository.core.EndStorageLink> __A_Diagrams_commonDevelopmentObject_Diagrams_45DDACEF343D00986BE441800112F0B99C0A53DC;
    private java.util.Collection<com.sap.tc.moin.repository.core.EndStorageLink> __A_TemplateInstances_commonDevelopmentObject_TemplateInstances_45DDACEF51C64A56A56C444C381C966D26ED4A10;
    private java.util.Collection<com.sap.tc.moin.repository.core.EndStorageLink> __A_Settings_Model_Settings_45DDACEF940B9B071FC64A9D3646CF420D8A31EA;
    private java.util.Collection<com.sap.tc.moin.repository.core.EndStorageLink> __A_UsedModels_model_UsedModels_45DDACEFD41F1ABE8DB84B7524DCC3B936FD4EE3;
    private java.util.Collection<com.sap.tc.moin.repository.core.EndStorageLink> __A_ModelRelations_Model_ModelRelations_460CC65CAB8CFC06C5844F0C3AB6E7A43ED13183;
    private java.util.Collection<com.sap.tc.moin.repository.core.EndStorageLink> __A_ModelClasses_Model_ModelClasses_460CC65CFB9462CB3E394F932B92F9A913F73E42;

    // default constructor
    public ModelImpl() {
        super();
    }
    
    // specific constructor
    public ModelImpl(java.lang.Object workspace, String mofId, com.sap.tc.moin.repository.mmi.reflect.RefPackage immediatePackage, com.sap.tc.moin.repository.mmi.reflect.RefObject metaObject, com.sap.tc.moin.repository.mmi.reflect.RefClass refClass) {
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
    public java.util.List getSettings() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (java.util.List) ___getElementsAtOtherLinkEnd( get___CurrentConnection(), this, get___EndAndMetaObject( "45DDACEF2B4FD46576EE49E32FDFECE6EFF08E55" /* attribute or association */, 0 ) ) ; //$NON-NLS-1$
       
    }
    public java.util.List getSettings(com.sap.tc.moin.repository.core.CoreConnection connection) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (java.util.List) ___getElementsAtOtherLinkEnd( connection, this, get___EndAndMetaObject( "45DDACEF2B4FD46576EE49E32FDFECE6EFF08E55" /* attribute or association */, 0 ) ) ; //$NON-NLS-1$
       
    }


    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getModelType() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) ___getElementAtOtherLinkEnd( get___CurrentConnection(), __A_ModelType_model_ModelType_45DDACEFB96F43E897A44FBC31A4F2873FAAD7F1);
       
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getModelType(com.sap.tc.moin.repository.core.CoreConnection connection) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) ___getElementAtOtherLinkEnd( connection, __A_ModelType_model_ModelType_45DDACEFB96F43E897A44FBC31A4F2873FAAD7F1);
       
    }
    public void setModelType(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeReference(get___CurrentConnection(), /* mofId of association */ "45DDACEF049F494E8D3D47783D668075FEE8D471", /* mofId of reference */ "45DDACEF900555CA47694AD828B68A17B38E5A5E" , newValue, 0); //$NON-NLS-1$ //$NON-NLS-2$

    }
    public void setModelType(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeReference(connection, /* mofId of association */ "45DDACEF049F494E8D3D47783D668075FEE8D471", /* mofId of reference */ "45DDACEF900555CA47694AD828B68A17B38E5A5E" , newValue, 0); //$NON-NLS-1$ //$NON-NLS-2$

    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getLogicalDictionary() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) ___getElementAtOtherLinkEnd( get___CurrentConnection(), __A_LogicalDictionary_model_LogicalDictionary_45DDACEF4ECD67C1CB8B4F373A4FF5556C64EDD4);
       
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getLogicalDictionary(com.sap.tc.moin.repository.core.CoreConnection connection) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) ___getElementAtOtherLinkEnd( connection, __A_LogicalDictionary_model_LogicalDictionary_45DDACEF4ECD67C1CB8B4F373A4FF5556C64EDD4);
       
    }
    public void setLogicalDictionary(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeReference(get___CurrentConnection(), /* mofId of association */ "45DDACEF998E67A1FEB5496917938B53807A4612", /* mofId of reference */ "45DDACEF7BE780D7296640E500548866CEE5DB70" , newValue, 0); //$NON-NLS-1$ //$NON-NLS-2$

    }
    public void setLogicalDictionary(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeReference(connection, /* mofId of association */ "45DDACEF998E67A1FEB5496917938B53807A4612", /* mofId of reference */ "45DDACEF7BE780D7296640E500548866CEE5DB70" , newValue, 0); //$NON-NLS-1$ //$NON-NLS-2$

    }
    public java.util.List getModelClasses() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (java.util.List) ___getElementsAtOtherLinkEnd( get___CurrentConnection(), this, get___EndAndMetaObject( "460CC65CB6A35495F95A45290C28B312047227A6" /* attribute or association */, 0 ) ) ; //$NON-NLS-1$
       
    }
    public java.util.List getModelClasses(com.sap.tc.moin.repository.core.CoreConnection connection) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (java.util.List) ___getElementsAtOtherLinkEnd( connection, this, get___EndAndMetaObject( "460CC65CB6A35495F95A45290C28B312047227A6" /* attribute or association */, 0 ) ) ; //$NON-NLS-1$
       
    }


    public java.util.List getModelRelations() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (java.util.List) ___getElementsAtOtherLinkEnd( get___CurrentConnection(), this, get___EndAndMetaObject( "460CC65C291B97877D6F47443AE0D4222727FE21" /* attribute or association */, 0 ) ) ; //$NON-NLS-1$
       
    }
    public java.util.List getModelRelations(com.sap.tc.moin.repository.core.CoreConnection connection) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (java.util.List) ___getElementsAtOtherLinkEnd( connection, this, get___EndAndMetaObject( "460CC65C291B97877D6F47443AE0D4222727FE21" /* attribute or association */, 0 ) ) ; //$NON-NLS-1$
       
    }


    public java.util.List getUsedModels() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (java.util.List) ___getElementsAtOtherLinkEnd( get___CurrentConnection(), this, get___EndAndMetaObject( "45DDACEF10B0645398EA4C64348B83714E7D8BCA" /* attribute or association */, 0 ) ) ; //$NON-NLS-1$
       
    }
    public java.util.List getUsedModels(com.sap.tc.moin.repository.core.CoreConnection connection) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (java.util.List) ___getElementsAtOtherLinkEnd( connection, this, get___EndAndMetaObject( "45DDACEF10B0645398EA4C64348B83714E7D8BCA" /* attribute or association */, 0 ) ) ; //$NON-NLS-1$
       
    }



    // methods for internal attribute setter
    private void set__Name(java.lang.String newValue) {
            __name = newValue;
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
                result = getSettings(connection);
                break;
            case 5: 
                result = getModelType(connection);
                break;
            case 6: 
                result = getLogicalDictionary(connection);
                break;
            case 7: 
                result = getModelClasses(connection);
                break;
            case 8: 
                result = getModelRelations(connection);
                break;
            case 9: 
                result = getUsedModels(connection);
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
                ___changeReference(connection, "45DDACEF2B4FD46576EE49E32FDFECE6EFF08E55" /* mofId of association */, "45DDACEF153A35EC452745232ECE98A9D378F94F" /* mofId of reference */, value, 0); //$NON-NLS-1$ //$NON-NLS-2$     
                break;
                    
            case 5:
                ___changeReference(connection, "45DDACEF049F494E8D3D47783D668075FEE8D471" /* mofId of association */, "45DDACEF900555CA47694AD828B68A17B38E5A5E" /* mofId of reference */, value, 0); //$NON-NLS-1$ //$NON-NLS-2$     
                break;
                    
            case 6:
                ___changeReference(connection, "45DDACEF998E67A1FEB5496917938B53807A4612" /* mofId of association */, "45DDACEF7BE780D7296640E500548866CEE5DB70" /* mofId of reference */, value, 0); //$NON-NLS-1$ //$NON-NLS-2$     
                break;
                    
            case 7:
                ___changeReference(connection, "460CC65CB6A35495F95A45290C28B312047227A6" /* mofId of association */, "460CC65C1DA4B85B1D0B47E9228CE7C3A7622F28" /* mofId of reference */, value, 0); //$NON-NLS-1$ //$NON-NLS-2$     
                break;
                    
            case 8:
                ___changeReference(connection, "460CC65C291B97877D6F47443AE0D4222727FE21" /* mofId of association */, "460CC65C69312AD639F24B032B17FB35B210127D" /* mofId of reference */, value, 0); //$NON-NLS-1$ //$NON-NLS-2$     
                break;
                    
            case 9:
                ___changeReference(connection, "45DDACEF10B0645398EA4C64348B83714E7D8BCA" /* mofId of association */, "45DDACEF4BC5EDD758F94D6B1DEFA17DBBEABE9E" /* mofId of reference */, value, 0); //$NON-NLS-1$ //$NON-NLS-2$     
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
            default:
                throw new com.sap.tc.moin.repository.mmi.reflect.InvalidCallException(featureName, refMetaObject(), "set___Value(String)"); //$NON-NLS-1$
        }
    }

    public void set___Value(com.sap.tc.moin.repository.core.CoreSession session, int featureId, java.lang.Object value) {
        switch (featureId) {
            case 3:
                set__Name((java.lang.String) value);     
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
            default:
                throw new com.sap.tc.moin.repository.mmi.reflect.InvalidCallException(featureName, refMetaObject(), "addOrSet___Value(String)"); //$NON-NLS-1$
        }
    }    



    public void set___AssociationLink( String associationEndMofId, com.sap.tc.moin.repository.core.EndStorageLink value ) {
        if ( associationEndMofId == "45DDACEF4ECD67C1CB8B4F373A4FF5556C64EDD4" ) { __A_LogicalDictionary_model_LogicalDictionary_45DDACEF4ECD67C1CB8B4F373A4FF5556C64EDD4 = value; return; } //$NON-NLS-1$ 
        if ( associationEndMofId == "45DDACEFB96F43E897A44FBC31A4F2873FAAD7F1" ) { __A_ModelType_model_ModelType_45DDACEFB96F43E897A44FBC31A4F2873FAAD7F1 = value; return; } //$NON-NLS-1$ 
        if ( associationEndMofId == "45DDACEFC2A0C1CA72084C5D2DCACA7DBD913372" ) { __A_DocumentationObject_commonDevelopmentObject_DocumentationObject_45DDACEFC2A0C1CA72084C5D2DCACA7DBD913372 = value; return; } //$NON-NLS-1$ 
    }
    
    public com.sap.tc.moin.repository.core.EndStorageLink get___AssociationLink( String associationEndMofId ) {
        if ( associationEndMofId == "45DDACEF4ECD67C1CB8B4F373A4FF5556C64EDD4" ) { return __A_LogicalDictionary_model_LogicalDictionary_45DDACEF4ECD67C1CB8B4F373A4FF5556C64EDD4; } //$NON-NLS-1$ 
        if ( associationEndMofId == "45DDACEFB96F43E897A44FBC31A4F2873FAAD7F1" ) { return __A_ModelType_model_ModelType_45DDACEFB96F43E897A44FBC31A4F2873FAAD7F1; } //$NON-NLS-1$ 
        if ( associationEndMofId == "45DDACEFC2A0C1CA72084C5D2DCACA7DBD913372" ) { return __A_DocumentationObject_commonDevelopmentObject_DocumentationObject_45DDACEFC2A0C1CA72084C5D2DCACA7DBD913372; } //$NON-NLS-1$ 
        return null;
    }
    public java.util.List<com.sap.tc.moin.repository.core.EndStorageLink> get___AllStoredLinks( ) {
        java.util.List<com.sap.tc.moin.repository.core.EndStorageLink> result = null;
        if ( __A_LogicalDictionary_model_LogicalDictionary_45DDACEF4ECD67C1CB8B4F373A4FF5556C64EDD4 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __A_LogicalDictionary_model_LogicalDictionary_45DDACEF4ECD67C1CB8B4F373A4FF5556C64EDD4); } 
        if ( __A_ModelType_model_ModelType_45DDACEFB96F43E897A44FBC31A4F2873FAAD7F1 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __A_ModelType_model_ModelType_45DDACEFB96F43E897A44FBC31A4F2873FAAD7F1); } 
        if ( __A_DocumentationObject_commonDevelopmentObject_DocumentationObject_45DDACEFC2A0C1CA72084C5D2DCACA7DBD913372 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __A_DocumentationObject_commonDevelopmentObject_DocumentationObject_45DDACEFC2A0C1CA72084C5D2DCACA7DBD913372); } 
        if ( __A_Diagrams_commonDevelopmentObject_Diagrams_45DDACEF343D00986BE441800112F0B99C0A53DC != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.addAll( __A_Diagrams_commonDevelopmentObject_Diagrams_45DDACEF343D00986BE441800112F0B99C0A53DC); } 
        if ( __A_TemplateInstances_commonDevelopmentObject_TemplateInstances_45DDACEF51C64A56A56C444C381C966D26ED4A10 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.addAll( __A_TemplateInstances_commonDevelopmentObject_TemplateInstances_45DDACEF51C64A56A56C444C381C966D26ED4A10); } 
        if ( __A_Settings_Model_Settings_45DDACEF940B9B071FC64A9D3646CF420D8A31EA != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.addAll( __A_Settings_Model_Settings_45DDACEF940B9B071FC64A9D3646CF420D8A31EA); } 
        if ( __A_UsedModels_model_UsedModels_45DDACEFD41F1ABE8DB84B7524DCC3B936FD4EE3 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.addAll( __A_UsedModels_model_UsedModels_45DDACEFD41F1ABE8DB84B7524DCC3B936FD4EE3); } 
        if ( __A_ModelRelations_Model_ModelRelations_460CC65CAB8CFC06C5844F0C3AB6E7A43ED13183 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.addAll( __A_ModelRelations_Model_ModelRelations_460CC65CAB8CFC06C5844F0C3AB6E7A43ED13183); } 
        if ( __A_ModelClasses_Model_ModelClasses_460CC65CFB9462CB3E394F932B92F9A913F73E42 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.addAll( __A_ModelClasses_Model_ModelClasses_460CC65CFB9462CB3E394F932B92F9A913F73E42); } 
        return result;

    }

    public java.util.List<com.sap.tc.moin.repository.core.EndStorageLink> get___AllStoredAssociationLinks( ) {
        java.util.List<com.sap.tc.moin.repository.core.EndStorageLink> result = null;
        if ( __A_LogicalDictionary_model_LogicalDictionary_45DDACEF4ECD67C1CB8B4F373A4FF5556C64EDD4 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __A_LogicalDictionary_model_LogicalDictionary_45DDACEF4ECD67C1CB8B4F373A4FF5556C64EDD4); } 
        if ( __A_ModelType_model_ModelType_45DDACEFB96F43E897A44FBC31A4F2873FAAD7F1 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __A_ModelType_model_ModelType_45DDACEFB96F43E897A44FBC31A4F2873FAAD7F1); } 
        if ( __A_DocumentationObject_commonDevelopmentObject_DocumentationObject_45DDACEFC2A0C1CA72084C5D2DCACA7DBD913372 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __A_DocumentationObject_commonDevelopmentObject_DocumentationObject_45DDACEFC2A0C1CA72084C5D2DCACA7DBD913372); } 
        if ( __A_Diagrams_commonDevelopmentObject_Diagrams_45DDACEF343D00986BE441800112F0B99C0A53DC != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.addAll( __A_Diagrams_commonDevelopmentObject_Diagrams_45DDACEF343D00986BE441800112F0B99C0A53DC); } 
        if ( __A_TemplateInstances_commonDevelopmentObject_TemplateInstances_45DDACEF51C64A56A56C444C381C966D26ED4A10 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.addAll( __A_TemplateInstances_commonDevelopmentObject_TemplateInstances_45DDACEF51C64A56A56C444C381C966D26ED4A10); } 
        if ( __A_Settings_Model_Settings_45DDACEF940B9B071FC64A9D3646CF420D8A31EA != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.addAll( __A_Settings_Model_Settings_45DDACEF940B9B071FC64A9D3646CF420D8A31EA); } 
        if ( __A_UsedModels_model_UsedModels_45DDACEFD41F1ABE8DB84B7524DCC3B936FD4EE3 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.addAll( __A_UsedModels_model_UsedModels_45DDACEFD41F1ABE8DB84B7524DCC3B936FD4EE3); } 
        if ( __A_ModelRelations_Model_ModelRelations_460CC65CAB8CFC06C5844F0C3AB6E7A43ED13183 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.addAll( __A_ModelRelations_Model_ModelRelations_460CC65CAB8CFC06C5844F0C3AB6E7A43ED13183); } 
        if ( __A_ModelClasses_Model_ModelClasses_460CC65CFB9462CB3E394F932B92F9A913F73E42 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.addAll( __A_ModelClasses_Model_ModelClasses_460CC65CFB9462CB3E394F932B92F9A913F73E42); } 
        return result;

    }
    public java.util.Collection<com.sap.tc.moin.repository.core.EndStorageLink> get___AssociationLinks( String associationEndMofId ) {
        if ( associationEndMofId == "45DDACEF343D00986BE441800112F0B99C0A53DC" ) { return __A_Diagrams_commonDevelopmentObject_Diagrams_45DDACEF343D00986BE441800112F0B99C0A53DC; } //$NON-NLS-1$ 
        if ( associationEndMofId == "45DDACEF51C64A56A56C444C381C966D26ED4A10" ) { return __A_TemplateInstances_commonDevelopmentObject_TemplateInstances_45DDACEF51C64A56A56C444C381C966D26ED4A10; } //$NON-NLS-1$ 
        if ( associationEndMofId == "45DDACEF940B9B071FC64A9D3646CF420D8A31EA" ) { return __A_Settings_Model_Settings_45DDACEF940B9B071FC64A9D3646CF420D8A31EA; } //$NON-NLS-1$ 
        if ( associationEndMofId == "45DDACEFD41F1ABE8DB84B7524DCC3B936FD4EE3" ) { return __A_UsedModels_model_UsedModels_45DDACEFD41F1ABE8DB84B7524DCC3B936FD4EE3; } //$NON-NLS-1$ 
        if ( associationEndMofId == "460CC65CAB8CFC06C5844F0C3AB6E7A43ED13183" ) { return __A_ModelRelations_Model_ModelRelations_460CC65CAB8CFC06C5844F0C3AB6E7A43ED13183; } //$NON-NLS-1$ 
        if ( associationEndMofId == "460CC65CFB9462CB3E394F932B92F9A913F73E42" ) { return __A_ModelClasses_Model_ModelClasses_460CC65CFB9462CB3E394F932B92F9A913F73E42; } //$NON-NLS-1$ 
        return null;
    }

    public void set___AssociationLinks( java.util.Collection<com.sap.tc.moin.repository.core.EndStorageLink> links, String associationEndMofId ) {
        if ( associationEndMofId == "45DDACEF343D00986BE441800112F0B99C0A53DC" ) { __A_Diagrams_commonDevelopmentObject_Diagrams_45DDACEF343D00986BE441800112F0B99C0A53DC = links; return; } //$NON-NLS-1$ 
        if ( associationEndMofId == "45DDACEF51C64A56A56C444C381C966D26ED4A10" ) { __A_TemplateInstances_commonDevelopmentObject_TemplateInstances_45DDACEF51C64A56A56C444C381C966D26ED4A10 = links; return; } //$NON-NLS-1$ 
        if ( associationEndMofId == "45DDACEF940B9B071FC64A9D3646CF420D8A31EA" ) { __A_Settings_Model_Settings_45DDACEF940B9B071FC64A9D3646CF420D8A31EA = links; return; } //$NON-NLS-1$ 
        if ( associationEndMofId == "45DDACEFD41F1ABE8DB84B7524DCC3B936FD4EE3" ) { __A_UsedModels_model_UsedModels_45DDACEFD41F1ABE8DB84B7524DCC3B936FD4EE3 = links; return; } //$NON-NLS-1$ 
        if ( associationEndMofId == "460CC65CAB8CFC06C5844F0C3AB6E7A43ED13183" ) { __A_ModelRelations_Model_ModelRelations_460CC65CAB8CFC06C5844F0C3AB6E7A43ED13183 = links; return; } //$NON-NLS-1$ 
        if ( associationEndMofId == "460CC65CFB9462CB3E394F932B92F9A913F73E42" ) { __A_ModelClasses_Model_ModelClasses_460CC65CFB9462CB3E394F932B92F9A913F73E42 = links; return; } //$NON-NLS-1$ 
    }    
    public java.util.List<com.sap.tc.moin.repository.core.EndStorageLink> clear___AllLinks( ) {
        reset___CompositeParentLink( );
        java.util.List<com.sap.tc.moin.repository.core.EndStorageLink> result = null;
        if ( __A_LogicalDictionary_model_LogicalDictionary_45DDACEF4ECD67C1CB8B4F373A4FF5556C64EDD4 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __A_LogicalDictionary_model_LogicalDictionary_45DDACEF4ECD67C1CB8B4F373A4FF5556C64EDD4); __A_LogicalDictionary_model_LogicalDictionary_45DDACEF4ECD67C1CB8B4F373A4FF5556C64EDD4 = null; } 
        if ( __A_ModelType_model_ModelType_45DDACEFB96F43E897A44FBC31A4F2873FAAD7F1 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __A_ModelType_model_ModelType_45DDACEFB96F43E897A44FBC31A4F2873FAAD7F1); __A_ModelType_model_ModelType_45DDACEFB96F43E897A44FBC31A4F2873FAAD7F1 = null; } 
        if ( __A_DocumentationObject_commonDevelopmentObject_DocumentationObject_45DDACEFC2A0C1CA72084C5D2DCACA7DBD913372 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __A_DocumentationObject_commonDevelopmentObject_DocumentationObject_45DDACEFC2A0C1CA72084C5D2DCACA7DBD913372); __A_DocumentationObject_commonDevelopmentObject_DocumentationObject_45DDACEFC2A0C1CA72084C5D2DCACA7DBD913372 = null; } 
        if ( __A_Diagrams_commonDevelopmentObject_Diagrams_45DDACEF343D00986BE441800112F0B99C0A53DC != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.addAll( __A_Diagrams_commonDevelopmentObject_Diagrams_45DDACEF343D00986BE441800112F0B99C0A53DC); __A_Diagrams_commonDevelopmentObject_Diagrams_45DDACEF343D00986BE441800112F0B99C0A53DC = null; } 
        if ( __A_TemplateInstances_commonDevelopmentObject_TemplateInstances_45DDACEF51C64A56A56C444C381C966D26ED4A10 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.addAll( __A_TemplateInstances_commonDevelopmentObject_TemplateInstances_45DDACEF51C64A56A56C444C381C966D26ED4A10); __A_TemplateInstances_commonDevelopmentObject_TemplateInstances_45DDACEF51C64A56A56C444C381C966D26ED4A10 = null; } 
        if ( __A_Settings_Model_Settings_45DDACEF940B9B071FC64A9D3646CF420D8A31EA != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.addAll( __A_Settings_Model_Settings_45DDACEF940B9B071FC64A9D3646CF420D8A31EA); __A_Settings_Model_Settings_45DDACEF940B9B071FC64A9D3646CF420D8A31EA = null; } 
        if ( __A_UsedModels_model_UsedModels_45DDACEFD41F1ABE8DB84B7524DCC3B936FD4EE3 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.addAll( __A_UsedModels_model_UsedModels_45DDACEFD41F1ABE8DB84B7524DCC3B936FD4EE3); __A_UsedModels_model_UsedModels_45DDACEFD41F1ABE8DB84B7524DCC3B936FD4EE3 = null; } 
        if ( __A_ModelRelations_Model_ModelRelations_460CC65CAB8CFC06C5844F0C3AB6E7A43ED13183 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.addAll( __A_ModelRelations_Model_ModelRelations_460CC65CAB8CFC06C5844F0C3AB6E7A43ED13183); __A_ModelRelations_Model_ModelRelations_460CC65CAB8CFC06C5844F0C3AB6E7A43ED13183 = null; } 
        if ( __A_ModelClasses_Model_ModelClasses_460CC65CFB9462CB3E394F932B92F9A913F73E42 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.addAll( __A_ModelClasses_Model_ModelClasses_460CC65CFB9462CB3E394F932B92F9A913F73E42); __A_ModelClasses_Model_ModelClasses_460CC65CFB9462CB3E394F932B92F9A913F73E42 = null; } 
        return result;

    }
    // get the JMI interface
    @SuppressWarnings("unchecked")
    public java.lang.Class<com.sap.ide.metamodel.webdynpro.model.Model> get___JmiInterface() {
        return com.sap.ide.metamodel.webdynpro.model.Model.class;
    }

    // create the wrapper
    @Override
    public com.sap.tc.moin.repository.spi.core.Wrapper<com.sap.ide.metamodel.webdynpro.model.__impl.ModelImpl> createWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, boolean synchronize) {
        return new com.sap.ide.metamodel.webdynpro.model.__impl.ModelWrapper(conn, this, synchronize);
    }
    
}