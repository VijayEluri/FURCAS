/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.tc.moin.testcases.case004;

/**
 * This interface is not intended to be implemented by clients.
 */
public interface F4 extends com.sap.tc.moin.repository.mmi.reflect.RefObject {

    /**
     * Descriptors for all features of this MofClass and its supertypes.
     */
    public static final Descriptors DESCRIPTORS = new Descriptors( );

    // class extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.ClassDescriptor<com.sap.tc.moin.repository.mmi.reflect.RefClass, com.sap.tc.moin.testcases.case004.F4> CLASS_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.ClassDescriptor<com.sap.tc.moin.repository.mmi.reflect.RefClass, com.sap.tc.moin.testcases.case004.F4>("45F120A57E4CF493F2554D201E5B9259CB1A21D7", "test.sap.com/tc/moin/metamodel/testcases", "testcases", "case004", "F4"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ 

    
    // attributes
    public com.sap.tc.moin.testcases.case004.C4 getOneC() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setOneC(com.sap.tc.moin.testcases.case004.C4 newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public java.util.Collection<com.sap.tc.moin.testcases.case004.C4> getManyCs() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public java.util.List<com.sap.tc.moin.testcases.case004.C4> getManyCsOrdered() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;


    public static final class Descriptors {
        Descriptors( ) { 
        }
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.tc.moin.testcases.case004.F4,com.sap.tc.moin.testcases.case004.C4> __oneC;
        /**
         * Returns the descriptor for the <code>oneC</code> attribute.
         * @return  the descriptor for the <code>oneC</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.tc.moin.testcases.case004.F4,com.sap.tc.moin.testcases.case004.C4> ONE_C( ) {
            if ( __oneC == null ) {
                __oneC = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.tc.moin.testcases.case004.F4,com.sap.tc.moin.testcases.case004.C4>( "45F120A51A63D23BE4E54B8621B9EEB51955EEB3", "test.sap.com/tc/moin/metamodel/testcases", new java.lang.String[] { "testcases", "case004", "F4", "oneC" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __oneC;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.tc.moin.testcases.case004.F4,java.util.Collection<com.sap.tc.moin.testcases.case004.C4>> __manyCs;
        /**
         * Returns the descriptor for the <code>manyCs</code> attribute.
         * @return  the descriptor for the <code>manyCs</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.tc.moin.testcases.case004.F4,java.util.Collection<com.sap.tc.moin.testcases.case004.C4>> MANY_CS( ) {
            if ( __manyCs == null ) {
                __manyCs = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.tc.moin.testcases.case004.F4,java.util.Collection<com.sap.tc.moin.testcases.case004.C4>>( "45F120A538562EABE12843AB3230C31F8795F1E7", "test.sap.com/tc/moin/metamodel/testcases", new java.lang.String[] { "testcases", "case004", "F4", "manyCs" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __manyCs;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.tc.moin.testcases.case004.F4,java.util.List<com.sap.tc.moin.testcases.case004.C4>> __manyCsOrdered;
        /**
         * Returns the descriptor for the <code>manyCsOrdered</code> attribute.
         * @return  the descriptor for the <code>manyCsOrdered</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.tc.moin.testcases.case004.F4,java.util.List<com.sap.tc.moin.testcases.case004.C4>> MANY_CS_ORDERED( ) {
            if ( __manyCsOrdered == null ) {
                __manyCsOrdered = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.tc.moin.testcases.case004.F4,java.util.List<com.sap.tc.moin.testcases.case004.C4>>( "45F574532E5DE60511534D7226BCA43F235EFDF9", "test.sap.com/tc/moin/metamodel/testcases", new java.lang.String[] { "testcases", "case004", "F4", "manyCsOrdered" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __manyCsOrdered;
        }
    }
}    