/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.component.__impl;

public final class ComponentUsageImpl extends com.sap.tc.moin.repository.core.jmi.reflect.RefObjectImpl {

        
    public static final java.util.Map<java.lang.String, java.lang.Integer> FEATURE_IDS;

    static {
        
        FEATURE_IDS = new java.util.HashMap<java.lang.String, java.lang.Integer>(11);
        FEATURE_IDS.put("TemplateInstances", Integer.valueOf(0)); //$NON-NLS-1$
        FEATURE_IDS.put("Diagrams", Integer.valueOf(1)); //$NON-NLS-1$
        FEATURE_IDS.put("DocumentationObject", Integer.valueOf(2)); //$NON-NLS-1$
        FEATURE_IDS.put("name", Integer.valueOf(3)); //$NON-NLS-1$
        FEATURE_IDS.put("UsedComponent", Integer.valueOf(4)); //$NON-NLS-1$
        FEATURE_IDS.put("UsingComponent", Integer.valueOf(5)); //$NON-NLS-1$
        FEATURE_IDS.put("ComponentControllerUsages", Integer.valueOf(6)); //$NON-NLS-1$
        FEATURE_IDS.put("lifecycleControl", Integer.valueOf(7)); //$NON-NLS-1$
    }
    
    
    // variable declarations
    private java.lang.String __name = null;
    private com.sap.ide.metamodel.webdynpro.enums.ComponentLifecycleEnum __lifecycleControl = null;

    // links for multiplicity-1 association ends
    private com.sap.tc.moin.repository.core.EndStorageLink __A_UsedComponent_abstractComponentUsage_UsedComponent_45DDACEED5B7A1217D7945600369F45AE89695D7;
    private com.sap.tc.moin.repository.core.EndStorageLink __A_DocumentationObject_commonDevelopmentObject_DocumentationObject_45DDACEFC2A0C1CA72084C5D2DCACA7DBD913372;

    // links for multiplicity-n association ends
    private java.util.Collection<com.sap.tc.moin.repository.core.EndStorageLink> __A_ComponentControllerUsages_ComponentUsage_ComponentControllerUsages_45DDACEEA57DEE1C8E0640B20F27F21990394DAD;
    private java.util.Collection<com.sap.tc.moin.repository.core.EndStorageLink> __A_Diagrams_commonDevelopmentObject_Diagrams_45DDACEF343D00986BE441800112F0B99C0A53DC;
    private java.util.Collection<com.sap.tc.moin.repository.core.EndStorageLink> __A_TemplateInstances_commonDevelopmentObject_TemplateInstances_45DDACEF51C64A56A56C444C381C966D26ED4A10;

    // default constructor
    public ComponentUsageImpl() {
        super();
    }
    
