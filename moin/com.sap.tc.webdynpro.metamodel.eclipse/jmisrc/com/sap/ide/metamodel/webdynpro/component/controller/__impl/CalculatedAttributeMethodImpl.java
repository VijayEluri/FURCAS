/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.component.controller.__impl;

public final class CalculatedAttributeMethodImpl extends com.sap.tc.moin.repository.core.jmi.reflect.RefObjectImpl {

        
    public static final java.util.Map<java.lang.String, java.lang.Integer> FEATURE_IDS;

    static {
        
        FEATURE_IDS = new java.util.HashMap<java.lang.String, java.lang.Integer>(12);
        FEATURE_IDS.put("TemplateInstances", Integer.valueOf(0)); //$NON-NLS-1$
        FEATURE_IDS.put("Diagrams", Integer.valueOf(1)); //$NON-NLS-1$
        FEATURE_IDS.put("DocumentationObject", Integer.valueOf(2)); //$NON-NLS-1$
        FEATURE_IDS.put("name", Integer.valueOf(3)); //$NON-NLS-1$
        FEATURE_IDS.put("Parameters", Integer.valueOf(4)); //$NON-NLS-1$
        FEATURE_IDS.put("ReturnType", Integer.valueOf(5)); //$NON-NLS-1$
        FEATURE_IDS.put("NativeType", Integer.valueOf(6)); //$NON-NLS-1$
        FEATURE_IDS.put("visibility", Integer.valueOf(7)); //$NON-NLS-1$
        FEATURE_IDS.put("codeBody", Integer.valueOf(8)); //$NON-NLS-1$
    }
    
    
    // variable declarations
    private java.lang.String __name = null;
    private com.sap.ide.metamodel.webdynpro.enums.VisibilityEnum __visibility = null;
    private java.lang.String __codeBody = null;

    // links for multiplicity-1 association ends
    private com.sap.tc.moin.repository.core.EndStorageLink __A_ReturnType_procedure_ReturnType_45DDACEE88CA5EC2D0D747AA3415D27FEC6226CD;
    private com.sap.tc.moin.repository.core.EndStorageLink __A_DocumentationObject_commonDevelopmentObject_DocumentationObject_45DDACEFC2A0C1CA72084C5D2DCACA7DBD913372;
    private com.sap.tc.moin.repository.core.EndStorageLink __A_NativeType_procedure_NativeType_460CC65B22E410DE9C9A40840B7C92FC90ABAC88;

    // links for multiplicity-n association ends
    private java.util.Collection<com.sap.tc.moin.repository.core.EndStorageLink> __A_Diagrams_commonDevelopmentObject_Diagrams_45DDACEF343D00986BE441800112F0B99C0A53DC;
    private java.util.Collection<com.sap.tc.moin.repository.core.EndStorageLink> __A_TemplateInstances_commonDevelopmentObject_TemplateInstances_45DDACEF51C64A56A56C444C381C966D26ED4A10;
    private java.util.Collection<com.sap.tc.moin.repository.core.EndStorageLink> __A_Parameters_Owner_Parameters_460CC65B0875452783BB447C3FD991D7EBC8445E;

    // default constructor
    public CalculatedAttributeMethodImpl() {
        super();
    }
    
