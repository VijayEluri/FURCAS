/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.component.view.uielement;

/**
 * TextEdit is used to display and edit several lines of text.
 * The edited value is given by the <code>value</code> property. The size of the
 * text edit is given by the <code>cols</code> and <code>rows</code> properties.
 * This interface is not intended to be implemented by clients.
 */
public interface TextEdit extends com.sap.ide.metamodel.webdynpro.component.view.uielement.Uielement {

    /**
     * Descriptors for all features of this MofClass and its supertypes.
     */
    public static final Descriptors DESCRIPTORS = new Descriptors( );

    // class extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.ClassDescriptor<com.sap.tc.moin.repository.mmi.reflect.RefClass, com.sap.ide.metamodel.webdynpro.component.view.uielement.TextEdit> CLASS_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.ClassDescriptor<com.sap.tc.moin.repository.mmi.reflect.RefClass, com.sap.ide.metamodel.webdynpro.component.view.uielement.TextEdit>("45DDACEE2EF2BC1856A245961BEDFC51DE719F2C", "sap.com/tc/moin/webdynpro", "WebDynpro", "component", "view", "uielement", "TextEdit"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ 

    
    // attributes
    /**
     * Determines the number of text columns displayed.
     */
    public int getCols() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    /**
     * Determines the number of text columns displayed.
     */
    public void setCols(int newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    /**
     * Determines the number of text rows displayed.
     */
    public int getRows() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    /**
     * Determines the number of text rows displayed.
     */
    public void setRows(int newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    /**
     * The error state of the text edit element.
     */
    public com.sap.ide.metamodel.webdynpro.component.view.uielement.State getState() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    /**
     * The error state of the text edit element.
     */
    public void setState(com.sap.ide.metamodel.webdynpro.component.view.uielement.State newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    /**
     * Determines how the text is wrapped.
     */
    public com.sap.ide.metamodel.webdynpro.component.view.uielement.TextWrapping getWrapping() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    /**
     * Determines how the text is wrapped.
     */
    public void setWrapping(com.sap.ide.metamodel.webdynpro.component.view.uielement.TextWrapping newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;


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
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.TextEdit,java.lang.Integer> __cols;
        /**
         * Returns the descriptor for the <code>cols</code> attribute.
         * @return  the descriptor for the <code>cols</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.TextEdit,java.lang.Integer> COLS( ) {
            if ( __cols == null ) {
                __cols = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.TextEdit,java.lang.Integer>( "45DDACEE4F2B450E6575475703DD986A4A8687CB", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "WebDynpro", "component", "view", "uielement", "TextEdit", "cols" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ //$NON-NLS-8$ 
            }
            return __cols;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.TextEdit,java.lang.Integer> __rows;
        /**
         * Returns the descriptor for the <code>rows</code> attribute.
         * @return  the descriptor for the <code>rows</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.TextEdit,java.lang.Integer> ROWS( ) {
            if ( __rows == null ) {
                __rows = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.TextEdit,java.lang.Integer>( "45DDACEE69064E4E4CDF46CB3B16957F8D0554FB", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "WebDynpro", "component", "view", "uielement", "TextEdit", "rows" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ //$NON-NLS-8$ 
            }
            return __rows;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.TextEdit,com.sap.ide.metamodel.webdynpro.component.view.uielement.State> __state;
        /**
         * Returns the descriptor for the <code>state</code> attribute.
         * @return  the descriptor for the <code>state</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.TextEdit,com.sap.ide.metamodel.webdynpro.component.view.uielement.State> STATE( ) {
            if ( __state == null ) {
                __state = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.TextEdit,com.sap.ide.metamodel.webdynpro.component.view.uielement.State>( "45DDACEE3D39E001F11B429D123CF67D25151360", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "WebDynpro", "component", "view", "uielement", "TextEdit", "state" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ //$NON-NLS-8$ 
            }
            return __state;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.TextEdit,com.sap.ide.metamodel.webdynpro.component.view.uielement.TextWrapping> __wrapping;
        /**
         * Returns the descriptor for the <code>wrapping</code> attribute.
         * @return  the descriptor for the <code>wrapping</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.TextEdit,com.sap.ide.metamodel.webdynpro.component.view.uielement.TextWrapping> WRAPPING( ) {
            if ( __wrapping == null ) {
                __wrapping = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.TextEdit,com.sap.ide.metamodel.webdynpro.component.view.uielement.TextWrapping>( "45DDACEE7C907A9F951A4BA7389AC420C54365D5", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "WebDynpro", "component", "view", "uielement", "TextEdit", "wrapping" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ //$NON-NLS-8$ 
            }
            return __wrapping;
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