    // specific constructor
    public ComponentUsageImpl(java.lang.Object workspace, String mofId, com.sap.tc.moin.repository.mmi.reflect.RefPackage immediatePackage, com.sap.tc.moin.repository.mmi.reflect.RefObject metaObject, com.sap.tc.moin.repository.mmi.reflect.RefClass refClass) {
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
    public com.sap.ide.metamodel.webdynpro.enums.ComponentLifecycleEnum getLifecycleControl() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return __lifecycleControl;
    }
    public void setLifecycleControl(com.sap.ide.metamodel.webdynpro.enums.ComponentLifecycleEnum newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeDataTypeAttribute(get___CurrentConnection(), 7, "45DDACEEFE39AFCBE5FB45DA2DF3C752C4976CBC", __lifecycleControl, newValue); //$NON-NLS-1$
    }
    public void setLifecycleControl(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.ide.metamodel.webdynpro.enums.ComponentLifecycleEnum newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeDataTypeAttribute(connection, 7, "45DDACEEFE39AFCBE5FB45DA2DF3C752C4976CBC", __lifecycleControl, newValue); //$NON-NLS-1$
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
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getUsedComponent() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) ___getElementAtOtherLinkEnd( get___CurrentConnection(), __A_UsedComponent_abstractComponentUsage_UsedComponent_45DDACEED5B7A1217D7945600369F45AE89695D7);
       
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getUsedComponent(com.sap.tc.moin.repository.core.CoreConnection connection) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) ___getElementAtOtherLinkEnd( connection, __A_UsedComponent_abstractComponentUsage_UsedComponent_45DDACEED5B7A1217D7945600369F45AE89695D7);
       
    }
    public void setUsedComponent(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeReference(get___CurrentConnection(), /* mofId of association */ "45DDACEE53461AAA6C25402117D69D6E9E8EB607", /* mofId of reference */ "45DDACEEDF2F2BE85E8E463A34FBC782E994F77B" , newValue, 0); //$NON-NLS-1$ //$NON-NLS-2$

    }
    public void setUsedComponent(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeReference(connection, /* mofId of association */ "45DDACEE53461AAA6C25402117D69D6E9E8EB607", /* mofId of reference */ "45DDACEEDF2F2BE85E8E463A34FBC782E994F77B" , newValue, 0); //$NON-NLS-1$ //$NON-NLS-2$

    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getUsingComponent() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        com.sap.tc.moin.repository.core.EndAndMetaObject endAndMetaObject = get___EndAndMetaObject( "45DDACEE076747EF2B01420E07C4E8A3C53021ED" /* attribute or association */, 1 ); //$NON-NLS-1$
        return (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) get___CompositeParentForEndAndMetaObject( get___CurrentConnection(), endAndMetaObject );   
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getUsingComponent(com.sap.tc.moin.repository.core.CoreConnection connection) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        com.sap.tc.moin.repository.core.EndAndMetaObject endAndMetaObject = get___EndAndMetaObject( "45DDACEE076747EF2B01420E07C4E8A3C53021ED" /* attribute or association */, 1 ); //$NON-NLS-1$
        return (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) get___CompositeParentForEndAndMetaObject( connection, endAndMetaObject );   
    }
    public void setUsingComponent(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeReference(get___CurrentConnection(), /* mofId of association */ "45DDACEE076747EF2B01420E07C4E8A3C53021ED", /* mofId of reference */ "45DDACEE2C13FC86227744B928C8F39DEBBA5C01" , newValue, 1); //$NON-NLS-1$ //$NON-NLS-2$

    }
    public void setUsingComponent(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeReference(connection, /* mofId of association */ "45DDACEE076747EF2B01420E07C4E8A3C53021ED", /* mofId of reference */ "45DDACEE2C13FC86227744B928C8F39DEBBA5C01" , newValue, 1); //$NON-NLS-1$ //$NON-NLS-2$

    }
    public java.util.List getComponentControllerUsages() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (java.util.List) ___getElementsAtOtherLinkEnd( get___CurrentConnection(), this, get___EndAndMetaObject( "45DDACEEBB2883DA45574F52092CAFD8B8325790" /* attribute or association */, 0 ) ) ; //$NON-NLS-1$
       
    }
    public java.util.List getComponentControllerUsages(com.sap.tc.moin.repository.core.CoreConnection connection) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (java.util.List) ___getElementsAtOtherLinkEnd( connection, this, get___EndAndMetaObject( "45DDACEEBB2883DA45574F52092CAFD8B8325790" /* attribute or association */, 0 ) ) ; //$NON-NLS-1$
       
    }



    // methods for internal attribute setter
    private void set__Name(java.lang.String newValue) {
            __name = newValue;
    }

    private void set__LifecycleControl(com.sap.ide.metamodel.webdynpro.enums.ComponentLifecycleEnum newValue) {
            __lifecycleControl = newValue;
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
                result = getUsedComponent(connection);
                break;
            case 5: 
                result = getUsingComponent(connection);
                break;
            case 6: 
                result = getComponentControllerUsages(connection);
                break;
            case 7: 
                result = getLifecycleControl();
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
                ___changeReference(connection, "45DDACEE53461AAA6C25402117D69D6E9E8EB607" /* mofId of association */, "45DDACEEDF2F2BE85E8E463A34FBC782E994F77B" /* mofId of reference */, value, 0); //$NON-NLS-1$ //$NON-NLS-2$     
                break;
                    
            case 5:
                ___changeReference(connection, "45DDACEE076747EF2B01420E07C4E8A3C53021ED" /* mofId of association */, "45DDACEE2C13FC86227744B928C8F39DEBBA5C01" /* mofId of reference */, value, 1); //$NON-NLS-1$ //$NON-NLS-2$     
                break;
                    
            case 6:
                ___changeReference(connection, "45DDACEEBB2883DA45574F52092CAFD8B8325790" /* mofId of association */, "45DDACEEB4308256222049C025D8C3BE4B4A7DFF" /* mofId of reference */, value, 0); //$NON-NLS-1$ //$NON-NLS-2$     
                break;
                    
            case 7:
                ___changeDataTypeAttribute(connection, 7, "45DDACEEFE39AFCBE5FB45DA2DF3C752C4976CBC", __lifecycleControl, value); //$NON-NLS-1$
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
                set__LifecycleControl((com.sap.ide.metamodel.webdynpro.enums.ComponentLifecycleEnum) value);     
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
                set__LifecycleControl((com.sap.ide.metamodel.webdynpro.enums.ComponentLifecycleEnum) value);     
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
                set__LifecycleControl((com.sap.ide.metamodel.webdynpro.enums.ComponentLifecycleEnum) value);     
                break;
            default:
                throw new com.sap.tc.moin.repository.mmi.reflect.InvalidCallException(featureName, refMetaObject(), "addOrSet___Value(String)"); //$NON-NLS-1$
        }
    }    



    public void set___AssociationLink( String associationEndMofId, com.sap.tc.moin.repository.core.EndStorageLink value ) {
        if ( associationEndMofId == "45DDACEED5B7A1217D7945600369F45AE89695D7" ) { __A_UsedComponent_abstractComponentUsage_UsedComponent_45DDACEED5B7A1217D7945600369F45AE89695D7 = value; return; } //$NON-NLS-1$ 
        if ( associationEndMofId == "45DDACEFC2A0C1CA72084C5D2DCACA7DBD913372" ) { __A_DocumentationObject_commonDevelopmentObject_DocumentationObject_45DDACEFC2A0C1CA72084C5D2DCACA7DBD913372 = value; return; } //$NON-NLS-1$ 
    }
    
    public com.sap.tc.moin.repository.core.EndStorageLink get___AssociationLink( String associationEndMofId ) {
        if ( associationEndMofId == "45DDACEED5B7A1217D7945600369F45AE89695D7" ) { return __A_UsedComponent_abstractComponentUsage_UsedComponent_45DDACEED5B7A1217D7945600369F45AE89695D7; } //$NON-NLS-1$ 
        if ( associationEndMofId == "45DDACEFC2A0C1CA72084C5D2DCACA7DBD913372" ) { return __A_DocumentationObject_commonDevelopmentObject_DocumentationObject_45DDACEFC2A0C1CA72084C5D2DCACA7DBD913372; } //$NON-NLS-1$ 
        return null;
    }
    public java.util.List<com.sap.tc.moin.repository.core.EndStorageLink> get___AllStoredLinks( ) {
        java.util.List<com.sap.tc.moin.repository.core.EndStorageLink> result = null;
        if ( __A_UsedComponent_abstractComponentUsage_UsedComponent_45DDACEED5B7A1217D7945600369F45AE89695D7 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __A_UsedComponent_abstractComponentUsage_UsedComponent_45DDACEED5B7A1217D7945600369F45AE89695D7); } 
        if ( __A_DocumentationObject_commonDevelopmentObject_DocumentationObject_45DDACEFC2A0C1CA72084C5D2DCACA7DBD913372 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __A_DocumentationObject_commonDevelopmentObject_DocumentationObject_45DDACEFC2A0C1CA72084C5D2DCACA7DBD913372); } 
        if ( __A_ComponentControllerUsages_ComponentUsage_ComponentControllerUsages_45DDACEEA57DEE1C8E0640B20F27F21990394DAD != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.addAll( __A_ComponentControllerUsages_ComponentUsage_ComponentControllerUsages_45DDACEEA57DEE1C8E0640B20F27F21990394DAD); } 
        if ( __A_Diagrams_commonDevelopmentObject_Diagrams_45DDACEF343D00986BE441800112F0B99C0A53DC != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.addAll( __A_Diagrams_commonDevelopmentObject_Diagrams_45DDACEF343D00986BE441800112F0B99C0A53DC); } 
        if ( __A_TemplateInstances_commonDevelopmentObject_TemplateInstances_45DDACEF51C64A56A56C444C381C966D26ED4A10 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.addAll( __A_TemplateInstances_commonDevelopmentObject_TemplateInstances_45DDACEF51C64A56A56C444C381C966D26ED4A10); } 
        return result;

    }

    public java.util.List<com.sap.tc.moin.repository.core.EndStorageLink> get___AllStoredAssociationLinks( ) {
        java.util.List<com.sap.tc.moin.repository.core.EndStorageLink> result = null;
        if ( __A_UsedComponent_abstractComponentUsage_UsedComponent_45DDACEED5B7A1217D7945600369F45AE89695D7 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __A_UsedComponent_abstractComponentUsage_UsedComponent_45DDACEED5B7A1217D7945600369F45AE89695D7); } 
        if ( __A_DocumentationObject_commonDevelopmentObject_DocumentationObject_45DDACEFC2A0C1CA72084C5D2DCACA7DBD913372 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __A_DocumentationObject_commonDevelopmentObject_DocumentationObject_45DDACEFC2A0C1CA72084C5D2DCACA7DBD913372); } 
        if ( __A_ComponentControllerUsages_ComponentUsage_ComponentControllerUsages_45DDACEEA57DEE1C8E0640B20F27F21990394DAD != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.addAll( __A_ComponentControllerUsages_ComponentUsage_ComponentControllerUsages_45DDACEEA57DEE1C8E0640B20F27F21990394DAD); } 
        if ( __A_Diagrams_commonDevelopmentObject_Diagrams_45DDACEF343D00986BE441800112F0B99C0A53DC != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.addAll( __A_Diagrams_commonDevelopmentObject_Diagrams_45DDACEF343D00986BE441800112F0B99C0A53DC); } 
        if ( __A_TemplateInstances_commonDevelopmentObject_TemplateInstances_45DDACEF51C64A56A56C444C381C966D26ED4A10 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.addAll( __A_TemplateInstances_commonDevelopmentObject_TemplateInstances_45DDACEF51C64A56A56C444C381C966D26ED4A10); } 
        return result;

    }
    public java.util.Collection<com.sap.tc.moin.repository.core.EndStorageLink> get___AssociationLinks( String associationEndMofId ) {
        if ( associationEndMofId == "45DDACEEA57DEE1C8E0640B20F27F21990394DAD" ) { return __A_ComponentControllerUsages_ComponentUsage_ComponentControllerUsages_45DDACEEA57DEE1C8E0640B20F27F21990394DAD; } //$NON-NLS-1$ 
        if ( associationEndMofId == "45DDACEF343D00986BE441800112F0B99C0A53DC" ) { return __A_Diagrams_commonDevelopmentObject_Diagrams_45DDACEF343D00986BE441800112F0B99C0A53DC; } //$NON-NLS-1$ 
        if ( associationEndMofId == "45DDACEF51C64A56A56C444C381C966D26ED4A10" ) { return __A_TemplateInstances_commonDevelopmentObject_TemplateInstances_45DDACEF51C64A56A56C444C381C966D26ED4A10; } //$NON-NLS-1$ 
        return null;
    }

    public void set___AssociationLinks( java.util.Collection<com.sap.tc.moin.repository.core.EndStorageLink> links, String associationEndMofId ) {
        if ( associationEndMofId == "45DDACEEA57DEE1C8E0640B20F27F21990394DAD" ) { __A_ComponentControllerUsages_ComponentUsage_ComponentControllerUsages_45DDACEEA57DEE1C8E0640B20F27F21990394DAD = links; return; } //$NON-NLS-1$ 
        if ( associationEndMofId == "45DDACEF343D00986BE441800112F0B99C0A53DC" ) { __A_Diagrams_commonDevelopmentObject_Diagrams_45DDACEF343D00986BE441800112F0B99C0A53DC = links; return; } //$NON-NLS-1$ 
        if ( associationEndMofId == "45DDACEF51C64A56A56C444C381C966D26ED4A10" ) { __A_TemplateInstances_commonDevelopmentObject_TemplateInstances_45DDACEF51C64A56A56C444C381C966D26ED4A10 = links; return; } //$NON-NLS-1$ 
    }    
    public java.util.List<com.sap.tc.moin.repository.core.EndStorageLink> clear___AllLinks( ) {
        reset___CompositeParentLink( );
        java.util.List<com.sap.tc.moin.repository.core.EndStorageLink> result = null;
        if ( __A_UsedComponent_abstractComponentUsage_UsedComponent_45DDACEED5B7A1217D7945600369F45AE89695D7 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __A_UsedComponent_abstractComponentUsage_UsedComponent_45DDACEED5B7A1217D7945600369F45AE89695D7); __A_UsedComponent_abstractComponentUsage_UsedComponent_45DDACEED5B7A1217D7945600369F45AE89695D7 = null; } 
        if ( __A_DocumentationObject_commonDevelopmentObject_DocumentationObject_45DDACEFC2A0C1CA72084C5D2DCACA7DBD913372 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __A_DocumentationObject_commonDevelopmentObject_DocumentationObject_45DDACEFC2A0C1CA72084C5D2DCACA7DBD913372); __A_DocumentationObject_commonDevelopmentObject_DocumentationObject_45DDACEFC2A0C1CA72084C5D2DCACA7DBD913372 = null; } 
        if ( __A_ComponentControllerUsages_ComponentUsage_ComponentControllerUsages_45DDACEEA57DEE1C8E0640B20F27F21990394DAD != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.addAll( __A_ComponentControllerUsages_ComponentUsage_ComponentControllerUsages_45DDACEEA57DEE1C8E0640B20F27F21990394DAD); __A_ComponentControllerUsages_ComponentUsage_ComponentControllerUsages_45DDACEEA57DEE1C8E0640B20F27F21990394DAD = null; } 
        if ( __A_Diagrams_commonDevelopmentObject_Diagrams_45DDACEF343D00986BE441800112F0B99C0A53DC != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.addAll( __A_Diagrams_commonDevelopmentObject_Diagrams_45DDACEF343D00986BE441800112F0B99C0A53DC); __A_Diagrams_commonDevelopmentObject_Diagrams_45DDACEF343D00986BE441800112F0B99C0A53DC = null; } 
        if ( __A_TemplateInstances_commonDevelopmentObject_TemplateInstances_45DDACEF51C64A56A56C444C381C966D26ED4A10 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.addAll( __A_TemplateInstances_commonDevelopmentObject_TemplateInstances_45DDACEF51C64A56A56C444C381C966D26ED4A10); __A_TemplateInstances_commonDevelopmentObject_TemplateInstances_45DDACEF51C64A56A56C444C381C966D26ED4A10 = null; } 
        return result;

    }
    // get the JMI interface
    @SuppressWarnings("unchecked")
    public java.lang.Class<com.sap.ide.metamodel.webdynpro.component.ComponentUsage> get___JmiInterface() {
        return com.sap.ide.metamodel.webdynpro.component.ComponentUsage.class;
    }

    // create the wrapper
    @Override
    public com.sap.tc.moin.repository.spi.core.Wrapper<com.sap.ide.metamodel.webdynpro.component.__impl.ComponentUsageImpl> createWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, boolean synchronize) {
        return new com.sap.ide.metamodel.webdynpro.component.__impl.ComponentUsageWrapper(conn, this, synchronize);
    }
    
}