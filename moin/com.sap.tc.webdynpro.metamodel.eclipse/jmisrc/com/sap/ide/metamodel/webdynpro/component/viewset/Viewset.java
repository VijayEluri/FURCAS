/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.component.viewset;

/**
 * Represents a viewset instantiated according to a viewset definition. Basically consists of view areas and viewset properties.
 * This interface is not intended to be implemented by clients.
 */
public interface Viewset extends com.sap.ide.metamodel.webdynpro.component.viewset.ViewsetHierarchyNode {

    /**
     * Descriptors for all features of this MofClass and its supertypes.
     */
    public static final Descriptors DESCRIPTORS = new Descriptors( );

    // class extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.ClassDescriptor<com.sap.tc.moin.repository.mmi.reflect.RefClass, com.sap.ide.metamodel.webdynpro.component.viewset.Viewset> CLASS_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.ClassDescriptor<com.sap.tc.moin.repository.mmi.reflect.RefClass, com.sap.ide.metamodel.webdynpro.component.viewset.Viewset>("45DDACEE95EE177659EF44BD273CF19AFE09E94F", "sap.com/tc/moin/webdynpro", "WebDynpro", "component", "viewset", "Viewset"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 

    
    // references
    public java.util.List<com.sap.ide.metamodel.webdynpro.component.viewset.ViewsetProperty> getViewsetProperties() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.ide.metamodel.webdynpro.framework.viewsetdefinition.ViewsetDefinition getViewsetDefinition() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setViewsetDefinition(com.sap.ide.metamodel.webdynpro.framework.viewsetdefinition.ViewsetDefinition newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;


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
        private com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.component.viewset.Viewset,java.util.List<com.sap.ide.metamodel.webdynpro.component.viewset.ViewsetProperty>> __viewsetProperties;
        /**
         * Returns the descriptor for the <code>viewsetProperties</code> reference.
         * @return  the descriptor for the <code>viewsetProperties</code> reference
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.component.viewset.Viewset,java.util.List<com.sap.ide.metamodel.webdynpro.component.viewset.ViewsetProperty>> VIEWSET_PROPERTIES( ) {
            if ( __viewsetProperties == null ) {
                __viewsetProperties = new com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.component.viewset.Viewset,java.util.List<com.sap.ide.metamodel.webdynpro.component.viewset.ViewsetProperty>>( "45DDACEE8DCFC86D93124EC22925F78F42007B81", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "WebDynpro", "component", "viewset", "Viewset", "ViewsetProperties" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ 
            }
            return __viewsetProperties;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.component.viewset.Viewset,com.sap.ide.metamodel.webdynpro.framework.viewsetdefinition.ViewsetDefinition> __viewsetDefinition;
        /**
         * Returns the descriptor for the <code>viewsetDefinition</code> reference.
         * @return  the descriptor for the <code>viewsetDefinition</code> reference
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.component.viewset.Viewset,com.sap.ide.metamodel.webdynpro.framework.viewsetdefinition.ViewsetDefinition> VIEWSET_DEFINITION( ) {
            if ( __viewsetDefinition == null ) {
                __viewsetDefinition = new com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.component.viewset.Viewset,com.sap.ide.metamodel.webdynpro.framework.viewsetdefinition.ViewsetDefinition>( "45DDACEE798E1ACD2CE444B5301ACA6B8C91B526", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "WebDynpro", "component", "viewset", "Viewset", "ViewsetDefinition" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ 
            }
            return __viewsetDefinition;
        }
    }
}    