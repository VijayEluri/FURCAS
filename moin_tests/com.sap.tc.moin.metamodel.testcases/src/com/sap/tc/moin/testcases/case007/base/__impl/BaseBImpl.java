/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.tc.moin.testcases.case007.base.__impl;

public final class BaseBImpl extends com.sap.tc.moin.repository.core.jmi.reflect.RefObjectImpl {

    
    static {
    }
    
    // links for multiplicity-n association ends
    private java.util.Collection<com.sap.tc.moin.repository.core.EndStorageLink> __BaseAReferencesBaseB_baseA_476118E36F917569A96F11DCB849001558C93B47;

    // default constructor
    public BaseBImpl() {
        super();
    }
    
    // specific constructor
    public BaseBImpl(java.lang.Object workspace, String mofId, com.sap.tc.moin.repository.mmi.reflect.RefPackage immediatePackage, com.sap.tc.moin.repository.mmi.reflect.RefObject metaObject, com.sap.tc.moin.repository.mmi.reflect.RefClass refClass) {
        super(workspace, mofId, immediatePackage, metaObject, refClass);
    }
    
    // methods for internal attribute setter

    // reflective methods
        
    


    public java.util.List<com.sap.tc.moin.repository.core.EndStorageLink> get___AllStoredLinks( ) {
        java.util.List<com.sap.tc.moin.repository.core.EndStorageLink> result = null;
        if ( __BaseAReferencesBaseB_baseA_476118E36F917569A96F11DCB849001558C93B47 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.addAll( __BaseAReferencesBaseB_baseA_476118E36F917569A96F11DCB849001558C93B47); } 
        return result;

    }

    public java.util.List<com.sap.tc.moin.repository.core.EndStorageLink> get___AllStoredAssociationLinks( ) {
        java.util.List<com.sap.tc.moin.repository.core.EndStorageLink> result = null;
        if ( __BaseAReferencesBaseB_baseA_476118E36F917569A96F11DCB849001558C93B47 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.addAll( __BaseAReferencesBaseB_baseA_476118E36F917569A96F11DCB849001558C93B47); } 
        return result;

    }
    public java.util.Collection<com.sap.tc.moin.repository.core.EndStorageLink> get___AssociationLinks( String associationEndMofId ) {
        if ( associationEndMofId == "476118E36F917569A96F11DCB849001558C93B47" ) { return __BaseAReferencesBaseB_baseA_476118E36F917569A96F11DCB849001558C93B47; } //$NON-NLS-1$ 
        return null;
    }

    public void set___AssociationLinks( java.util.Collection<com.sap.tc.moin.repository.core.EndStorageLink> links, String associationEndMofId ) {
        if ( associationEndMofId == "476118E36F917569A96F11DCB849001558C93B47" ) { __BaseAReferencesBaseB_baseA_476118E36F917569A96F11DCB849001558C93B47 = links; return; } //$NON-NLS-1$ 
    }    
    public java.util.List<com.sap.tc.moin.repository.core.EndStorageLink> clear___AllLinks( ) {
        reset___CompositeParentLink( );
        java.util.List<com.sap.tc.moin.repository.core.EndStorageLink> result = null;
        if ( __BaseAReferencesBaseB_baseA_476118E36F917569A96F11DCB849001558C93B47 != null ) { if ( result == null ) result = new java.util.ArrayList<com.sap.tc.moin.repository.core.EndStorageLink>( ); result.addAll( __BaseAReferencesBaseB_baseA_476118E36F917569A96F11DCB849001558C93B47); __BaseAReferencesBaseB_baseA_476118E36F917569A96F11DCB849001558C93B47 = null; } 
        return result;

    }
    // get the JMI interface
    public java.lang.Class<com.sap.tc.moin.testcases.case007.base.BaseB> get___JmiInterface() {
        return com.sap.tc.moin.testcases.case007.base.BaseB.class;
    }

    // create the wrapper
    @Override
    public com.sap.tc.moin.repository.spi.core.Wrapper<com.sap.tc.moin.testcases.case007.base.__impl.BaseBImpl> createWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, boolean synchronize) {
        return new com.sap.tc.moin.testcases.case007.base.__impl.BaseBWrapper(conn, this, synchronize);
    }
    
}