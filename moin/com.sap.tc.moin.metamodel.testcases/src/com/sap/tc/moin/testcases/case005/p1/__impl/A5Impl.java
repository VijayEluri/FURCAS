/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.tc.moin.testcases.case005.p1.__impl;

public final class A5Impl extends com.sap.tc.moin.repository.core.jmi.reflect.RefObjectImpl {

        
    public static final java.util.Map<java.lang.String, java.lang.Integer> FEATURE_IDS;
    
    static {
        
        FEATURE_IDS = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
        FEATURE_IDS.put("X", Integer.valueOf(0)); //$NON-NLS-1$
    }
    
    // links for multiplicity-1 association ends
    private com.sap.tc.moin.repository.core.EndStorageLink __Association2_d5_45F120A546E278C2DD9242A319D8990E9CB08F7B;
    private com.sap.tc.moin.repository.core.EndStorageLink __Association1_X_45F120A589F1892C109F4B012884802502189A6C;

    // default constructor
    public A5Impl() {
        super();
    }
    
    // specific constructor
    public A5Impl(java.lang.Object workspace, String mofId, com.sap.tc.moin.repository.mmi.reflect.RefPackage immediatePackage, com.sap.tc.moin.repository.mmi.reflect.RefObject metaObject, com.sap.tc.moin.repository.mmi.reflect.RefClass refClass) {
        super(workspace, mofId, immediatePackage, metaObject, refClass);
    }
    