    // specific constructor
    public CalculatedAttributeMethodImpl(java.lang.Object workspace, String mofId, com.sap.tc.moin.repository.mmi.reflect.RefPackage immediatePackage, com.sap.tc.moin.repository.mmi.reflect.RefObject metaObject, com.sap.tc.moin.repository.mmi.reflect.RefClass refClass) {
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
    public com.sap.ide.metamodel.webdynpro.enums.VisibilityEnum getVisibility() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return __visibility;
    }
    public void setVisibility(com.sap.ide.metamodel.webdynpro.enums.VisibilityEnum newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeDataTypeAttribute(get___CurrentConnection(), 7, "45DDACEEB8851F91EBF74C791648C3D0E9606204", __visibility, newValue); //$NON-NLS-1$
    }
    public void setVisibility(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.ide.metamodel.webdynpro.enums.VisibilityEnum newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeDataTypeAttribute(connection, 7, "45DDACEEB8851F91EBF74C791648C3D0E9606204", __visibility, newValue); //$NON-NLS-1$
    }
    public java.lang.String getCodeBody() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return __codeBody;
    }
    public void setCodeBody(java.lang.String newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeDataTypeAttribute(get___CurrentConnection(), 8, "45DDACEE38B192FAE4EB4F832344B2EAF0E335EC", __codeBody, newValue); //$NON-NLS-1$
    }
    public void setCodeBody(com.sap.tc.moin.repository.core.CoreConnection connection, java.lang.String newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeDataTypeAttribute(connection, 8, "45DDACEE38B192FAE4EB4F832344B2EAF0E335EC", __codeBody, newValue); //$NON-NLS-1$
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
    public java.util.List getParameters() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (java.util.List) ___getElementsAtOtherLinkEnd( get___CurrentConnection(), this, get___EndAndMetaObject( "460CC65B5940A113E52F4D750BEED592C4496ECD" /* attribute or association */, 0 ) ) ; //$NON-NLS-1$
       
    }
    public java.util.List getParameters(com.sap.tc.moin.repository.core.CoreConnection connection) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (java.util.List) ___getElementsAtOtherLinkEnd( connection, this, get___EndAndMetaObject( "460CC65B5940A113E52F4D750BEED592C4496ECD" /* attribute or association */, 0 ) ) ; //$NON-NLS-1$
       
    }


    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getReturnType() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) ___getElementAtOtherLinkEnd( get___CurrentConnection(), __A_ReturnType_procedure_ReturnType_45DDACEE88CA5EC2D0D747AA3415D27FEC6226CD);
       
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getReturnType(com.sap.tc.moin.repository.core.CoreConnection connection) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) ___getElementAtOtherLinkEnd( connection, __A_ReturnType_procedure_ReturnType_45DDACEE88CA5EC2D0D747AA3415D27FEC6226CD);
       
    }
    public void setReturnType(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeReference(get___CurrentConnection(), /* mofId of association */ "45DDACEEEA2CD3D7206F4F871062F67B6A79B4CB", /* mofId of reference */ "45DDACEEC2CE7FBAD4FE4F7E1478F7A3CD5F7EA9" , newValue, 0); //$NON-NLS-1$ //$NON-NLS-2$

    }
    public void setReturnType(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeReference(connection, /* mofId of association */ "45DDACEEEA2CD3D7206F4F871062F67B6A79B4CB", /* mofId of reference */ "45DDACEEC2CE7FBAD4FE4F7E1478F7A3CD5F7EA9" , newValue, 0); //$NON-NLS-1$ //$NON-NLS-2$

    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getNativeType() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) ___getElementAtOtherLinkEnd( get___CurrentConnection(), __A_NativeType_procedure_NativeType_460CC65B22E410DE9C9A40840B7C92FC90ABAC88);
       
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getNativeType(com.sap.tc.moin.repository.core.CoreConnection connection) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) ___getElementAtOtherLinkEnd( connection, __A_NativeType_procedure_NativeType_460CC65B22E410DE9C9A40840B7C92FC90ABAC88);
       
    }
    public void setNativeType(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeReference(get___CurrentConnection(), /* mofId of association */ "460CC65B3F66744F92E54E392940C3BFD3E1FE6A", /* mofId of reference */ "460CC65BFADE38E0FBB34CEA11C4CFE67FE5C681" , newValue, 0); //$NON-NLS-1$ //$NON-NLS-2$

    }
    public void setNativeType(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeReference(connection, /* mofId of association */ "460CC65B3F66744F92E54E392940C3BFD3E1FE6A", /* mofId of reference */ "460CC65BFADE38E0FBB34CEA11C4CFE67FE5C681" , newValue, 0); //$NON-NLS-1$ //$NON-NLS-2$

    }

    // methods for internal attribute setter
    private void set__Name(java.lang.String newValue) {
            __name = newValue;
    }

    private void set__Visibility(com.sap.ide.metamodel.webdynpro.enums.VisibilityEnum newValue) {
            __visibility = newValue;
    }

    private void set__CodeBody(java.lang.String newValue) {
            __codeBody = newValue;
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
                result = getParameters(connection);
                break;
            case 5: 
                result = getReturnType(connection);
                break;
            case 6: 
                result = getNativeType(connection);
                break;
            case 7: 
                result = getVisibility();
                break;
            case 8: 
                result = getCodeBody();
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
                ___changeReference(connection, "460CC65B5940A113E52F4D750BEED592C4496ECD" /* mofId of association */, "460CC65B51B3E22033B54D8B3DE9E4638892F3A3" /* mofId of reference */, value, 0); //$NON-NLS-1$ //$NON-NLS-2$     
                break;
                    
            case 5:
                ___changeReference(connection, "45DDACEEEA2CD3D7206F4F871062F67B6A79B4CB" /* mofId of association */, "45DDACEEC2CE7FBAD4FE4F7E1478F7A3CD5F7EA9" /* mofId of reference */, value, 0); //$NON-NLS-1$ //$NON-NLS-2$     
                break;
                    
            case 6:
                ___changeReference(connection, "460CC65B3F66744F92E54E392940C3BFD3E1FE6A" /* mofId of association */, "460CC65BFADE38E0FBB34CEA11C4CFE67FE5C681" /* mofId of reference */, value, 0); //$NON-NLS-1$ //$NON-NLS-2$     
                break;
                    
            case 7:
                ___changeDataTypeAttribute(connection, 7, "45DDACEEB8851F91EBF74C791648C3D0E9606204", __visibility, value); //$NON-NLS-1$
                break;
                    
            case 8:
                ___changeDataTypeAttribute(connection, 8, "45DDACEE38B192FAE4EB4F832344B2EAF0E335EC", __codeBody, value); //$NON-NLS-1$
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
                set__Visibility((com.sap.ide.metamodel.webdynpro.enums.VisibilityEnum) value);     
                break;
            case 8:
                set__CodeBody((java.lang.String) value);     
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
                set__Visibility((com.sap.ide.metamodel.webdynpro.enums.VisibilityEnum) value);     
                break;
            case 8:
                set__CodeBody((java.lang.String) value);     
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
                set__Visibility((com.sap.ide.metamodel.webdynpro.enums.VisibilityEnum) value);     
                break;
            case 8:
                set__CodeBody((java.lang.String) value);     
                break;
            default:
                throw new com.sap.tc.moin.repository.mmi.reflect.InvalidCallException(featureName, refMetaObject(), "addOrSet___Value(String)"); //$NON-NLS-1$
        }
    }    



    public void set___AssociationLink( String associationEndMofId, com.sap.tc.moin.repository.core.EndStorageLink value ) {
        if ( associationEndMofId == "45DDACEE88CA5EC2D0D747AA3415D27FEC6226CD" ) { __A_ReturnType_procedure_ReturnType_45DDACEE88CA5EC2D0D747AA3415D27FEC6226CD = value; return; } //$NON-NLS-1$ 
        if ( associationEndMofId == "45DDACEFC2A0C1CA72084C5D2DCACA7DBD913372" ) { __A_DocumentationObject_commonDevelopmentObject_DocumentationObject_45DDACEFC2A0C1CA72084C5D2DCACA7DBD913372 = value; return; } //$NON-NLS-1$ 
        if ( associationEndMofId == "460CC65B22E410DE9C9A40840B7C92FC90ABAC88" ) { __A_NativeType_procedure_NativeType_460CC65B22E410DE9C9A40840B7C92FC90ABAC88 = value; return; } //$NON-NLS-1$ 
    }
    
    public com.sap.tc.moin.repository.core.EndStorageLink get___AssociationLink( String associationEndMofId ) {
        if ( associationEndMofId == "45DDACEE88CA5EC2D0D747AA3415D27FEC6226CD" ) { return __A_ReturnType_procedure_ReturnType_45DDACEE88CA5EC2D0D747AA3415D27FEC6226CD; } //$NON-NLS-1$ 
        if ( associationEndMofId == "45DDACEFC2A0C1CA72084C5D2DCACA7DBD913372" ) { return __A_DocumentationObject_commonDevelopmentObject_DocumentationObject_45DDACEFC2A0C1CA72084C5D2DCACA7DBD913372; } //$NON-NLS-1$ 
        if ( associationEndMofId == "460CC65B22E410DE9C9A40840B7C92FC90ABAC88" ) { return __A_NativeType_procedure_NativeType_460CC65B22E410DE9C9A40840B7C92FC90ABAC88; } //$NON-NLS-1$ 
        return null;
    }
    public java.util.List<com.sap.tc.moin.repository.core.EndStorageLink> get___AllStoredLinks( ) {
        java.util.List<com.sap.tc.moin.repository.core.EndStorageLink> result = null;
        if ( __A_ReturnType_procedure_ReturnType_45DDACEE88CA5EC2D0D747AA3415D27FEC6226CD != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __A_ReturnType_procedure_ReturnType_45DDACEE88CA5EC2D0D747AA3415D27FEC6226CD); } 
        if ( __A_DocumentationObject_commonDevelopmentObject_DocumentationObject_45DDACEFC2A0C1CA72084C5D2DCACA7DBD913372 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __A_DocumentationObject_commonDevelopmentObject_DocumentationObject_45DDACEFC2A0C1CA72084C5D2DCACA7DBD913372); } 
        if ( __A_NativeType_procedure_NativeType_460CC65B22E410DE9C9A40840B7C92FC90ABAC88 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __A_NativeType_procedure_NativeType_460CC65B22E410DE9C9A40840B7C92FC90ABAC88); } 
        if ( __A_Diagrams_commonDevelopmentObject_Diagrams_45DDACEF343D00986BE441800112F0B99C0A53DC != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.addAll( __A_Diagrams_commonDevelopmentObject_Diagrams_45DDACEF343D00986BE441800112F0B99C0A53DC); } 
        if ( __A_TemplateInstances_commonDevelopmentObject_TemplateInstances_45DDACEF51C64A56A56C444C381C966D26ED4A10 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.addAll( __A_TemplateInstances_commonDevelopmentObject_TemplateInstances_45DDACEF51C64A56A56C444C381C966D26ED4A10); } 
        if ( __A_Parameters_Owner_Parameters_460CC65B0875452783BB447C3FD991D7EBC8445E != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.addAll( __A_Parameters_Owner_Parameters_460CC65B0875452783BB447C3FD991D7EBC8445E); } 
        return result;

    }

    public java.util.List<com.sap.tc.moin.repository.core.EndStorageLink> get___AllStoredAssociationLinks( ) {
        java.util.List<com.sap.tc.moin.repository.core.EndStorageLink> result = null;
        if ( __A_ReturnType_procedure_ReturnType_45DDACEE88CA5EC2D0D747AA3415D27FEC6226CD != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __A_ReturnType_procedure_ReturnType_45DDACEE88CA5EC2D0D747AA3415D27FEC6226CD); } 
        if ( __A_DocumentationObject_commonDevelopmentObject_DocumentationObject_45DDACEFC2A0C1CA72084C5D2DCACA7DBD913372 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __A_DocumentationObject_commonDevelopmentObject_DocumentationObject_45DDACEFC2A0C1CA72084C5D2DCACA7DBD913372); } 
        if ( __A_NativeType_procedure_NativeType_460CC65B22E410DE9C9A40840B7C92FC90ABAC88 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __A_NativeType_procedure_NativeType_460CC65B22E410DE9C9A40840B7C92FC90ABAC88); } 
        if ( __A_Diagrams_commonDevelopmentObject_Diagrams_45DDACEF343D00986BE441800112F0B99C0A53DC != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.addAll( __A_Diagrams_commonDevelopmentObject_Diagrams_45DDACEF343D00986BE441800112F0B99C0A53DC); } 
        if ( __A_TemplateInstances_commonDevelopmentObject_TemplateInstances_45DDACEF51C64A56A56C444C381C966D26ED4A10 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.addAll( __A_TemplateInstances_commonDevelopmentObject_TemplateInstances_45DDACEF51C64A56A56C444C381C966D26ED4A10); } 
        if ( __A_Parameters_Owner_Parameters_460CC65B0875452783BB447C3FD991D7EBC8445E != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.addAll( __A_Parameters_Owner_Parameters_460CC65B0875452783BB447C3FD991D7EBC8445E); } 
        return result;

    }
    public java.util.Collection<com.sap.tc.moin.repository.core.EndStorageLink> get___AssociationLinks( String associationEndMofId ) {
        if ( associationEndMofId == "45DDACEF343D00986BE441800112F0B99C0A53DC" ) { return __A_Diagrams_commonDevelopmentObject_Diagrams_45DDACEF343D00986BE441800112F0B99C0A53DC; } //$NON-NLS-1$ 
        if ( associationEndMofId == "45DDACEF51C64A56A56C444C381C966D26ED4A10" ) { return __A_TemplateInstances_commonDevelopmentObject_TemplateInstances_45DDACEF51C64A56A56C444C381C966D26ED4A10; } //$NON-NLS-1$ 
        if ( associationEndMofId == "460CC65B0875452783BB447C3FD991D7EBC8445E" ) { return __A_Parameters_Owner_Parameters_460CC65B0875452783BB447C3FD991D7EBC8445E; } //$NON-NLS-1$ 
        return null;
    }

    public void set___AssociationLinks( java.util.Collection<com.sap.tc.moin.repository.core.EndStorageLink> links, String associationEndMofId ) {
        if ( associationEndMofId == "45DDACEF343D00986BE441800112F0B99C0A53DC" ) { __A_Diagrams_commonDevelopmentObject_Diagrams_45DDACEF343D00986BE441800112F0B99C0A53DC = links; return; } //$NON-NLS-1$ 
        if ( associationEndMofId == "45DDACEF51C64A56A56C444C381C966D26ED4A10" ) { __A_TemplateInstances_commonDevelopmentObject_TemplateInstances_45DDACEF51C64A56A56C444C381C966D26ED4A10 = links; return; } //$NON-NLS-1$ 
        if ( associationEndMofId == "460CC65B0875452783BB447C3FD991D7EBC8445E" ) { __A_Parameters_Owner_Parameters_460CC65B0875452783BB447C3FD991D7EBC8445E = links; return; } //$NON-NLS-1$ 
    }    
    public java.util.List<com.sap.tc.moin.repository.core.EndStorageLink> clear___AllLinks( ) {
        reset___CompositeParentLink( );
        java.util.List<com.sap.tc.moin.repository.core.EndStorageLink> result = null;
        if ( __A_ReturnType_procedure_ReturnType_45DDACEE88CA5EC2D0D747AA3415D27FEC6226CD != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __A_ReturnType_procedure_ReturnType_45DDACEE88CA5EC2D0D747AA3415D27FEC6226CD); __A_ReturnType_procedure_ReturnType_45DDACEE88CA5EC2D0D747AA3415D27FEC6226CD = null; } 
        if ( __A_DocumentationObject_commonDevelopmentObject_DocumentationObject_45DDACEFC2A0C1CA72084C5D2DCACA7DBD913372 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __A_DocumentationObject_commonDevelopmentObject_DocumentationObject_45DDACEFC2A0C1CA72084C5D2DCACA7DBD913372); __A_DocumentationObject_commonDevelopmentObject_DocumentationObject_45DDACEFC2A0C1CA72084C5D2DCACA7DBD913372 = null; } 
        if ( __A_NativeType_procedure_NativeType_460CC65B22E410DE9C9A40840B7C92FC90ABAC88 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __A_NativeType_procedure_NativeType_460CC65B22E410DE9C9A40840B7C92FC90ABAC88); __A_NativeType_procedure_NativeType_460CC65B22E410DE9C9A40840B7C92FC90ABAC88 = null; } 
        if ( __A_Diagrams_commonDevelopmentObject_Diagrams_45DDACEF343D00986BE441800112F0B99C0A53DC != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.addAll( __A_Diagrams_commonDevelopmentObject_Diagrams_45DDACEF343D00986BE441800112F0B99C0A53DC); __A_Diagrams_commonDevelopmentObject_Diagrams_45DDACEF343D00986BE441800112F0B99C0A53DC = null; } 
        if ( __A_TemplateInstances_commonDevelopmentObject_TemplateInstances_45DDACEF51C64A56A56C444C381C966D26ED4A10 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.addAll( __A_TemplateInstances_commonDevelopmentObject_TemplateInstances_45DDACEF51C64A56A56C444C381C966D26ED4A10); __A_TemplateInstances_commonDevelopmentObject_TemplateInstances_45DDACEF51C64A56A56C444C381C966D26ED4A10 = null; } 
        if ( __A_Parameters_Owner_Parameters_460CC65B0875452783BB447C3FD991D7EBC8445E != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.addAll( __A_Parameters_Owner_Parameters_460CC65B0875452783BB447C3FD991D7EBC8445E); __A_Parameters_Owner_Parameters_460CC65B0875452783BB447C3FD991D7EBC8445E = null; } 
        return result;

    }
    // get the JMI interface
    @SuppressWarnings("unchecked")
    public java.lang.Class<com.sap.ide.metamodel.webdynpro.component.controller.CalculatedAttributeMethod> get___JmiInterface() {
        return com.sap.ide.metamodel.webdynpro.component.controller.CalculatedAttributeMethod.class;
    }

    // create the wrapper
    @Override
    public com.sap.tc.moin.repository.spi.core.Wrapper<com.sap.ide.metamodel.webdynpro.component.controller.__impl.CalculatedAttributeMethodImpl> createWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, boolean synchronize) {
        return new com.sap.ide.metamodel.webdynpro.component.controller.__impl.CalculatedAttributeMethodWrapper(conn, this, synchronize);
    }
    
}