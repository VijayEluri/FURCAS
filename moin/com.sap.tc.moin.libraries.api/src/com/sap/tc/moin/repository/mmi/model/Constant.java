/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.tc.moin.repository.mmi.model;

/**
 * This interface is not intended to be implemented by clients.
 */
public interface Constant extends com.sap.tc.moin.repository.mmi.model.TypedElement {

    /**
     * Descriptors for all features of this MofClass and its supertypes.
     */
    public static final Descriptors DESCRIPTORS = new Descriptors( );

    // class extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.ClassDescriptor<com.sap.tc.moin.repository.mmi.reflect.RefClass, com.sap.tc.moin.repository.mmi.model.Constant> CLASS_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.ClassDescriptor<com.sap.tc.moin.repository.mmi.reflect.RefClass, com.sap.tc.moin.repository.mmi.model.Constant>("45ED2E29050B855406AE42C81E9EA97E02EFA276", "sap.com/tc/moin/mof_1.4", "Model", "Constant"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ 

    
    // attributes
    public java.lang.String getValue() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setValue(java.lang.String newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;


    public static final class Descriptors {
        Descriptors( ) { 
        }
        /**
         * Returns the descriptor for the <code>name</code> attribute.
         * @return  the descriptor for the <code>name</code> attribute
         */
        public com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.tc.moin.repository.mmi.model.ModelElement,java.lang.String> NAME( ) {
            return com.sap.tc.moin.repository.mmi.model.ModelElement.DESCRIPTORS.NAME( );
        }
        /**
         * Returns the descriptor for the <code>annotation</code> attribute.
         * @return  the descriptor for the <code>annotation</code> attribute
         */
        public com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.tc.moin.repository.mmi.model.ModelElement,java.lang.String> ANNOTATION( ) {
            return com.sap.tc.moin.repository.mmi.model.ModelElement.DESCRIPTORS.ANNOTATION( );
        }
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.tc.moin.repository.mmi.model.Constant,java.lang.String> __value;
        /**
         * Returns the descriptor for the <code>value</code> attribute.
         * @return  the descriptor for the <code>value</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.tc.moin.repository.mmi.model.Constant,java.lang.String> VALUE( ) {
            if ( __value == null ) {
                __value = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.tc.moin.repository.mmi.model.Constant,java.lang.String>( "45ED2E299F2202040F0D4F543845B0E715A13BC8", "sap.com/tc/moin/mof_1.4", new java.lang.String[] { "Model", "Constant", "value" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ 
            }
            return __value;
        }
        /**
         * Returns the descriptor for the <code>requiredElements</code> reference.
         * @return  the descriptor for the <code>requiredElements</code> reference
         */
        public com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.tc.moin.repository.mmi.model.ModelElement,java.util.Collection<com.sap.tc.moin.repository.mmi.model.ModelElement>> REQUIRED_ELEMENTS( ) {
            return com.sap.tc.moin.repository.mmi.model.ModelElement.DESCRIPTORS.REQUIRED_ELEMENTS( );
        }
        /**
         * Returns the descriptor for the <code>container</code> reference.
         * @return  the descriptor for the <code>container</code> reference
         */
        public com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.tc.moin.repository.mmi.model.ModelElement,com.sap.tc.moin.repository.mmi.model.Namespace> CONTAINER( ) {
            return com.sap.tc.moin.repository.mmi.model.ModelElement.DESCRIPTORS.CONTAINER( );
        }
        /**
         * Returns the descriptor for the <code>constraints</code> reference.
         * @return  the descriptor for the <code>constraints</code> reference
         */
        public com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.tc.moin.repository.mmi.model.ModelElement,java.util.Collection<com.sap.tc.moin.repository.mmi.model.Constraint>> CONSTRAINTS( ) {
            return com.sap.tc.moin.repository.mmi.model.ModelElement.DESCRIPTORS.CONSTRAINTS( );
        }
        /**
         * Returns the descriptor for the <code>type</code> reference.
         * @return  the descriptor for the <code>type</code> reference
         */
        public com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.tc.moin.repository.mmi.model.TypedElement,com.sap.tc.moin.repository.mmi.model.Classifier> TYPE( ) {
            return com.sap.tc.moin.repository.mmi.model.TypedElement.DESCRIPTORS.TYPE( );
        }
        /**
         * Returns the descriptor for the <code>findRequiredElements</code> operation.
         * @return  the descriptor for the <code>findRequiredElements</code> operation
         */
        public com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.repository.mmi.model.ModelElement,java.util.Collection<com.sap.tc.moin.repository.mmi.model.ModelElement>> FIND_REQUIRED_ELEMENTS( ) {
            return com.sap.tc.moin.repository.mmi.model.ModelElement.DESCRIPTORS.FIND_REQUIRED_ELEMENTS( );
        }
        /**
         * Returns the descriptor for the <code>isRequiredBecause</code> operation.
         * @return  the descriptor for the <code>isRequiredBecause</code> operation
         */
        public com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.repository.mmi.model.ModelElement,java.lang.Boolean> IS_REQUIRED_BECAUSE( ) {
            return com.sap.tc.moin.repository.mmi.model.ModelElement.DESCRIPTORS.IS_REQUIRED_BECAUSE( );
        }
        /**
         * Returns the descriptor for the <code>isFrozen</code> operation.
         * @return  the descriptor for the <code>isFrozen</code> operation
         */
        public com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.repository.mmi.model.ModelElement,java.lang.Boolean> IS_FROZEN( ) {
            return com.sap.tc.moin.repository.mmi.model.ModelElement.DESCRIPTORS.IS_FROZEN( );
        }
        /**
         * Returns the descriptor for the <code>isVisible</code> operation.
         * @return  the descriptor for the <code>isVisible</code> operation
         */
        public com.sap.tc.moin.repository.mmi.descriptors.OperationDescriptor<com.sap.tc.moin.repository.mmi.model.Operation,com.sap.tc.moin.repository.mmi.model.ModelElement,java.lang.Boolean> IS_VISIBLE( ) {
            return com.sap.tc.moin.repository.mmi.model.ModelElement.DESCRIPTORS.IS_VISIBLE( );
        }
    }
}    