/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.sap.furcas.metamodel.FURCAS.textblocks;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.sap.furcas.metamodel.FURCAS.textblocks.TextblocksFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface TextblocksPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "textblocks";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.furcas.org/textblocks";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "com.sap.furcas.textblocks";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    TextblocksPackage eINSTANCE = com.sap.furcas.metamodel.FURCAS.textblocks.impl.TextblocksPackageImpl.init();

    /**
     * The meta object id for the '{@link com.sap.furcas.metamodel.FURCAS.textblocks.impl.DocumentNodeImpl <em>Document Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sap.furcas.metamodel.FURCAS.textblocks.impl.DocumentNodeImpl
     * @see com.sap.furcas.metamodel.FURCAS.textblocks.impl.TextblocksPackageImpl#getDocumentNode()
     * @generated
     */
    int DOCUMENT_NODE = 5;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_NODE__VERSION = 0;

    /**
     * The feature id for the '<em><b>Children Changed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_NODE__CHILDREN_CHANGED = 1;

    /**
     * The feature id for the '<em><b>Relexing Needed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_NODE__RELEXING_NEEDED = 2;

    /**
     * The feature id for the '<em><b>Parent</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_NODE__PARENT = 3;

    /**
     * The feature id for the '<em><b>Sequence Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_NODE__SEQUENCE_ELEMENT = 4;

    /**
     * The feature id for the '<em><b>Offset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_NODE__OFFSET = 5;

    /**
     * The feature id for the '<em><b>Length</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_NODE__LENGTH = 6;

    /**
     * The feature id for the '<em><b>Other Versions</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_NODE__OTHER_VERSIONS = 7;

    /**
     * The feature id for the '<em><b>Offset Relative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_NODE__OFFSET_RELATIVE = 8;

    /**
     * The feature id for the '<em><b>Absolute Offset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_NODE__ABSOLUTE_OFFSET = 9;

    /**
     * The number of structural features of the '<em>Document Node</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_NODE_FEATURE_COUNT = 10;

    /**
     * The meta object id for the '{@link com.sap.furcas.metamodel.FURCAS.textblocks.impl.TextBlockImpl <em>Text Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sap.furcas.metamodel.FURCAS.textblocks.impl.TextBlockImpl
     * @see com.sap.furcas.metamodel.FURCAS.textblocks.impl.TextblocksPackageImpl#getTextBlock()
     * @generated
     */
    int TEXT_BLOCK = 0;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_BLOCK__VERSION = DOCUMENT_NODE__VERSION;

    /**
     * The feature id for the '<em><b>Children Changed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_BLOCK__CHILDREN_CHANGED = DOCUMENT_NODE__CHILDREN_CHANGED;

    /**
     * The feature id for the '<em><b>Relexing Needed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_BLOCK__RELEXING_NEEDED = DOCUMENT_NODE__RELEXING_NEEDED;

    /**
     * The feature id for the '<em><b>Parent</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_BLOCK__PARENT = DOCUMENT_NODE__PARENT;

    /**
     * The feature id for the '<em><b>Sequence Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_BLOCK__SEQUENCE_ELEMENT = DOCUMENT_NODE__SEQUENCE_ELEMENT;

    /**
     * The feature id for the '<em><b>Offset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_BLOCK__OFFSET = DOCUMENT_NODE__OFFSET;

    /**
     * The feature id for the '<em><b>Length</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_BLOCK__LENGTH = DOCUMENT_NODE__LENGTH;

    /**
     * The feature id for the '<em><b>Other Versions</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_BLOCK__OTHER_VERSIONS = DOCUMENT_NODE__OTHER_VERSIONS;

    /**
     * The feature id for the '<em><b>Offset Relative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_BLOCK__OFFSET_RELATIVE = DOCUMENT_NODE__OFFSET_RELATIVE;

    /**
     * The feature id for the '<em><b>Absolute Offset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_BLOCK__ABSOLUTE_OFFSET = DOCUMENT_NODE__ABSOLUTE_OFFSET;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_BLOCK__TYPE = DOCUMENT_NODE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Sub Nodes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_BLOCK__SUB_NODES = DOCUMENT_NODE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Parent Alt Choices</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_BLOCK__PARENT_ALT_CHOICES = DOCUMENT_NODE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Elements In Context</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_BLOCK__ELEMENTS_IN_CONTEXT = DOCUMENT_NODE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>For Each Executions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_BLOCK__FOR_EACH_EXECUTIONS = DOCUMENT_NODE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Cached String</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_BLOCK__CACHED_STRING = DOCUMENT_NODE_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Complete</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_BLOCK__COMPLETE = DOCUMENT_NODE_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Additional Templates</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_BLOCK__ADDITIONAL_TEMPLATES = DOCUMENT_NODE_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Corresponding Model Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_BLOCK__CORRESPONDING_MODEL_ELEMENTS = DOCUMENT_NODE_FEATURE_COUNT + 8;

    /**
     * The number of structural features of the '<em>Text Block</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_BLOCK_FEATURE_COUNT = DOCUMENT_NODE_FEATURE_COUNT + 9;

    /**
     * The meta object id for the '{@link com.sap.furcas.metamodel.FURCAS.textblocks.impl.AbstractTokenImpl <em>Abstract Token</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sap.furcas.metamodel.FURCAS.textblocks.impl.AbstractTokenImpl
     * @see com.sap.furcas.metamodel.FURCAS.textblocks.impl.TextblocksPackageImpl#getAbstractToken()
     * @generated
     */
    int ABSTRACT_TOKEN = 1;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_TOKEN__VERSION = DOCUMENT_NODE__VERSION;

    /**
     * The feature id for the '<em><b>Children Changed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_TOKEN__CHILDREN_CHANGED = DOCUMENT_NODE__CHILDREN_CHANGED;

    /**
     * The feature id for the '<em><b>Relexing Needed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_TOKEN__RELEXING_NEEDED = DOCUMENT_NODE__RELEXING_NEEDED;

    /**
     * The feature id for the '<em><b>Parent</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_TOKEN__PARENT = DOCUMENT_NODE__PARENT;

    /**
     * The feature id for the '<em><b>Sequence Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_TOKEN__SEQUENCE_ELEMENT = DOCUMENT_NODE__SEQUENCE_ELEMENT;

    /**
     * The feature id for the '<em><b>Offset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_TOKEN__OFFSET = DOCUMENT_NODE__OFFSET;

    /**
     * The feature id for the '<em><b>Length</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_TOKEN__LENGTH = DOCUMENT_NODE__LENGTH;

    /**
     * The feature id for the '<em><b>Other Versions</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_TOKEN__OTHER_VERSIONS = DOCUMENT_NODE__OTHER_VERSIONS;

    /**
     * The feature id for the '<em><b>Offset Relative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_TOKEN__OFFSET_RELATIVE = DOCUMENT_NODE__OFFSET_RELATIVE;

    /**
     * The feature id for the '<em><b>Absolute Offset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_TOKEN__ABSOLUTE_OFFSET = DOCUMENT_NODE__ABSOLUTE_OFFSET;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_TOKEN__VALUE = DOCUMENT_NODE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Lookahead</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_TOKEN__LOOKAHEAD = DOCUMENT_NODE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Lookback</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_TOKEN__LOOKBACK = DOCUMENT_NODE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>State</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_TOKEN__STATE = DOCUMENT_NODE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_TOKEN__TYPE = DOCUMENT_NODE_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Abstract Token</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_TOKEN_FEATURE_COUNT = DOCUMENT_NODE_FEATURE_COUNT + 5;

    /**
     * The meta object id for the '{@link com.sap.furcas.metamodel.FURCAS.textblocks.impl.OmittedTokenImpl <em>Omitted Token</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sap.furcas.metamodel.FURCAS.textblocks.impl.OmittedTokenImpl
     * @see com.sap.furcas.metamodel.FURCAS.textblocks.impl.TextblocksPackageImpl#getOmittedToken()
     * @generated
     */
    int OMITTED_TOKEN = 2;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OMITTED_TOKEN__VERSION = ABSTRACT_TOKEN__VERSION;

    /**
     * The feature id for the '<em><b>Children Changed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OMITTED_TOKEN__CHILDREN_CHANGED = ABSTRACT_TOKEN__CHILDREN_CHANGED;

    /**
     * The feature id for the '<em><b>Relexing Needed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OMITTED_TOKEN__RELEXING_NEEDED = ABSTRACT_TOKEN__RELEXING_NEEDED;

    /**
     * The feature id for the '<em><b>Parent</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OMITTED_TOKEN__PARENT = ABSTRACT_TOKEN__PARENT;

    /**
     * The feature id for the '<em><b>Sequence Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OMITTED_TOKEN__SEQUENCE_ELEMENT = ABSTRACT_TOKEN__SEQUENCE_ELEMENT;

    /**
     * The feature id for the '<em><b>Offset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OMITTED_TOKEN__OFFSET = ABSTRACT_TOKEN__OFFSET;

    /**
     * The feature id for the '<em><b>Length</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OMITTED_TOKEN__LENGTH = ABSTRACT_TOKEN__LENGTH;

    /**
     * The feature id for the '<em><b>Other Versions</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OMITTED_TOKEN__OTHER_VERSIONS = ABSTRACT_TOKEN__OTHER_VERSIONS;

    /**
     * The feature id for the '<em><b>Offset Relative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OMITTED_TOKEN__OFFSET_RELATIVE = ABSTRACT_TOKEN__OFFSET_RELATIVE;

    /**
     * The feature id for the '<em><b>Absolute Offset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OMITTED_TOKEN__ABSOLUTE_OFFSET = ABSTRACT_TOKEN__ABSOLUTE_OFFSET;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OMITTED_TOKEN__VALUE = ABSTRACT_TOKEN__VALUE;

    /**
     * The feature id for the '<em><b>Lookahead</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OMITTED_TOKEN__LOOKAHEAD = ABSTRACT_TOKEN__LOOKAHEAD;

    /**
     * The feature id for the '<em><b>Lookback</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OMITTED_TOKEN__LOOKBACK = ABSTRACT_TOKEN__LOOKBACK;

    /**
     * The feature id for the '<em><b>State</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OMITTED_TOKEN__STATE = ABSTRACT_TOKEN__STATE;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OMITTED_TOKEN__TYPE = ABSTRACT_TOKEN__TYPE;

    /**
     * The number of structural features of the '<em>Omitted Token</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OMITTED_TOKEN_FEATURE_COUNT = ABSTRACT_TOKEN_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link com.sap.furcas.metamodel.FURCAS.textblocks.impl.LexedTokenImpl <em>Lexed Token</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sap.furcas.metamodel.FURCAS.textblocks.impl.LexedTokenImpl
     * @see com.sap.furcas.metamodel.FURCAS.textblocks.impl.TextblocksPackageImpl#getLexedToken()
     * @generated
     */
    int LEXED_TOKEN = 3;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LEXED_TOKEN__VERSION = ABSTRACT_TOKEN__VERSION;

    /**
     * The feature id for the '<em><b>Children Changed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LEXED_TOKEN__CHILDREN_CHANGED = ABSTRACT_TOKEN__CHILDREN_CHANGED;

    /**
     * The feature id for the '<em><b>Relexing Needed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LEXED_TOKEN__RELEXING_NEEDED = ABSTRACT_TOKEN__RELEXING_NEEDED;

    /**
     * The feature id for the '<em><b>Parent</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LEXED_TOKEN__PARENT = ABSTRACT_TOKEN__PARENT;

    /**
     * The feature id for the '<em><b>Sequence Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LEXED_TOKEN__SEQUENCE_ELEMENT = ABSTRACT_TOKEN__SEQUENCE_ELEMENT;

    /**
     * The feature id for the '<em><b>Offset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LEXED_TOKEN__OFFSET = ABSTRACT_TOKEN__OFFSET;

    /**
     * The feature id for the '<em><b>Length</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LEXED_TOKEN__LENGTH = ABSTRACT_TOKEN__LENGTH;

    /**
     * The feature id for the '<em><b>Other Versions</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LEXED_TOKEN__OTHER_VERSIONS = ABSTRACT_TOKEN__OTHER_VERSIONS;

    /**
     * The feature id for the '<em><b>Offset Relative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LEXED_TOKEN__OFFSET_RELATIVE = ABSTRACT_TOKEN__OFFSET_RELATIVE;

    /**
     * The feature id for the '<em><b>Absolute Offset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LEXED_TOKEN__ABSOLUTE_OFFSET = ABSTRACT_TOKEN__ABSOLUTE_OFFSET;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LEXED_TOKEN__VALUE = ABSTRACT_TOKEN__VALUE;

    /**
     * The feature id for the '<em><b>Lookahead</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LEXED_TOKEN__LOOKAHEAD = ABSTRACT_TOKEN__LOOKAHEAD;

    /**
     * The feature id for the '<em><b>Lookback</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LEXED_TOKEN__LOOKBACK = ABSTRACT_TOKEN__LOOKBACK;

    /**
     * The feature id for the '<em><b>State</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LEXED_TOKEN__STATE = ABSTRACT_TOKEN__STATE;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LEXED_TOKEN__TYPE = ABSTRACT_TOKEN__TYPE;

    /**
     * The feature id for the '<em><b>Operator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LEXED_TOKEN__OPERATOR = ABSTRACT_TOKEN_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Referenced Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LEXED_TOKEN__REFERENCED_ELEMENTS = ABSTRACT_TOKEN_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Lexed Token</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LEXED_TOKEN_FEATURE_COUNT = ABSTRACT_TOKEN_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link com.sap.furcas.metamodel.FURCAS.textblocks.impl.UnlexedTokenImpl <em>Unlexed Token</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sap.furcas.metamodel.FURCAS.textblocks.impl.UnlexedTokenImpl
     * @see com.sap.furcas.metamodel.FURCAS.textblocks.impl.TextblocksPackageImpl#getUnlexedToken()
     * @generated
     */
    int UNLEXED_TOKEN = 4;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNLEXED_TOKEN__VERSION = ABSTRACT_TOKEN__VERSION;

    /**
     * The feature id for the '<em><b>Children Changed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNLEXED_TOKEN__CHILDREN_CHANGED = ABSTRACT_TOKEN__CHILDREN_CHANGED;

    /**
     * The feature id for the '<em><b>Relexing Needed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNLEXED_TOKEN__RELEXING_NEEDED = ABSTRACT_TOKEN__RELEXING_NEEDED;

    /**
     * The feature id for the '<em><b>Parent</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNLEXED_TOKEN__PARENT = ABSTRACT_TOKEN__PARENT;

    /**
     * The feature id for the '<em><b>Sequence Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNLEXED_TOKEN__SEQUENCE_ELEMENT = ABSTRACT_TOKEN__SEQUENCE_ELEMENT;

    /**
     * The feature id for the '<em><b>Offset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNLEXED_TOKEN__OFFSET = ABSTRACT_TOKEN__OFFSET;

    /**
     * The feature id for the '<em><b>Length</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNLEXED_TOKEN__LENGTH = ABSTRACT_TOKEN__LENGTH;

    /**
     * The feature id for the '<em><b>Other Versions</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNLEXED_TOKEN__OTHER_VERSIONS = ABSTRACT_TOKEN__OTHER_VERSIONS;

    /**
     * The feature id for the '<em><b>Offset Relative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNLEXED_TOKEN__OFFSET_RELATIVE = ABSTRACT_TOKEN__OFFSET_RELATIVE;

    /**
     * The feature id for the '<em><b>Absolute Offset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNLEXED_TOKEN__ABSOLUTE_OFFSET = ABSTRACT_TOKEN__ABSOLUTE_OFFSET;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNLEXED_TOKEN__VALUE = ABSTRACT_TOKEN__VALUE;

    /**
     * The feature id for the '<em><b>Lookahead</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNLEXED_TOKEN__LOOKAHEAD = ABSTRACT_TOKEN__LOOKAHEAD;

    /**
     * The feature id for the '<em><b>Lookback</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNLEXED_TOKEN__LOOKBACK = ABSTRACT_TOKEN__LOOKBACK;

    /**
     * The feature id for the '<em><b>State</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNLEXED_TOKEN__STATE = ABSTRACT_TOKEN__STATE;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNLEXED_TOKEN__TYPE = ABSTRACT_TOKEN__TYPE;

    /**
     * The number of structural features of the '<em>Unlexed Token</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNLEXED_TOKEN_FEATURE_COUNT = ABSTRACT_TOKEN_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link com.sap.furcas.metamodel.FURCAS.textblocks.impl.ForEachExecutionImpl <em>For Each Execution</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sap.furcas.metamodel.FURCAS.textblocks.impl.ForEachExecutionImpl
     * @see com.sap.furcas.metamodel.FURCAS.textblocks.impl.TextblocksPackageImpl#getForEachExecution()
     * @generated
     */
    int FOR_EACH_EXECUTION = 6;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_EXECUTION__VERSION = TEXT_BLOCK__VERSION;

    /**
     * The feature id for the '<em><b>Children Changed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_EXECUTION__CHILDREN_CHANGED = TEXT_BLOCK__CHILDREN_CHANGED;

    /**
     * The feature id for the '<em><b>Relexing Needed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_EXECUTION__RELEXING_NEEDED = TEXT_BLOCK__RELEXING_NEEDED;

    /**
     * The feature id for the '<em><b>Parent</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_EXECUTION__PARENT = TEXT_BLOCK__PARENT;

    /**
     * The feature id for the '<em><b>Sequence Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_EXECUTION__SEQUENCE_ELEMENT = TEXT_BLOCK__SEQUENCE_ELEMENT;

    /**
     * The feature id for the '<em><b>Offset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_EXECUTION__OFFSET = TEXT_BLOCK__OFFSET;

    /**
     * The feature id for the '<em><b>Length</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_EXECUTION__LENGTH = TEXT_BLOCK__LENGTH;

    /**
     * The feature id for the '<em><b>Other Versions</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_EXECUTION__OTHER_VERSIONS = TEXT_BLOCK__OTHER_VERSIONS;

    /**
     * The feature id for the '<em><b>Offset Relative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_EXECUTION__OFFSET_RELATIVE = TEXT_BLOCK__OFFSET_RELATIVE;

    /**
     * The feature id for the '<em><b>Absolute Offset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_EXECUTION__ABSOLUTE_OFFSET = TEXT_BLOCK__ABSOLUTE_OFFSET;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_EXECUTION__TYPE = TEXT_BLOCK__TYPE;

    /**
     * The feature id for the '<em><b>Sub Nodes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_EXECUTION__SUB_NODES = TEXT_BLOCK__SUB_NODES;

    /**
     * The feature id for the '<em><b>Parent Alt Choices</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_EXECUTION__PARENT_ALT_CHOICES = TEXT_BLOCK__PARENT_ALT_CHOICES;

    /**
     * The feature id for the '<em><b>Elements In Context</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_EXECUTION__ELEMENTS_IN_CONTEXT = TEXT_BLOCK__ELEMENTS_IN_CONTEXT;

    /**
     * The feature id for the '<em><b>For Each Executions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_EXECUTION__FOR_EACH_EXECUTIONS = TEXT_BLOCK__FOR_EACH_EXECUTIONS;

    /**
     * The feature id for the '<em><b>Cached String</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_EXECUTION__CACHED_STRING = TEXT_BLOCK__CACHED_STRING;

    /**
     * The feature id for the '<em><b>Complete</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_EXECUTION__COMPLETE = TEXT_BLOCK__COMPLETE;

    /**
     * The feature id for the '<em><b>Additional Templates</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_EXECUTION__ADDITIONAL_TEMPLATES = TEXT_BLOCK__ADDITIONAL_TEMPLATES;

    /**
     * The feature id for the '<em><b>Corresponding Model Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_EXECUTION__CORRESPONDING_MODEL_ELEMENTS = TEXT_BLOCK__CORRESPONDING_MODEL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Foreach Pedicate Property Init</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_EXECUTION__FOREACH_PEDICATE_PROPERTY_INIT = TEXT_BLOCK_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Context Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_EXECUTION__CONTEXT_ELEMENT = TEXT_BLOCK_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Result Model Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_EXECUTION__RESULT_MODEL_ELEMENT = TEXT_BLOCK_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Source Model Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_EXECUTION__SOURCE_MODEL_ELEMENT = TEXT_BLOCK_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Context String</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_EXECUTION__CONTEXT_STRING = TEXT_BLOCK_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Template Used For Production</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_EXECUTION__TEMPLATE_USED_FOR_PRODUCTION = TEXT_BLOCK_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>For Each Execution</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_EXECUTION_FEATURE_COUNT = TEXT_BLOCK_FEATURE_COUNT + 6;

    /**
     * The meta object id for the '{@link com.sap.furcas.metamodel.FURCAS.textblocks.impl.EostokenImpl <em>Eostoken</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sap.furcas.metamodel.FURCAS.textblocks.impl.EostokenImpl
     * @see com.sap.furcas.metamodel.FURCAS.textblocks.impl.TextblocksPackageImpl#getEostoken()
     * @generated
     */
    int EOSTOKEN = 7;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EOSTOKEN__VERSION = ABSTRACT_TOKEN__VERSION;

    /**
     * The feature id for the '<em><b>Children Changed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EOSTOKEN__CHILDREN_CHANGED = ABSTRACT_TOKEN__CHILDREN_CHANGED;

    /**
     * The feature id for the '<em><b>Relexing Needed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EOSTOKEN__RELEXING_NEEDED = ABSTRACT_TOKEN__RELEXING_NEEDED;

    /**
     * The feature id for the '<em><b>Parent</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EOSTOKEN__PARENT = ABSTRACT_TOKEN__PARENT;

    /**
     * The feature id for the '<em><b>Sequence Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EOSTOKEN__SEQUENCE_ELEMENT = ABSTRACT_TOKEN__SEQUENCE_ELEMENT;

    /**
     * The feature id for the '<em><b>Offset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EOSTOKEN__OFFSET = ABSTRACT_TOKEN__OFFSET;

    /**
     * The feature id for the '<em><b>Length</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EOSTOKEN__LENGTH = ABSTRACT_TOKEN__LENGTH;

    /**
     * The feature id for the '<em><b>Other Versions</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EOSTOKEN__OTHER_VERSIONS = ABSTRACT_TOKEN__OTHER_VERSIONS;

    /**
     * The feature id for the '<em><b>Offset Relative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EOSTOKEN__OFFSET_RELATIVE = ABSTRACT_TOKEN__OFFSET_RELATIVE;

    /**
     * The feature id for the '<em><b>Absolute Offset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EOSTOKEN__ABSOLUTE_OFFSET = ABSTRACT_TOKEN__ABSOLUTE_OFFSET;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EOSTOKEN__VALUE = ABSTRACT_TOKEN__VALUE;

    /**
     * The feature id for the '<em><b>Lookahead</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EOSTOKEN__LOOKAHEAD = ABSTRACT_TOKEN__LOOKAHEAD;

    /**
     * The feature id for the '<em><b>Lookback</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EOSTOKEN__LOOKBACK = ABSTRACT_TOKEN__LOOKBACK;

    /**
     * The feature id for the '<em><b>State</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EOSTOKEN__STATE = ABSTRACT_TOKEN__STATE;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EOSTOKEN__TYPE = ABSTRACT_TOKEN__TYPE;

    /**
     * The number of structural features of the '<em>Eostoken</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EOSTOKEN_FEATURE_COUNT = ABSTRACT_TOKEN_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link com.sap.furcas.metamodel.FURCAS.textblocks.impl.BostokenImpl <em>Bostoken</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sap.furcas.metamodel.FURCAS.textblocks.impl.BostokenImpl
     * @see com.sap.furcas.metamodel.FURCAS.textblocks.impl.TextblocksPackageImpl#getBostoken()
     * @generated
     */
    int BOSTOKEN = 8;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOSTOKEN__VERSION = ABSTRACT_TOKEN__VERSION;

    /**
     * The feature id for the '<em><b>Children Changed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOSTOKEN__CHILDREN_CHANGED = ABSTRACT_TOKEN__CHILDREN_CHANGED;

    /**
     * The feature id for the '<em><b>Relexing Needed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOSTOKEN__RELEXING_NEEDED = ABSTRACT_TOKEN__RELEXING_NEEDED;

    /**
     * The feature id for the '<em><b>Parent</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOSTOKEN__PARENT = ABSTRACT_TOKEN__PARENT;

    /**
     * The feature id for the '<em><b>Sequence Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOSTOKEN__SEQUENCE_ELEMENT = ABSTRACT_TOKEN__SEQUENCE_ELEMENT;

    /**
     * The feature id for the '<em><b>Offset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOSTOKEN__OFFSET = ABSTRACT_TOKEN__OFFSET;

    /**
     * The feature id for the '<em><b>Length</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOSTOKEN__LENGTH = ABSTRACT_TOKEN__LENGTH;

    /**
     * The feature id for the '<em><b>Other Versions</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOSTOKEN__OTHER_VERSIONS = ABSTRACT_TOKEN__OTHER_VERSIONS;

    /**
     * The feature id for the '<em><b>Offset Relative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOSTOKEN__OFFSET_RELATIVE = ABSTRACT_TOKEN__OFFSET_RELATIVE;

    /**
     * The feature id for the '<em><b>Absolute Offset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOSTOKEN__ABSOLUTE_OFFSET = ABSTRACT_TOKEN__ABSOLUTE_OFFSET;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOSTOKEN__VALUE = ABSTRACT_TOKEN__VALUE;

    /**
     * The feature id for the '<em><b>Lookahead</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOSTOKEN__LOOKAHEAD = ABSTRACT_TOKEN__LOOKAHEAD;

    /**
     * The feature id for the '<em><b>Lookback</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOSTOKEN__LOOKBACK = ABSTRACT_TOKEN__LOOKBACK;

    /**
     * The feature id for the '<em><b>State</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOSTOKEN__STATE = ABSTRACT_TOKEN__STATE;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOSTOKEN__TYPE = ABSTRACT_TOKEN__TYPE;

    /**
     * The number of structural features of the '<em>Bostoken</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOSTOKEN_FEATURE_COUNT = ABSTRACT_TOKEN_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link com.sap.furcas.metamodel.FURCAS.textblocks.Version <em>Version</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sap.furcas.metamodel.FURCAS.textblocks.Version
     * @see com.sap.furcas.metamodel.FURCAS.textblocks.impl.TextblocksPackageImpl#getVersion()
     * @generated
     */
    int VERSION = 9;


    /**
     * Returns the meta object for class '{@link com.sap.furcas.metamodel.FURCAS.textblocks.TextBlock <em>Text Block</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Text Block</em>'.
     * @see com.sap.furcas.metamodel.FURCAS.textblocks.TextBlock
     * @generated
     */
    EClass getTextBlock();

    /**
     * Returns the meta object for the reference '{@link com.sap.furcas.metamodel.FURCAS.textblocks.TextBlock#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Type</em>'.
     * @see com.sap.furcas.metamodel.FURCAS.textblocks.TextBlock#getType()
     * @see #getTextBlock()
     * @generated
     */
    EReference getTextBlock_Type();

    /**
     * Returns the meta object for the containment reference list '{@link com.sap.furcas.metamodel.FURCAS.textblocks.TextBlock#getSubNodes <em>Sub Nodes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Sub Nodes</em>'.
     * @see com.sap.furcas.metamodel.FURCAS.textblocks.TextBlock#getSubNodes()
     * @see #getTextBlock()
     * @generated
     */
    EReference getTextBlock_SubNodes();

    /**
     * Returns the meta object for the attribute list '{@link com.sap.furcas.metamodel.FURCAS.textblocks.TextBlock#getParentAltChoices <em>Parent Alt Choices</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Parent Alt Choices</em>'.
     * @see com.sap.furcas.metamodel.FURCAS.textblocks.TextBlock#getParentAltChoices()
     * @see #getTextBlock()
     * @generated
     */
    EAttribute getTextBlock_ParentAltChoices();

    /**
     * Returns the meta object for the reference list '{@link com.sap.furcas.metamodel.FURCAS.textblocks.TextBlock#getElementsInContext <em>Elements In Context</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Elements In Context</em>'.
     * @see com.sap.furcas.metamodel.FURCAS.textblocks.TextBlock#getElementsInContext()
     * @see #getTextBlock()
     * @generated
     */
    EReference getTextBlock_ElementsInContext();

    /**
     * Returns the meta object for the containment reference list '{@link com.sap.furcas.metamodel.FURCAS.textblocks.TextBlock#getForEachExecutions <em>For Each Executions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>For Each Executions</em>'.
     * @see com.sap.furcas.metamodel.FURCAS.textblocks.TextBlock#getForEachExecutions()
     * @see #getTextBlock()
     * @generated
     */
    EReference getTextBlock_ForEachExecutions();

    /**
     * Returns the meta object for the attribute '{@link com.sap.furcas.metamodel.FURCAS.textblocks.TextBlock#getCachedString <em>Cached String</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Cached String</em>'.
     * @see com.sap.furcas.metamodel.FURCAS.textblocks.TextBlock#getCachedString()
     * @see #getTextBlock()
     * @generated
     */
    EAttribute getTextBlock_CachedString();

    /**
     * Returns the meta object for the attribute '{@link com.sap.furcas.metamodel.FURCAS.textblocks.TextBlock#isComplete <em>Complete</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Complete</em>'.
     * @see com.sap.furcas.metamodel.FURCAS.textblocks.TextBlock#isComplete()
     * @see #getTextBlock()
     * @generated
     */
    EAttribute getTextBlock_Complete();

    /**
     * Returns the meta object for the reference list '{@link com.sap.furcas.metamodel.FURCAS.textblocks.TextBlock#getAdditionalTemplates <em>Additional Templates</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Additional Templates</em>'.
     * @see com.sap.furcas.metamodel.FURCAS.textblocks.TextBlock#getAdditionalTemplates()
     * @see #getTextBlock()
     * @generated
     */
    EReference getTextBlock_AdditionalTemplates();

    /**
     * Returns the meta object for the reference list '{@link com.sap.furcas.metamodel.FURCAS.textblocks.TextBlock#getCorrespondingModelElements <em>Corresponding Model Elements</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Corresponding Model Elements</em>'.
     * @see com.sap.furcas.metamodel.FURCAS.textblocks.TextBlock#getCorrespondingModelElements()
     * @see #getTextBlock()
     * @generated
     */
    EReference getTextBlock_CorrespondingModelElements();

    /**
     * Returns the meta object for class '{@link com.sap.furcas.metamodel.FURCAS.textblocks.AbstractToken <em>Abstract Token</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstract Token</em>'.
     * @see com.sap.furcas.metamodel.FURCAS.textblocks.AbstractToken
     * @generated
     */
    EClass getAbstractToken();

    /**
     * Returns the meta object for the attribute '{@link com.sap.furcas.metamodel.FURCAS.textblocks.AbstractToken#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see com.sap.furcas.metamodel.FURCAS.textblocks.AbstractToken#getValue()
     * @see #getAbstractToken()
     * @generated
     */
    EAttribute getAbstractToken_Value();

    /**
     * Returns the meta object for the attribute '{@link com.sap.furcas.metamodel.FURCAS.textblocks.AbstractToken#getLookahead <em>Lookahead</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Lookahead</em>'.
     * @see com.sap.furcas.metamodel.FURCAS.textblocks.AbstractToken#getLookahead()
     * @see #getAbstractToken()
     * @generated
     */
    EAttribute getAbstractToken_Lookahead();

    /**
     * Returns the meta object for the attribute '{@link com.sap.furcas.metamodel.FURCAS.textblocks.AbstractToken#getLookback <em>Lookback</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Lookback</em>'.
     * @see com.sap.furcas.metamodel.FURCAS.textblocks.AbstractToken#getLookback()
     * @see #getAbstractToken()
     * @generated
     */
    EAttribute getAbstractToken_Lookback();

    /**
     * Returns the meta object for the attribute '{@link com.sap.furcas.metamodel.FURCAS.textblocks.AbstractToken#getState <em>State</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>State</em>'.
     * @see com.sap.furcas.metamodel.FURCAS.textblocks.AbstractToken#getState()
     * @see #getAbstractToken()
     * @generated
     */
    EAttribute getAbstractToken_State();

    /**
     * Returns the meta object for the attribute '{@link com.sap.furcas.metamodel.FURCAS.textblocks.AbstractToken#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see com.sap.furcas.metamodel.FURCAS.textblocks.AbstractToken#getType()
     * @see #getAbstractToken()
     * @generated
     */
    EAttribute getAbstractToken_Type();

    /**
     * Returns the meta object for class '{@link com.sap.furcas.metamodel.FURCAS.textblocks.OmittedToken <em>Omitted Token</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Omitted Token</em>'.
     * @see com.sap.furcas.metamodel.FURCAS.textblocks.OmittedToken
     * @generated
     */
    EClass getOmittedToken();

    /**
     * Returns the meta object for class '{@link com.sap.furcas.metamodel.FURCAS.textblocks.LexedToken <em>Lexed Token</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Lexed Token</em>'.
     * @see com.sap.furcas.metamodel.FURCAS.textblocks.LexedToken
     * @generated
     */
    EClass getLexedToken();

    /**
     * Returns the meta object for the attribute '{@link com.sap.furcas.metamodel.FURCAS.textblocks.LexedToken#isOperator <em>Operator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Operator</em>'.
     * @see com.sap.furcas.metamodel.FURCAS.textblocks.LexedToken#isOperator()
     * @see #getLexedToken()
     * @generated
     */
    EAttribute getLexedToken_Operator();

    /**
     * Returns the meta object for the reference list '{@link com.sap.furcas.metamodel.FURCAS.textblocks.LexedToken#getReferencedElements <em>Referenced Elements</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referenced Elements</em>'.
     * @see com.sap.furcas.metamodel.FURCAS.textblocks.LexedToken#getReferencedElements()
     * @see #getLexedToken()
     * @generated
     */
    EReference getLexedToken_ReferencedElements();

    /**
     * Returns the meta object for class '{@link com.sap.furcas.metamodel.FURCAS.textblocks.UnlexedToken <em>Unlexed Token</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Unlexed Token</em>'.
     * @see com.sap.furcas.metamodel.FURCAS.textblocks.UnlexedToken
     * @generated
     */
    EClass getUnlexedToken();

    /**
     * Returns the meta object for class '{@link com.sap.furcas.metamodel.FURCAS.textblocks.DocumentNode <em>Document Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Document Node</em>'.
     * @see com.sap.furcas.metamodel.FURCAS.textblocks.DocumentNode
     * @generated
     */
    EClass getDocumentNode();

    /**
     * Returns the meta object for the attribute '{@link com.sap.furcas.metamodel.FURCAS.textblocks.DocumentNode#getVersion <em>Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Version</em>'.
     * @see com.sap.furcas.metamodel.FURCAS.textblocks.DocumentNode#getVersion()
     * @see #getDocumentNode()
     * @generated
     */
    EAttribute getDocumentNode_Version();

    /**
     * Returns the meta object for the attribute '{@link com.sap.furcas.metamodel.FURCAS.textblocks.DocumentNode#isChildrenChanged <em>Children Changed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Children Changed</em>'.
     * @see com.sap.furcas.metamodel.FURCAS.textblocks.DocumentNode#isChildrenChanged()
     * @see #getDocumentNode()
     * @generated
     */
    EAttribute getDocumentNode_ChildrenChanged();

    /**
     * Returns the meta object for the attribute '{@link com.sap.furcas.metamodel.FURCAS.textblocks.DocumentNode#isRelexingNeeded <em>Relexing Needed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Relexing Needed</em>'.
     * @see com.sap.furcas.metamodel.FURCAS.textblocks.DocumentNode#isRelexingNeeded()
     * @see #getDocumentNode()
     * @generated
     */
    EAttribute getDocumentNode_RelexingNeeded();

    /**
     * Returns the meta object for the container reference '{@link com.sap.furcas.metamodel.FURCAS.textblocks.DocumentNode#getParent <em>Parent</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent</em>'.
     * @see com.sap.furcas.metamodel.FURCAS.textblocks.DocumentNode#getParent()
     * @see #getDocumentNode()
     * @generated
     */
    EReference getDocumentNode_Parent();

    /**
     * Returns the meta object for the reference '{@link com.sap.furcas.metamodel.FURCAS.textblocks.DocumentNode#getSequenceElement <em>Sequence Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Sequence Element</em>'.
     * @see com.sap.furcas.metamodel.FURCAS.textblocks.DocumentNode#getSequenceElement()
     * @see #getDocumentNode()
     * @generated
     */
    EReference getDocumentNode_SequenceElement();

    /**
     * Returns the meta object for the attribute '{@link com.sap.furcas.metamodel.FURCAS.textblocks.DocumentNode#getOffset <em>Offset</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Offset</em>'.
     * @see com.sap.furcas.metamodel.FURCAS.textblocks.DocumentNode#getOffset()
     * @see #getDocumentNode()
     * @generated
     */
    EAttribute getDocumentNode_Offset();

    /**
     * Returns the meta object for the attribute '{@link com.sap.furcas.metamodel.FURCAS.textblocks.DocumentNode#getLength <em>Length</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Length</em>'.
     * @see com.sap.furcas.metamodel.FURCAS.textblocks.DocumentNode#getLength()
     * @see #getDocumentNode()
     * @generated
     */
    EAttribute getDocumentNode_Length();

    /**
     * Returns the meta object for the reference list '{@link com.sap.furcas.metamodel.FURCAS.textblocks.DocumentNode#getOtherVersions <em>Other Versions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Other Versions</em>'.
     * @see com.sap.furcas.metamodel.FURCAS.textblocks.DocumentNode#getOtherVersions()
     * @see #getDocumentNode()
     * @generated
     */
    EReference getDocumentNode_OtherVersions();

    /**
     * Returns the meta object for the attribute '{@link com.sap.furcas.metamodel.FURCAS.textblocks.DocumentNode#isOffsetRelative <em>Offset Relative</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Offset Relative</em>'.
     * @see com.sap.furcas.metamodel.FURCAS.textblocks.DocumentNode#isOffsetRelative()
     * @see #getDocumentNode()
     * @generated
     */
    EAttribute getDocumentNode_OffsetRelative();

    /**
     * Returns the meta object for the attribute '{@link com.sap.furcas.metamodel.FURCAS.textblocks.DocumentNode#getAbsoluteOffset <em>Absolute Offset</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Absolute Offset</em>'.
     * @see com.sap.furcas.metamodel.FURCAS.textblocks.DocumentNode#getAbsoluteOffset()
     * @see #getDocumentNode()
     * @generated
     */
    EAttribute getDocumentNode_AbsoluteOffset();

    /**
     * Returns the meta object for class '{@link com.sap.furcas.metamodel.FURCAS.textblocks.ForEachExecution <em>For Each Execution</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>For Each Execution</em>'.
     * @see com.sap.furcas.metamodel.FURCAS.textblocks.ForEachExecution
     * @generated
     */
    EClass getForEachExecution();

    /**
     * Returns the meta object for the reference '{@link com.sap.furcas.metamodel.FURCAS.textblocks.ForEachExecution#getForeachPedicatePropertyInit <em>Foreach Pedicate Property Init</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Foreach Pedicate Property Init</em>'.
     * @see com.sap.furcas.metamodel.FURCAS.textblocks.ForEachExecution#getForeachPedicatePropertyInit()
     * @see #getForEachExecution()
     * @generated
     */
    EReference getForEachExecution_ForeachPedicatePropertyInit();

    /**
     * Returns the meta object for the reference '{@link com.sap.furcas.metamodel.FURCAS.textblocks.ForEachExecution#getContextElement <em>Context Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Context Element</em>'.
     * @see com.sap.furcas.metamodel.FURCAS.textblocks.ForEachExecution#getContextElement()
     * @see #getForEachExecution()
     * @generated
     */
    EReference getForEachExecution_ContextElement();

    /**
     * Returns the meta object for the reference '{@link com.sap.furcas.metamodel.FURCAS.textblocks.ForEachExecution#getResultModelElement <em>Result Model Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Result Model Element</em>'.
     * @see com.sap.furcas.metamodel.FURCAS.textblocks.ForEachExecution#getResultModelElement()
     * @see #getForEachExecution()
     * @generated
     */
    EReference getForEachExecution_ResultModelElement();

    /**
     * Returns the meta object for the reference '{@link com.sap.furcas.metamodel.FURCAS.textblocks.ForEachExecution#getSourceModelElement <em>Source Model Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Source Model Element</em>'.
     * @see com.sap.furcas.metamodel.FURCAS.textblocks.ForEachExecution#getSourceModelElement()
     * @see #getForEachExecution()
     * @generated
     */
    EReference getForEachExecution_SourceModelElement();

    /**
     * Returns the meta object for the attribute '{@link com.sap.furcas.metamodel.FURCAS.textblocks.ForEachExecution#getContextString <em>Context String</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Context String</em>'.
     * @see com.sap.furcas.metamodel.FURCAS.textblocks.ForEachExecution#getContextString()
     * @see #getForEachExecution()
     * @generated
     */
    EAttribute getForEachExecution_ContextString();

    /**
     * Returns the meta object for the reference '{@link com.sap.furcas.metamodel.FURCAS.textblocks.ForEachExecution#getTemplateUsedForProduction <em>Template Used For Production</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Template Used For Production</em>'.
     * @see com.sap.furcas.metamodel.FURCAS.textblocks.ForEachExecution#getTemplateUsedForProduction()
     * @see #getForEachExecution()
     * @generated
     */
    EReference getForEachExecution_TemplateUsedForProduction();

    /**
     * Returns the meta object for class '{@link com.sap.furcas.metamodel.FURCAS.textblocks.Eostoken <em>Eostoken</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Eostoken</em>'.
     * @see com.sap.furcas.metamodel.FURCAS.textblocks.Eostoken
     * @generated
     */
    EClass getEostoken();

    /**
     * Returns the meta object for class '{@link com.sap.furcas.metamodel.FURCAS.textblocks.Bostoken <em>Bostoken</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Bostoken</em>'.
     * @see com.sap.furcas.metamodel.FURCAS.textblocks.Bostoken
     * @generated
     */
    EClass getBostoken();

    /**
     * Returns the meta object for enum '{@link com.sap.furcas.metamodel.FURCAS.textblocks.Version <em>Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Version</em>'.
     * @see com.sap.furcas.metamodel.FURCAS.textblocks.Version
     * @generated
     */
    EEnum getVersion();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    TextblocksFactory getTextblocksFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link com.sap.furcas.metamodel.FURCAS.textblocks.impl.TextBlockImpl <em>Text Block</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see com.sap.furcas.metamodel.FURCAS.textblocks.impl.TextBlockImpl
         * @see com.sap.furcas.metamodel.FURCAS.textblocks.impl.TextblocksPackageImpl#getTextBlock()
         * @generated
         */
        EClass TEXT_BLOCK = eINSTANCE.getTextBlock();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TEXT_BLOCK__TYPE = eINSTANCE.getTextBlock_Type();

        /**
         * The meta object literal for the '<em><b>Sub Nodes</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TEXT_BLOCK__SUB_NODES = eINSTANCE.getTextBlock_SubNodes();

        /**
         * The meta object literal for the '<em><b>Parent Alt Choices</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TEXT_BLOCK__PARENT_ALT_CHOICES = eINSTANCE.getTextBlock_ParentAltChoices();

        /**
         * The meta object literal for the '<em><b>Elements In Context</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TEXT_BLOCK__ELEMENTS_IN_CONTEXT = eINSTANCE.getTextBlock_ElementsInContext();

        /**
         * The meta object literal for the '<em><b>For Each Executions</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TEXT_BLOCK__FOR_EACH_EXECUTIONS = eINSTANCE.getTextBlock_ForEachExecutions();

        /**
         * The meta object literal for the '<em><b>Cached String</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TEXT_BLOCK__CACHED_STRING = eINSTANCE.getTextBlock_CachedString();

        /**
         * The meta object literal for the '<em><b>Complete</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TEXT_BLOCK__COMPLETE = eINSTANCE.getTextBlock_Complete();

        /**
         * The meta object literal for the '<em><b>Additional Templates</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TEXT_BLOCK__ADDITIONAL_TEMPLATES = eINSTANCE.getTextBlock_AdditionalTemplates();

        /**
         * The meta object literal for the '<em><b>Corresponding Model Elements</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TEXT_BLOCK__CORRESPONDING_MODEL_ELEMENTS = eINSTANCE.getTextBlock_CorrespondingModelElements();

        /**
         * The meta object literal for the '{@link com.sap.furcas.metamodel.FURCAS.textblocks.impl.AbstractTokenImpl <em>Abstract Token</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see com.sap.furcas.metamodel.FURCAS.textblocks.impl.AbstractTokenImpl
         * @see com.sap.furcas.metamodel.FURCAS.textblocks.impl.TextblocksPackageImpl#getAbstractToken()
         * @generated
         */
        EClass ABSTRACT_TOKEN = eINSTANCE.getAbstractToken();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ABSTRACT_TOKEN__VALUE = eINSTANCE.getAbstractToken_Value();

        /**
         * The meta object literal for the '<em><b>Lookahead</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ABSTRACT_TOKEN__LOOKAHEAD = eINSTANCE.getAbstractToken_Lookahead();

        /**
         * The meta object literal for the '<em><b>Lookback</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ABSTRACT_TOKEN__LOOKBACK = eINSTANCE.getAbstractToken_Lookback();

        /**
         * The meta object literal for the '<em><b>State</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ABSTRACT_TOKEN__STATE = eINSTANCE.getAbstractToken_State();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ABSTRACT_TOKEN__TYPE = eINSTANCE.getAbstractToken_Type();

        /**
         * The meta object literal for the '{@link com.sap.furcas.metamodel.FURCAS.textblocks.impl.OmittedTokenImpl <em>Omitted Token</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see com.sap.furcas.metamodel.FURCAS.textblocks.impl.OmittedTokenImpl
         * @see com.sap.furcas.metamodel.FURCAS.textblocks.impl.TextblocksPackageImpl#getOmittedToken()
         * @generated
         */
        EClass OMITTED_TOKEN = eINSTANCE.getOmittedToken();

        /**
         * The meta object literal for the '{@link com.sap.furcas.metamodel.FURCAS.textblocks.impl.LexedTokenImpl <em>Lexed Token</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see com.sap.furcas.metamodel.FURCAS.textblocks.impl.LexedTokenImpl
         * @see com.sap.furcas.metamodel.FURCAS.textblocks.impl.TextblocksPackageImpl#getLexedToken()
         * @generated
         */
        EClass LEXED_TOKEN = eINSTANCE.getLexedToken();

        /**
         * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LEXED_TOKEN__OPERATOR = eINSTANCE.getLexedToken_Operator();

        /**
         * The meta object literal for the '<em><b>Referenced Elements</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LEXED_TOKEN__REFERENCED_ELEMENTS = eINSTANCE.getLexedToken_ReferencedElements();

        /**
         * The meta object literal for the '{@link com.sap.furcas.metamodel.FURCAS.textblocks.impl.UnlexedTokenImpl <em>Unlexed Token</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see com.sap.furcas.metamodel.FURCAS.textblocks.impl.UnlexedTokenImpl
         * @see com.sap.furcas.metamodel.FURCAS.textblocks.impl.TextblocksPackageImpl#getUnlexedToken()
         * @generated
         */
        EClass UNLEXED_TOKEN = eINSTANCE.getUnlexedToken();

        /**
         * The meta object literal for the '{@link com.sap.furcas.metamodel.FURCAS.textblocks.impl.DocumentNodeImpl <em>Document Node</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see com.sap.furcas.metamodel.FURCAS.textblocks.impl.DocumentNodeImpl
         * @see com.sap.furcas.metamodel.FURCAS.textblocks.impl.TextblocksPackageImpl#getDocumentNode()
         * @generated
         */
        EClass DOCUMENT_NODE = eINSTANCE.getDocumentNode();

        /**
         * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENT_NODE__VERSION = eINSTANCE.getDocumentNode_Version();

        /**
         * The meta object literal for the '<em><b>Children Changed</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENT_NODE__CHILDREN_CHANGED = eINSTANCE.getDocumentNode_ChildrenChanged();

        /**
         * The meta object literal for the '<em><b>Relexing Needed</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENT_NODE__RELEXING_NEEDED = eINSTANCE.getDocumentNode_RelexingNeeded();

        /**
         * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_NODE__PARENT = eINSTANCE.getDocumentNode_Parent();

        /**
         * The meta object literal for the '<em><b>Sequence Element</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_NODE__SEQUENCE_ELEMENT = eINSTANCE.getDocumentNode_SequenceElement();

        /**
         * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENT_NODE__OFFSET = eINSTANCE.getDocumentNode_Offset();

        /**
         * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENT_NODE__LENGTH = eINSTANCE.getDocumentNode_Length();

        /**
         * The meta object literal for the '<em><b>Other Versions</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_NODE__OTHER_VERSIONS = eINSTANCE.getDocumentNode_OtherVersions();

        /**
         * The meta object literal for the '<em><b>Offset Relative</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENT_NODE__OFFSET_RELATIVE = eINSTANCE.getDocumentNode_OffsetRelative();

        /**
         * The meta object literal for the '<em><b>Absolute Offset</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENT_NODE__ABSOLUTE_OFFSET = eINSTANCE.getDocumentNode_AbsoluteOffset();

        /**
         * The meta object literal for the '{@link com.sap.furcas.metamodel.FURCAS.textblocks.impl.ForEachExecutionImpl <em>For Each Execution</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see com.sap.furcas.metamodel.FURCAS.textblocks.impl.ForEachExecutionImpl
         * @see com.sap.furcas.metamodel.FURCAS.textblocks.impl.TextblocksPackageImpl#getForEachExecution()
         * @generated
         */
        EClass FOR_EACH_EXECUTION = eINSTANCE.getForEachExecution();

        /**
         * The meta object literal for the '<em><b>Foreach Pedicate Property Init</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FOR_EACH_EXECUTION__FOREACH_PEDICATE_PROPERTY_INIT = eINSTANCE.getForEachExecution_ForeachPedicatePropertyInit();

        /**
         * The meta object literal for the '<em><b>Context Element</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FOR_EACH_EXECUTION__CONTEXT_ELEMENT = eINSTANCE.getForEachExecution_ContextElement();

        /**
         * The meta object literal for the '<em><b>Result Model Element</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FOR_EACH_EXECUTION__RESULT_MODEL_ELEMENT = eINSTANCE.getForEachExecution_ResultModelElement();

        /**
         * The meta object literal for the '<em><b>Source Model Element</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FOR_EACH_EXECUTION__SOURCE_MODEL_ELEMENT = eINSTANCE.getForEachExecution_SourceModelElement();

        /**
         * The meta object literal for the '<em><b>Context String</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FOR_EACH_EXECUTION__CONTEXT_STRING = eINSTANCE.getForEachExecution_ContextString();

        /**
         * The meta object literal for the '<em><b>Template Used For Production</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FOR_EACH_EXECUTION__TEMPLATE_USED_FOR_PRODUCTION = eINSTANCE.getForEachExecution_TemplateUsedForProduction();

        /**
         * The meta object literal for the '{@link com.sap.furcas.metamodel.FURCAS.textblocks.impl.EostokenImpl <em>Eostoken</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see com.sap.furcas.metamodel.FURCAS.textblocks.impl.EostokenImpl
         * @see com.sap.furcas.metamodel.FURCAS.textblocks.impl.TextblocksPackageImpl#getEostoken()
         * @generated
         */
        EClass EOSTOKEN = eINSTANCE.getEostoken();

        /**
         * The meta object literal for the '{@link com.sap.furcas.metamodel.FURCAS.textblocks.impl.BostokenImpl <em>Bostoken</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see com.sap.furcas.metamodel.FURCAS.textblocks.impl.BostokenImpl
         * @see com.sap.furcas.metamodel.FURCAS.textblocks.impl.TextblocksPackageImpl#getBostoken()
         * @generated
         */
        EClass BOSTOKEN = eINSTANCE.getBostoken();

        /**
         * The meta object literal for the '{@link com.sap.furcas.metamodel.FURCAS.textblocks.Version <em>Version</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see com.sap.furcas.metamodel.FURCAS.textblocks.Version
         * @see com.sap.furcas.metamodel.FURCAS.textblocks.impl.TextblocksPackageImpl#getVersion()
         * @generated
         */
        EEnum VERSION = eINSTANCE.getVersion();

    }

} //TextblocksPackage
