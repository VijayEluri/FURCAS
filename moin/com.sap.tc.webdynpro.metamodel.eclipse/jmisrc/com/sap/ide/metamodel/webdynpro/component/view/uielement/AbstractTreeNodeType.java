/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.component.view.uielement;

/**
 * AbstractTreeNodeType is the base class of a trees node types.
 * This interface is not intended to be implemented by clients.
 */
public interface AbstractTreeNodeType extends com.sap.ide.metamodel.webdynpro.component.view.uielement.ViewElement {

    /**
     * Descriptors for all features of this MofClass and its supertypes.
     */
    public static final Descriptors DESCRIPTORS = new Descriptors( );

    // class extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.ClassDescriptor<com.sap.tc.moin.repository.mmi.reflect.RefClass, com.sap.ide.metamodel.webdynpro.component.view.uielement.AbstractTreeNodeType> CLASS_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.ClassDescriptor<com.sap.tc.moin.repository.mmi.reflect.RefClass, com.sap.ide.metamodel.webdynpro.component.view.uielement.AbstractTreeNodeType>("45DDACEEFC42E44D139D462E05078664E47D5282", "sap.com/tc/moin/webdynpro", "WebDynpro", "component", "view", "uielement", "AbstractTreeNodeType"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ 

    
    // attributes
    /**
     * The text used for nodes of this type.
     */
    public com.sap.ide.metamodel.common.TranslatableText getText() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    /**
     * The text used for nodes of this type.
     */
    public void setText(com.sap.ide.metamodel.common.TranslatableText newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    /**
     * The tooltip used for nodes of this type.
     */
    public com.sap.ide.metamodel.common.TranslatableText getTooltip() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    /**
     * The tooltip used for nodes of this type.
     */
    public void setTooltip(com.sap.ide.metamodel.common.TranslatableText newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    /**
     * Determines the URL where this icon gets its data.
     */
    public java.lang.String getIconSource() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    /**
     * Determines the URL where this icon gets its data.
     */
    public void setIconSource(java.lang.String newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.ide.metamodel.common.TranslatableText getIconAlt() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setIconAlt(com.sap.ide.metamodel.common.TranslatableText newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    /**
     * Specifies wether the TreeNode should be displayed as link or not. By default every node that has an action attached to it is displayed as link. With this property this default behaviour is overwritten.    
     */
    public boolean isIgnoreAction() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    /**
     * Specifies wether the TreeNode should be displayed as link or not. By default every node that has an action attached to it is displayed as link. With this property this default behaviour is overwritten.    
     */
    public void setIgnoreAction(boolean newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;

    // references
    public com.sap.ide.metamodel.webdynpro.component.view.uielement.Tree getTree() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setTree(com.sap.ide.metamodel.webdynpro.component.view.uielement.Tree newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;


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
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.AbstractTreeNodeType,com.sap.ide.metamodel.common.TranslatableText> __text;
        /**
         * Returns the descriptor for the <code>text</code> attribute.
         * @return  the descriptor for the <code>text</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.AbstractTreeNodeType,com.sap.ide.metamodel.common.TranslatableText> TEXT( ) {
            if ( __text == null ) {
                __text = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.AbstractTreeNodeType,com.sap.ide.metamodel.common.TranslatableText>( "45DDACEEBD6152E8C8B04E192393E92F2964DB6B", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "WebDynpro", "component", "view", "uielement", "AbstractTreeNodeType", "text" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ //$NON-NLS-8$ 
            }
            return __text;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.AbstractTreeNodeType,com.sap.ide.metamodel.common.TranslatableText> __tooltip;
        /**
         * Returns the descriptor for the <code>tooltip</code> attribute.
         * @return  the descriptor for the <code>tooltip</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.AbstractTreeNodeType,com.sap.ide.metamodel.common.TranslatableText> TOOLTIP( ) {
            if ( __tooltip == null ) {
                __tooltip = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.AbstractTreeNodeType,com.sap.ide.metamodel.common.TranslatableText>( "45DDACEE8EC4C06D09F3449A36D5A7510FB3369F", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "WebDynpro", "component", "view", "uielement", "AbstractTreeNodeType", "tooltip" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ //$NON-NLS-8$ 
            }
            return __tooltip;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.AbstractTreeNodeType,java.lang.String> __iconSource;
        /**
         * Returns the descriptor for the <code>iconSource</code> attribute.
         * @return  the descriptor for the <code>iconSource</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.AbstractTreeNodeType,java.lang.String> ICON_SOURCE( ) {
            if ( __iconSource == null ) {
                __iconSource = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.AbstractTreeNodeType,java.lang.String>( "45DDACEE02321EBE004B4280215A917B2A6F5864", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "WebDynpro", "component", "view", "uielement", "AbstractTreeNodeType", "iconSource" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ //$NON-NLS-8$ 
            }
            return __iconSource;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.AbstractTreeNodeType,com.sap.ide.metamodel.common.TranslatableText> __iconAlt;
        /**
         * Returns the descriptor for the <code>iconAlt</code> attribute.
         * @return  the descriptor for the <code>iconAlt</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.AbstractTreeNodeType,com.sap.ide.metamodel.common.TranslatableText> ICON_ALT( ) {
            if ( __iconAlt == null ) {
                __iconAlt = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.AbstractTreeNodeType,com.sap.ide.metamodel.common.TranslatableText>( "45DDACEEA2C2F08F76164CB61A5386BF5755A8C5", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "WebDynpro", "component", "view", "uielement", "AbstractTreeNodeType", "iconAlt" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ //$NON-NLS-8$ 
            }
            return __iconAlt;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.AbstractTreeNodeType,java.lang.Boolean> __ignoreAction;
        /**
         * Returns the descriptor for the <code>ignoreAction</code> attribute.
         * @return  the descriptor for the <code>ignoreAction</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.AbstractTreeNodeType,java.lang.Boolean> IGNORE_ACTION( ) {
            if ( __ignoreAction == null ) {
                __ignoreAction = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.AbstractTreeNodeType,java.lang.Boolean>( "45DDACEEF4B5E7A769D640FC17F2CB1779E3A844", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "WebDynpro", "component", "view", "uielement", "AbstractTreeNodeType", "ignoreAction" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ //$NON-NLS-8$ 
            }
            return __ignoreAction;
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
        private com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.component.view.uielement.AbstractTreeNodeType,com.sap.ide.metamodel.webdynpro.component.view.uielement.Tree> __tree;
        /**
         * Returns the descriptor for the <code>tree</code> reference.
         * @return  the descriptor for the <code>tree</code> reference
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.component.view.uielement.AbstractTreeNodeType,com.sap.ide.metamodel.webdynpro.component.view.uielement.Tree> TREE( ) {
            if ( __tree == null ) {
                __tree = new com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.component.view.uielement.AbstractTreeNodeType,com.sap.ide.metamodel.webdynpro.component.view.uielement.Tree>( "45DDACEE933405380F26487F3B4691104D944B63", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "WebDynpro", "component", "view", "uielement", "AbstractTreeNodeType", "Tree" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ //$NON-NLS-8$ 
            }
            return __tree;
        }
    }
}    