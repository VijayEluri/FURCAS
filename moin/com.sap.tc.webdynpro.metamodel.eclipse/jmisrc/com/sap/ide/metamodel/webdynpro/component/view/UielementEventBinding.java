/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.component.view;

/**
 * Represents an event binding declaration between an event of a ui element (event source) and a controller action (event sink).
 * This interface is not intended to be implemented by clients.
 */
public interface UielementEventBinding extends com.sap.ide.metamodel.webdynpro.event.EventBinding {

    /**
     * Descriptors for all features of this MofClass and its supertypes.
     */
    public static final Descriptors DESCRIPTORS = new Descriptors( );

    // class extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.ClassDescriptor<com.sap.tc.moin.repository.mmi.reflect.RefClass, com.sap.ide.metamodel.webdynpro.component.view.UielementEventBinding> CLASS_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.ClassDescriptor<com.sap.tc.moin.repository.mmi.reflect.RefClass, com.sap.ide.metamodel.webdynpro.component.view.UielementEventBinding>("45DDACEE16203124B3FC46CA383B915E587C1102", "sap.com/tc/moin/webdynpro", "WebDynpro", "component", "view", "UIElementEventBinding"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 

    
    // references
    public com.sap.ide.metamodel.webdynpro.component.view.uielement.ViewElement getViewElement() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setViewElement(com.sap.ide.metamodel.webdynpro.component.view.uielement.ViewElement newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.ide.metamodel.webdynpro.component.controller.Action getBoundAction() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setBoundAction(com.sap.ide.metamodel.webdynpro.component.controller.Action newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.ide.metamodel.webdynpro.framework.FrameworkEvent getUielementEvent() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setUielementEvent(com.sap.ide.metamodel.webdynpro.framework.FrameworkEvent newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;


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
         * Returns the descriptor for the <code>parameterMappings</code> reference.
         * @return  the descriptor for the <code>parameterMappings</code> reference
         */
        public com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.event.EventBinding,java.util.Collection<com.sap.ide.metamodel.webdynpro.event.ParameterMapping>> PARAMETER_MAPPINGS( ) {
            return com.sap.ide.metamodel.webdynpro.event.EventBinding.DESCRIPTORS.PARAMETER_MAPPINGS( );
        }
        private com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.component.view.UielementEventBinding,com.sap.ide.metamodel.webdynpro.component.view.uielement.ViewElement> __viewElement;
        /**
         * Returns the descriptor for the <code>viewElement</code> reference.
         * @return  the descriptor for the <code>viewElement</code> reference
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.component.view.UielementEventBinding,com.sap.ide.metamodel.webdynpro.component.view.uielement.ViewElement> VIEW_ELEMENT( ) {
            if ( __viewElement == null ) {
                __viewElement = new com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.component.view.UielementEventBinding,com.sap.ide.metamodel.webdynpro.component.view.uielement.ViewElement>( "45DDACEE77F9F315B8B8465F3C92D49A9C8F3322", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "WebDynpro", "component", "view", "UIElementEventBinding", "ViewElement" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ 
            }
            return __viewElement;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.component.view.UielementEventBinding,com.sap.ide.metamodel.webdynpro.component.controller.Action> __boundAction;
        /**
         * Returns the descriptor for the <code>boundAction</code> reference.
         * @return  the descriptor for the <code>boundAction</code> reference
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.component.view.UielementEventBinding,com.sap.ide.metamodel.webdynpro.component.controller.Action> BOUND_ACTION( ) {
            if ( __boundAction == null ) {
                __boundAction = new com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.component.view.UielementEventBinding,com.sap.ide.metamodel.webdynpro.component.controller.Action>( "460CC65C23276D097BCB44762DF0C85C7ADDC376", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "WebDynpro", "component", "view", "UIElementEventBinding", "BoundAction" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ 
            }
            return __boundAction;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.component.view.UielementEventBinding,com.sap.ide.metamodel.webdynpro.framework.FrameworkEvent> __uielementEvent;
        /**
         * Returns the descriptor for the <code>uielementEvent</code> reference.
         * @return  the descriptor for the <code>uielementEvent</code> reference
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.component.view.UielementEventBinding,com.sap.ide.metamodel.webdynpro.framework.FrameworkEvent> UIELEMENT_EVENT( ) {
            if ( __uielementEvent == null ) {
                __uielementEvent = new com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.component.view.UielementEventBinding,com.sap.ide.metamodel.webdynpro.framework.FrameworkEvent>( "460CC65CE2B0D36731D84C092E6496DAEBC26D05", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "WebDynpro", "component", "view", "UIElementEventBinding", "UIElementEvent" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ 
            }
            return __uielementEvent;
        }
    }
}    