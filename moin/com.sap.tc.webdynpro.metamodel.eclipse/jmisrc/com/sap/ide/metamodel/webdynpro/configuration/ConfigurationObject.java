/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.configuration;

/**
 * This interface is not intended to be implemented by clients.
 */
public interface ConfigurationObject extends com.sap.ide.metamodel.common.CommonDevelopmentObject {

    /**
     * Descriptors for all features of this MofClass and its supertypes.
     */
    public static final Descriptors DESCRIPTORS = new Descriptors( );

    // class extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.ClassDescriptor<com.sap.tc.moin.repository.mmi.reflect.RefClass, com.sap.ide.metamodel.webdynpro.configuration.ConfigurationObject> CLASS_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.ClassDescriptor<com.sap.tc.moin.repository.mmi.reflect.RefClass, com.sap.ide.metamodel.webdynpro.configuration.ConfigurationObject>("45DDACEEC89CF01517BC413F1EEBAF75D1C05147", "sap.com/tc/moin/webdynpro", "WebDynpro", "configuration", "ConfigurationObject"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ 

    
    // references
    public com.sap.ide.metamodel.webdynpro.model.Mclass getConfigModelClass() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setConfigModelClass(com.sap.ide.metamodel.webdynpro.model.Mclass newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public java.util.List<com.sap.ide.metamodel.webdynpro.configuration.ConfigProperty> getConfigurationProperties() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public java.util.List<com.sap.ide.metamodel.webdynpro.configuration.ConfigAssociation> getOutgoingAssociations() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public java.util.List<com.sap.ide.metamodel.webdynpro.configuration.ConfigAggregation> getOutgoingAggregations() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;


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
        private com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.configuration.ConfigurationObject,com.sap.ide.metamodel.webdynpro.model.Mclass> __configModelClass;
        /**
         * Returns the descriptor for the <code>configModelClass</code> reference.
         * @return  the descriptor for the <code>configModelClass</code> reference
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.configuration.ConfigurationObject,com.sap.ide.metamodel.webdynpro.model.Mclass> CONFIG_MODEL_CLASS( ) {
            if ( __configModelClass == null ) {
                __configModelClass = new com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.configuration.ConfigurationObject,com.sap.ide.metamodel.webdynpro.model.Mclass>( "45DDACEE5C5C1E66787B45A9070089EA9B435493", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "WebDynpro", "configuration", "ConfigurationObject", "ConfigModelClass" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __configModelClass;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.configuration.ConfigurationObject,java.util.List<com.sap.ide.metamodel.webdynpro.configuration.ConfigProperty>> __configurationProperties;
        /**
         * Returns the descriptor for the <code>configurationProperties</code> reference.
         * @return  the descriptor for the <code>configurationProperties</code> reference
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.configuration.ConfigurationObject,java.util.List<com.sap.ide.metamodel.webdynpro.configuration.ConfigProperty>> CONFIGURATION_PROPERTIES( ) {
            if ( __configurationProperties == null ) {
                __configurationProperties = new com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.configuration.ConfigurationObject,java.util.List<com.sap.ide.metamodel.webdynpro.configuration.ConfigProperty>>( "45DDACEEB8A6DDDEF8B24F422732A9915EB412D2", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "WebDynpro", "configuration", "ConfigurationObject", "ConfigurationProperties" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __configurationProperties;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.configuration.ConfigurationObject,java.util.List<com.sap.ide.metamodel.webdynpro.configuration.ConfigAssociation>> __outgoingAssociations;
        /**
         * Returns the descriptor for the <code>outgoingAssociations</code> reference.
         * @return  the descriptor for the <code>outgoingAssociations</code> reference
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.configuration.ConfigurationObject,java.util.List<com.sap.ide.metamodel.webdynpro.configuration.ConfigAssociation>> OUTGOING_ASSOCIATIONS( ) {
            if ( __outgoingAssociations == null ) {
                __outgoingAssociations = new com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.configuration.ConfigurationObject,java.util.List<com.sap.ide.metamodel.webdynpro.configuration.ConfigAssociation>>( "45DDACEE8EF383ABDB66461E1A28AF1B60202171", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "WebDynpro", "configuration", "ConfigurationObject", "OutgoingAssociations" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __outgoingAssociations;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.configuration.ConfigurationObject,java.util.List<com.sap.ide.metamodel.webdynpro.configuration.ConfigAggregation>> __outgoingAggregations;
        /**
         * Returns the descriptor for the <code>outgoingAggregations</code> reference.
         * @return  the descriptor for the <code>outgoingAggregations</code> reference
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.configuration.ConfigurationObject,java.util.List<com.sap.ide.metamodel.webdynpro.configuration.ConfigAggregation>> OUTGOING_AGGREGATIONS( ) {
            if ( __outgoingAggregations == null ) {
                __outgoingAggregations = new com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.configuration.ConfigurationObject,java.util.List<com.sap.ide.metamodel.webdynpro.configuration.ConfigAggregation>>( "45DDACEE9103F0D964D241EE0F18F35A8E98BAF7", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "WebDynpro", "configuration", "ConfigurationObject", "OutgoingAggregations" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __outgoingAggregations;
        }
    }
}    