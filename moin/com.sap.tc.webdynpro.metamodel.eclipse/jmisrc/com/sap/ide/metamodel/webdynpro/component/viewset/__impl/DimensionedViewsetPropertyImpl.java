/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.component.viewset.__impl;

public final class DimensionedViewsetPropertyImpl extends com.sap.tc.moin.repository.core.jmi.reflect.RefObjectImpl {

        
    public static final java.util.Map<java.lang.String, java.lang.Integer> FEATURE_IDS;

    static {
        
        FEATURE_IDS = new java.util.HashMap<java.lang.String, java.lang.Integer>(16);
        FEATURE_IDS.put("TemplateInstances", Integer.valueOf(0)); //$NON-NLS-1$
        FEATURE_IDS.put("Diagrams", Integer.valueOf(1)); //$NON-NLS-1$
        FEATURE_IDS.put("DocumentationObject", Integer.valueOf(2)); //$NON-NLS-1$
        FEATURE_IDS.put("name", Integer.valueOf(3)); //$NON-NLS-1$
        FEATURE_IDS.put("Viewset", Integer.valueOf(4)); //$NON-NLS-1$
        FEATURE_IDS.put("ViewsetPropertyDefinition", Integer.valueOf(5)); //$NON-NLS-1$
        FEATURE_IDS.put("value", Integer.valueOf(6)); //$NON-NLS-1$
        FEATURE_IDS.put("translatedValue", Integer.valueOf(7)); //$NON-NLS-1$
        FEATURE_IDS.put("x", Integer.valueOf(8)); //$NON-NLS-1$
        FEATURE_IDS.put("y", Integer.valueOf(9)); //$NON-NLS-1$
        FEATURE_IDS.put("z", Integer.valueOf(10)); //$NON-NLS-1$
        FEATURE_IDS.put("alias", Integer.valueOf(11)); //$NON-NLS-1$
    }
    
    
    // variable declarations
    private java.lang.String __name = null;
    private java.lang.String __value = null;
    private int __x = 0;
    private int __y = 0;
    private int __z = 0;
    private java.lang.String __alias = null;

    // links for multiplicity-1 association ends
    private com.sap.tc.moin.repository.core.EndStorageLink __A_ViewsetPropertyDefinition_viewsetProperty_ViewsetPropertyDefinition_45DDACEEACE25CC64B874EF10DCB98140F9C304B;
    private com.sap.tc.moin.repository.core.EndStorageLink __A_DocumentationObject_commonDevelopmentObject_DocumentationObject_45DDACEFC2A0C1CA72084C5D2DCACA7DBD913372;

    // links for multiplicity-n association ends
    private java.util.Collection<com.sap.tc.moin.repository.core.EndStorageLink> __A_Diagrams_commonDevelopmentObject_Diagrams_45DDACEF343D00986BE441800112F0B99C0A53DC;
    private java.util.Collection<com.sap.tc.moin.repository.core.EndStorageLink> __A_TemplateInstances_commonDevelopmentObject_TemplateInstances_45DDACEF51C64A56A56C444C381C966D26ED4A10;

    // links for multiplicity-1 object-valued attributes
    private com.sap.tc.moin.repository.core.EndStorageLink __translatedValue;

    // default constructor
    public DimensionedViewsetPropertyImpl() {
        super();
    }
    
