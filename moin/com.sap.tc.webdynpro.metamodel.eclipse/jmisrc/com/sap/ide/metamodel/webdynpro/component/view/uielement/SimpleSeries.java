/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.component.view.uielement;

/**
 * Part of BusinessGraphics.
 * This interface is not intended to be implemented by clients.
 */
public interface SimpleSeries extends com.sap.ide.metamodel.webdynpro.component.view.uielement.AbstractSeries {

    /**
     * Descriptors for all features of this MofClass and its supertypes.
     */
    public static final Descriptors DESCRIPTORS = new Descriptors( );

    // class extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.ClassDescriptor<com.sap.tc.moin.repository.mmi.reflect.RefClass, com.sap.ide.metamodel.webdynpro.component.view.uielement.SimpleSeries> CLASS_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.ClassDescriptor<com.sap.tc.moin.repository.mmi.reflect.RefClass, com.sap.ide.metamodel.webdynpro.component.view.uielement.SimpleSeries>("45DDACEE178E953AE315437D3EC8C3CAA63D78BA", "sap.com/tc/moin/webdynpro", "WebDynpro", "component", "view", "uielement", "SimpleSeries"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ 

    
    // attributes
    public java.lang.String getCustomizingId() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setCustomizingId(java.lang.String newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.ide.metamodel.common.TranslatableText getLabel() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setLabel(com.sap.ide.metamodel.common.TranslatableText newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.ide.metamodel.common.TranslatableText getTooltip() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setTooltip(com.sap.ide.metamodel.common.TranslatableText newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public java.lang.String getValue() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setValue(java.lang.String newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;


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
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.SimpleSeries,java.lang.String> __customizingId;
        /**
         * Returns the descriptor for the <code>customizingId</code> attribute.
         * @return  the descriptor for the <code>customizingId</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.SimpleSeries,java.lang.String> CUSTOMIZING_ID( ) {
            if ( __customizingId == null ) {
                __customizingId = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.SimpleSeries,java.lang.String>( "45DDACEE7FD62335D69E4FE501A8D28098A4B7A8", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "WebDynpro", "component", "view", "uielement", "SimpleSeries", "customizingID" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ //$NON-NLS-8$ 
            }
            return __customizingId;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.SimpleSeries,com.sap.ide.metamodel.common.TranslatableText> __label;
        /**
         * Returns the descriptor for the <code>label</code> attribute.
         * @return  the descriptor for the <code>label</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.SimpleSeries,com.sap.ide.metamodel.common.TranslatableText> LABEL( ) {
            if ( __label == null ) {
                __label = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.SimpleSeries,com.sap.ide.metamodel.common.TranslatableText>( "45DDACEEE4DCC77DE74F4936041DE8D8C7A2974C", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "WebDynpro", "component", "view", "uielement", "SimpleSeries", "label" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ //$NON-NLS-8$ 
            }
            return __label;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.SimpleSeries,com.sap.ide.metamodel.common.TranslatableText> __tooltip;
        /**
         * Returns the descriptor for the <code>tooltip</code> attribute.
         * @return  the descriptor for the <code>tooltip</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.SimpleSeries,com.sap.ide.metamodel.common.TranslatableText> TOOLTIP( ) {
            if ( __tooltip == null ) {
                __tooltip = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.SimpleSeries,com.sap.ide.metamodel.common.TranslatableText>( "45DDACEEACDC3EAD413D4D521F2ED1DD26D1F9E0", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "WebDynpro", "component", "view", "uielement", "SimpleSeries", "tooltip" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ //$NON-NLS-8$ 
            }
            return __tooltip;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.SimpleSeries,java.lang.String> __value;
        /**
         * Returns the descriptor for the <code>value</code> attribute.
         * @return  the descriptor for the <code>value</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.SimpleSeries,java.lang.String> VALUE( ) {
            if ( __value == null ) {
                __value = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.SimpleSeries,java.lang.String>( "45DDACEE0203FF8FF6B244CF012F804FBE73AD24", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "WebDynpro", "component", "view", "uielement", "SimpleSeries", "value" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ //$NON-NLS-8$ 
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
         * Returns the descriptor for the <code>businessGraphics</code> reference.
         * @return  the descriptor for the <code>businessGraphics</code> reference
         */
        public com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.component.view.uielement.AbstractSeries,com.sap.ide.metamodel.webdynpro.component.view.uielement.BusinessGraphics> BUSINESS_GRAPHICS( ) {
            return com.sap.ide.metamodel.webdynpro.component.view.uielement.AbstractSeries.DESCRIPTORS.BUSINESS_GRAPHICS( );
        }
    }
}    