/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.component.view;

/**
 * Represents the empty view, which is embedded into each Web Dynpro component by default. Separate non-MDO class. Instances reside in the component MDO.
 * This interface is not intended to be implemented by clients.
 */
public interface EmptyView extends com.sap.ide.metamodel.webdynpro.component.view.AbstractView {

    /**
     * Descriptors for all features of this MofClass and its supertypes.
     */
    public static final Descriptors DESCRIPTORS = new Descriptors( );

    // class extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.ClassDescriptor<com.sap.tc.moin.repository.mmi.reflect.RefClass, com.sap.ide.metamodel.webdynpro.component.view.EmptyView> CLASS_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.ClassDescriptor<com.sap.tc.moin.repository.mmi.reflect.RefClass, com.sap.ide.metamodel.webdynpro.component.view.EmptyView>("45DDACEE89D08D3BED7449B33DA8E669FD7675A0", "sap.com/tc/moin/webdynpro", "WebDynpro", "component", "view", "EmptyView"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 

    

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
         * Returns the descriptor for the <code>type</code> attribute.
         * @return  the descriptor for the <code>type</code> attribute
         */
        public com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.AbstractView,com.sap.ide.metamodel.webdynpro.enums.ViewTypeEnum> TYPE( ) {
            return com.sap.ide.metamodel.webdynpro.component.view.AbstractView.DESCRIPTORS.TYPE( );
        }
        /**
         * Returns the descriptor for the <code>lifespan</code> attribute.
         * @return  the descriptor for the <code>lifespan</code> attribute
         */
        public com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.AbstractView,com.sap.ide.metamodel.webdynpro.enums.ViewLifespanEnum> LIFESPAN( ) {
            return com.sap.ide.metamodel.webdynpro.component.view.AbstractView.DESCRIPTORS.LIFESPAN( );
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
         * Returns the descriptor for the <code>viewContainers</code> reference.
         * @return  the descriptor for the <code>viewContainers</code> reference
         */
        public com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.component.view.AbstractView,java.util.Collection<com.sap.ide.metamodel.webdynpro.component.view.ViewContainer>> VIEW_CONTAINERS( ) {
            return com.sap.ide.metamodel.webdynpro.component.view.AbstractView.DESCRIPTORS.VIEW_CONTAINERS( );
        }
        /**
         * Returns the descriptor for the <code>viewController</code> reference.
         * @return  the descriptor for the <code>viewController</code> reference
         */
        public com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.component.view.AbstractView,com.sap.ide.metamodel.webdynpro.component.controller.Controller> VIEW_CONTROLLER( ) {
            return com.sap.ide.metamodel.webdynpro.component.view.AbstractView.DESCRIPTORS.VIEW_CONTROLLER( );
        }
    }
}    