    // specific constructor
    public DimensionedViewsetPropertyImpl(java.lang.Object workspace, String mofId, com.sap.tc.moin.repository.mmi.reflect.RefPackage immediatePackage, com.sap.tc.moin.repository.mmi.reflect.RefObject metaObject, com.sap.tc.moin.repository.mmi.reflect.RefClass refClass) {
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
    public java.lang.String getValue() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return __value;
    }
    public void setValue(java.lang.String newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeDataTypeAttribute(get___CurrentConnection(), 6, "45DDACEE8FF720FFCB474A9212889F6AEC948965", __value, newValue); //$NON-NLS-1$
    }
    public void setValue(com.sap.tc.moin.repository.core.CoreConnection connection, java.lang.String newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeDataTypeAttribute(connection, 6, "45DDACEE8FF720FFCB474A9212889F6AEC948965", __value, newValue); //$NON-NLS-1$
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getTranslatedValue() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) ___getElementAtOtherLinkEnd( get___CurrentConnection(), __translatedValue);
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getTranslatedValue(com.sap.tc.moin.repository.core.CoreConnection connection) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) ___getElementAtOtherLinkEnd( connection, __translatedValue);
    }
    public void setTranslatedValue(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeObjectAttribute(get___CurrentConnection(), "45DDACEED117991353F8445A10B482784F275C1D", newValue); //$NON-NLS-1$
    }
    public void setTranslatedValue(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeObjectAttribute(connection, "45DDACEED117991353F8445A10B482784F275C1D", newValue); //$NON-NLS-1$
    }
    public int getX() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return __x;
    }
    public void setX(int newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeDataTypeAttribute(get___CurrentConnection(), 8, "45DDACEE4C1AD8A508874A89372DF7CBB55BFE79", __x, newValue); //$NON-NLS-1$
    }
    public void setX(com.sap.tc.moin.repository.core.CoreConnection connection, int newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeDataTypeAttribute(connection, 8, "45DDACEE4C1AD8A508874A89372DF7CBB55BFE79", __x, newValue); //$NON-NLS-1$
    }
    public int getY() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return __y;
    }
    public void setY(int newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeDataTypeAttribute(get___CurrentConnection(), 9, "45DDACEEA2B8F5DBB99349BA2EABED8F816BE72D", __y, newValue); //$NON-NLS-1$
    }
    public void setY(com.sap.tc.moin.repository.core.CoreConnection connection, int newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeDataTypeAttribute(connection, 9, "45DDACEEA2B8F5DBB99349BA2EABED8F816BE72D", __y, newValue); //$NON-NLS-1$
    }
    public int getZ() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return __z;
    }
    public void setZ(int newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeDataTypeAttribute(get___CurrentConnection(), 10, "45DDACEE34A3BDAEC0DC405C201AA2514F19C28C", __z, newValue); //$NON-NLS-1$
    }
    public void setZ(com.sap.tc.moin.repository.core.CoreConnection connection, int newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeDataTypeAttribute(connection, 10, "45DDACEE34A3BDAEC0DC405C201AA2514F19C28C", __z, newValue); //$NON-NLS-1$
    }
    public java.lang.String getAlias() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return __alias;
    }
    public void setAlias(java.lang.String newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeDataTypeAttribute(get___CurrentConnection(), 11, "45DDACEED43A190E2E974D470D5583A7D6A2408D", __alias, newValue); //$NON-NLS-1$
    }
    public void setAlias(com.sap.tc.moin.repository.core.CoreConnection connection, java.lang.String newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeDataTypeAttribute(connection, 11, "45DDACEED43A190E2E974D470D5583A7D6A2408D", __alias, newValue); //$NON-NLS-1$
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
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getViewset() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        com.sap.tc.moin.repository.core.EndAndMetaObject endAndMetaObject = get___EndAndMetaObject( "45DDACEE951AC67E7F0B40490230C565B22A6367" /* attribute or association */, 1 ); //$NON-NLS-1$
        return (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) get___CompositeParentForEndAndMetaObject( get___CurrentConnection(), endAndMetaObject );   
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getViewset(com.sap.tc.moin.repository.core.CoreConnection connection) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        com.sap.tc.moin.repository.core.EndAndMetaObject endAndMetaObject = get___EndAndMetaObject( "45DDACEE951AC67E7F0B40490230C565B22A6367" /* attribute or association */, 1 ); //$NON-NLS-1$
        return (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) get___CompositeParentForEndAndMetaObject( connection, endAndMetaObject );   
    }
    public void setViewset(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeReference(get___CurrentConnection(), /* mofId of association */ "45DDACEE951AC67E7F0B40490230C565B22A6367", /* mofId of reference */ "45DDACEE35B0B74EC09645E9377FBC3C0D5922E4" , newValue, 1); //$NON-NLS-1$ //$NON-NLS-2$

    }
    public void setViewset(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeReference(connection, /* mofId of association */ "45DDACEE951AC67E7F0B40490230C565B22A6367", /* mofId of reference */ "45DDACEE35B0B74EC09645E9377FBC3C0D5922E4" , newValue, 1); //$NON-NLS-1$ //$NON-NLS-2$

    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getViewsetPropertyDefinition() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) ___getElementAtOtherLinkEnd( get___CurrentConnection(), __A_ViewsetPropertyDefinition_viewsetProperty_ViewsetPropertyDefinition_45DDACEEACE25CC64B874EF10DCB98140F9C304B);
       
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getViewsetPropertyDefinition(com.sap.tc.moin.repository.core.CoreConnection connection) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) ___getElementAtOtherLinkEnd( connection, __A_ViewsetPropertyDefinition_viewsetProperty_ViewsetPropertyDefinition_45DDACEEACE25CC64B874EF10DCB98140F9C304B);
       
    }
    public void setViewsetPropertyDefinition(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeReference(get___CurrentConnection(), /* mofId of association */ "45DDACEE66850EB9B720428922D7CD3A97F0ABBE", /* mofId of reference */ "45DDACEE993D8E2AD7AD4EE522C4EAC5C37258A9" , newValue, 0); //$NON-NLS-1$ //$NON-NLS-2$

    }
    public void setViewsetPropertyDefinition(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeReference(connection, /* mofId of association */ "45DDACEE66850EB9B720428922D7CD3A97F0ABBE", /* mofId of reference */ "45DDACEE993D8E2AD7AD4EE522C4EAC5C37258A9" , newValue, 0); //$NON-NLS-1$ //$NON-NLS-2$

    }

    // methods for internal attribute setter
    private void set__Name(java.lang.String newValue) {
            __name = newValue;
    }

    private void set__Value(java.lang.String newValue) {
            __value = newValue;
    }

    private void set__TranslatedValue(com.sap.tc.moin.repository.core.CoreSession session, java.lang.Object newValue) {
        ___loadLinks(session, "45DDACEED117991353F8445A10B482784F275C1D" /* "translatedValue" */, newValue, 1); //$NON-NLS-1$ //$NON-NLS-2$
    }

    private void set__X(int newValue) {
            __x = newValue;
    }

    private void set__Y(int newValue) {
            __y = newValue;
    }

    private void set__Z(int newValue) {
            __z = newValue;
    }

    private void set__Alias(java.lang.String newValue) {
            __alias = newValue;
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
                result = getViewset(connection);
                break;
            case 5: 
                result = getViewsetPropertyDefinition(connection);
                break;
            case 6: 
                result = getValue();
                break;
            case 7: 
                result = getTranslatedValue(connection);
                break;
            case 8: 
                result = getX();
                break;
            case 9: 
                result = getY();
                break;
            case 10: 
                result = getZ();
                break;
            case 11: 
                result = getAlias();
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
                ___changeReference(connection, "45DDACEE951AC67E7F0B40490230C565B22A6367" /* mofId of association */, "45DDACEE35B0B74EC09645E9377FBC3C0D5922E4" /* mofId of reference */, value, 1); //$NON-NLS-1$ //$NON-NLS-2$     
                break;
                    
            case 5:
                ___changeReference(connection, "45DDACEE66850EB9B720428922D7CD3A97F0ABBE" /* mofId of association */, "45DDACEE993D8E2AD7AD4EE522C4EAC5C37258A9" /* mofId of reference */, value, 0); //$NON-NLS-1$ //$NON-NLS-2$     
                break;
                    
            case 6:
                ___changeDataTypeAttribute(connection, 6, "45DDACEE8FF720FFCB474A9212889F6AEC948965", __value, value); //$NON-NLS-1$
                break;
                    
            case 7:
                ___changeObjectAttribute(connection, "45DDACEED117991353F8445A10B482784F275C1D", value); //$NON-NLS-1$
                break;
                    
            case 8:
                ___changeDataTypeAttribute(connection, 8, "45DDACEE4C1AD8A508874A89372DF7CBB55BFE79", __x, value); //$NON-NLS-1$
                break;
                    
            case 9:
                ___changeDataTypeAttribute(connection, 9, "45DDACEEA2B8F5DBB99349BA2EABED8F816BE72D", __y, value); //$NON-NLS-1$
                break;
                    
            case 10:
                ___changeDataTypeAttribute(connection, 10, "45DDACEE34A3BDAEC0DC405C201AA2514F19C28C", __z, value); //$NON-NLS-1$
                break;
                    
            case 11:
                ___changeDataTypeAttribute(connection, 11, "45DDACEED43A190E2E974D470D5583A7D6A2408D", __alias, value); //$NON-NLS-1$
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
            case 6:
                set__Value((java.lang.String) value);     
                break;
            case 7:
                set__TranslatedValue(session, value);     
                break;
            case 8:
                set__X((java.lang.Integer) value);     
                break;
            case 9:
                set__Y((java.lang.Integer) value);     
                break;
            case 10:
                set__Z((java.lang.Integer) value);     
                break;
            case 11:
                set__Alias((java.lang.String) value);     
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
            case 6:
                set__Value((java.lang.String) value);     
                break;
            case 7:
                set__TranslatedValue(session, value);     
                break;
            case 8:
                set__X((java.lang.Integer) value);     
                break;
            case 9:
                set__Y((java.lang.Integer) value);     
                break;
            case 10:
                set__Z((java.lang.Integer) value);     
                break;
            case 11:
                set__Alias((java.lang.String) value);     
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
            case 6:
                set__Value((java.lang.String) value);     
                break;
            case 7:
                set__TranslatedValue(session, value);         
                break;
            case 8:
                set__X((java.lang.Integer) value);     
                break;
            case 9:
                set__Y((java.lang.Integer) value);     
                break;
            case 10:
                set__Z((java.lang.Integer) value);     
                break;
            case 11:
                set__Alias((java.lang.String) value);     
                break;
            default:
                throw new com.sap.tc.moin.repository.mmi.reflect.InvalidCallException(featureName, refMetaObject(), "addOrSet___Value(String)"); //$NON-NLS-1$
        }
    }    



    public void set___AssociationLink( String associationEndMofId, com.sap.tc.moin.repository.core.EndStorageLink value ) {
        if ( associationEndMofId == "45DDACEEACE25CC64B874EF10DCB98140F9C304B" ) { __A_ViewsetPropertyDefinition_viewsetProperty_ViewsetPropertyDefinition_45DDACEEACE25CC64B874EF10DCB98140F9C304B = value; return; } //$NON-NLS-1$ 
        if ( associationEndMofId == "45DDACEFC2A0C1CA72084C5D2DCACA7DBD913372" ) { __A_DocumentationObject_commonDevelopmentObject_DocumentationObject_45DDACEFC2A0C1CA72084C5D2DCACA7DBD913372 = value; return; } //$NON-NLS-1$ 
    }
    
    public com.sap.tc.moin.repository.core.EndStorageLink get___AssociationLink( String associationEndMofId ) {
        if ( associationEndMofId == "45DDACEEACE25CC64B874EF10DCB98140F9C304B" ) { return __A_ViewsetPropertyDefinition_viewsetProperty_ViewsetPropertyDefinition_45DDACEEACE25CC64B874EF10DCB98140F9C304B; } //$NON-NLS-1$ 
        if ( associationEndMofId == "45DDACEFC2A0C1CA72084C5D2DCACA7DBD913372" ) { return __A_DocumentationObject_commonDevelopmentObject_DocumentationObject_45DDACEFC2A0C1CA72084C5D2DCACA7DBD913372; } //$NON-NLS-1$ 
        return null;
    }
    public void set___AttributeLink( String attributeMofId, com.sap.tc.moin.repository.core.EndStorageLink value ) {
        if ( attributeMofId == "45DDACEED117991353F8445A10B482784F275C1D" ) { __translatedValue = value; return; } //$NON-NLS-1$ 
    }

    public com.sap.tc.moin.repository.core.EndStorageLink get___AttributeLink( String attributeMofId ) {
        if ( attributeMofId == "45DDACEED117991353F8445A10B482784F275C1D" ) { return __translatedValue; } //$NON-NLS-1$ 
        return null;
    }
    public java.util.List<com.sap.tc.moin.repository.core.EndStorageLink> get___AllStoredLinks( ) {
        java.util.List<com.sap.tc.moin.repository.core.EndStorageLink> result = null;
        if ( __A_ViewsetPropertyDefinition_viewsetProperty_ViewsetPropertyDefinition_45DDACEEACE25CC64B874EF10DCB98140F9C304B != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __A_ViewsetPropertyDefinition_viewsetProperty_ViewsetPropertyDefinition_45DDACEEACE25CC64B874EF10DCB98140F9C304B); } 
        if ( __A_DocumentationObject_commonDevelopmentObject_DocumentationObject_45DDACEFC2A0C1CA72084C5D2DCACA7DBD913372 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __A_DocumentationObject_commonDevelopmentObject_DocumentationObject_45DDACEFC2A0C1CA72084C5D2DCACA7DBD913372); } 
        if ( __A_Diagrams_commonDevelopmentObject_Diagrams_45DDACEF343D00986BE441800112F0B99C0A53DC != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.addAll( __A_Diagrams_commonDevelopmentObject_Diagrams_45DDACEF343D00986BE441800112F0B99C0A53DC); } 
        if ( __A_TemplateInstances_commonDevelopmentObject_TemplateInstances_45DDACEF51C64A56A56C444C381C966D26ED4A10 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.addAll( __A_TemplateInstances_commonDevelopmentObject_TemplateInstances_45DDACEF51C64A56A56C444C381C966D26ED4A10); } 
        if ( __translatedValue != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __translatedValue); } 
        return result;

    }

    public java.util.List<com.sap.tc.moin.repository.core.EndStorageLink> get___AllStoredAssociationLinks( ) {
        java.util.List<com.sap.tc.moin.repository.core.EndStorageLink> result = null;
        if ( __A_ViewsetPropertyDefinition_viewsetProperty_ViewsetPropertyDefinition_45DDACEEACE25CC64B874EF10DCB98140F9C304B != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __A_ViewsetPropertyDefinition_viewsetProperty_ViewsetPropertyDefinition_45DDACEEACE25CC64B874EF10DCB98140F9C304B); } 
        if ( __A_DocumentationObject_commonDevelopmentObject_DocumentationObject_45DDACEFC2A0C1CA72084C5D2DCACA7DBD913372 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __A_DocumentationObject_commonDevelopmentObject_DocumentationObject_45DDACEFC2A0C1CA72084C5D2DCACA7DBD913372); } 
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
        if ( __A_ViewsetPropertyDefinition_viewsetProperty_ViewsetPropertyDefinition_45DDACEEACE25CC64B874EF10DCB98140F9C304B != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __A_ViewsetPropertyDefinition_viewsetProperty_ViewsetPropertyDefinition_45DDACEEACE25CC64B874EF10DCB98140F9C304B); __A_ViewsetPropertyDefinition_viewsetProperty_ViewsetPropertyDefinition_45DDACEEACE25CC64B874EF10DCB98140F9C304B = null; } 
        if ( __A_DocumentationObject_commonDevelopmentObject_DocumentationObject_45DDACEFC2A0C1CA72084C5D2DCACA7DBD913372 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __A_DocumentationObject_commonDevelopmentObject_DocumentationObject_45DDACEFC2A0C1CA72084C5D2DCACA7DBD913372); __A_DocumentationObject_commonDevelopmentObject_DocumentationObject_45DDACEFC2A0C1CA72084C5D2DCACA7DBD913372 = null; } 
        if ( __A_Diagrams_commonDevelopmentObject_Diagrams_45DDACEF343D00986BE441800112F0B99C0A53DC != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.addAll( __A_Diagrams_commonDevelopmentObject_Diagrams_45DDACEF343D00986BE441800112F0B99C0A53DC); __A_Diagrams_commonDevelopmentObject_Diagrams_45DDACEF343D00986BE441800112F0B99C0A53DC = null; } 
        if ( __A_TemplateInstances_commonDevelopmentObject_TemplateInstances_45DDACEF51C64A56A56C444C381C966D26ED4A10 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.addAll( __A_TemplateInstances_commonDevelopmentObject_TemplateInstances_45DDACEF51C64A56A56C444C381C966D26ED4A10); __A_TemplateInstances_commonDevelopmentObject_TemplateInstances_45DDACEF51C64A56A56C444C381C966D26ED4A10 = null; } 
        if ( __translatedValue != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __translatedValue); __translatedValue = null; } 
        return result;

    }
    // get the JMI interface
    @SuppressWarnings("unchecked")
    public java.lang.Class<com.sap.ide.metamodel.webdynpro.component.viewset.DimensionedViewsetProperty> get___JmiInterface() {
        return com.sap.ide.metamodel.webdynpro.component.viewset.DimensionedViewsetProperty.class;
    }

    // create the wrapper
    @Override
    public com.sap.tc.moin.repository.spi.core.Wrapper<com.sap.ide.metamodel.webdynpro.component.viewset.__impl.DimensionedViewsetPropertyImpl> createWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, boolean synchronize) {
        return new com.sap.ide.metamodel.webdynpro.component.viewset.__impl.DimensionedViewsetPropertyWrapper(conn, this, synchronize);
    }
    
}