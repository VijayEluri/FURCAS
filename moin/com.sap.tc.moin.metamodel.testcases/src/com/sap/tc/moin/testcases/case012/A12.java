/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.tc.moin.testcases.case012;

/**
 * This interface is not intended to be implemented by clients.
 */
public interface A12 extends com.sap.tc.moin.repository.mmi.reflect.RefObject {

    /**
     * Descriptors for all features of this MofClass and its supertypes.
     */
    public static final Descriptors DESCRIPTORS = new Descriptors( );

    // class extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.ClassDescriptor<com.sap.tc.moin.repository.mmi.reflect.RefClass, com.sap.tc.moin.testcases.case012.A12> CLASS_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.ClassDescriptor<com.sap.tc.moin.repository.mmi.reflect.RefClass, com.sap.tc.moin.testcases.case012.A12>("47A97A49D1BBA958D49311DC8EB7001558C93B47", "test.sap.com/tc/moin/metamodel/testcases", "testcases", "case012", "A12"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ 

    
    // attributes
    public com.sap.tc.moin.testcases.case012.D12 getAttributeD12() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setAttributeD12(com.sap.tc.moin.testcases.case012.D12 newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;

    // operations
    public com.sap.tc.moin.testcases.case012.D12 operationWithObjectParameters(com.sap.tc.moin.testcases.case012.D12 paramD12) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.tc.moin.testcases.case012.A12 operationWithThisAsReturnParameter() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.tc.moin.testcases.case012.D12 operationGetAttributeD12() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;


    public static final class Descriptors {
        Descriptors( ) { 
        }
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.tc.moin.testcases.case012.A12,com.sap.tc.moin.testcases.case012.D12> __attributeD12;
        /**
         * Returns the descriptor for the <code>attributeD12</code> attribute.
         * @return  the descriptor for the <code>attributeD12</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.tc.moin.testcases.case012.A12,com.sap.tc.moin.testcases.case012.D12> ATTRIBUTE_D12( ) {
            if ( __attributeD12 == null ) {
                __attributeD12 = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.tc.moin.testcases.case012.A12,com.sap.tc.moin.testcases.case012.D12>( "47A97A49D1BBA950D49311DC81A3001558C93B47", "test.sap.com/tc/moin/metamodel/testcases", new java.lang.String[] { "testcases", "case012", "A12", "attributeD12" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __attributeD12;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.testcases.case012.A12,com.sap.tc.moin.testcases.case012.D12> __operationWithObjectParameters;
        /**
         * Returns the descriptor for the <code>operationWithObjectParameters</code> operation.
         * @return  the descriptor for the <code>operationWithObjectParameters</code> operation
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.testcases.case012.A12,com.sap.tc.moin.testcases.case012.D12> OPERATION_WITH_OBJECT_PARAMETERS( ) {
            if ( __operationWithObjectParameters == null ) {
                __operationWithObjectParameters = new com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.testcases.case012.A12,com.sap.tc.moin.testcases.case012.D12>( "47A97A49D1BBA953D49311DCB4C6001558C93B47", "test.sap.com/tc/moin/metamodel/testcases", new java.lang.String[] { "testcases", "case012", "A12", "operationWithObjectParameters" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __operationWithObjectParameters;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.testcases.case012.A12,com.sap.tc.moin.testcases.case012.A12> __operationWithThisAsReturnParameter;
        /**
         * Returns the descriptor for the <code>operationWithThisAsReturnParameter</code> operation.
         * @return  the descriptor for the <code>operationWithThisAsReturnParameter</code> operation
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.testcases.case012.A12,com.sap.tc.moin.testcases.case012.A12> OPERATION_WITH_THIS_AS_RETURN_PARAMETER( ) {
            if ( __operationWithThisAsReturnParameter == null ) {
                __operationWithThisAsReturnParameter = new com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.testcases.case012.A12,com.sap.tc.moin.testcases.case012.A12>( "47A97A49D1BBA955D49311DCC1C3001558C93B47", "test.sap.com/tc/moin/metamodel/testcases", new java.lang.String[] { "testcases", "case012", "A12", "operationWithThisAsReturnParameter" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __operationWithThisAsReturnParameter;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.testcases.case012.A12,com.sap.tc.moin.testcases.case012.D12> __operationGetAttributeD12;
        /**
         * Returns the descriptor for the <code>operationGetAttributeD12</code> operation.
         * @return  the descriptor for the <code>operationGetAttributeD12</code> operation
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.testcases.case012.A12,com.sap.tc.moin.testcases.case012.D12> OPERATION_GET_ATTRIBUTE_D12( ) {
            if ( __operationGetAttributeD12 == null ) {
                __operationGetAttributeD12 = new com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.testcases.case012.A12,com.sap.tc.moin.testcases.case012.D12>( "47A97A49D1BBA957D49311DCC24D001558C93B47", "test.sap.com/tc/moin/metamodel/testcases", new java.lang.String[] { "testcases", "case012", "A12", "operationGetAttributeD12" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __operationGetAttributeD12;
        }
    }
}    