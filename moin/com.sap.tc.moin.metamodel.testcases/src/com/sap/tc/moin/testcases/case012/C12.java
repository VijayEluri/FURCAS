/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.tc.moin.testcases.case012;

/**
 * This interface is not intended to be implemented by clients.
 */
public interface C12 extends com.sap.tc.moin.repository.mmi.reflect.RefObject {

    /**
     * Descriptors for all features of this MofClass and its supertypes.
     */
    public static final Descriptors DESCRIPTORS = new Descriptors( );

    // class extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.ClassDescriptor<com.sap.tc.moin.repository.mmi.reflect.RefClass, com.sap.tc.moin.testcases.case012.C12> CLASS_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.ClassDescriptor<com.sap.tc.moin.repository.mmi.reflect.RefClass, com.sap.tc.moin.testcases.case012.C12>("45F120A53D0DB73BB01C473B0FF4960E7A1C2DB4", "test.sap.com/tc/moin/metamodel/testcases", "testcases", "case012", "C12"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ 

    
    // operations
    public void operationInInteger(int inInteger) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void operationInD(com.sap.tc.moin.testcases.case012.D12 inD) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void operationInManyBoolean(java.util.Collection<? extends java.lang.Boolean> inManyBoolean) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void operationInManyDs(java.util.Collection<? extends com.sap.tc.moin.testcases.case012.D12> inManyDs) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void operationOutDouble(double[] outDouble) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void operationOutD(com.sap.tc.moin.testcases.case012.D12[] outD) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void operationOutManyFloat(java.util.Collection<? extends java.lang.Float>[] outManyFloat) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void operationOutManyDs(java.util.Collection<? extends com.sap.tc.moin.testcases.case012.D12>[] manyDs) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void operationInoutLong(long[] inoutLong) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void operationInoutLongOptional(java.lang.Long[] inoutLongOptional) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void operationInoutManyLongs(java.util.Collection<? extends java.lang.Long>[] inoutManyLongs) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void operationInoutManyLongsOrdered(java.util.List<? extends java.lang.Long>[] inoutManyLongsOrdered) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void operationInoutD(com.sap.tc.moin.testcases.case012.D12[] inoutD) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void operationInoutManyDs(java.util.Collection<? extends com.sap.tc.moin.testcases.case012.D12>[] inoutManyDs) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public int operationReturnInteger() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.tc.moin.testcases.case012.D12 operationReturnD() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public java.util.Collection<java.lang.Integer> operationReturnManyInteger() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public java.util.Collection<com.sap.tc.moin.testcases.case012.D12> operationReturnManyDs() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;


