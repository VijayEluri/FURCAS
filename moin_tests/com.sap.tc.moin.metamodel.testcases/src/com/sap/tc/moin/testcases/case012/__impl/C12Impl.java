/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.tc.moin.testcases.case012.__impl;

public final class C12Impl extends com.sap.tc.moin.repository.core.jmi.reflect.RefObjectImpl {

        
    private static final java.util.Map<java.lang.String, java.lang.Integer> OPERATION_IDS;
    
    static {
        
        OPERATION_IDS = new java.util.HashMap<java.lang.String, java.lang.Integer>(24);
        OPERATION_IDS.put("operationInInteger", Integer.valueOf(0)); //$NON-NLS-1$
        OPERATION_IDS.put("operationInD", Integer.valueOf(1)); //$NON-NLS-1$
        OPERATION_IDS.put("operationInManyBoolean", Integer.valueOf(2)); //$NON-NLS-1$
        OPERATION_IDS.put("operationInManyDs", Integer.valueOf(3)); //$NON-NLS-1$
        OPERATION_IDS.put("operationOutDouble", Integer.valueOf(4)); //$NON-NLS-1$
        OPERATION_IDS.put("operationOutD", Integer.valueOf(5)); //$NON-NLS-1$
        OPERATION_IDS.put("operationOutManyFloat", Integer.valueOf(6)); //$NON-NLS-1$
        OPERATION_IDS.put("operationOutManyDs", Integer.valueOf(7)); //$NON-NLS-1$
        OPERATION_IDS.put("operationInoutLong", Integer.valueOf(8)); //$NON-NLS-1$
        OPERATION_IDS.put("operationInoutLongOptional", Integer.valueOf(9)); //$NON-NLS-1$
        OPERATION_IDS.put("operationInoutManyLongs", Integer.valueOf(10)); //$NON-NLS-1$
        OPERATION_IDS.put("operationInoutManyLongsOrdered", Integer.valueOf(11)); //$NON-NLS-1$
        OPERATION_IDS.put("operationInoutD", Integer.valueOf(12)); //$NON-NLS-1$
        OPERATION_IDS.put("operationInoutManyDs", Integer.valueOf(13)); //$NON-NLS-1$
        OPERATION_IDS.put("operationReturnInteger", Integer.valueOf(14)); //$NON-NLS-1$
        OPERATION_IDS.put("operationReturnD", Integer.valueOf(15)); //$NON-NLS-1$
        OPERATION_IDS.put("operationReturnManyInteger", Integer.valueOf(16)); //$NON-NLS-1$
        OPERATION_IDS.put("operationReturnManyDs", Integer.valueOf(17)); //$NON-NLS-1$
    }
    
    // default constructor
    public C12Impl() {
        super();
    }
    
    // specific constructor
    public C12Impl(java.lang.Object workspace, String mofId, com.sap.tc.moin.repository.mmi.reflect.RefPackage immediatePackage, com.sap.tc.moin.repository.mmi.reflect.RefObject metaObject, com.sap.tc.moin.repository.mmi.reflect.RefClass refClass) {
        super(workspace, mofId, immediatePackage, metaObject, refClass);
    }
    
    // methods for internal attribute setter

    // reflective methods
        
    


    // get the JMI interface
    public java.lang.Class<com.sap.tc.moin.testcases.case012.C12> get___JmiInterface() {
        return com.sap.tc.moin.testcases.case012.C12.class;
    }

    // create the wrapper
    @Override
    public com.sap.tc.moin.repository.spi.core.Wrapper<com.sap.tc.moin.testcases.case012.__impl.C12Impl> createWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, boolean synchronize) {
        return new com.sap.tc.moin.testcases.case012.__impl.C12Wrapper(conn, this, synchronize);
    }
    
}