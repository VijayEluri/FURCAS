/**
 * Generated by the MOIN Generator Version 3.0
 **/

package org.omg.ocl.expressions.__impl;

public final class TupleLiteralExpImpl extends com.sap.tc.moin.repository.core.jmi.reflect.RefObjectImpl implements org.omg.ocl.expressions.TupleLiteralExp,org.omg.ocl.expressions.__impl.TupleLiteralExpInternal {

        
    public static final java.util.Map<java.lang.String, java.lang.Integer> FEATURE_IDS;
    
    static {
        
        FEATURE_IDS = new java.util.HashMap<java.lang.String, java.lang.Integer>(14);
        FEATURE_IDS.put("name", Integer.valueOf(0)); //$NON-NLS-1$
        FEATURE_IDS.put("type", Integer.valueOf(1)); //$NON-NLS-1$
        FEATURE_IDS.put("appliedProperty", Integer.valueOf(2)); //$NON-NLS-1$
        FEATURE_IDS.put("parentOperation", Integer.valueOf(3)); //$NON-NLS-1$
        FEATURE_IDS.put("attributeForInitialValue", Integer.valueOf(4)); //$NON-NLS-1$
        FEATURE_IDS.put("associationEndForInitialValue", Integer.valueOf(5)); //$NON-NLS-1$
        FEATURE_IDS.put("defines", Integer.valueOf(6)); //$NON-NLS-1$
        FEATURE_IDS.put("associationEndForDerivationExpression", Integer.valueOf(7)); //$NON-NLS-1$
        FEATURE_IDS.put("attributeForDerivationExpression", Integer.valueOf(8)); //$NON-NLS-1$
        FEATURE_IDS.put("tuplePart", Integer.valueOf(9)); //$NON-NLS-1$
    }
    
    
    // variable declarations
    private java.lang.String __name = null;

    // links for multiplicity-1 association ends
    private com.sap.tc.moin.repository.core.EndStorageLink __AssociationEndInitialValue_associationEndForInitialValue_45ED2E29040E888560A24E823A4A8D633D3ED3B8;
    private com.sap.tc.moin.repository.core.EndStorageLink __AttributeDerivationExpression_attributeForDerivationExpression_45ED2E2956BFBD2D2CDA48C00F8BAB214E917F30;
    private com.sap.tc.moin.repository.core.EndStorageLink __AttributeInitalValue_attributeForInitialValue_45ED2E29C6ECC1D2A27C494B0896B80960FE4674;
    private com.sap.tc.moin.repository.core.EndStorageLink __A_type_oclExpression_type_45ED2E29E26A1E3F26E34AAD2B5F8D07C597EBF1;
    private com.sap.tc.moin.repository.core.EndStorageLink __AssociationEndDerivationExpression_associationEndForDerivationExpression_45ED2E29F70821B98D594E32377FCC1458007858;

    // links for multiplicity-n association ends
    private java.util.Collection<com.sap.tc.moin.repository.core.EndStorageLink> __OperationBodyDefinition_defines_45ED2E290365D828E8B74D170EB99D548BF3299E;
    private java.util.Collection<com.sap.tc.moin.repository.core.EndStorageLink> __A_tuplePart_tupleLiteralExp_tuplePart_45ED2E29D5AC907755AF487A2AD5D4F24C272720;

    // default constructor
    public TupleLiteralExpImpl() {
        super();
    }
    
    // specific constructor
    public TupleLiteralExpImpl(java.lang.Object workspace, String mofId, com.sap.tc.moin.repository.mmi.reflect.RefPackage immediatePackage, com.sap.tc.moin.repository.mmi.reflect.RefObject metaObject, com.sap.tc.moin.repository.mmi.reflect.RefClass refClass) {
        super(workspace, mofId, immediatePackage, metaObject, refClass);
    }
    
