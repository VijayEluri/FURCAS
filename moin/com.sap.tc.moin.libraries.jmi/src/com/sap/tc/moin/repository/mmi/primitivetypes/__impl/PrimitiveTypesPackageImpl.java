/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.tc.moin.repository.mmi.primitivetypes.__impl;

public final class PrimitiveTypesPackageImpl extends com.sap.tc.moin.repository.core.jmi.reflect.RefPackageImpl implements com.sap.tc.moin.repository.mmi.primitivetypes.PrimitiveTypesPackage,com.sap.tc.moin.repository.mmi.primitivetypes.__impl.PrimitiveTypesPackageInternal
{
    
    static {
    }

    // constructors    
    public PrimitiveTypesPackageImpl()
    {
        super();
    }
    public PrimitiveTypesPackageImpl(java.lang.Object workspace, java.lang.String mofId, com.sap.tc.moin.repository.mmi.reflect.RefPackage immediatePackage, com.sap.tc.moin.repository.mmi.reflect.RefObject metaObject)
    {
        super(workspace, mofId, immediatePackage, metaObject);
    }
    // internal enumeration creators
    // internal structure type creators
    // nested packages
    // classes
    // associations
    // structure type creators

    protected java.lang.Object create___Extent(java.lang.Object workspace, java.lang.String mofId, com.sap.tc.moin.repository.mmi.reflect.RefPackage immediatePackage, com.sap.tc.moin.repository.mmi.reflect.RefObject metaObject) {
        java.lang.String name = ((com.sap.tc.moin.repository.mmi.model.ModelElement) metaObject).getName();
        throw new com.sap.tc.moin.repository.mmi.reflect.InvalidCallException(name, null, "create___Extent()"); //$NON-NLS-1$        
    }

    public java.lang.Class<com.sap.tc.moin.repository.mmi.primitivetypes.PrimitiveTypesPackage> get___JmiInterface() {
        return com.sap.tc.moin.repository.mmi.primitivetypes.PrimitiveTypesPackage.class;
    }
    
    protected void initialize() {
        if (___refPackages == null) {
            ___refPackages = new java.util.ArrayList<RefPackageAndName>(0);
            ___refPackagesByName = new java.util.HashMap<String, RefPackageAndName>();
            java.lang.String name = ""; //$NON-NLS-1$
            RefPackageAndName rpan = null;
        }
  
        if (___refClasses == null) {
            ___refClasses = new java.util.ArrayList<RefClassAndName>(0);
            ___refClassesByName = new java.util.HashMap<String, RefClassAndName>();
            java.lang.String name = ""; //$NON-NLS-1$
            RefClassAndName rcan = null;
        }
  
        if (___refAssociations == null) {
            ___refAssociations = new java.util.ArrayList<RefAssociationAndName>(0);
            ___refAssociationsByName = new java.util.HashMap<String, RefAssociationAndName>();
            java.lang.String name = ""; //$NON-NLS-1$
            RefAssociationAndName raan = null;
        }
    }
    
    @Override
    public com.sap.tc.moin.repository.spi.core.Wrapper<com.sap.tc.moin.repository.mmi.primitivetypes.__impl.PrimitiveTypesPackageImpl> createWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, boolean synchronize) {
        return new com.sap.tc.moin.repository.mmi.primitivetypes.__impl.PrimitiveTypesPackageWrapper(conn, this, synchronize);
    }

}