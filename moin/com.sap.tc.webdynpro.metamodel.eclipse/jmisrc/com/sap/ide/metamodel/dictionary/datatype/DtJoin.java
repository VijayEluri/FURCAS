/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.dictionary.datatype;

/**
 * This interface is not intended to be implemented by clients.
 */
public interface DtJoin extends com.sap.ide.metamodel.common.CommonDevelopmentObject {

    /**
     * Descriptors for all features of this MofClass and its supertypes.
     */
    public static final Descriptors DESCRIPTORS = new Descriptors( );

    // class extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.ClassDescriptor<com.sap.tc.moin.repository.mmi.reflect.RefClass, com.sap.ide.metamodel.dictionary.datatype.DtJoin> CLASS_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.ClassDescriptor<com.sap.tc.moin.repository.mmi.reflect.RefClass, com.sap.ide.metamodel.dictionary.datatype.DtJoin>("45DDACEF447BADF55A3A4E0F2955C43057CD07CE", "sap.com/tc/moin/webdynpro", "Dictionary", "datatype", "DtJoin"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ 

    
    // attributes
    public java.lang.String getJoinText() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setJoinText(java.lang.String newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public java.lang.String getJoinType() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setJoinType(java.lang.String newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public java.lang.String getTabnameL() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setTabnameL(java.lang.String newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public java.lang.String getTabnameR() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setTabnameR(java.lang.String newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;

    // references
    public com.sap.ide.metamodel.dictionary.datatype.DtDbView getDbView() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setDbView(com.sap.ide.metamodel.dictionary.datatype.DtDbView newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public java.util.List<com.sap.ide.metamodel.dictionary.datatype.DtJoinCondition> getConditions() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;


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
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.dictionary.datatype.DtJoin,java.lang.String> __joinText;
        /**
         * Returns the descriptor for the <code>joinText</code> attribute.
         * @return  the descriptor for the <code>joinText</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.dictionary.datatype.DtJoin,java.lang.String> JOIN_TEXT( ) {
            if ( __joinText == null ) {
                __joinText = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.dictionary.datatype.DtJoin,java.lang.String>( "45DDACEF9EA53447C41A40611B3EA55F28219718", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "Dictionary", "datatype", "DtJoin", "joinText" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __joinText;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.dictionary.datatype.DtJoin,java.lang.String> __joinType;
        /**
         * Returns the descriptor for the <code>joinType</code> attribute.
         * @return  the descriptor for the <code>joinType</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.dictionary.datatype.DtJoin,java.lang.String> JOIN_TYPE( ) {
            if ( __joinType == null ) {
                __joinType = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.dictionary.datatype.DtJoin,java.lang.String>( "45DDACEF3318D70F090142172C60C04D45384788", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "Dictionary", "datatype", "DtJoin", "joinType" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __joinType;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.dictionary.datatype.DtJoin,java.lang.String> __tabnameL;
        /**
         * Returns the descriptor for the <code>tabnameL</code> attribute.
         * @return  the descriptor for the <code>tabnameL</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.dictionary.datatype.DtJoin,java.lang.String> TABNAME_L( ) {
            if ( __tabnameL == null ) {
                __tabnameL = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.dictionary.datatype.DtJoin,java.lang.String>( "45DDACEFE5BEC559BC834DC634E985C577A614B1", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "Dictionary", "datatype", "DtJoin", "tabnameL" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __tabnameL;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.dictionary.datatype.DtJoin,java.lang.String> __tabnameR;
        /**
         * Returns the descriptor for the <code>tabnameR</code> attribute.
         * @return  the descriptor for the <code>tabnameR</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.dictionary.datatype.DtJoin,java.lang.String> TABNAME_R( ) {
            if ( __tabnameR == null ) {
                __tabnameR = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.dictionary.datatype.DtJoin,java.lang.String>( "45DDACEF65EAC24C91B243C50CFDAE24A8AFEF88", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "Dictionary", "datatype", "DtJoin", "tabnameR" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __tabnameR;
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
        private com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.dictionary.datatype.DtJoin,com.sap.ide.metamodel.dictionary.datatype.DtDbView> __dbView;
        /**
         * Returns the descriptor for the <code>dbView</code> reference.
         * @return  the descriptor for the <code>dbView</code> reference
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.dictionary.datatype.DtJoin,com.sap.ide.metamodel.dictionary.datatype.DtDbView> DB_VIEW( ) {
            if ( __dbView == null ) {
                __dbView = new com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.dictionary.datatype.DtJoin,com.sap.ide.metamodel.dictionary.datatype.DtDbView>( "45DDACEF6B8DC136207B4EE8303AFB5CFF403D66", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "Dictionary", "datatype", "DtJoin", "DbView" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __dbView;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.dictionary.datatype.DtJoin,java.util.List<com.sap.ide.metamodel.dictionary.datatype.DtJoinCondition>> __conditions;
        /**
         * Returns the descriptor for the <code>conditions</code> reference.
         * @return  the descriptor for the <code>conditions</code> reference
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.dictionary.datatype.DtJoin,java.util.List<com.sap.ide.metamodel.dictionary.datatype.DtJoinCondition>> CONDITIONS( ) {
            if ( __conditions == null ) {
                __conditions = new com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.dictionary.datatype.DtJoin,java.util.List<com.sap.ide.metamodel.dictionary.datatype.DtJoinCondition>>( "45DDACEF96289ECFFCEB487D30B1C0EE921E1514", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "Dictionary", "datatype", "DtJoin", "Conditions" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __conditions;
        }
    }
}    