    public static final class Descriptors {
        Descriptors( ) { 
        }
        private com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.testcases.case012.C12,java.lang.Void> __operationInInteger;
        /**
         * Returns the descriptor for the <code>operationInInteger</code> operation.
         * @return  the descriptor for the <code>operationInInteger</code> operation
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.testcases.case012.C12,java.lang.Void> OPERATION_IN_INTEGER( ) {
            if ( __operationInInteger == null ) {
                __operationInInteger = new com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.testcases.case012.C12,java.lang.Void>( "45F120A540BF2AC6BE7840190428ABA4887C1F5E", "test.sap.com/tc/moin/metamodel/testcases", new java.lang.String[] { "testcases", "case012", "C12", "operationInInteger" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __operationInInteger;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.testcases.case012.C12,java.lang.Void> __operationInD;
        /**
         * Returns the descriptor for the <code>operationInD</code> operation.
         * @return  the descriptor for the <code>operationInD</code> operation
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.testcases.case012.C12,java.lang.Void> OPERATION_IN_D( ) {
            if ( __operationInD == null ) {
                __operationInD = new com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.testcases.case012.C12,java.lang.Void>( "45F120A5AC1B49B1D5B746EF1AD6AFB50C354A09", "test.sap.com/tc/moin/metamodel/testcases", new java.lang.String[] { "testcases", "case012", "C12", "operationInD" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __operationInD;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.testcases.case012.C12,java.lang.Void> __operationInManyBoolean;
        /**
         * Returns the descriptor for the <code>operationInManyBoolean</code> operation.
         * @return  the descriptor for the <code>operationInManyBoolean</code> operation
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.testcases.case012.C12,java.lang.Void> OPERATION_IN_MANY_BOOLEAN( ) {
            if ( __operationInManyBoolean == null ) {
                __operationInManyBoolean = new com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.testcases.case012.C12,java.lang.Void>( "45F120A5A8A3B05CB2D144933D98D3DACCE00743", "test.sap.com/tc/moin/metamodel/testcases", new java.lang.String[] { "testcases", "case012", "C12", "operationInManyBoolean" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __operationInManyBoolean;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.testcases.case012.C12,java.lang.Void> __operationInManyDs;
        /**
         * Returns the descriptor for the <code>operationInManyDs</code> operation.
         * @return  the descriptor for the <code>operationInManyDs</code> operation
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.testcases.case012.C12,java.lang.Void> OPERATION_IN_MANY_DS( ) {
            if ( __operationInManyDs == null ) {
                __operationInManyDs = new com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.testcases.case012.C12,java.lang.Void>( "45F120A541C6A24581644B630118DAF8A996F984", "test.sap.com/tc/moin/metamodel/testcases", new java.lang.String[] { "testcases", "case012", "C12", "operationInManyDs" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __operationInManyDs;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.testcases.case012.C12,java.lang.Void> __operationOutDouble;
        /**
         * Returns the descriptor for the <code>operationOutDouble</code> operation.
         * @return  the descriptor for the <code>operationOutDouble</code> operation
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.testcases.case012.C12,java.lang.Void> OPERATION_OUT_DOUBLE( ) {
            if ( __operationOutDouble == null ) {
                __operationOutDouble = new com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.testcases.case012.C12,java.lang.Void>( "45F120A5790231554BEC489D1E398116933F02E1", "test.sap.com/tc/moin/metamodel/testcases", new java.lang.String[] { "testcases", "case012", "C12", "operationOutDouble" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __operationOutDouble;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.testcases.case012.C12,java.lang.Void> __operationOutD;
        /**
         * Returns the descriptor for the <code>operationOutD</code> operation.
         * @return  the descriptor for the <code>operationOutD</code> operation
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.testcases.case012.C12,java.lang.Void> OPERATION_OUT_D( ) {
            if ( __operationOutD == null ) {
                __operationOutD = new com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.testcases.case012.C12,java.lang.Void>( "45F120A52800FC212F0F41A4141488845ACEA34B", "test.sap.com/tc/moin/metamodel/testcases", new java.lang.String[] { "testcases", "case012", "C12", "operationOutD" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __operationOutD;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.testcases.case012.C12,java.lang.Void> __operationOutManyFloat;
        /**
         * Returns the descriptor for the <code>operationOutManyFloat</code> operation.
         * @return  the descriptor for the <code>operationOutManyFloat</code> operation
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.testcases.case012.C12,java.lang.Void> OPERATION_OUT_MANY_FLOAT( ) {
            if ( __operationOutManyFloat == null ) {
                __operationOutManyFloat = new com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.testcases.case012.C12,java.lang.Void>( "45F120A5E4EC7260798246211AD8A03EEDDBA8FA", "test.sap.com/tc/moin/metamodel/testcases", new java.lang.String[] { "testcases", "case012", "C12", "operationOutManyFloat" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __operationOutManyFloat;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.testcases.case012.C12,java.lang.Void> __operationOutManyDs;
        /**
         * Returns the descriptor for the <code>operationOutManyDs</code> operation.
         * @return  the descriptor for the <code>operationOutManyDs</code> operation
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.testcases.case012.C12,java.lang.Void> OPERATION_OUT_MANY_DS( ) {
            if ( __operationOutManyDs == null ) {
                __operationOutManyDs = new com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.testcases.case012.C12,java.lang.Void>( "45F120A569A0195F89CA4B3B07DA937CC10732BA", "test.sap.com/tc/moin/metamodel/testcases", new java.lang.String[] { "testcases", "case012", "C12", "operationOutManyDs" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __operationOutManyDs;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.testcases.case012.C12,java.lang.Void> __operationInoutLong;
        /**
         * Returns the descriptor for the <code>operationInoutLong</code> operation.
         * @return  the descriptor for the <code>operationInoutLong</code> operation
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.testcases.case012.C12,java.lang.Void> OPERATION_INOUT_LONG( ) {
            if ( __operationInoutLong == null ) {
                __operationInoutLong = new com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.testcases.case012.C12,java.lang.Void>( "45F120A576221E0CBBF547F81904F3539F8673F0", "test.sap.com/tc/moin/metamodel/testcases", new java.lang.String[] { "testcases", "case012", "C12", "operationInoutLong" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __operationInoutLong;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.testcases.case012.C12,java.lang.Void> __operationInoutLongOptional;
        /**
         * Returns the descriptor for the <code>operationInoutLongOptional</code> operation.
         * @return  the descriptor for the <code>operationInoutLongOptional</code> operation
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.testcases.case012.C12,java.lang.Void> OPERATION_INOUT_LONG_OPTIONAL( ) {
            if ( __operationInoutLongOptional == null ) {
                __operationInoutLongOptional = new com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.testcases.case012.C12,java.lang.Void>( "45F120A59EAD4650F36D4B3135B3F105D63C6653", "test.sap.com/tc/moin/metamodel/testcases", new java.lang.String[] { "testcases", "case012", "C12", "operationInoutLongOptional" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __operationInoutLongOptional;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.testcases.case012.C12,java.lang.Void> __operationInoutManyLongs;
        /**
         * Returns the descriptor for the <code>operationInoutManyLongs</code> operation.
         * @return  the descriptor for the <code>operationInoutManyLongs</code> operation
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.testcases.case012.C12,java.lang.Void> OPERATION_INOUT_MANY_LONGS( ) {
            if ( __operationInoutManyLongs == null ) {
                __operationInoutManyLongs = new com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.testcases.case012.C12,java.lang.Void>( "45F120A5C3677498D1A64C280764B4DEFBCF6E27", "test.sap.com/tc/moin/metamodel/testcases", new java.lang.String[] { "testcases", "case012", "C12", "operationInoutManyLongs" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __operationInoutManyLongs;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.testcases.case012.C12,java.lang.Void> __operationInoutManyLongsOrdered;
        /**
         * Returns the descriptor for the <code>operationInoutManyLongsOrdered</code> operation.
         * @return  the descriptor for the <code>operationInoutManyLongsOrdered</code> operation
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.testcases.case012.C12,java.lang.Void> OPERATION_INOUT_MANY_LONGS_ORDERED( ) {
            if ( __operationInoutManyLongsOrdered == null ) {
                __operationInoutManyLongsOrdered = new com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.testcases.case012.C12,java.lang.Void>( "45F120A5A793F7DA808A471A1254E6A3DE6259F4", "test.sap.com/tc/moin/metamodel/testcases", new java.lang.String[] { "testcases", "case012", "C12", "operationInoutManyLongsOrdered" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __operationInoutManyLongsOrdered;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.testcases.case012.C12,java.lang.Void> __operationInoutD;
        /**
         * Returns the descriptor for the <code>operationInoutD</code> operation.
         * @return  the descriptor for the <code>operationInoutD</code> operation
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.testcases.case012.C12,java.lang.Void> OPERATION_INOUT_D( ) {
            if ( __operationInoutD == null ) {
                __operationInoutD = new com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.testcases.case012.C12,java.lang.Void>( "45F120A59377C4A9B2E14E15084EE92AB703FF8B", "test.sap.com/tc/moin/metamodel/testcases", new java.lang.String[] { "testcases", "case012", "C12", "operationInoutD" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __operationInoutD;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.testcases.case012.C12,java.lang.Void> __operationInoutManyDs;
        /**
         * Returns the descriptor for the <code>operationInoutManyDs</code> operation.
         * @return  the descriptor for the <code>operationInoutManyDs</code> operation
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.testcases.case012.C12,java.lang.Void> OPERATION_INOUT_MANY_DS( ) {
            if ( __operationInoutManyDs == null ) {
                __operationInoutManyDs = new com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.testcases.case012.C12,java.lang.Void>( "45F120A5DD12EA7B2E304F32393BBB6FFB7794E9", "test.sap.com/tc/moin/metamodel/testcases", new java.lang.String[] { "testcases", "case012", "C12", "operationInoutManyDs" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __operationInoutManyDs;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.testcases.case012.C12,java.lang.Integer> __operationReturnInteger;
        /**
         * Returns the descriptor for the <code>operationReturnInteger</code> operation.
         * @return  the descriptor for the <code>operationReturnInteger</code> operation
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.testcases.case012.C12,java.lang.Integer> OPERATION_RETURN_INTEGER( ) {
            if ( __operationReturnInteger == null ) {
                __operationReturnInteger = new com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.testcases.case012.C12,java.lang.Integer>( "45F120A5263745C8C0EA4EAF2FAAE5EED186B6F9", "test.sap.com/tc/moin/metamodel/testcases", new java.lang.String[] { "testcases", "case012", "C12", "operationReturnInteger" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __operationReturnInteger;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.testcases.case012.C12,com.sap.tc.moin.testcases.case012.D12> __operationReturnD;
        /**
         * Returns the descriptor for the <code>operationReturnD</code> operation.
         * @return  the descriptor for the <code>operationReturnD</code> operation
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.testcases.case012.C12,com.sap.tc.moin.testcases.case012.D12> OPERATION_RETURN_D( ) {
            if ( __operationReturnD == null ) {
                __operationReturnD = new com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.testcases.case012.C12,com.sap.tc.moin.testcases.case012.D12>( "45F120A5F671C625BF4148881452EDC09986AC66", "test.sap.com/tc/moin/metamodel/testcases", new java.lang.String[] { "testcases", "case012", "C12", "operationReturnD" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __operationReturnD;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.testcases.case012.C12,java.util.Collection<java.lang.Integer>> __operationReturnManyInteger;
        /**
         * Returns the descriptor for the <code>operationReturnManyInteger</code> operation.
         * @return  the descriptor for the <code>operationReturnManyInteger</code> operation
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.testcases.case012.C12,java.util.Collection<java.lang.Integer>> OPERATION_RETURN_MANY_INTEGER( ) {
            if ( __operationReturnManyInteger == null ) {
                __operationReturnManyInteger = new com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.testcases.case012.C12,java.util.Collection<java.lang.Integer>>( "45F120A57D99D9F8BCD847E53815AF5E549A7363", "test.sap.com/tc/moin/metamodel/testcases", new java.lang.String[] { "testcases", "case012", "C12", "operationReturnManyInteger" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __operationReturnManyInteger;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.testcases.case012.C12,java.util.Collection<com.sap.tc.moin.testcases.case012.D12>> __operationReturnManyDs;
        /**
         * Returns the descriptor for the <code>operationReturnManyDs</code> operation.
         * @return  the descriptor for the <code>operationReturnManyDs</code> operation
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.testcases.case012.C12,java.util.Collection<com.sap.tc.moin.testcases.case012.D12>> OPERATION_RETURN_MANY_DS( ) {
            if ( __operationReturnManyDs == null ) {
                __operationReturnManyDs = new com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.testcases.case012.C12,java.util.Collection<com.sap.tc.moin.testcases.case012.D12>>( "45F120A51ACB80CDCF804F6A32418A119E82C743", "test.sap.com/tc/moin/metamodel/testcases", new java.lang.String[] { "testcases", "case012", "C12", "operationReturnManyDs" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __operationReturnManyDs;
        }
    }
}    