/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.component.view.uielement;

/**
 * An input field to be used in a toolbar.
 * This interface is not intended to be implemented by clients.
 */
public interface ToolBarInputField extends com.sap.ide.metamodel.webdynpro.component.view.uielement.AbstractInputField {

    /**
     * Descriptors for all features of this MofClass and its supertypes.
     */
    public static final Descriptors DESCRIPTORS = new Descriptors( );

    // class extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.ClassDescriptor<com.sap.tc.moin.repository.mmi.reflect.RefClass, com.sap.ide.metamodel.webdynpro.component.view.uielement.ToolBarInputField> CLASS_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.ClassDescriptor<com.sap.tc.moin.repository.mmi.reflect.RefClass, com.sap.ide.metamodel.webdynpro.component.view.uielement.ToolBarInputField>("45DDACEE33D0D352AFE7479436AC858BCED134E2", "sap.com/tc/moin/webdynpro", "WebDynpro", "component", "view", "uielement", "ToolBarInputField"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ 

    
    // attributes
    public com.sap.ide.metamodel.common.TranslatableText getLabelText() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setLabelText(com.sap.ide.metamodel.common.TranslatableText newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;


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
        /**
         * Returns the descriptor for the <code>length</code> attribute.
         * @return  the descriptor for the <code>length</code> attribute
         */
        public com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.AbstractInputField,java.lang.Integer> LENGTH( ) {
            return com.sap.ide.metamodel.webdynpro.component.view.uielement.AbstractInputField.DESCRIPTORS.LENGTH( );
        }
        /**
         * Returns the descriptor for the <code>lengthIsDependent</code> attribute.
         * @return  the descriptor for the <code>lengthIsDependent</code> attribute
         */
        public com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.AbstractInputField,java.lang.Boolean> LENGTH_IS_DEPENDENT( ) {
            return com.sap.ide.metamodel.webdynpro.component.view.uielement.AbstractInputField.DESCRIPTORS.LENGTH_IS_DEPENDENT( );
        }
        /**
         * Returns the descriptor for the <code>passwordField</code> attribute.
         * @return  the descriptor for the <code>passwordField</code> attribute
         */
        public com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.AbstractInputField,java.lang.Boolean> PASSWORD_FIELD( ) {
            return com.sap.ide.metamodel.webdynpro.component.view.uielement.AbstractInputField.DESCRIPTORS.PASSWORD_FIELD( );
        }
        /**
         * Returns the descriptor for the <code>readOnly</code> attribute.
         * @return  the descriptor for the <code>readOnly</code> attribute
         */
        public com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.AbstractInputField,java.lang.Boolean> READ_ONLY( ) {
            return com.sap.ide.metamodel.webdynpro.component.view.uielement.AbstractInputField.DESCRIPTORS.READ_ONLY( );
        }
        /**
         * Returns the descriptor for the <code>state</code> attribute.
         * @return  the descriptor for the <code>state</code> attribute
         */
        public com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.AbstractInputField,com.sap.ide.metamodel.webdynpro.component.view.uielement.State> STATE( ) {
            return com.sap.ide.metamodel.webdynpro.component.view.uielement.AbstractInputField.DESCRIPTORS.STATE( );
        }
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.ToolBarInputField,com.sap.ide.metamodel.common.TranslatableText> __labelText;
        /**
         * Returns the descriptor for the <code>labelText</code> attribute.
         * @return  the descriptor for the <code>labelText</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.ToolBarInputField,com.sap.ide.metamodel.common.TranslatableText> LABEL_TEXT( ) {
            if ( __labelText == null ) {
                __labelText = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.ToolBarInputField,com.sap.ide.metamodel.common.TranslatableText>( "45DDACEEC021A5B9A17147970277FF5B074D3509", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "WebDynpro", "component", "view", "uielement", "ToolBarInputField", "labelText" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ //$NON-NLS-8$ 
            }
            return __labelText;
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