/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.tc.moin.testcases.case018.__impl;

public final class A18Impl extends com.sap.tc.moin.repository.core.jmi.reflect.RefObjectImpl {

        
    public static final java.util.Map<java.lang.String, java.lang.Integer> FEATURE_IDS;
    
    static {
        
        FEATURE_IDS = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
        FEATURE_IDS.put("foundationAttributeA1f", Integer.valueOf(0)); //$NON-NLS-1$
    }
    
    // links for multiplicity-1 association ends
    private com.sap.tc.moin.repository.core.EndStorageLink __usesA1FromFoundation_a1FromFoundation_45F120A563FDEA49B1844AA50088BDC4543F054A;

    // links for multiplicity-1 object-valued attributes
    private com.sap.tc.moin.repository.core.EndStorageLink __foundationAttributeA1f;

    // default constructor
    public A18Impl() {
        super();
    }
    
    // specific constructor
    public A18Impl(java.lang.Object workspace, String mofId, com.sap.tc.moin.repository.mmi.reflect.RefPackage immediatePackage, com.sap.tc.moin.repository.mmi.reflect.RefObject metaObject, com.sap.tc.moin.repository.mmi.reflect.RefClass refClass) {
        super(workspace, mofId, immediatePackage, metaObject, refClass);
    }
    
