/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.component.view.uielement;

/**
 * Abstract base class of drop-down list classes.
 * This interface is not intended to be implemented by clients.
 */
public interface AbstractDropDown extends com.sap.ide.metamodel.webdynpro.component.view.uielement.Uielement {

    /**
     * Descriptors for all features of this MofClass and its supertypes.
     */
    public static final Descriptors DESCRIPTORS = new Descriptors( );

    // class extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.ClassDescriptor<com.sap.tc.moin.repository.mmi.reflect.RefClass, com.sap.ide.metamodel.webdynpro.component.view.uielement.AbstractDropDown> CLASS_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.ClassDescriptor<com.sap.tc.moin.repository.mmi.reflect.RefClass, com.sap.ide.metamodel.webdynpro.component.view.uielement.AbstractDropDown>("45DDACEEE2083F5CCA424A1D115E84BCA389B184", "sap.com/tc/moin/webdynpro", "WebDynpro", "component", "view", "uielement", "AbstractDropDown"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ 

    
    // attributes
    /**
     * The state of the drop-down list.
     */
    public com.sap.ide.metamodel.webdynpro.component.view.uielement.State getState() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    /**
     * The state of the drop-down list.
     */
    public void setState(com.sap.ide.metamodel.webdynpro.component.view.uielement.State newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    /**
     * Determines the width of the drop-down list box. This must be an integer value interpreted as pixels!
     */
    public java.lang.String getWidth() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    /**
     * Determines the width of the drop-down list box. This must be an integer value interpreted as pixels!
     */
    public void setWidth(java.lang.String newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;


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
         * Returns the descriptor for the <code>enabled</code> attribute.
         * @return  the descriptor for the <code>enabled</code> attribute
         */
        public com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.Uielement,java.lang.Boolean> ENABLED( ) {
            return com.sap.ide.metamodel.webdynpro.component.view.uielement.Uielement.DESCRIPTORS.ENABLED( );
        }
        /**
         * Returns the descriptor for the <code>tooltip</code> attribute.
         * @return  the descriptor for the <code>tooltip</code> attribute
         */
        public com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.Uielement,com.sap.ide.metamodel.common.TranslatableText> TOOLTIP( ) {
            return com.sap.ide.metamodel.webdynpro.component.view.uielement.Uielement.DESCRIPTORS.TOOLTIP( );
        }
        /**
         * Returns the descriptor for the <code>tooltipIsDependent</code> attribute.
         * @return  the descriptor for the <code>tooltipIsDependent</code> attribute
         */
        public com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.Uielement,java.lang.Boolean> TOOLTIP_IS_DEPENDENT( ) {
            return com.sap.ide.metamodel.webdynpro.component.view.uielement.Uielement.DESCRIPTORS.TOOLTIP_IS_DEPENDENT( );
        }
        /**
         * Returns the descriptor for the <code>visible</code> attribute.
         * @return  the descriptor for the <code>visible</code> attribute
         */
        public com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.Uielement,com.sap.ide.metamodel.webdynpro.component.view.uielement.Visibility> VISIBLE( ) {
            return com.sap.ide.metamodel.webdynpro.component.view.uielement.Uielement.DESCRIPTORS.VISIBLE( );
        }
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.AbstractDropDown,com.sap.ide.metamodel.webdynpro.component.view.uielement.State> __state;
        /**
         * Returns the descriptor for the <code>state</code> attribute.
         * @return  the descriptor for the <code>state</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.AbstractDropDown,com.sap.ide.metamodel.webdynpro.component.view.uielement.State> STATE( ) {
            if ( __state == null ) {
                __state = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.AbstractDropDown,com.sap.ide.metamodel.webdynpro.component.view.uielement.State>( "45DDACEE29C8EC2390574520029AC2E98CCAC6C2", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "WebDynpro", "component", "view", "uielement", "AbstractDropDown", "state" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ //$NON-NLS-8$ 
            }
            return __state;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.AbstractDropDown,java.lang.String> __width;
        /**
         * Returns the descriptor for the <code>width</code> attribute.
         * @return  the descriptor for the <code>width</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.AbstractDropDown,java.lang.String> WIDTH( ) {
            if ( __width == null ) {
                __width = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.AbstractDropDown,java.lang.String>( "45DDACEE11842DB074604E9833ABE9F4A06D1331", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "WebDynpro", "component", "view", "uielement", "AbstractDropDown", "width" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ //$NON-NLS-8$ 
            }
            return __width;
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
         * Returns the descriptor for the <code>definition</code> reference.
         * @return  the descriptor for the <code>definition</code> reference
         */
        public com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.component.view.uielement.ViewElement,com.sap.ide.metamodel.webdynpro.framework.uielib.ViewElementDefinition> DEFINITION( ) {
            return com.sap.ide.metamodel.webdynpro.component.view.uielement.ViewElement.DESCRIPTORS.DEFINITION( );
        }
        /**
         * Returns the descriptor for the <code>outgoingAggregations</code> reference.
         * @return  the descriptor for the <code>outgoingAggregations</code> reference
         */
        public com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.component.view.uielement.ViewElement,java.util.List<com.sap.ide.metamodel.webdynpro.component.view.uielement.ViewElementAggregation>> OUTGOING_AGGREGATIONS( ) {
            return com.sap.ide.metamodel.webdynpro.component.view.uielement.ViewElement.DESCRIPTORS.OUTGOING_AGGREGATIONS( );
        }
        /**
         * Returns the descriptor for the <code>properties</code> reference.
         * @return  the descriptor for the <code>properties</code> reference
         */
        public com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.component.view.uielement.ViewElement,java.util.List<com.sap.ide.metamodel.webdynpro.component.view.uielement.AbstractViewElementProperty>> PROPERTIES( ) {
            return com.sap.ide.metamodel.webdynpro.component.view.uielement.ViewElement.DESCRIPTORS.PROPERTIES( );
        }
        /**
         * Returns the descriptor for the <code>container</code> reference.
         * @return  the descriptor for the <code>container</code> reference
         */
        public com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.component.view.uielement.Uielement,com.sap.ide.metamodel.webdynpro.component.view.uielement.UielementContainer> CONTAINER( ) {
            return com.sap.ide.metamodel.webdynpro.component.view.uielement.Uielement.DESCRIPTORS.CONTAINER( );
        }
        /**
         * Returns the descriptor for the <code>layoutData</code> reference.
         * @return  the descriptor for the <code>layoutData</code> reference
         */
        public com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.component.view.uielement.Uielement,com.sap.ide.metamodel.webdynpro.component.view.uielement.LayoutData> LAYOUT_DATA( ) {
            return com.sap.ide.metamodel.webdynpro.component.view.uielement.Uielement.DESCRIPTORS.LAYOUT_DATA( );
        }
    }
}    