/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.application;

/**
 * Represents a setting attached to a Web Dynpro application. Refers to an application property definition.
 * This interface is not intended to be implemented by clients.
 */
public interface ApplicationProperty extends com.sap.ide.metamodel.common.CommonDevelopmentObject {

    /**
     * Descriptors for all features of this MofClass and its supertypes.
     */
    public static final Descriptors DESCRIPTORS = new Descriptors( );

    // class extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.ClassDescriptor<com.sap.tc.moin.repository.mmi.reflect.RefClass, com.sap.ide.metamodel.webdynpro.application.ApplicationProperty> CLASS_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.ClassDescriptor<com.sap.tc.moin.repository.mmi.reflect.RefClass, com.sap.ide.metamodel.webdynpro.application.ApplicationProperty>("45DDACEFAA42CDD2D5A14E460F03D67A0976D626", "sap.com/tc/moin/webdynpro", "WebDynpro", "application", "ApplicationProperty"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ 

    
    // attributes
    public java.lang.String getValue() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setValue(java.lang.String newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;

    // references
    public com.sap.ide.metamodel.webdynpro.application.Application getApplication() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setApplication(com.sap.ide.metamodel.webdynpro.application.Application newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.ide.metamodel.webdynpro.framework.ApplicationPropertyDefinition getPropertyDefinition() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setPropertyDefinition(com.sap.ide.metamodel.webdynpro.framework.ApplicationPropertyDefinition newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;


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
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.application.ApplicationProperty,java.lang.String> __value;
        /**
         * Returns the descriptor for the <code>value</code> attribute.
         * @return  the descriptor for the <code>value</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.application.ApplicationProperty,java.lang.String> VALUE( ) {
            if ( __value == null ) {
                __value = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.application.ApplicationProperty,java.lang.String>( "45DDACEFE166FCCDBAB74AE53EFD9A981B995A34", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "WebDynpro", "application", "ApplicationProperty", "value" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __value;
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
        private com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.application.ApplicationProperty,com.sap.ide.metamodel.webdynpro.application.Application> __application;
        /**
         * Returns the descriptor for the <code>application</code> reference.
         * @return  the descriptor for the <code>application</code> reference
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.application.ApplicationProperty,com.sap.ide.metamodel.webdynpro.application.Application> APPLICATION( ) {
            if ( __application == null ) {
                __application = new com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.application.ApplicationProperty,com.sap.ide.metamodel.webdynpro.application.Application>( "460CC65C8DA13F83270B457B3229E2EA9D9C37CA", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "WebDynpro", "application", "ApplicationProperty", "Application" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __application;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.application.ApplicationProperty,com.sap.ide.metamodel.webdynpro.framework.ApplicationPropertyDefinition> __propertyDefinition;
        /**
         * Returns the descriptor for the <code>propertyDefinition</code> reference.
         * @return  the descriptor for the <code>propertyDefinition</code> reference
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.application.ApplicationProperty,com.sap.ide.metamodel.webdynpro.framework.ApplicationPropertyDefinition> PROPERTY_DEFINITION( ) {
            if ( __propertyDefinition == null ) {
                __propertyDefinition = new com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.application.ApplicationProperty,com.sap.ide.metamodel.webdynpro.framework.ApplicationPropertyDefinition>( "460CC65CAECF64CBD55A4AD220CCA9089181490F", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "WebDynpro", "application", "ApplicationProperty", "PropertyDefinition" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __propertyDefinition;
        }
    }
}    