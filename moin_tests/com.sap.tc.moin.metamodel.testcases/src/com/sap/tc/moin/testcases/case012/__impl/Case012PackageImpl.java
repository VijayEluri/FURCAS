/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.tc.moin.testcases.case012.__impl;

public final class Case012PackageImpl extends com.sap.tc.moin.repository.core.jmi.reflect.RefPackageImpl
{
        
    public static final java.util.Map<java.lang.String, java.lang.Integer> FEATURE_IDS;
    
    static {
        
        FEATURE_IDS = new java.util.HashMap<java.lang.String, java.lang.Integer>(6);
        FEATURE_IDS.put("C12", Integer.valueOf(0)); //$NON-NLS-1$
        FEATURE_IDS.put("D12", Integer.valueOf(1)); //$NON-NLS-1$
        FEATURE_IDS.put("A12", Integer.valueOf(2)); //$NON-NLS-1$
        FEATURE_IDS.put("B12", Integer.valueOf(3)); //$NON-NLS-1$
    }

    // constructors    
    public Case012PackageImpl()
    {
        super();
    }
    public Case012PackageImpl(java.lang.Object workspace, java.lang.String mofId, com.sap.tc.moin.repository.mmi.reflect.RefPackage immediatePackage, com.sap.tc.moin.repository.mmi.reflect.RefObject metaObject)
    {
        super(workspace, mofId, immediatePackage, metaObject);
    }
    // internal enumeration creators
    // internal structure type creators
    // nested packages
    // classes
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getC12(com.sap.tc.moin.repository.core.CoreConnection connection) {
        return  refClass(connection, "C12"); //$NON-NLS-1$
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getD12(com.sap.tc.moin.repository.core.CoreConnection connection) {
        return  refClass(connection, "D12"); //$NON-NLS-1$
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getA12(com.sap.tc.moin.repository.core.CoreConnection connection) {
        return  refClass(connection, "A12"); //$NON-NLS-1$
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getB12(com.sap.tc.moin.repository.core.CoreConnection connection) {
        return  refClass(connection, "B12"); //$NON-NLS-1$
    }
    // associations
    // structure type creators

    protected java.lang.Object create___Extent(java.lang.Object workspace, java.lang.String mofId, com.sap.tc.moin.repository.mmi.reflect.RefPackage immediatePackage, com.sap.tc.moin.repository.mmi.reflect.RefObject metaObject) {
        java.lang.String name = ((com.sap.tc.moin.repository.mmi.model.ModelElement) metaObject).getName();
        com.sap.tc.moin.repository.mmi.reflect.RefBaseObject result = null;
        try {
            switch (FEATURE_IDS.get(name)) {
                case 0:
                    return new com.sap.tc.moin.repository.core.jmi.reflect.RefClassImpl(workspace, mofId, immediatePackage, metaObject, Class.forName("com.sap.tc.moin.testcases.case012.__impl.C12Impl")); //$NON-NLS-1$
                case 1:
                    return new com.sap.tc.moin.repository.core.jmi.reflect.RefClassImpl(workspace, mofId, immediatePackage, metaObject, Class.forName("com.sap.tc.moin.testcases.case012.__impl.D12Impl")); //$NON-NLS-1$
                case 2:
                    return new com.sap.tc.moin.repository.core.jmi.reflect.RefClassImpl(workspace, mofId, immediatePackage, metaObject, Class.forName("com.sap.tc.moin.testcases.case012.__impl.A12Impl")); //$NON-NLS-1$
                case 3:
                    return new com.sap.tc.moin.repository.core.jmi.reflect.RefClassImpl(workspace, mofId, immediatePackage, metaObject, Class.forName("com.sap.tc.moin.testcases.case012.__impl.B12Impl")); //$NON-NLS-1$
                default:
                    throw new com.sap.tc.moin.repository.mmi.reflect.InvalidCallException(name, null, "create___Extent()"); //$NON-NLS-1$
        }
        }
        catch(com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            throw ex;
        }
        catch(java.lang.Exception ex) {
            throw new com.sap.tc.moin.repository.mmi.reflect.JmiException(ex);
        }        
    }

    public java.lang.Class<com.sap.tc.moin.testcases.case012.Case012Package> get___JmiInterface() {
        return com.sap.tc.moin.testcases.case012.Case012Package.class;
    }
    
    protected void initialize() {
        if (___refPackages == null) {
            ___refPackages = new java.util.ArrayList<RefPackageAndName>(0);
            ___refPackagesByName = new java.util.HashMap<String, RefPackageAndName>();
            java.lang.String name = ""; //$NON-NLS-1$
            RefPackageAndName rpan = null;
        }
  
        if (___refClasses == null) {
            ___refClasses = new java.util.ArrayList<RefClassAndName>(4);
            ___refClassesByName = new java.util.HashMap<String, RefClassAndName>();
            java.lang.String name = ""; //$NON-NLS-1$
            RefClassAndName rcan = null;
            name = "C12"; //$NON-NLS-1$
            rcan = new RefClassAndName(name, "com.sap.tc.moin.testcases.case012.C12"); //$NON-NLS-1$
            ___refClasses.add(rcan);
            ___refClassesByName.put(name, rcan);
            name = "D12"; //$NON-NLS-1$
            rcan = new RefClassAndName(name, "com.sap.tc.moin.testcases.case012.D12"); //$NON-NLS-1$
            ___refClasses.add(rcan);
            ___refClassesByName.put(name, rcan);
            name = "A12"; //$NON-NLS-1$
            rcan = new RefClassAndName(name, "com.sap.tc.moin.testcases.case012.A12"); //$NON-NLS-1$
            ___refClasses.add(rcan);
            ___refClassesByName.put(name, rcan);
            name = "B12"; //$NON-NLS-1$
            rcan = new RefClassAndName(name, "com.sap.tc.moin.testcases.case012.B12"); //$NON-NLS-1$
            ___refClasses.add(rcan);
            ___refClassesByName.put(name, rcan);
        }
  
        if (___refAssociations == null) {
            ___refAssociations = new java.util.ArrayList<RefAssociationAndName>(0);
            ___refAssociationsByName = new java.util.HashMap<String, RefAssociationAndName>();
            java.lang.String name = ""; //$NON-NLS-1$
            RefAssociationAndName raan = null;
        }
    }
    
    @Override
    public com.sap.tc.moin.repository.spi.core.Wrapper<com.sap.tc.moin.testcases.case012.__impl.Case012PackageImpl> createWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, boolean synchronize) {
        return new com.sap.tc.moin.testcases.case012.__impl.Case012PackageWrapper(conn, this, synchronize);
    }

}