/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.model;

/**
 * Represents a model type specific setting that is attached to a model.
 * This interface is not intended to be implemented by clients.
 */
public interface ModelSetting extends com.sap.ide.metamodel.webdynpro.model.AbstractModelSetting {

    /**
     * Descriptors for all features of this MofClass and its supertypes.
     */
    public static final Descriptors DESCRIPTORS = new Descriptors( );

    // class extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.ClassDescriptor<com.sap.tc.moin.repository.mmi.reflect.RefClass, com.sap.ide.metamodel.webdynpro.model.ModelSetting> CLASS_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.ClassDescriptor<com.sap.tc.moin.repository.mmi.reflect.RefClass, com.sap.ide.metamodel.webdynpro.model.ModelSetting>("45DDACEF596E38BE294B4F5F392192CE14C1C55C", "sap.com/tc/moin/webdynpro", "WebDynpro", "model", "ModelSetting"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ 

    
    // references
    public com.sap.ide.metamodel.webdynpro.framework.ModelSettingDefinition getSettingDefinition() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setSettingDefinition(com.sap.ide.metamodel.webdynpro.framework.ModelSettingDefinition newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.ide.metamodel.webdynpro.model.Model getModel() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setModel(com.sap.ide.metamodel.webdynpro.model.Model newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;


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
         * Returns the descriptor for the <code>value</code> attribute.
         * @return  the descriptor for the <code>value</code> attribute
         */
        public com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.model.AbstractModelSetting,java.lang.String> VALUE( ) {
            return com.sap.ide.metamodel.webdynpro.model.AbstractModelSetting.DESCRIPTORS.VALUE( );
        }
        /**
         * Returns the descriptor for the <code>translatableValue</code> attribute.
         * @return  the descriptor for the <code>translatableValue</code> attribute
         */
        public com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.model.AbstractModelSetting,com.sap.ide.metamodel.common.TranslatableText> TRANSLATABLE_VALUE( ) {
            return com.sap.ide.metamodel.webdynpro.model.AbstractModelSetting.DESCRIPTORS.TRANSLATABLE_VALUE( );
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
        private com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.model.ModelSetting,com.sap.ide.metamodel.webdynpro.framework.ModelSettingDefinition> __settingDefinition;
        /**
         * Returns the descriptor for the <code>settingDefinition</code> reference.
         * @return  the descriptor for the <code>settingDefinition</code> reference
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.model.ModelSetting,com.sap.ide.metamodel.webdynpro.framework.ModelSettingDefinition> SETTING_DEFINITION( ) {
            if ( __settingDefinition == null ) {
                __settingDefinition = new com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.model.ModelSetting,com.sap.ide.metamodel.webdynpro.framework.ModelSettingDefinition>( "45DDACEFE87241E02482404136E7BA9D39CC93CD", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "WebDynpro", "model", "ModelSetting", "SettingDefinition" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __settingDefinition;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.model.ModelSetting,com.sap.ide.metamodel.webdynpro.model.Model> __model;
        /**
         * Returns the descriptor for the <code>model</code> reference.
         * @return  the descriptor for the <code>model</code> reference
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.model.ModelSetting,com.sap.ide.metamodel.webdynpro.model.Model> MODEL( ) {
            if ( __model == null ) {
                __model = new com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.model.ModelSetting,com.sap.ide.metamodel.webdynpro.model.Model>( "45DDACEF70E3B114F71C4E063AA5DF25B4007E3E", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "WebDynpro", "model", "ModelSetting", "Model" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __model;
        }
    }
}    