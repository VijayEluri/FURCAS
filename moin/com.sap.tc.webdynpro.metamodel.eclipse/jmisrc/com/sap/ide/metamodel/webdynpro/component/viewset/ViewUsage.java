/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.component.viewset;

/**
 * Represents a view instance that is embedded into a viewset hierarchy.
 * This interface is not intended to be implemented by clients.
 */
public interface ViewUsage extends com.sap.ide.metamodel.webdynpro.component.viewset.ViewsetHierarchyNode {

    /**
     * Descriptors for all features of this MofClass and its supertypes.
     */
    public static final Descriptors DESCRIPTORS = new Descriptors( );

    // class extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.ClassDescriptor<com.sap.tc.moin.repository.mmi.reflect.RefClass, com.sap.ide.metamodel.webdynpro.component.viewset.ViewUsage> CLASS_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.ClassDescriptor<com.sap.tc.moin.repository.mmi.reflect.RefClass, com.sap.ide.metamodel.webdynpro.component.viewset.ViewUsage>("45DDACEE51F8D6B827E0470A36A2A10BC11DBB6E", "sap.com/tc/moin/webdynpro", "WebDynpro", "component", "viewset", "ViewUsage"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 

    
    // attributes
    public java.lang.String getId() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setId(java.lang.String newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;

    // references
    public com.sap.ide.metamodel.webdynpro.component.ComponentUsage getComponentUsage() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setComponentUsage(com.sap.ide.metamodel.webdynpro.component.ComponentUsage newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.ide.metamodel.webdynpro.component.navigation.InboundPlug getDefaultInboundPlug() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setDefaultInboundPlug(com.sap.ide.metamodel.webdynpro.component.navigation.InboundPlug newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;


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
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.viewset.ViewUsage,java.lang.String> __id;
        /**
         * Returns the descriptor for the <code>id</code> attribute.
         * @return  the descriptor for the <code>id</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.viewset.ViewUsage,java.lang.String> ID( ) {
            if ( __id == null ) {
                __id = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.viewset.ViewUsage,java.lang.String>( "45DDACEE2F43731DE45F4BBD33F8BCA6F6340033", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "WebDynpro", "component", "viewset", "ViewUsage", "id" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ 
            }
            return __id;
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
         * Returns the descriptor for the <code>placeholder</code> reference.
         * @return  the descriptor for the <code>placeholder</code> reference
         */
        public com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.component.viewset.ViewsetHierarchyNode,com.sap.ide.metamodel.webdynpro.component.viewset.Placeholder> PLACEHOLDER( ) {
            return com.sap.ide.metamodel.webdynpro.component.viewset.ViewsetHierarchyNode.DESCRIPTORS.PLACEHOLDER( );
        }
        /**
         * Returns the descriptor for the <code>viewAreas</code> reference.
         * @return  the descriptor for the <code>viewAreas</code> reference
         */
        public com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.component.viewset.ViewsetHierarchyNode,java.util.List<com.sap.ide.metamodel.webdynpro.component.viewset.Placeholder>> VIEW_AREAS( ) {
            return com.sap.ide.metamodel.webdynpro.component.viewset.ViewsetHierarchyNode.DESCRIPTORS.VIEW_AREAS( );
        }
        /**
         * Returns the descriptor for the <code>view</code> reference.
         * @return  the descriptor for the <code>view</code> reference
         */
        public com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.component.viewset.ViewsetHierarchyNode,com.sap.ide.metamodel.webdynpro.component.view.AbstractView> VIEW( ) {
            return com.sap.ide.metamodel.webdynpro.component.viewset.ViewsetHierarchyNode.DESCRIPTORS.VIEW( );
        }
        private com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.component.viewset.ViewUsage,com.sap.ide.metamodel.webdynpro.component.ComponentUsage> __componentUsage;
        /**
         * Returns the descriptor for the <code>componentUsage</code> reference.
         * @return  the descriptor for the <code>componentUsage</code> reference
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.component.viewset.ViewUsage,com.sap.ide.metamodel.webdynpro.component.ComponentUsage> COMPONENT_USAGE( ) {
            if ( __componentUsage == null ) {
                __componentUsage = new com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.component.viewset.ViewUsage,com.sap.ide.metamodel.webdynpro.component.ComponentUsage>( "45DDACEE9888551C089E4B83201EF55F10D3BFD7", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "WebDynpro", "component", "viewset", "ViewUsage", "ComponentUsage" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ 
            }
            return __componentUsage;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.component.viewset.ViewUsage,com.sap.ide.metamodel.webdynpro.component.navigation.InboundPlug> __defaultInboundPlug;
        /**
         * Returns the descriptor for the <code>defaultInboundPlug</code> reference.
         * @return  the descriptor for the <code>defaultInboundPlug</code> reference
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.component.viewset.ViewUsage,com.sap.ide.metamodel.webdynpro.component.navigation.InboundPlug> DEFAULT_INBOUND_PLUG( ) {
            if ( __defaultInboundPlug == null ) {
                __defaultInboundPlug = new com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.component.viewset.ViewUsage,com.sap.ide.metamodel.webdynpro.component.navigation.InboundPlug>( "45DDACEE8A6A31F4A2AC47621E75A9E54979A40E", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "WebDynpro", "component", "viewset", "ViewUsage", "DefaultInboundPlug" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ 
            }
            return __defaultInboundPlug;
        }
    }
}    