/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.dictionary.datatype;

/**
 * This interface is not intended to be implemented by clients.
 */
public interface DtTechnicalSettings extends com.sap.ide.metamodel.common.CommonDevelopmentObject {

    /**
     * Descriptors for all features of this MofClass and its supertypes.
     */
    public static final Descriptors DESCRIPTORS = new Descriptors( );

    // class extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.ClassDescriptor<com.sap.tc.moin.repository.mmi.reflect.RefClass, com.sap.ide.metamodel.dictionary.datatype.DtTechnicalSettings> CLASS_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.ClassDescriptor<com.sap.tc.moin.repository.mmi.reflect.RefClass, com.sap.ide.metamodel.dictionary.datatype.DtTechnicalSettings>("45DDACEF9ADFD4F1FEF44F4C2AE8B1711143D755", "sap.com/tc/moin/webdynpro", "Dictionary", "datatype", "DtTechnicalSettings"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ 

    
    // attributes
    public int getNumberOfRecords() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setNumberOfRecords(int newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean isBuffered() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setBuffered(boolean newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean isLogged() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setLogged(boolean newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public int getGenKeyCount() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setGenKeyCount(int newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;

    // references
    public com.sap.ide.metamodel.dictionary.datatype.DtDbTable getDbTable() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setDbTable(com.sap.ide.metamodel.dictionary.datatype.DtDbTable newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.ide.metamodel.dictionary.datatype.DtDbView getDbView() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setDbView(com.sap.ide.metamodel.dictionary.datatype.DtDbView newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;


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
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.dictionary.datatype.DtTechnicalSettings,java.lang.Integer> __numberOfRecords;
        /**
         * Returns the descriptor for the <code>numberOfRecords</code> attribute.
         * @return  the descriptor for the <code>numberOfRecords</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.dictionary.datatype.DtTechnicalSettings,java.lang.Integer> NUMBER_OF_RECORDS( ) {
            if ( __numberOfRecords == null ) {
                __numberOfRecords = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.dictionary.datatype.DtTechnicalSettings,java.lang.Integer>( "45DDACEF770DA13497E3409C037CCDC56F46D183", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "Dictionary", "datatype", "DtTechnicalSettings", "numberOfRecords" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __numberOfRecords;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.dictionary.datatype.DtTechnicalSettings,java.lang.Boolean> __isBuffered;
        /**
         * Returns the descriptor for the <code>isBuffered</code> attribute.
         * @return  the descriptor for the <code>isBuffered</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.dictionary.datatype.DtTechnicalSettings,java.lang.Boolean> IS_BUFFERED( ) {
            if ( __isBuffered == null ) {
                __isBuffered = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.dictionary.datatype.DtTechnicalSettings,java.lang.Boolean>( "45DDACEF22221B2FB4E34E8809FF803A3AC4B75C", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "Dictionary", "datatype", "DtTechnicalSettings", "isBuffered" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __isBuffered;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.dictionary.datatype.DtTechnicalSettings,java.lang.Boolean> __isLogged;
        /**
         * Returns the descriptor for the <code>isLogged</code> attribute.
         * @return  the descriptor for the <code>isLogged</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.dictionary.datatype.DtTechnicalSettings,java.lang.Boolean> IS_LOGGED( ) {
            if ( __isLogged == null ) {
                __isLogged = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.dictionary.datatype.DtTechnicalSettings,java.lang.Boolean>( "45DDACEF31762B920C8540CC1A96BBA55F9A24F0", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "Dictionary", "datatype", "DtTechnicalSettings", "isLogged" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __isLogged;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.dictionary.datatype.DtTechnicalSettings,java.lang.Integer> __genKeyCount;
        /**
         * Returns the descriptor for the <code>genKeyCount</code> attribute.
         * @return  the descriptor for the <code>genKeyCount</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.dictionary.datatype.DtTechnicalSettings,java.lang.Integer> GEN_KEY_COUNT( ) {
            if ( __genKeyCount == null ) {
                __genKeyCount = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.dictionary.datatype.DtTechnicalSettings,java.lang.Integer>( "45DDACEF19A64846E79F4EED3B85FD60E5120BCA", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "Dictionary", "datatype", "DtTechnicalSettings", "genKeyCount" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __genKeyCount;
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
        private com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.dictionary.datatype.DtTechnicalSettings,com.sap.ide.metamodel.dictionary.datatype.DtDbTable> __dbTable;
        /**
         * Returns the descriptor for the <code>dbTable</code> reference.
         * @return  the descriptor for the <code>dbTable</code> reference
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.dictionary.datatype.DtTechnicalSettings,com.sap.ide.metamodel.dictionary.datatype.DtDbTable> DB_TABLE( ) {
            if ( __dbTable == null ) {
                __dbTable = new com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.dictionary.datatype.DtTechnicalSettings,com.sap.ide.metamodel.dictionary.datatype.DtDbTable>( "45DDACEFE044F74FD1844AE132D3B9C5AB430314", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "Dictionary", "datatype", "DtTechnicalSettings", "DbTable" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __dbTable;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.dictionary.datatype.DtTechnicalSettings,com.sap.ide.metamodel.dictionary.datatype.DtDbView> __dbView;
        /**
         * Returns the descriptor for the <code>dbView</code> reference.
         * @return  the descriptor for the <code>dbView</code> reference
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.dictionary.datatype.DtTechnicalSettings,com.sap.ide.metamodel.dictionary.datatype.DtDbView> DB_VIEW( ) {
            if ( __dbView == null ) {
                __dbView = new com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.dictionary.datatype.DtTechnicalSettings,com.sap.ide.metamodel.dictionary.datatype.DtDbView>( "45DDACEF24387DDD14BD45B73890D5AF523938B0", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "Dictionary", "datatype", "DtTechnicalSettings", "DbView" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __dbView;
        }
    }
}    