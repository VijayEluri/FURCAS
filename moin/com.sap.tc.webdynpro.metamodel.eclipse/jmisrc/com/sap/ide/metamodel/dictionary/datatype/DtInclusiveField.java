/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.dictionary.datatype;

/**
 * This interface is not intended to be implemented by clients.
 */
public interface DtInclusiveField extends com.sap.ide.metamodel.common.CommonDevelopmentObject {

    /**
     * Descriptors for all features of this MofClass and its supertypes.
     */
    public static final Descriptors DESCRIPTORS = new Descriptors( );

    // class extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.ClassDescriptor<com.sap.tc.moin.repository.mmi.reflect.RefClass, com.sap.ide.metamodel.dictionary.datatype.DtInclusiveField> CLASS_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.ClassDescriptor<com.sap.tc.moin.repository.mmi.reflect.RefClass, com.sap.ide.metamodel.dictionary.datatype.DtInclusiveField>("45DDACEF409EEAB04596446D3268AC4071E61CF3", "sap.com/tc/moin/webdynpro", "Dictionary", "datatype", "DtInclusiveField"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ 

    
    // attributes
    public java.lang.String getNewName() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setNewName(java.lang.String newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public int getPosition() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setPosition(int newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;

    // references
    public com.sap.ide.metamodel.dictionary.datatype.DtImportFromOtherStructure getOwner() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setOwner(com.sap.ide.metamodel.dictionary.datatype.DtImportFromOtherStructure newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;


    public static final class Descriptors {
        Descriptors( ) { 
        }
        /**
         * Returns the descriptor for the <code>name</code> attribute.
         * @return  the descriptor for the <code>name</code> attribute
         */
        public com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.common.CommonDevelopmentObject,java.lang.String> NAME( ) {
            return com.sap.ide.metamodel.common.CommonDevelopmentObject.DESCRIPTORS.NAME( );
        }
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.dictionary.datatype.DtInclusiveField,java.lang.String> __newName;
        /**
         * Returns the descriptor for the <code>newName</code> attribute.
         * @return  the descriptor for the <code>newName</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.dictionary.datatype.DtInclusiveField,java.lang.String> NEW_NAME( ) {
            if ( __newName == null ) {
                __newName = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.dictionary.datatype.DtInclusiveField,java.lang.String>( "45DDACEF51D4EE9348DD48203C338459F9E24A8A", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "Dictionary", "datatype", "DtInclusiveField", "newName" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __newName;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.dictionary.datatype.DtInclusiveField,java.lang.Integer> __position;
        /**
         * Returns the descriptor for the <code>position</code> attribute.
         * @return  the descriptor for the <code>position</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.dictionary.datatype.DtInclusiveField,java.lang.Integer> POSITION( ) {
            if ( __position == null ) {
                __position = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.dictionary.datatype.DtInclusiveField,java.lang.Integer>( "45DDACEFB780C24A0DF64598019EF7E11BD38AA1", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "Dictionary", "datatype", "DtInclusiveField", "position" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __position;
        }
        /**
         * Returns the descriptor for the <code>templateInstances</code> reference.
         * @return  the descriptor for the <code>templateInstances</code> reference
         */
        public com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.common.CommonDevelopmentObject,java.util.List<com.sap.ide.metamodel.common.template.EmbeddedTemplateInstance>> TEMPLATE_INSTANCES( ) {
            return com.sap.ide.metamodel.common.CommonDevelopmentObject.DESCRIPTORS.TEMPLATE_INSTANCES( );
        }
        /**
         * Returns the descriptor for the <code>diagrams</code> reference.
         * @return  the descriptor for the <code>diagrams</code> reference
         */
        public com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.common.CommonDevelopmentObject,java.util.List<com.sap.ide.metamodel.common.diagram.EmbeddedDiagram>> DIAGRAMS( ) {
            return com.sap.ide.metamodel.common.CommonDevelopmentObject.DESCRIPTORS.DIAGRAMS( );
        }
        /**
         * Returns the descriptor for the <code>documentationObject</code> reference.
         * @return  the descriptor for the <code>documentationObject</code> reference
         */
        public com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.common.CommonDevelopmentObject,com.sap.ide.metamodel.common.DocumentationObject> DOCUMENTATION_OBJECT( ) {
            return com.sap.ide.metamodel.common.CommonDevelopmentObject.DESCRIPTORS.DOCUMENTATION_OBJECT( );
        }
        private com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.dictionary.datatype.DtInclusiveField,com.sap.ide.metamodel.dictionary.datatype.DtImportFromOtherStructure> __owner;
        /**
         * Returns the descriptor for the <code>owner</code> reference.
         * @return  the descriptor for the <code>owner</code> reference
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.dictionary.datatype.DtInclusiveField,com.sap.ide.metamodel.dictionary.datatype.DtImportFromOtherStructure> OWNER( ) {
            if ( __owner == null ) {
                __owner = new com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.dictionary.datatype.DtInclusiveField,com.sap.ide.metamodel.dictionary.datatype.DtImportFromOtherStructure>( "45DDACEF1A71E56D858D46B50398D2018CE40EE8", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "Dictionary", "datatype", "DtInclusiveField", "Owner" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __owner;
        }
    }
}    