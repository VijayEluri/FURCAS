/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.tc.moin.testcases.case024.__impl;

public class A24Wrapper extends com.sap.tc.moin.repository.core.jmi.reflect.RefObjectWrapperImpl<com.sap.tc.moin.testcases.case024.__impl.A24Impl> implements com.sap.tc.moin.testcases.case024.A24,com.sap.tc.moin.repository.Partitionable {

        
    private static final java.util.Map<java.lang.String, java.lang.Integer> OPERATION_IDS;
    
    static {
        
        OPERATION_IDS = new java.util.HashMap<java.lang.String, java.lang.Integer>();
        OPERATION_IDS.put("testJmiCalls", Integer.valueOf(0)); //$NON-NLS-1$
    }

    public A24Wrapper(com.sap.tc.moin.repository.core.CoreConnection conn, com.sap.tc.moin.testcases.case024.__impl.A24Impl baseObject, boolean synchronize) {
        super(conn, baseObject, synchronize);
    }

    private com.sap.tc.moin.testcases.case024.__impl.A24Impl getCastWrappedObject() {
        return (com.sap.tc.moin.testcases.case024.__impl.A24Impl) getWrappedObject();
    }
    
    public com.sap.tc.moin.testcases.case024.__impl.A24Impl unwrap() {
        return (com.sap.tc.moin.testcases.case024.__impl.A24Impl) getWrappedObject();
    }
        
    // methods for attributes
     
    // methods for references
   
    // methods for modeled operations
    public boolean testJmiCalls(com.sap.tc.moin.testcases.case024.A24 someElement) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        java.util.List<java.lang.Object> parameterList = new java.util.ArrayList<java.lang.Object>(1);
        try {
            parameterList.add(someElement);
            return (java.lang.Boolean)___invokeOperation(connection, 0, "487DF65161104E10533A11DDA6510015588353D1", parameterList); //$NON-NLS-1$
        } catch ( com.sap.tc.moin.repository.mmi.reflect.RefException ex ) {
            throw new com.sap.tc.moin.repository.mmi.reflect.JmiException( ex );
        }
    }

    
    // methods for internal modeled operations
    private boolean invoke__testJmiCalls(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.testcases.case024.A24 someElement) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        // begin of implementation provided in tag org.omg.sap2mof.OperationCodeJava
        com.sap.tc.moin.repository.Connection myConnection = ( (com.sap.tc.moin.repository.Partitionable) someElement ).get___Connection( );
        com.sap.tc.moin.testcases.case004.A4 a4 = myConnection.createElementInPartition( com.sap.tc.moin.testcases.case004.A4.class, null );
        com.sap.tc.moin.testcases.case004.B4 b4 = myConnection.createElementInPartition( com.sap.tc.moin.testcases.case004.B4.class, null );
        com.sap.tc.moin.testcases.case004.B4 b4_1 = myConnection.createElementInPartition( com.sap.tc.moin.testcases.case004.B4.class, null );
        com.sap.tc.moin.testcases.case004.B4 b4_2 = myConnection.createElementInPartition( com.sap.tc.moin.testcases.case004.B4.class, null );
        com.sap.tc.moin.testcases.case004.B4 b4_3 = myConnection.createElementInPartition( com.sap.tc.moin.testcases.case004.B4.class, null );

        //primitive attribute
        a4.setOnePrimitive( "TestValue" );

        //object valued attribute to-1
        a4.setOneBoptional( b4 );
        a4.getOneBoptional( );

        //object valued attribute to-n (JmiList)
        a4.getManyBs( ).add( b4_1 );
        java.util.List<com.sap.tc.moin.testcases.case004.B4> listOfB4s = new java.util.ArrayList<com.sap.tc.moin.testcases.case004.B4>( );
        listOfB4s.add( b4_2 );
        listOfB4s.add( b4_3 );
        a4.getManyBs( ).addAll( listOfB4s );
        return true;
        // end of implementation provided in tag org.omg.sap2mof.OperationCodeJava
    }

    // reflective methods
    @Override
    public Object refInvokeOperation(com.sap.tc.moin.repository.core.CoreConnection connection, java.lang.String requestedOperation, java.util.List<? extends Object> args) throws com.sap.tc.moin.repository.mmi.reflect.RefException {
        if (requestedOperation == null) {
            throw new com.sap.tc.moin.repository.mmi.reflect.InvalidNameException(requestedOperation);
        }
        java.lang.Integer operationId = OPERATION_IDS.get(requestedOperation);
        if (operationId == null) {
            throw new com.sap.tc.moin.repository.mmi.reflect.InvalidCallException(requestedOperation, refMetaObject(), "refInvokeOperation(String)"); //$NON-NLS-1$
        }
        switch (operationId) {
                
            case 0:
                return ___invokeOperation( connection, operationId, "487DF65161104E10533A11DDA6510015588353D1", args ); //$NON-NLS-1$    
            default:
                throw new com.sap.tc.moin.repository.mmi.reflect.InvalidCallException(requestedOperation, refMetaObject(), "refInvokeOperation(String)"); //$NON-NLS-1$
        }
    }
    
    @Override
    public Object invoke___Operation(com.sap.tc.moin.repository.core.CoreConnection connection, int operationId, java.util.List<? extends Object> args) throws com.sap.tc.moin.repository.mmi.reflect.RefException {
        switch (operationId) {
                
            case 0:
                return invoke__testJmiCalls(connection, (com.sap.tc.moin.testcases.case024.A24) args.get(0));    
            default:
                throw new com.sap.tc.moin.repository.mmi.reflect.InvalidCallException( operationId, refMetaObject( ), "invoke___Operation(int)"); //$NON-NLS-1$
        }
    
    }    

    // get the JMI interface
    public java.lang.Class<com.sap.tc.moin.testcases.case024.A24> get___JmiInterface() {
        return com.sap.tc.moin.testcases.case024.A24.class;
    }

    // to String
    protected String metaObjectToString() {
        return "com.sap.tc.moin.testcases.case024.A24 (Java Type)\ntestcases.case024.A24 (MOF Type)"; //$NON-NLS-1$
    }    
}