    // methods for attributes
    public java.lang.String getName() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return __name;
    }
    public void setName(java.lang.String newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeDataTypeAttribute(get___CurrentConnection(), 0, "474BE1D8487DE7D09CCA11DCBA7700199904B925", __name, newValue); //$NON-NLS-1$
    }
    public void setName(com.sap.tc.moin.repository.core.CoreConnection connection, java.lang.String newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeDataTypeAttribute(connection, 0, "474BE1D8487DE7D09CCA11DCBA7700199904B925", __name, newValue); //$NON-NLS-1$
    }

    // methods for references
    public com.sap.tc.moin.repository.mmi.model.Classifier getType() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (com.sap.tc.moin.repository.mmi.model.Classifier) ___getElementAtOtherLinkEnd( get___CurrentConnection(), __A_type_oclExpression_type_45ED2E29E26A1E3F26E34AAD2B5F8D07C597EBF1);
       
    }
    public com.sap.tc.moin.repository.mmi.model.Classifier getType(com.sap.tc.moin.repository.core.CoreConnection connection) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (com.sap.tc.moin.repository.mmi.model.Classifier) ___getElementAtOtherLinkEnd( connection, __A_type_oclExpression_type_45ED2E29E26A1E3F26E34AAD2B5F8D07C597EBF1);
       
    }
    public void setType(com.sap.tc.moin.repository.mmi.model.Classifier newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeReference(get___CurrentConnection(), /* mofId of association */ "45ED2E29A8976A898EAF47150D76C377A0EDBAC2", /* mofId of reference */ "45ED2E2993A4564088D54DD3240CA63FD19D73D9" , newValue, 0); //$NON-NLS-1$ //$NON-NLS-2$
    
    }
    public void setType(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.model.Classifier newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeReference(connection, /* mofId of association */ "45ED2E29A8976A898EAF47150D76C377A0EDBAC2", /* mofId of reference */ "45ED2E2993A4564088D54DD3240CA63FD19D73D9" , newValue, 0); //$NON-NLS-1$ //$NON-NLS-2$
    
    }
    public org.omg.ocl.expressions.PropertyCallExp getAppliedProperty() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        com.sap.tc.moin.repository.core.EndAndMetaObject endAndMetaObject = get___EndAndMetaObject( "45ED2E299BB9CF41F9C44C763865EFB27EADFA32" /* attribute or association */, 0 ); //$NON-NLS-1$
        return (org.omg.ocl.expressions.PropertyCallExp) get___CompositeParentForEndAndMetaObject( get___CurrentConnection(), endAndMetaObject );   
    }
    public org.omg.ocl.expressions.PropertyCallExp getAppliedProperty(com.sap.tc.moin.repository.core.CoreConnection connection) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        com.sap.tc.moin.repository.core.EndAndMetaObject endAndMetaObject = get___EndAndMetaObject( "45ED2E299BB9CF41F9C44C763865EFB27EADFA32" /* attribute or association */, 0 ); //$NON-NLS-1$
        return (org.omg.ocl.expressions.PropertyCallExp) get___CompositeParentForEndAndMetaObject( connection, endAndMetaObject );   
    }
    public void setAppliedProperty(org.omg.ocl.expressions.PropertyCallExp newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeReference(get___CurrentConnection(), /* mofId of association */ "45ED2E299BB9CF41F9C44C763865EFB27EADFA32", /* mofId of reference */ "45ED2E2927BC9366DE0541551DDECFF51EBF6C17" , newValue, 0); //$NON-NLS-1$ //$NON-NLS-2$
    
    }
    public void setAppliedProperty(com.sap.tc.moin.repository.core.CoreConnection connection, org.omg.ocl.expressions.PropertyCallExp newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeReference(connection, /* mofId of association */ "45ED2E299BB9CF41F9C44C763865EFB27EADFA32", /* mofId of reference */ "45ED2E2927BC9366DE0541551DDECFF51EBF6C17" , newValue, 0); //$NON-NLS-1$ //$NON-NLS-2$
    
    }
    public org.omg.ocl.expressions.OperationCallExp getParentOperation() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        com.sap.tc.moin.repository.core.EndAndMetaObject endAndMetaObject = get___EndAndMetaObject( "45ED2E297046BE46EB524CAA1143F6FD9EE9162C" /* attribute or association */, 0 ); //$NON-NLS-1$
        return (org.omg.ocl.expressions.OperationCallExp) get___CompositeParentForEndAndMetaObject( get___CurrentConnection(), endAndMetaObject );   
    }
    public org.omg.ocl.expressions.OperationCallExp getParentOperation(com.sap.tc.moin.repository.core.CoreConnection connection) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        com.sap.tc.moin.repository.core.EndAndMetaObject endAndMetaObject = get___EndAndMetaObject( "45ED2E297046BE46EB524CAA1143F6FD9EE9162C" /* attribute or association */, 0 ); //$NON-NLS-1$
        return (org.omg.ocl.expressions.OperationCallExp) get___CompositeParentForEndAndMetaObject( connection, endAndMetaObject );   
    }
    public void setParentOperation(org.omg.ocl.expressions.OperationCallExp newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeReference(get___CurrentConnection(), /* mofId of association */ "45ED2E297046BE46EB524CAA1143F6FD9EE9162C", /* mofId of reference */ "45ED2E29D514C9081CBB491D14BAC67CF86FD2FA" , newValue, 0); //$NON-NLS-1$ //$NON-NLS-2$
    
    }
    public void setParentOperation(com.sap.tc.moin.repository.core.CoreConnection connection, org.omg.ocl.expressions.OperationCallExp newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeReference(connection, /* mofId of association */ "45ED2E297046BE46EB524CAA1143F6FD9EE9162C", /* mofId of reference */ "45ED2E29D514C9081CBB491D14BAC67CF86FD2FA" , newValue, 0); //$NON-NLS-1$ //$NON-NLS-2$
    
    }
    public com.sap.tc.moin.repository.mmi.model.Attribute getAttributeForInitialValue() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (com.sap.tc.moin.repository.mmi.model.Attribute) ___getElementAtOtherLinkEnd( get___CurrentConnection(), __AttributeInitalValue_attributeForInitialValue_45ED2E29C6ECC1D2A27C494B0896B80960FE4674);
       
    }
    public com.sap.tc.moin.repository.mmi.model.Attribute getAttributeForInitialValue(com.sap.tc.moin.repository.core.CoreConnection connection) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (com.sap.tc.moin.repository.mmi.model.Attribute) ___getElementAtOtherLinkEnd( connection, __AttributeInitalValue_attributeForInitialValue_45ED2E29C6ECC1D2A27C494B0896B80960FE4674);
       
    }
    public void setAttributeForInitialValue(com.sap.tc.moin.repository.mmi.model.Attribute newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeReference(get___CurrentConnection(), /* mofId of association */ "45ED2E29A286E6ED595D4D21383BDF80C5FFDA11", /* mofId of reference */ "45ED2E296378A09CBFC148502B69D343C5268FB7" , newValue, 0); //$NON-NLS-1$ //$NON-NLS-2$
    
    }
    public void setAttributeForInitialValue(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.model.Attribute newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeReference(connection, /* mofId of association */ "45ED2E29A286E6ED595D4D21383BDF80C5FFDA11", /* mofId of reference */ "45ED2E296378A09CBFC148502B69D343C5268FB7" , newValue, 0); //$NON-NLS-1$ //$NON-NLS-2$
    
    }
    public com.sap.tc.moin.repository.mmi.model.AssociationEnd getAssociationEndForInitialValue() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (com.sap.tc.moin.repository.mmi.model.AssociationEnd) ___getElementAtOtherLinkEnd( get___CurrentConnection(), __AssociationEndInitialValue_associationEndForInitialValue_45ED2E29040E888560A24E823A4A8D633D3ED3B8);
       
    }
    public com.sap.tc.moin.repository.mmi.model.AssociationEnd getAssociationEndForInitialValue(com.sap.tc.moin.repository.core.CoreConnection connection) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (com.sap.tc.moin.repository.mmi.model.AssociationEnd) ___getElementAtOtherLinkEnd( connection, __AssociationEndInitialValue_associationEndForInitialValue_45ED2E29040E888560A24E823A4A8D633D3ED3B8);
       
    }
    public void setAssociationEndForInitialValue(com.sap.tc.moin.repository.mmi.model.AssociationEnd newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeReference(get___CurrentConnection(), /* mofId of association */ "45ED2E2900D7CC82F45E481F01A3CB414C39021A", /* mofId of reference */ "45ED2E29D3136C6C9CFB48063C93EF82D9226085" , newValue, 1); //$NON-NLS-1$ //$NON-NLS-2$
    
    }
    public void setAssociationEndForInitialValue(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.model.AssociationEnd newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeReference(connection, /* mofId of association */ "45ED2E2900D7CC82F45E481F01A3CB414C39021A", /* mofId of reference */ "45ED2E29D3136C6C9CFB48063C93EF82D9226085" , newValue, 1); //$NON-NLS-1$ //$NON-NLS-2$
    
    }
    public java.util.Collection<com.sap.tc.moin.repository.mmi.model.Operation> getDefines() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (java.util.Collection<com.sap.tc.moin.repository.mmi.model.Operation>) ___getElementsAtOtherLinkEnd( get___CurrentConnection(), this, get___EndAndMetaObject( "45ED2E2931823687B9EA4F3B2FA8D1089389DA6A" /* attribute or association */, 1 ) ) ; //$NON-NLS-1$
       
    }
    public java.util.Collection<com.sap.tc.moin.repository.mmi.model.Operation> getDefines(com.sap.tc.moin.repository.core.CoreConnection connection) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (java.util.Collection<com.sap.tc.moin.repository.mmi.model.Operation>) ___getElementsAtOtherLinkEnd( connection, this, get___EndAndMetaObject( "45ED2E2931823687B9EA4F3B2FA8D1089389DA6A" /* attribute or association */, 1 ) ) ; //$NON-NLS-1$
       
    }


    public com.sap.tc.moin.repository.mmi.model.AssociationEnd getAssociationEndForDerivationExpression() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (com.sap.tc.moin.repository.mmi.model.AssociationEnd) ___getElementAtOtherLinkEnd( get___CurrentConnection(), __AssociationEndDerivationExpression_associationEndForDerivationExpression_45ED2E29F70821B98D594E32377FCC1458007858);
       
    }
    public com.sap.tc.moin.repository.mmi.model.AssociationEnd getAssociationEndForDerivationExpression(com.sap.tc.moin.repository.core.CoreConnection connection) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (com.sap.tc.moin.repository.mmi.model.AssociationEnd) ___getElementAtOtherLinkEnd( connection, __AssociationEndDerivationExpression_associationEndForDerivationExpression_45ED2E29F70821B98D594E32377FCC1458007858);
       
    }
    public void setAssociationEndForDerivationExpression(com.sap.tc.moin.repository.mmi.model.AssociationEnd newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeReference(get___CurrentConnection(), /* mofId of association */ "45ED2E29DA068B3F43BC491E1A0DB705FE6FEF09", /* mofId of reference */ "45ED2E2966089EF9349B4BB00456AB1FA674D25F" , newValue, 1); //$NON-NLS-1$ //$NON-NLS-2$
    
    }
    public void setAssociationEndForDerivationExpression(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.model.AssociationEnd newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeReference(connection, /* mofId of association */ "45ED2E29DA068B3F43BC491E1A0DB705FE6FEF09", /* mofId of reference */ "45ED2E2966089EF9349B4BB00456AB1FA674D25F" , newValue, 1); //$NON-NLS-1$ //$NON-NLS-2$
    
    }
    public com.sap.tc.moin.repository.mmi.model.Attribute getAttributeForDerivationExpression() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (com.sap.tc.moin.repository.mmi.model.Attribute) ___getElementAtOtherLinkEnd( get___CurrentConnection(), __AttributeDerivationExpression_attributeForDerivationExpression_45ED2E2956BFBD2D2CDA48C00F8BAB214E917F30);
       
    }
    public com.sap.tc.moin.repository.mmi.model.Attribute getAttributeForDerivationExpression(com.sap.tc.moin.repository.core.CoreConnection connection) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (com.sap.tc.moin.repository.mmi.model.Attribute) ___getElementAtOtherLinkEnd( connection, __AttributeDerivationExpression_attributeForDerivationExpression_45ED2E2956BFBD2D2CDA48C00F8BAB214E917F30);
       
    }
    public void setAttributeForDerivationExpression(com.sap.tc.moin.repository.mmi.model.Attribute newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeReference(get___CurrentConnection(), /* mofId of association */ "45ED2E29AD7CF6B69D7E479E0A67C662FE56B082", /* mofId of reference */ "45ED2E29129ACA79B1D947C71861E2454E1D6181" , newValue, 1); //$NON-NLS-1$ //$NON-NLS-2$
    
    }
    public void setAttributeForDerivationExpression(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.model.Attribute newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeReference(connection, /* mofId of association */ "45ED2E29AD7CF6B69D7E479E0A67C662FE56B082", /* mofId of reference */ "45ED2E29129ACA79B1D947C71861E2454E1D6181" , newValue, 1); //$NON-NLS-1$ //$NON-NLS-2$
    
    }
    public java.util.Collection<org.omg.ocl.expressions.VariableDeclaration> getTuplePart() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (java.util.Collection<org.omg.ocl.expressions.VariableDeclaration>) ___getElementsAtOtherLinkEnd( get___CurrentConnection(), this, get___EndAndMetaObject( "45ED2E2923015E6DE474466D075EE20F01D20408" /* attribute or association */, 0 ) ) ; //$NON-NLS-1$
       
    }
    public java.util.Collection<org.omg.ocl.expressions.VariableDeclaration> getTuplePart(com.sap.tc.moin.repository.core.CoreConnection connection) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (java.util.Collection<org.omg.ocl.expressions.VariableDeclaration>) ___getElementsAtOtherLinkEnd( connection, this, get___EndAndMetaObject( "45ED2E2923015E6DE474466D075EE20F01D20408" /* attribute or association */, 0 ) ) ; //$NON-NLS-1$
       
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
                result = getName();
                break;
            case 1: 
                result = getType(connection);
                break;
            case 2: 
                result = getAppliedProperty(connection);
                break;
            case 3: 
                result = getParentOperation(connection);
                break;
            case 4: 
                result = getAttributeForInitialValue(connection);
                break;
            case 5: 
                result = getAssociationEndForInitialValue(connection);
                break;
            case 6: 
                result = getDefines(connection);
                break;
            case 7: 
                result = getAssociationEndForDerivationExpression(connection);
                break;
            case 8: 
                result = getAttributeForDerivationExpression(connection);
                break;
            case 9: 
                result = getTuplePart(connection);
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
                ___changeDataTypeAttribute(connection, 0, "474BE1D8487DE7D09CCA11DCBA7700199904B925", __name, value); //$NON-NLS-1$
                break;
                    
            case 1:
                ___changeReference(connection, "45ED2E29A8976A898EAF47150D76C377A0EDBAC2" /* mofId of association */, "45ED2E2993A4564088D54DD3240CA63FD19D73D9" /* mofId of reference */, value, 0); //$NON-NLS-1$ //$NON-NLS-2$     
                break;
                    
            case 2:
                ___changeReference(connection, "45ED2E299BB9CF41F9C44C763865EFB27EADFA32" /* mofId of association */, "45ED2E2927BC9366DE0541551DDECFF51EBF6C17" /* mofId of reference */, value, 0); //$NON-NLS-1$ //$NON-NLS-2$     
                break;
                    
            case 3:
                ___changeReference(connection, "45ED2E297046BE46EB524CAA1143F6FD9EE9162C" /* mofId of association */, "45ED2E29D514C9081CBB491D14BAC67CF86FD2FA" /* mofId of reference */, value, 0); //$NON-NLS-1$ //$NON-NLS-2$     
                break;
                    
            case 4:
                ___changeReference(connection, "45ED2E29A286E6ED595D4D21383BDF80C5FFDA11" /* mofId of association */, "45ED2E296378A09CBFC148502B69D343C5268FB7" /* mofId of reference */, value, 0); //$NON-NLS-1$ //$NON-NLS-2$     
                break;
                    
            case 5:
                ___changeReference(connection, "45ED2E2900D7CC82F45E481F01A3CB414C39021A" /* mofId of association */, "45ED2E29D3136C6C9CFB48063C93EF82D9226085" /* mofId of reference */, value, 1); //$NON-NLS-1$ //$NON-NLS-2$     
                break;
                    
            case 6:
                ___changeReference(connection, "45ED2E2931823687B9EA4F3B2FA8D1089389DA6A" /* mofId of association */, "45ED2E2930BC2830AC80418C2C3DFBAEABA1AFD5" /* mofId of reference */, value, 1); //$NON-NLS-1$ //$NON-NLS-2$     
                break;
                    
            case 7:
                ___changeReference(connection, "45ED2E29DA068B3F43BC491E1A0DB705FE6FEF09" /* mofId of association */, "45ED2E2966089EF9349B4BB00456AB1FA674D25F" /* mofId of reference */, value, 1); //$NON-NLS-1$ //$NON-NLS-2$     
                break;
                    
            case 8:
                ___changeReference(connection, "45ED2E29AD7CF6B69D7E479E0A67C662FE56B082" /* mofId of association */, "45ED2E29129ACA79B1D947C71861E2454E1D6181" /* mofId of reference */, value, 1); //$NON-NLS-1$ //$NON-NLS-2$     
                break;
                    
            case 9:
                ___changeReference(connection, "45ED2E2923015E6DE474466D075EE20F01D20408" /* mofId of association */, "45ED2E29265D6656315A4A67161BF4F9742D5DA0" /* mofId of reference */, value, 0); //$NON-NLS-1$ //$NON-NLS-2$     
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
            default:
                throw new com.sap.tc.moin.repository.mmi.reflect.InvalidCallException(featureName, refMetaObject(), "set___Value(String)"); //$NON-NLS-1$
        }
    }
    
    public void set___Value(com.sap.tc.moin.repository.core.CoreSession session, int featureId, java.lang.Object value) {
        switch (featureId) {
            case 0:
                set__Name((java.lang.String) value);     
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
            default:
                throw new com.sap.tc.moin.repository.mmi.reflect.InvalidCallException(featureName, refMetaObject(), "addOrSet___Value(String)"); //$NON-NLS-1$
        }
    }    
    


    public void set___AssociationLink( String associationEndMofId, com.sap.tc.moin.repository.core.EndStorageLink value ) {
        if ( associationEndMofId == "45ED2E29040E888560A24E823A4A8D633D3ED3B8" ) { __AssociationEndInitialValue_associationEndForInitialValue_45ED2E29040E888560A24E823A4A8D633D3ED3B8 = value; return; } //$NON-NLS-1$ 
        if ( associationEndMofId == "45ED2E2956BFBD2D2CDA48C00F8BAB214E917F30" ) { __AttributeDerivationExpression_attributeForDerivationExpression_45ED2E2956BFBD2D2CDA48C00F8BAB214E917F30 = value; return; } //$NON-NLS-1$ 
        if ( associationEndMofId == "45ED2E29C6ECC1D2A27C494B0896B80960FE4674" ) { __AttributeInitalValue_attributeForInitialValue_45ED2E29C6ECC1D2A27C494B0896B80960FE4674 = value; return; } //$NON-NLS-1$ 
        if ( associationEndMofId == "45ED2E29E26A1E3F26E34AAD2B5F8D07C597EBF1" ) { __A_type_oclExpression_type_45ED2E29E26A1E3F26E34AAD2B5F8D07C597EBF1 = value; return; } //$NON-NLS-1$ 
        if ( associationEndMofId == "45ED2E29F70821B98D594E32377FCC1458007858" ) { __AssociationEndDerivationExpression_associationEndForDerivationExpression_45ED2E29F70821B98D594E32377FCC1458007858 = value; return; } //$NON-NLS-1$ 
    }
    
    public com.sap.tc.moin.repository.core.EndStorageLink get___AssociationLink( String associationEndMofId ) {
        if ( associationEndMofId == "45ED2E29040E888560A24E823A4A8D633D3ED3B8" ) { return __AssociationEndInitialValue_associationEndForInitialValue_45ED2E29040E888560A24E823A4A8D633D3ED3B8; } //$NON-NLS-1$ 
        if ( associationEndMofId == "45ED2E2956BFBD2D2CDA48C00F8BAB214E917F30" ) { return __AttributeDerivationExpression_attributeForDerivationExpression_45ED2E2956BFBD2D2CDA48C00F8BAB214E917F30; } //$NON-NLS-1$ 
        if ( associationEndMofId == "45ED2E29C6ECC1D2A27C494B0896B80960FE4674" ) { return __AttributeInitalValue_attributeForInitialValue_45ED2E29C6ECC1D2A27C494B0896B80960FE4674; } //$NON-NLS-1$ 
        if ( associationEndMofId == "45ED2E29E26A1E3F26E34AAD2B5F8D07C597EBF1" ) { return __A_type_oclExpression_type_45ED2E29E26A1E3F26E34AAD2B5F8D07C597EBF1; } //$NON-NLS-1$ 
        if ( associationEndMofId == "45ED2E29F70821B98D594E32377FCC1458007858" ) { return __AssociationEndDerivationExpression_associationEndForDerivationExpression_45ED2E29F70821B98D594E32377FCC1458007858; } //$NON-NLS-1$ 
        return null;
    }
    public java.util.List<com.sap.tc.moin.repository.core.EndStorageLink> get___AllStoredLinks( ) {
        java.util.List<com.sap.tc.moin.repository.core.EndStorageLink> result = null;
        if ( __AssociationEndInitialValue_associationEndForInitialValue_45ED2E29040E888560A24E823A4A8D633D3ED3B8 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __AssociationEndInitialValue_associationEndForInitialValue_45ED2E29040E888560A24E823A4A8D633D3ED3B8); } 
        if ( __AttributeDerivationExpression_attributeForDerivationExpression_45ED2E2956BFBD2D2CDA48C00F8BAB214E917F30 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __AttributeDerivationExpression_attributeForDerivationExpression_45ED2E2956BFBD2D2CDA48C00F8BAB214E917F30); } 
        if ( __AttributeInitalValue_attributeForInitialValue_45ED2E29C6ECC1D2A27C494B0896B80960FE4674 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __AttributeInitalValue_attributeForInitialValue_45ED2E29C6ECC1D2A27C494B0896B80960FE4674); } 
        if ( __A_type_oclExpression_type_45ED2E29E26A1E3F26E34AAD2B5F8D07C597EBF1 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __A_type_oclExpression_type_45ED2E29E26A1E3F26E34AAD2B5F8D07C597EBF1); } 
        if ( __AssociationEndDerivationExpression_associationEndForDerivationExpression_45ED2E29F70821B98D594E32377FCC1458007858 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __AssociationEndDerivationExpression_associationEndForDerivationExpression_45ED2E29F70821B98D594E32377FCC1458007858); } 
        if ( __OperationBodyDefinition_defines_45ED2E290365D828E8B74D170EB99D548BF3299E != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.addAll( __OperationBodyDefinition_defines_45ED2E290365D828E8B74D170EB99D548BF3299E); } 
        if ( __A_tuplePart_tupleLiteralExp_tuplePart_45ED2E29D5AC907755AF487A2AD5D4F24C272720 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.addAll( __A_tuplePart_tupleLiteralExp_tuplePart_45ED2E29D5AC907755AF487A2AD5D4F24C272720); } 
        return result;

    }

    public java.util.List<com.sap.tc.moin.repository.core.EndStorageLink> get___AllStoredAssociationLinks( ) {
        java.util.List<com.sap.tc.moin.repository.core.EndStorageLink> result = null;
        if ( __AssociationEndInitialValue_associationEndForInitialValue_45ED2E29040E888560A24E823A4A8D633D3ED3B8 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __AssociationEndInitialValue_associationEndForInitialValue_45ED2E29040E888560A24E823A4A8D633D3ED3B8); } 
        if ( __AttributeDerivationExpression_attributeForDerivationExpression_45ED2E2956BFBD2D2CDA48C00F8BAB214E917F30 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __AttributeDerivationExpression_attributeForDerivationExpression_45ED2E2956BFBD2D2CDA48C00F8BAB214E917F30); } 
        if ( __AttributeInitalValue_attributeForInitialValue_45ED2E29C6ECC1D2A27C494B0896B80960FE4674 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __AttributeInitalValue_attributeForInitialValue_45ED2E29C6ECC1D2A27C494B0896B80960FE4674); } 
        if ( __A_type_oclExpression_type_45ED2E29E26A1E3F26E34AAD2B5F8D07C597EBF1 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __A_type_oclExpression_type_45ED2E29E26A1E3F26E34AAD2B5F8D07C597EBF1); } 
        if ( __AssociationEndDerivationExpression_associationEndForDerivationExpression_45ED2E29F70821B98D594E32377FCC1458007858 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __AssociationEndDerivationExpression_associationEndForDerivationExpression_45ED2E29F70821B98D594E32377FCC1458007858); } 
        if ( __OperationBodyDefinition_defines_45ED2E290365D828E8B74D170EB99D548BF3299E != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.addAll( __OperationBodyDefinition_defines_45ED2E290365D828E8B74D170EB99D548BF3299E); } 
        if ( __A_tuplePart_tupleLiteralExp_tuplePart_45ED2E29D5AC907755AF487A2AD5D4F24C272720 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.addAll( __A_tuplePart_tupleLiteralExp_tuplePart_45ED2E29D5AC907755AF487A2AD5D4F24C272720); } 
        return result;

    }
    public java.util.Collection<com.sap.tc.moin.repository.core.EndStorageLink> get___AssociationLinks( String associationEndMofId ) {
        if ( associationEndMofId == "45ED2E290365D828E8B74D170EB99D548BF3299E" ) { return __OperationBodyDefinition_defines_45ED2E290365D828E8B74D170EB99D548BF3299E; } //$NON-NLS-1$ 
        if ( associationEndMofId == "45ED2E29D5AC907755AF487A2AD5D4F24C272720" ) { return __A_tuplePart_tupleLiteralExp_tuplePart_45ED2E29D5AC907755AF487A2AD5D4F24C272720; } //$NON-NLS-1$ 
        return null;
    }

    public void set___AssociationLinks( java.util.Collection<com.sap.tc.moin.repository.core.EndStorageLink> links, String associationEndMofId ) {
        if ( associationEndMofId == "45ED2E290365D828E8B74D170EB99D548BF3299E" ) { __OperationBodyDefinition_defines_45ED2E290365D828E8B74D170EB99D548BF3299E = links; return; } //$NON-NLS-1$ 
        if ( associationEndMofId == "45ED2E29D5AC907755AF487A2AD5D4F24C272720" ) { __A_tuplePart_tupleLiteralExp_tuplePart_45ED2E29D5AC907755AF487A2AD5D4F24C272720 = links; return; } //$NON-NLS-1$ 
    }    
    public java.util.List<com.sap.tc.moin.repository.core.EndStorageLink> clear___AllLinks( ) {
        reset___CompositeParentLink( );
        java.util.List<com.sap.tc.moin.repository.core.EndStorageLink> result = null;
        if ( __AssociationEndInitialValue_associationEndForInitialValue_45ED2E29040E888560A24E823A4A8D633D3ED3B8 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __AssociationEndInitialValue_associationEndForInitialValue_45ED2E29040E888560A24E823A4A8D633D3ED3B8); __AssociationEndInitialValue_associationEndForInitialValue_45ED2E29040E888560A24E823A4A8D633D3ED3B8 = null; } 
        if ( __AttributeDerivationExpression_attributeForDerivationExpression_45ED2E2956BFBD2D2CDA48C00F8BAB214E917F30 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __AttributeDerivationExpression_attributeForDerivationExpression_45ED2E2956BFBD2D2CDA48C00F8BAB214E917F30); __AttributeDerivationExpression_attributeForDerivationExpression_45ED2E2956BFBD2D2CDA48C00F8BAB214E917F30 = null; } 
        if ( __AttributeInitalValue_attributeForInitialValue_45ED2E29C6ECC1D2A27C494B0896B80960FE4674 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __AttributeInitalValue_attributeForInitialValue_45ED2E29C6ECC1D2A27C494B0896B80960FE4674); __AttributeInitalValue_attributeForInitialValue_45ED2E29C6ECC1D2A27C494B0896B80960FE4674 = null; } 
        if ( __A_type_oclExpression_type_45ED2E29E26A1E3F26E34AAD2B5F8D07C597EBF1 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __A_type_oclExpression_type_45ED2E29E26A1E3F26E34AAD2B5F8D07C597EBF1); __A_type_oclExpression_type_45ED2E29E26A1E3F26E34AAD2B5F8D07C597EBF1 = null; } 
        if ( __AssociationEndDerivationExpression_associationEndForDerivationExpression_45ED2E29F70821B98D594E32377FCC1458007858 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __AssociationEndDerivationExpression_associationEndForDerivationExpression_45ED2E29F70821B98D594E32377FCC1458007858); __AssociationEndDerivationExpression_associationEndForDerivationExpression_45ED2E29F70821B98D594E32377FCC1458007858 = null; } 
        if ( __OperationBodyDefinition_defines_45ED2E290365D828E8B74D170EB99D548BF3299E != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.addAll( __OperationBodyDefinition_defines_45ED2E290365D828E8B74D170EB99D548BF3299E); __OperationBodyDefinition_defines_45ED2E290365D828E8B74D170EB99D548BF3299E = null; } 
        if ( __A_tuplePart_tupleLiteralExp_tuplePart_45ED2E29D5AC907755AF487A2AD5D4F24C272720 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.addAll( __A_tuplePart_tupleLiteralExp_tuplePart_45ED2E29D5AC907755AF487A2AD5D4F24C272720); __A_tuplePart_tupleLiteralExp_tuplePart_45ED2E29D5AC907755AF487A2AD5D4F24C272720 = null; } 
        return result;

    }
    // get the JMI interface
    public java.lang.Class<org.omg.ocl.expressions.TupleLiteralExp> get___JmiInterface() {
        return org.omg.ocl.expressions.TupleLiteralExp.class;
    }

    // create the wrapper
    @Override
    public com.sap.tc.moin.repository.spi.core.Wrapper<org.omg.ocl.expressions.__impl.TupleLiteralExpImpl> createWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, boolean synchronize) {
        return new org.omg.ocl.expressions.__impl.TupleLiteralExpWrapper(conn, this, synchronize);
    }
    
}