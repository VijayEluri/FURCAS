/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.dictionary.datatype;

/**
 * This interface is not intended to be implemented by clients.
 */
public interface DtImportFromOtherStructure extends com.sap.ide.metamodel.dictionary.datatype.DtStructureElement {

    /**
     * Descriptors for all features of this MofClass and its supertypes.
     */
    public static final Descriptors DESCRIPTORS = new Descriptors( );

    // class extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.ClassDescriptor<com.sap.tc.moin.repository.mmi.reflect.RefClass, com.sap.ide.metamodel.dictionary.datatype.DtImportFromOtherStructure> CLASS_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.ClassDescriptor<com.sap.tc.moin.repository.mmi.reflect.RefClass, com.sap.ide.metamodel.dictionary.datatype.DtImportFromOtherStructure>("45DDACEF1746EC3F488942E805D4EBDBD97A8E59", "sap.com/tc/moin/webdynpro", "Dictionary", "datatype", "DtImportFromOtherStructure"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ 

    
    // attributes
    public java.lang.String getGroup() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setGroup(java.lang.String newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;

    // references
    public java.util.List<com.sap.ide.metamodel.dictionary.datatype.DtExclusiveField> getExclusiveFields() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public java.util.List<com.sap.ide.metamodel.dictionary.datatype.DtRenamedField> getRenamedFields() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.ide.metamodel.dictionary.datatype.DtStructure getUsedStructure() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setUsedStructure(com.sap.ide.metamodel.dictionary.datatype.DtStructure newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.ide.metamodel.dictionary.datatype.DtJoin getBelongingToJoinRight() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setBelongingToJoinRight(com.sap.ide.metamodel.dictionary.datatype.DtJoin newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.ide.metamodel.dictionary.datatype.DtJoin getBelongingToJoinLeft() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setBelongingToJoinLeft(com.sap.ide.metamodel.dictionary.datatype.DtJoin newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public java.util.List<com.sap.ide.metamodel.dictionary.datatype.DtInclusiveField> getInclusiveFields() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;


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
        /**
         * Returns the descriptor for the <code>description</code> attribute.
         * @return  the descriptor for the <code>description</code> attribute
         */
        public com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.dictionary.datatype.DtStructureElement,com.sap.ide.metamodel.common.TranslatableText> DESCRIPTION( ) {
            return com.sap.ide.metamodel.dictionary.datatype.DtStructureElement.DESCRIPTORS.DESCRIPTION( );
        }
        /**
         * Returns the descriptor for the <code>position</code> attribute.
         * @return  the descriptor for the <code>position</code> attribute
         */
        public com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.dictionary.datatype.DtStructureElement,java.lang.Integer> POSITION( ) {
            return com.sap.ide.metamodel.dictionary.datatype.DtStructureElement.DESCRIPTORS.POSITION( );
        }
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.dictionary.datatype.DtImportFromOtherStructure,java.lang.String> __group;
        /**
         * Returns the descriptor for the <code>group</code> attribute.
         * @return  the descriptor for the <code>group</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.dictionary.datatype.DtImportFromOtherStructure,java.lang.String> GROUP( ) {
            if ( __group == null ) {
                __group = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.dictionary.datatype.DtImportFromOtherStructure,java.lang.String>( "45DDACEF40A0D71ECE2743852047A97E572E2521", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "Dictionary", "datatype", "DtImportFromOtherStructure", "group" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __group;
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
        /**
         * Returns the descriptor for the <code>structure</code> reference.
         * @return  the descriptor for the <code>structure</code> reference
         */
        public com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.dictionary.datatype.DtStructureElement,com.sap.ide.metamodel.dictionary.datatype.DtStructure> STRUCTURE( ) {
            return com.sap.ide.metamodel.dictionary.datatype.DtStructureElement.DESCRIPTORS.STRUCTURE( );
        }
        private com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.dictionary.datatype.DtImportFromOtherStructure,java.util.List<com.sap.ide.metamodel.dictionary.datatype.DtExclusiveField>> __exclusiveFields;
        /**
         * Returns the descriptor for the <code>exclusiveFields</code> reference.
         * @return  the descriptor for the <code>exclusiveFields</code> reference
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.dictionary.datatype.DtImportFromOtherStructure,java.util.List<com.sap.ide.metamodel.dictionary.datatype.DtExclusiveField>> EXCLUSIVE_FIELDS( ) {
            if ( __exclusiveFields == null ) {
                __exclusiveFields = new com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.dictionary.datatype.DtImportFromOtherStructure,java.util.List<com.sap.ide.metamodel.dictionary.datatype.DtExclusiveField>>( "45DDACEF0DFC7E6B5996423B38E0A96BCA255C35", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "Dictionary", "datatype", "DtImportFromOtherStructure", "ExclusiveFields" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __exclusiveFields;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.dictionary.datatype.DtImportFromOtherStructure,java.util.List<com.sap.ide.metamodel.dictionary.datatype.DtRenamedField>> __renamedFields;
        /**
         * Returns the descriptor for the <code>renamedFields</code> reference.
         * @return  the descriptor for the <code>renamedFields</code> reference
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.dictionary.datatype.DtImportFromOtherStructure,java.util.List<com.sap.ide.metamodel.dictionary.datatype.DtRenamedField>> RENAMED_FIELDS( ) {
            if ( __renamedFields == null ) {
                __renamedFields = new com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.dictionary.datatype.DtImportFromOtherStructure,java.util.List<com.sap.ide.metamodel.dictionary.datatype.DtRenamedField>>( "45DDACEFBA904EF5A61347E82F44F6C3DF692483", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "Dictionary", "datatype", "DtImportFromOtherStructure", "RenamedFields" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __renamedFields;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.dictionary.datatype.DtImportFromOtherStructure,com.sap.ide.metamodel.dictionary.datatype.DtStructure> __usedStructure;
        /**
         * Returns the descriptor for the <code>usedStructure</code> reference.
         * @return  the descriptor for the <code>usedStructure</code> reference
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.dictionary.datatype.DtImportFromOtherStructure,com.sap.ide.metamodel.dictionary.datatype.DtStructure> USED_STRUCTURE( ) {
            if ( __usedStructure == null ) {
                __usedStructure = new com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.dictionary.datatype.DtImportFromOtherStructure,com.sap.ide.metamodel.dictionary.datatype.DtStructure>( "45DDACEF0F8095DCEC1748433000AF2E5DD24430", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "Dictionary", "datatype", "DtImportFromOtherStructure", "UsedStructure" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __usedStructure;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.dictionary.datatype.DtImportFromOtherStructure,com.sap.ide.metamodel.dictionary.datatype.DtJoin> __belongingToJoinRight;
        /**
         * Returns the descriptor for the <code>belongingToJoinRight</code> reference.
         * @return  the descriptor for the <code>belongingToJoinRight</code> reference
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.dictionary.datatype.DtImportFromOtherStructure,com.sap.ide.metamodel.dictionary.datatype.DtJoin> BELONGING_TO_JOIN_RIGHT( ) {
            if ( __belongingToJoinRight == null ) {
                __belongingToJoinRight = new com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.dictionary.datatype.DtImportFromOtherStructure,com.sap.ide.metamodel.dictionary.datatype.DtJoin>( "45DDACEF8851BB84D1304CEC0A05954DDA12B4DF", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "Dictionary", "datatype", "DtImportFromOtherStructure", "BelongingToJoinRight" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __belongingToJoinRight;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.dictionary.datatype.DtImportFromOtherStructure,com.sap.ide.metamodel.dictionary.datatype.DtJoin> __belongingToJoinLeft;
        /**
         * Returns the descriptor for the <code>belongingToJoinLeft</code> reference.
         * @return  the descriptor for the <code>belongingToJoinLeft</code> reference
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.dictionary.datatype.DtImportFromOtherStructure,com.sap.ide.metamodel.dictionary.datatype.DtJoin> BELONGING_TO_JOIN_LEFT( ) {
            if ( __belongingToJoinLeft == null ) {
                __belongingToJoinLeft = new com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.dictionary.datatype.DtImportFromOtherStructure,com.sap.ide.metamodel.dictionary.datatype.DtJoin>( "45DDACEFDAB750763E394D742029C71064912D91", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "Dictionary", "datatype", "DtImportFromOtherStructure", "BelongingToJoinLeft" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __belongingToJoinLeft;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.dictionary.datatype.DtImportFromOtherStructure,java.util.List<com.sap.ide.metamodel.dictionary.datatype.DtInclusiveField>> __inclusiveFields;
        /**
         * Returns the descriptor for the <code>inclusiveFields</code> reference.
         * @return  the descriptor for the <code>inclusiveFields</code> reference
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.dictionary.datatype.DtImportFromOtherStructure,java.util.List<com.sap.ide.metamodel.dictionary.datatype.DtInclusiveField>> INCLUSIVE_FIELDS( ) {
            if ( __inclusiveFields == null ) {
                __inclusiveFields = new com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.dictionary.datatype.DtImportFromOtherStructure,java.util.List<com.sap.ide.metamodel.dictionary.datatype.DtInclusiveField>>( "45DDACEF98DE317BF91B48181BE4E8F54344B5B8", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "Dictionary", "datatype", "DtImportFromOtherStructure", "InclusiveFields" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __inclusiveFields;
        }
    }
}    