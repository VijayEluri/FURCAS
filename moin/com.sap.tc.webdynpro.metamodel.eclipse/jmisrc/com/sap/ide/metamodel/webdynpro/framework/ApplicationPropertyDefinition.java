/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.framework;

/**
 * Represents the definition for an application property.
 * This interface is not intended to be implemented by clients.
 */
public interface ApplicationPropertyDefinition extends com.sap.ide.metamodel.common.CommonDevelopmentObject {

    /**
     * Descriptors for all features of this MofClass and its supertypes.
     */
    public static final Descriptors DESCRIPTORS = new Descriptors( );

    // class extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.ClassDescriptor<com.sap.tc.moin.repository.mmi.reflect.RefClass, com.sap.ide.metamodel.webdynpro.framework.ApplicationPropertyDefinition> CLASS_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.ClassDescriptor<com.sap.tc.moin.repository.mmi.reflect.RefClass, com.sap.ide.metamodel.webdynpro.framework.ApplicationPropertyDefinition>("45DDACEFF4BCA866587046CD32368D766A978167", "sap.com/tc/moin/webdynpro", "WebDynpro", "framework", "ApplicationPropertyDefinition"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ 

    
    // attributes
    public java.lang.String getQualifiedName() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setQualifiedName(java.lang.String newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public java.lang.String getAlias() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setAlias(java.lang.String newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.ide.metamodel.common.TranslatableText getDescription() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setDescription(com.sap.ide.metamodel.common.TranslatableText newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public java.lang.String getDefaultValue() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setDefaultValue(java.lang.String newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean isMandatory() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setMandatory(boolean newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;

    // references
    public com.sap.ide.metamodel.webdynpro.framework.ApplicationPropertyDefinitionSet getDefinitionSet() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setDefinitionSet(com.sap.ide.metamodel.webdynpro.framework.ApplicationPropertyDefinitionSet newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.ide.metamodel.dictionary.datatype.DtScalarType getType() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setType(com.sap.ide.metamodel.dictionary.datatype.DtScalarType newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;


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
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.framework.ApplicationPropertyDefinition,java.lang.String> __qualifiedName;
        /**
         * Returns the descriptor for the <code>qualifiedName</code> attribute.
         * @return  the descriptor for the <code>qualifiedName</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.framework.ApplicationPropertyDefinition,java.lang.String> QUALIFIED_NAME( ) {
            if ( __qualifiedName == null ) {
                __qualifiedName = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.framework.ApplicationPropertyDefinition,java.lang.String>( "45DDACEF15FC634D7D4549B725C69E441292F05E", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "WebDynpro", "framework", "ApplicationPropertyDefinition", "qualifiedName" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __qualifiedName;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.framework.ApplicationPropertyDefinition,java.lang.String> __alias;
        /**
         * Returns the descriptor for the <code>alias</code> attribute.
         * @return  the descriptor for the <code>alias</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.framework.ApplicationPropertyDefinition,java.lang.String> ALIAS( ) {
            if ( __alias == null ) {
                __alias = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.framework.ApplicationPropertyDefinition,java.lang.String>( "45DDACEFFD64DB24F4634412151892DFD433089C", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "WebDynpro", "framework", "ApplicationPropertyDefinition", "alias" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __alias;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.framework.ApplicationPropertyDefinition,com.sap.ide.metamodel.common.TranslatableText> __description;
        /**
         * Returns the descriptor for the <code>description</code> attribute.
         * @return  the descriptor for the <code>description</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.framework.ApplicationPropertyDefinition,com.sap.ide.metamodel.common.TranslatableText> DESCRIPTION( ) {
            if ( __description == null ) {
                __description = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.framework.ApplicationPropertyDefinition,com.sap.ide.metamodel.common.TranslatableText>( "45DDACEF58DE0A0E65454ACD33B5A551D984FB09", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "WebDynpro", "framework", "ApplicationPropertyDefinition", "description" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __description;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.framework.ApplicationPropertyDefinition,java.lang.String> __defaultValue;
        /**
         * Returns the descriptor for the <code>defaultValue</code> attribute.
         * @return  the descriptor for the <code>defaultValue</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.framework.ApplicationPropertyDefinition,java.lang.String> DEFAULT_VALUE( ) {
            if ( __defaultValue == null ) {
                __defaultValue = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.framework.ApplicationPropertyDefinition,java.lang.String>( "45DDACEF917C2802F78E485F1922B7227B9B7279", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "WebDynpro", "framework", "ApplicationPropertyDefinition", "defaultValue" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __defaultValue;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.framework.ApplicationPropertyDefinition,java.lang.Boolean> __isMandatory;
        /**
         * Returns the descriptor for the <code>isMandatory</code> attribute.
         * @return  the descriptor for the <code>isMandatory</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.framework.ApplicationPropertyDefinition,java.lang.Boolean> IS_MANDATORY( ) {
            if ( __isMandatory == null ) {
                __isMandatory = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.framework.ApplicationPropertyDefinition,java.lang.Boolean>( "45DDACEF8EE3DCFB8159420E3E4CFBD90127039D", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "WebDynpro", "framework", "ApplicationPropertyDefinition", "isMandatory" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __isMandatory;
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
        private com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.framework.ApplicationPropertyDefinition,com.sap.ide.metamodel.webdynpro.framework.ApplicationPropertyDefinitionSet> __definitionSet;
        /**
         * Returns the descriptor for the <code>definitionSet</code> reference.
         * @return  the descriptor for the <code>definitionSet</code> reference
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.framework.ApplicationPropertyDefinition,com.sap.ide.metamodel.webdynpro.framework.ApplicationPropertyDefinitionSet> DEFINITION_SET( ) {
            if ( __definitionSet == null ) {
                __definitionSet = new com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.framework.ApplicationPropertyDefinition,com.sap.ide.metamodel.webdynpro.framework.ApplicationPropertyDefinitionSet>( "45DDACEFB020CFC757A34CE72D88871A2346AD73", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "WebDynpro", "framework", "ApplicationPropertyDefinition", "DefinitionSet" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __definitionSet;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.framework.ApplicationPropertyDefinition,com.sap.ide.metamodel.dictionary.datatype.DtScalarType> __type;
        /**
         * Returns the descriptor for the <code>type</code> reference.
         * @return  the descriptor for the <code>type</code> reference
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.framework.ApplicationPropertyDefinition,com.sap.ide.metamodel.dictionary.datatype.DtScalarType> TYPE( ) {
            if ( __type == null ) {
                __type = new com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.framework.ApplicationPropertyDefinition,com.sap.ide.metamodel.dictionary.datatype.DtScalarType>( "460CC65C2E802A5CEBAC42D83604A4B669B0924D", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "WebDynpro", "framework", "ApplicationPropertyDefinition", "Type" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __type;
        }
    }
}    