    // methods for references
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getX() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) ___getElementAtOtherLinkEnd( get___CurrentConnection(), __Association1_X_45F120A589F1892C109F4B012884802502189A6C);
       
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getX(com.sap.tc.moin.repository.core.CoreConnection connection) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) ___getElementAtOtherLinkEnd( connection, __Association1_X_45F120A589F1892C109F4B012884802502189A6C);
       
    }
    public void setX(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeReference(get___CurrentConnection(), /* mofId of association */ "45F120A577C9AFF3347749E41D1DDF655E2D1C1B", /* mofId of reference */ "45F120A5640F9FBE2A2544B61520D5DF45CEC49E" , newValue, 0); //$NON-NLS-1$ //$NON-NLS-2$
    
    }
    public void setX(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeReference(connection, /* mofId of association */ "45F120A577C9AFF3347749E41D1DDF655E2D1C1B", /* mofId of reference */ "45F120A5640F9FBE2A2544B61520D5DF45CEC49E" , newValue, 0); //$NON-NLS-1$ //$NON-NLS-2$
    
    }

    // methods for internal attribute setter

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
                result = getX(connection);
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
                ___changeReference(connection, "45F120A577C9AFF3347749E41D1DDF655E2D1C1B" /* mofId of association */, "45F120A5640F9FBE2A2544B61520D5DF45CEC49E" /* mofId of reference */, value, 0); //$NON-NLS-1$ //$NON-NLS-2$     
                break;
                    
        default:
            throw new com.sap.tc.moin.repository.mmi.reflect.InvalidCallException(featureName, null, "refSetValue(String)"); //$NON-NLS-1$
        }
    }
    
    public void set___Value(com.sap.tc.moin.repository.core.CoreSession session, java.lang.String featureName, java.lang.Object value) {
        switch (FEATURE_IDS.get(featureName)) {
            default:
                throw new com.sap.tc.moin.repository.mmi.reflect.InvalidCallException(featureName, refMetaObject(), "set___Value(String)"); //$NON-NLS-1$
        }
    }
    
    public void set___Value(com.sap.tc.moin.repository.core.CoreSession session, int featureId, java.lang.Object value) {
        switch (featureId) {
            default:
                throw new com.sap.tc.moin.repository.mmi.reflect.InvalidCallException(featureId, refMetaObject(), "set___Value(int)"); //$NON-NLS-1$
        }
    }
    
    public void addOrSet___Value(com.sap.tc.moin.repository.core.CoreSession session, java.lang.String featureName, java.lang.Object value) {
        switch (FEATURE_IDS.get(featureName)) {
            default:
                throw new com.sap.tc.moin.repository.mmi.reflect.InvalidCallException(featureName, refMetaObject(), "addOrSet___Value(String)"); //$NON-NLS-1$
        }
    }    
    


    public void set___AssociationLink( String associationEndMofId, com.sap.tc.moin.repository.core.EndStorageLink value ) {
        if ( associationEndMofId == "45F120A546E278C2DD9242A319D8990E9CB08F7B" ) { __Association2_d5_45F120A546E278C2DD9242A319D8990E9CB08F7B = value; return; } //$NON-NLS-1$ 
        if ( associationEndMofId == "45F120A589F1892C109F4B012884802502189A6C" ) { __Association1_X_45F120A589F1892C109F4B012884802502189A6C = value; return; } //$NON-NLS-1$ 
    }
    
    public com.sap.tc.moin.repository.core.EndStorageLink get___AssociationLink( String associationEndMofId ) {
        if ( associationEndMofId == "45F120A546E278C2DD9242A319D8990E9CB08F7B" ) { return __Association2_d5_45F120A546E278C2DD9242A319D8990E9CB08F7B; } //$NON-NLS-1$ 
        if ( associationEndMofId == "45F120A589F1892C109F4B012884802502189A6C" ) { return __Association1_X_45F120A589F1892C109F4B012884802502189A6C; } //$NON-NLS-1$ 
        return null;
    }
    public java.util.List<com.sap.tc.moin.repository.core.EndStorageLink> get___AllStoredLinks( ) {
        java.util.List<com.sap.tc.moin.repository.core.EndStorageLink> result = null;
        if ( __Association2_d5_45F120A546E278C2DD9242A319D8990E9CB08F7B != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __Association2_d5_45F120A546E278C2DD9242A319D8990E9CB08F7B); } 
        if ( __Association1_X_45F120A589F1892C109F4B012884802502189A6C != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __Association1_X_45F120A589F1892C109F4B012884802502189A6C); } 
        return result;

    }

    public java.util.List<com.sap.tc.moin.repository.core.EndStorageLink> get___AllStoredAssociationLinks( ) {
        java.util.List<com.sap.tc.moin.repository.core.EndStorageLink> result = null;
        if ( __Association2_d5_45F120A546E278C2DD9242A319D8990E9CB08F7B != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __Association2_d5_45F120A546E278C2DD9242A319D8990E9CB08F7B); } 
        if ( __Association1_X_45F120A589F1892C109F4B012884802502189A6C != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __Association1_X_45F120A589F1892C109F4B012884802502189A6C); } 
        return result;

    }
    public java.util.List<com.sap.tc.moin.repository.core.EndStorageLink> clear___AllLinks( ) {
        reset___CompositeParentLink( );
        java.util.List<com.sap.tc.moin.repository.core.EndStorageLink> result = null;
        if ( __Association2_d5_45F120A546E278C2DD9242A319D8990E9CB08F7B != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __Association2_d5_45F120A546E278C2DD9242A319D8990E9CB08F7B); __Association2_d5_45F120A546E278C2DD9242A319D8990E9CB08F7B = null; } 
        if ( __Association1_X_45F120A589F1892C109F4B012884802502189A6C != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __Association1_X_45F120A589F1892C109F4B012884802502189A6C); __Association1_X_45F120A589F1892C109F4B012884802502189A6C = null; } 
        return result;

    }
    // get the JMI interface
    public java.lang.Class<com.sap.tc.moin.testcases.case005.p1.A5> get___JmiInterface() {
        return com.sap.tc.moin.testcases.case005.p1.A5.class;
    }

    // create the wrapper
    @Override
    public com.sap.tc.moin.repository.spi.core.Wrapper<com.sap.tc.moin.testcases.case005.p1.__impl.A5Impl> createWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, boolean synchronize) {
        return new com.sap.tc.moin.testcases.case005.p1.__impl.A5Wrapper(conn, this, synchronize);
    }
    
}