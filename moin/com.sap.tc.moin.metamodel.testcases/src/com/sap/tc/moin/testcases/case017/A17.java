/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.tc.moin.testcases.case017;

/**
 * This interface is not intended to be implemented by clients.
 */
public interface A17 extends com.sap.tc.moin.repository.mmi.reflect.RefObject {

    /**
     * Descriptors for all features of this MofClass and its supertypes.
     */
    public static final Descriptors DESCRIPTORS = new Descriptors( );

    // class extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.ClassDescriptor<com.sap.tc.moin.repository.mmi.reflect.RefClass, com.sap.tc.moin.testcases.case017.A17> CLASS_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.ClassDescriptor<com.sap.tc.moin.repository.mmi.reflect.RefClass, com.sap.tc.moin.testcases.case017.A17>("45F120A5262EE936B46A48E038C5DC113D1AFB10", "test.sap.com/tc/moin/metamodel/testcases", "testcases", "case017", "A17"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ 

    
    // references
    public java.util.Collection<com.sap.tc.moin.testcases.case017.A17> getToEnd() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.tc.moin.testcases.case017.A17 getFromEnd() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setFromEnd(com.sap.tc.moin.testcases.case017.A17 newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;


    public static final class Descriptors {
        Descriptors( ) { 
        }
        private com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.tc.moin.testcases.case017.A17,java.util.Collection<com.sap.tc.moin.testcases.case017.A17>> __toEnd;
        /**
         * Returns the descriptor for the <code>toEnd</code> reference.
         * @return  the descriptor for the <code>toEnd</code> reference
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.tc.moin.testcases.case017.A17,java.util.Collection<com.sap.tc.moin.testcases.case017.A17>> TO_END( ) {
            if ( __toEnd == null ) {
                __toEnd = new com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.tc.moin.testcases.case017.A17,java.util.Collection<com.sap.tc.moin.testcases.case017.A17>>( "45F120A59365046106C64AA2352EB4C5CCB305EB", "test.sap.com/tc/moin/metamodel/testcases", new java.lang.String[] { "testcases", "case017", "A17", "toEnd" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __toEnd;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.tc.moin.testcases.case017.A17,com.sap.tc.moin.testcases.case017.A17> __fromEnd;
        /**
         * Returns the descriptor for the <code>fromEnd</code> reference.
         * @return  the descriptor for the <code>fromEnd</code> reference
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.tc.moin.testcases.case017.A17,com.sap.tc.moin.testcases.case017.A17> FROM_END( ) {
            if ( __fromEnd == null ) {
                __fromEnd = new com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.tc.moin.testcases.case017.A17,com.sap.tc.moin.testcases.case017.A17>( "45F120A5A7D37A15936447613D81F4591F925187", "test.sap.com/tc/moin/metamodel/testcases", new java.lang.String[] { "testcases", "case017", "A17", "fromEnd" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __fromEnd;
        }
    }
}    