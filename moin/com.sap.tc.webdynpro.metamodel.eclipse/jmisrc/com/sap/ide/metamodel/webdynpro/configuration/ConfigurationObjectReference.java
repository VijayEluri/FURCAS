/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.configuration;

/**
 * This interface is not intended to be implemented by clients.
 */
public interface ConfigurationObjectReference extends com.sap.ide.metamodel.common.CommonDevelopmentObject {

    /**
     * Descriptors for all features of this MofClass and its supertypes.
     */
    public static final Descriptors DESCRIPTORS = new Descriptors( );

    // class extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.ClassDescriptor<com.sap.tc.moin.repository.mmi.reflect.RefClass, com.sap.ide.metamodel.webdynpro.configuration.ConfigurationObjectReference> CLASS_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.ClassDescriptor<com.sap.tc.moin.repository.mmi.reflect.RefClass, com.sap.ide.metamodel.webdynpro.configuration.ConfigurationObjectReference>("45DDACEEABF13EC621F147F313A5A01C66F23790", "sap.com/tc/moin/webdynpro", "WebDynpro", "configuration", "ConfigurationObjectReference"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ 

    
    // references
    public com.sap.ide.metamodel.webdynpro.configuration.ComponentConfiguration getConfiguration() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setConfiguration(com.sap.ide.metamodel.webdynpro.configuration.ComponentConfiguration newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;


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
        private com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.configuration.ConfigurationObjectReference,com.sap.ide.metamodel.webdynpro.configuration.ComponentConfiguration> __configuration;
        /**
         * Returns the descriptor for the <code>configuration</code> reference.
         * @return  the descriptor for the <code>configuration</code> reference
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.configuration.ConfigurationObjectReference,com.sap.ide.metamodel.webdynpro.configuration.ComponentConfiguration> CONFIGURATION( ) {
            if ( __configuration == null ) {
                __configuration = new com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.configuration.ConfigurationObjectReference,com.sap.ide.metamodel.webdynpro.configuration.ComponentConfiguration>( "45DDACEEE99B6C268C8D4AD537A1F33AA7A20B75", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "WebDynpro", "configuration", "ConfigurationObjectReference", "Configuration" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __configuration;
        }
    }
}    