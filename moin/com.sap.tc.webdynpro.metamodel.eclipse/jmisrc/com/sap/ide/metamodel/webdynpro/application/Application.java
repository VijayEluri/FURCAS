/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.application;

/**
 * Instances of Application represent Web Dynpro applications. Such applications are defined by a tripel made of:
 * 1. the webdynpro component that runs the application, 
 * 2. a startup-InboundPlug of an InterfaceView of this component, 
 * 3. configuration data to configure the component.
 * This interface is not intended to be implemented by clients.
 */
public interface Application extends com.sap.ide.metamodel.common.CommonDevelopmentObject {

    /**
     * Descriptors for all features of this MofClass and its supertypes.
     */
    public static final Descriptors DESCRIPTORS = new Descriptors( );

    // class extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.ClassDescriptor<com.sap.tc.moin.repository.mmi.reflect.RefClass, com.sap.ide.metamodel.webdynpro.application.Application> CLASS_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.ClassDescriptor<com.sap.tc.moin.repository.mmi.reflect.RefClass, com.sap.ide.metamodel.webdynpro.application.Application>("45DDACEF017A648947024E7B0E828ACAD7CA255F", "sap.com/tc/moin/webdynpro", "WebDynpro", "application", "Application"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ 

    
    // attributes
    public java.lang.String getHelpLink() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setHelpLink(java.lang.String newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.ide.metamodel.common.TranslatableText getHelpDescription() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setHelpDescription(com.sap.ide.metamodel.common.TranslatableText newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.ide.metamodel.webdynpro.enums.MessageDisplayModeEnum getMessageDisplayMode() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setMessageDisplayMode(com.sap.ide.metamodel.webdynpro.enums.MessageDisplayModeEnum newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;

    // references
    public java.util.List<com.sap.ide.metamodel.webdynpro.application.ApplicationProperty> getApplicationProperties() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.ide.metamodel.webdynpro.component.navigation.InboundPlug getStartupPlug() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setStartupPlug(com.sap.ide.metamodel.webdynpro.component.navigation.InboundPlug newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public java.util.List<com.sap.ide.metamodel.webdynpro.framework.ApplicationPropertyDefinitionSet> getPropertyDefinitionSets() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.ide.metamodel.webdynpro.configuration.LocalComponentConfig getRootComponentConfiguration() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setRootComponentConfiguration(com.sap.ide.metamodel.webdynpro.configuration.LocalComponentConfig newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;


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
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.application.Application,java.lang.String> __helpLink;
        /**
         * Returns the descriptor for the <code>helpLink</code> attribute.
         * @return  the descriptor for the <code>helpLink</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.application.Application,java.lang.String> HELP_LINK( ) {
            if ( __helpLink == null ) {
                __helpLink = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.application.Application,java.lang.String>( "45DDACEF89AA0E248638494704129D569C77AAED", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "WebDynpro", "application", "Application", "helpLink" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __helpLink;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.application.Application,com.sap.ide.metamodel.common.TranslatableText> __helpDescription;
        /**
         * Returns the descriptor for the <code>helpDescription</code> attribute.
         * @return  the descriptor for the <code>helpDescription</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.application.Application,com.sap.ide.metamodel.common.TranslatableText> HELP_DESCRIPTION( ) {
            if ( __helpDescription == null ) {
                __helpDescription = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.application.Application,com.sap.ide.metamodel.common.TranslatableText>( "45DDACEF745C4A47A353481A2CAAEE5959C315B4", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "WebDynpro", "application", "Application", "helpDescription" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __helpDescription;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.application.Application,com.sap.ide.metamodel.webdynpro.enums.MessageDisplayModeEnum> __messageDisplayMode;
        /**
         * Returns the descriptor for the <code>messageDisplayMode</code> attribute.
         * @return  the descriptor for the <code>messageDisplayMode</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.application.Application,com.sap.ide.metamodel.webdynpro.enums.MessageDisplayModeEnum> MESSAGE_DISPLAY_MODE( ) {
            if ( __messageDisplayMode == null ) {
                __messageDisplayMode = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.application.Application,com.sap.ide.metamodel.webdynpro.enums.MessageDisplayModeEnum>( "45DDACEFE58F12B386AC44CD3E20EE6FC693378E", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "WebDynpro", "application", "Application", "messageDisplayMode" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __messageDisplayMode;
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
        private com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.application.Application,java.util.List<com.sap.ide.metamodel.webdynpro.application.ApplicationProperty>> __applicationProperties;
        /**
         * Returns the descriptor for the <code>applicationProperties</code> reference.
         * @return  the descriptor for the <code>applicationProperties</code> reference
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.application.Application,java.util.List<com.sap.ide.metamodel.webdynpro.application.ApplicationProperty>> APPLICATION_PROPERTIES( ) {
            if ( __applicationProperties == null ) {
                __applicationProperties = new com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.application.Application,java.util.List<com.sap.ide.metamodel.webdynpro.application.ApplicationProperty>>( "460CC65C0434B444D2CB446B0EE0B5D3F79EFFF6", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "WebDynpro", "application", "Application", "ApplicationProperties" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __applicationProperties;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.application.Application,com.sap.ide.metamodel.webdynpro.component.navigation.InboundPlug> __startupPlug;
        /**
         * Returns the descriptor for the <code>startupPlug</code> reference.
         * @return  the descriptor for the <code>startupPlug</code> reference
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.application.Application,com.sap.ide.metamodel.webdynpro.component.navigation.InboundPlug> STARTUP_PLUG( ) {
            if ( __startupPlug == null ) {
                __startupPlug = new com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.application.Application,com.sap.ide.metamodel.webdynpro.component.navigation.InboundPlug>( "460CC65C7A906A8EEA6E4D8B207EE9F9345F19A7", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "WebDynpro", "application", "Application", "StartupPlug" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __startupPlug;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.application.Application,java.util.List<com.sap.ide.metamodel.webdynpro.framework.ApplicationPropertyDefinitionSet>> __propertyDefinitionSets;
        /**
         * Returns the descriptor for the <code>propertyDefinitionSets</code> reference.
         * @return  the descriptor for the <code>propertyDefinitionSets</code> reference
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.application.Application,java.util.List<com.sap.ide.metamodel.webdynpro.framework.ApplicationPropertyDefinitionSet>> PROPERTY_DEFINITION_SETS( ) {
            if ( __propertyDefinitionSets == null ) {
                __propertyDefinitionSets = new com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.application.Application,java.util.List<com.sap.ide.metamodel.webdynpro.framework.ApplicationPropertyDefinitionSet>>( "460CC65CBCEF1F868B74420D0167935FC77B22D4", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "WebDynpro", "application", "Application", "PropertyDefinitionSets" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __propertyDefinitionSets;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.application.Application,com.sap.ide.metamodel.webdynpro.configuration.LocalComponentConfig> __rootComponentConfiguration;
        /**
         * Returns the descriptor for the <code>rootComponentConfiguration</code> reference.
         * @return  the descriptor for the <code>rootComponentConfiguration</code> reference
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.application.Application,com.sap.ide.metamodel.webdynpro.configuration.LocalComponentConfig> ROOT_COMPONENT_CONFIGURATION( ) {
            if ( __rootComponentConfiguration == null ) {
                __rootComponentConfiguration = new com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.application.Application,com.sap.ide.metamodel.webdynpro.configuration.LocalComponentConfig>( "460CC65C8638D97FD72040172D64AEC1767EDDA3", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "WebDynpro", "application", "Application", "RootComponentConfiguration" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __rootComponentConfiguration;
        }
    }
}    