    // methods for attributes
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getFoundationAttributeA1f() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) ___getElementAtOtherLinkEnd( get___CurrentConnection(), __foundationAttributeA1f);
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getFoundationAttributeA1f(com.sap.tc.moin.repository.core.CoreConnection connection) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) ___getElementAtOtherLinkEnd( connection, __foundationAttributeA1f);
    }
    public void setFoundationAttributeA1f(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeObjectAttribute(get___CurrentConnection(), "45F120A53BEC7E6098C3418531ADC9567AD8027B", newValue); //$NON-NLS-1$
    }
    public void setFoundationAttributeA1f(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          ___changeObjectAttribute(connection, "45F120A53BEC7E6098C3418531ADC9567AD8027B", newValue); //$NON-NLS-1$
    }

    // methods for internal attribute setter
    private void set__FoundationAttributeA1f(com.sap.tc.moin.repository.core.CoreSession session, java.lang.Object newValue) {
        ___loadLinks(session, "45F120A53BEC7E6098C3418531ADC9567AD8027B" /* "foundationAttributeA1f" */, newValue, 1); //$NON-NLS-1$ //$NON-NLS-2$
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
                result = getFoundationAttributeA1f(connection);
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
                ___changeObjectAttribute(connection, "45F120A53BEC7E6098C3418531ADC9567AD8027B", value); //$NON-NLS-1$
                break;
                    
        default:
            throw new com.sap.tc.moin.repository.mmi.reflect.InvalidCallException(featureName, null, "refSetValue(String)"); //$NON-NLS-1$
        }
    }
    
    public void set___Value(com.sap.tc.moin.repository.core.CoreSession session, java.lang.String featureName, java.lang.Object value) {
        switch (FEATURE_IDS.get(featureName)) {
            case 0:
                set__FoundationAttributeA1f(session, value);     
                break;
            default:
                throw new com.sap.tc.moin.repository.mmi.reflect.InvalidCallException(featureName, refMetaObject(), "set___Value(String)"); //$NON-NLS-1$
        }
    }
    
    public void set___Value(com.sap.tc.moin.repository.core.CoreSession session, int featureId, java.lang.Object value) {
        switch (featureId) {
            case 0:
                set__FoundationAttributeA1f(session, value);     
                break;
            default:
                throw new com.sap.tc.moin.repository.mmi.reflect.InvalidCallException(featureId, refMetaObject(), "set___Value(int)"); //$NON-NLS-1$
        }
    }
    
    public void addOrSet___Value(com.sap.tc.moin.repository.core.CoreSession session, java.lang.String featureName, java.lang.Object value) {
        switch (FEATURE_IDS.get(featureName)) {
            case 0:
                set__FoundationAttributeA1f(session, value);         
                break;
            default:
                throw new com.sap.tc.moin.repository.mmi.reflect.InvalidCallException(featureName, refMetaObject(), "addOrSet___Value(String)"); //$NON-NLS-1$
        }
    }    
    


    public void set___AssociationLink( String associationEndMofId, com.sap.tc.moin.repository.core.EndStorageLink value ) {
        if ( associationEndMofId == "45F120A563FDEA49B1844AA50088BDC4543F054A" ) { __usesA1FromFoundation_a1FromFoundation_45F120A563FDEA49B1844AA50088BDC4543F054A = value; return; } //$NON-NLS-1$ 
    }
    
    public com.sap.tc.moin.repository.core.EndStorageLink get___AssociationLink( String associationEndMofId ) {
        if ( associationEndMofId == "45F120A563FDEA49B1844AA50088BDC4543F054A" ) { return __usesA1FromFoundation_a1FromFoundation_45F120A563FDEA49B1844AA50088BDC4543F054A; } //$NON-NLS-1$ 
        return null;
    }
    public void set___AttributeLink( String attributeMofId, com.sap.tc.moin.repository.core.EndStorageLink value ) {
        if ( attributeMofId == "45F120A53BEC7E6098C3418531ADC9567AD8027B" ) { __foundationAttributeA1f = value; return; } //$NON-NLS-1$ 
    }

    public com.sap.tc.moin.repository.core.EndStorageLink get___AttributeLink( String attributeMofId ) {
        if ( attributeMofId == "45F120A53BEC7E6098C3418531ADC9567AD8027B" ) { return __foundationAttributeA1f; } //$NON-NLS-1$ 
        return null;
    }
    public java.util.List<com.sap.tc.moin.repository.core.EndStorageLink> get___AllStoredLinks( ) {
        java.util.List<com.sap.tc.moin.repository.core.EndStorageLink> result = null;
        if ( __usesA1FromFoundation_a1FromFoundation_45F120A563FDEA49B1844AA50088BDC4543F054A != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __usesA1FromFoundation_a1FromFoundation_45F120A563FDEA49B1844AA50088BDC4543F054A); } 
        if ( __foundationAttributeA1f != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __foundationAttributeA1f); } 
        return result;

    }

    public java.util.List<com.sap.tc.moin.repository.core.EndStorageLink> get___AllStoredAssociationLinks( ) {
        java.util.List<com.sap.tc.moin.repository.core.EndStorageLink> result = null;
        if ( __usesA1FromFoundation_a1FromFoundation_45F120A563FDEA49B1844AA50088BDC4543F054A != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __usesA1FromFoundation_a1FromFoundation_45F120A563FDEA49B1844AA50088BDC4543F054A); } 
        return result;

    }
    public java.util.List<com.sap.tc.moin.repository.core.EndStorageLink> clear___AllLinks( ) {
        reset___CompositeParentLink( );
        java.util.List<com.sap.tc.moin.repository.core.EndStorageLink> result = null;
        if ( __usesA1FromFoundation_a1FromFoundation_45F120A563FDEA49B1844AA50088BDC4543F054A != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __usesA1FromFoundation_a1FromFoundation_45F120A563FDEA49B1844AA50088BDC4543F054A); __usesA1FromFoundation_a1FromFoundation_45F120A563FDEA49B1844AA50088BDC4543F054A = null; } 
        if ( __foundationAttributeA1f != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.add( __foundationAttributeA1f); __foundationAttributeA1f = null; } 
        return result;

    }
    // get the JMI interface
    public java.lang.Class<com.sap.tc.moin.testcases.case018.A18> get___JmiInterface() {
        return com.sap.tc.moin.testcases.case018.A18.class;
    }

    // create the wrapper
    @Override
    public com.sap.tc.moin.repository.spi.core.Wrapper<com.sap.tc.moin.testcases.case018.__impl.A18Impl> createWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, boolean synchronize) {
        return new com.sap.tc.moin.testcases.case018.__impl.A18Wrapper(conn, this, synchronize);
    }
    
}