/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.sap.furcas.metamodel.FURCAS.textblocks.impl;

import com.sap.furcas.metamodel.FURCAS.FURCASPackage;

import com.sap.furcas.metamodel.FURCAS.TCS.TCSPackage;

import com.sap.furcas.metamodel.FURCAS.TCS.impl.TCSPackageImpl;

import com.sap.furcas.metamodel.FURCAS.impl.FURCASPackageImpl;

import com.sap.furcas.metamodel.FURCAS.textblocks.AbstractToken;
import com.sap.furcas.metamodel.FURCAS.textblocks.Bostoken;
import com.sap.furcas.metamodel.FURCAS.textblocks.DocumentNode;
import com.sap.furcas.metamodel.FURCAS.textblocks.Eostoken;
import com.sap.furcas.metamodel.FURCAS.textblocks.ForEachExecution;
import com.sap.furcas.metamodel.FURCAS.textblocks.LexedToken;
import com.sap.furcas.metamodel.FURCAS.textblocks.OmittedToken;
import com.sap.furcas.metamodel.FURCAS.textblocks.TextBlock;
import com.sap.furcas.metamodel.FURCAS.textblocks.TextblocksFactory;
import com.sap.furcas.metamodel.FURCAS.textblocks.TextblocksPackage;
import com.sap.furcas.metamodel.FURCAS.textblocks.UnlexedToken;
import com.sap.furcas.metamodel.FURCAS.textblocks.Version;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TextblocksPackageImpl extends EPackageImpl implements TextblocksPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass textBlockEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass abstractTokenEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass omittedTokenEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass lexedTokenEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass unlexedTokenEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass documentNodeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass forEachExecutionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eostokenEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass bostokenEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum versionEEnum = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see com.sap.furcas.metamodel.FURCAS.textblocks.TextblocksPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private TextblocksPackageImpl() {
        super(eNS_URI, TextblocksFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link TextblocksPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static TextblocksPackage init() {
        if (isInited) return (TextblocksPackage)EPackage.Registry.INSTANCE.getEPackage(TextblocksPackage.eNS_URI);

        // Obtain or create and register package
        TextblocksPackageImpl theTextblocksPackage = (TextblocksPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TextblocksPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TextblocksPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        EcorePackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        FURCASPackageImpl theFURCASPackage = (FURCASPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FURCASPackage.eNS_URI) instanceof FURCASPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FURCASPackage.eNS_URI) : FURCASPackage.eINSTANCE);
        TCSPackageImpl theTCSPackage = (TCSPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TCSPackage.eNS_URI) instanceof TCSPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TCSPackage.eNS_URI) : TCSPackage.eINSTANCE);

        // Create package meta-data objects
        theTextblocksPackage.createPackageContents();
        theFURCASPackage.createPackageContents();
        theTCSPackage.createPackageContents();

        // Initialize created meta-data
        theTextblocksPackage.initializePackageContents();
        theFURCASPackage.initializePackageContents();
        theTCSPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theTextblocksPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(TextblocksPackage.eNS_URI, theTextblocksPackage);
        return theTextblocksPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTextBlock() {
        return textBlockEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTextBlock_Type() {
        return (EReference)textBlockEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTextBlock_SubNodes() {
        return (EReference)textBlockEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTextBlock_ParentAltChoices() {
        return (EAttribute)textBlockEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTextBlock_ElementsInContext() {
        return (EReference)textBlockEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTextBlock_ForEachExecutions() {
        return (EReference)textBlockEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTextBlock_CachedString() {
        return (EAttribute)textBlockEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTextBlock_Complete() {
        return (EAttribute)textBlockEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTextBlock_AdditionalTemplates() {
        return (EReference)textBlockEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTextBlock_CorrespondingModelElements() {
        return (EReference)textBlockEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAbstractToken() {
        return abstractTokenEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAbstractToken_Value() {
        return (EAttribute)abstractTokenEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAbstractToken_Lookahead() {
        return (EAttribute)abstractTokenEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAbstractToken_Lookback() {
        return (EAttribute)abstractTokenEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAbstractToken_State() {
        return (EAttribute)abstractTokenEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAbstractToken_Type() {
        return (EAttribute)abstractTokenEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getOmittedToken() {
        return omittedTokenEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLexedToken() {
        return lexedTokenEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLexedToken_Operator() {
        return (EAttribute)lexedTokenEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getLexedToken_ReferencedElements() {
        return (EReference)lexedTokenEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getUnlexedToken() {
        return unlexedTokenEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDocumentNode() {
        return documentNodeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentNode_Version() {
        return (EAttribute)documentNodeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentNode_ChildrenChanged() {
        return (EAttribute)documentNodeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentNode_RelexingNeeded() {
        return (EAttribute)documentNodeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentNode_Parent() {
        return (EReference)documentNodeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentNode_SequenceElement() {
        return (EReference)documentNodeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentNode_Offset() {
        return (EAttribute)documentNodeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentNode_Length() {
        return (EAttribute)documentNodeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentNode_OtherVersions() {
        return (EReference)documentNodeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentNode_OffsetRelative() {
        return (EAttribute)documentNodeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentNode_AbsoluteOffset() {
        return (EAttribute)documentNodeEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getForEachExecution() {
        return forEachExecutionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getForEachExecution_ForeachPedicatePropertyInit() {
        return (EReference)forEachExecutionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getForEachExecution_ContextElement() {
        return (EReference)forEachExecutionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getForEachExecution_ResultModelElement() {
        return (EReference)forEachExecutionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getForEachExecution_SourceModelElement() {
        return (EReference)forEachExecutionEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getForEachExecution_ContextString() {
        return (EAttribute)forEachExecutionEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getForEachExecution_TemplateUsedForProduction() {
        return (EReference)forEachExecutionEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEostoken() {
        return eostokenEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBostoken() {
        return bostokenEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getVersion() {
        return versionEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TextblocksFactory getTextblocksFactory() {
        return (TextblocksFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        textBlockEClass = createEClass(TEXT_BLOCK);
        createEReference(textBlockEClass, TEXT_BLOCK__TYPE);
        createEReference(textBlockEClass, TEXT_BLOCK__SUB_NODES);
        createEAttribute(textBlockEClass, TEXT_BLOCK__PARENT_ALT_CHOICES);
        createEReference(textBlockEClass, TEXT_BLOCK__ELEMENTS_IN_CONTEXT);
        createEReference(textBlockEClass, TEXT_BLOCK__FOR_EACH_EXECUTIONS);
        createEAttribute(textBlockEClass, TEXT_BLOCK__CACHED_STRING);
        createEAttribute(textBlockEClass, TEXT_BLOCK__COMPLETE);
        createEReference(textBlockEClass, TEXT_BLOCK__ADDITIONAL_TEMPLATES);
        createEReference(textBlockEClass, TEXT_BLOCK__CORRESPONDING_MODEL_ELEMENTS);

        abstractTokenEClass = createEClass(ABSTRACT_TOKEN);
        createEAttribute(abstractTokenEClass, ABSTRACT_TOKEN__VALUE);
        createEAttribute(abstractTokenEClass, ABSTRACT_TOKEN__LOOKAHEAD);
        createEAttribute(abstractTokenEClass, ABSTRACT_TOKEN__LOOKBACK);
        createEAttribute(abstractTokenEClass, ABSTRACT_TOKEN__STATE);
        createEAttribute(abstractTokenEClass, ABSTRACT_TOKEN__TYPE);

        omittedTokenEClass = createEClass(OMITTED_TOKEN);

        lexedTokenEClass = createEClass(LEXED_TOKEN);
        createEAttribute(lexedTokenEClass, LEXED_TOKEN__OPERATOR);
        createEReference(lexedTokenEClass, LEXED_TOKEN__REFERENCED_ELEMENTS);

        unlexedTokenEClass = createEClass(UNLEXED_TOKEN);

        documentNodeEClass = createEClass(DOCUMENT_NODE);
        createEAttribute(documentNodeEClass, DOCUMENT_NODE__VERSION);
        createEAttribute(documentNodeEClass, DOCUMENT_NODE__CHILDREN_CHANGED);
        createEAttribute(documentNodeEClass, DOCUMENT_NODE__RELEXING_NEEDED);
        createEReference(documentNodeEClass, DOCUMENT_NODE__PARENT);
        createEReference(documentNodeEClass, DOCUMENT_NODE__SEQUENCE_ELEMENT);
        createEAttribute(documentNodeEClass, DOCUMENT_NODE__OFFSET);
        createEAttribute(documentNodeEClass, DOCUMENT_NODE__LENGTH);
        createEReference(documentNodeEClass, DOCUMENT_NODE__OTHER_VERSIONS);
        createEAttribute(documentNodeEClass, DOCUMENT_NODE__OFFSET_RELATIVE);
        createEAttribute(documentNodeEClass, DOCUMENT_NODE__ABSOLUTE_OFFSET);

        forEachExecutionEClass = createEClass(FOR_EACH_EXECUTION);
        createEReference(forEachExecutionEClass, FOR_EACH_EXECUTION__FOREACH_PEDICATE_PROPERTY_INIT);
        createEReference(forEachExecutionEClass, FOR_EACH_EXECUTION__CONTEXT_ELEMENT);
        createEReference(forEachExecutionEClass, FOR_EACH_EXECUTION__RESULT_MODEL_ELEMENT);
        createEReference(forEachExecutionEClass, FOR_EACH_EXECUTION__SOURCE_MODEL_ELEMENT);
        createEAttribute(forEachExecutionEClass, FOR_EACH_EXECUTION__CONTEXT_STRING);
        createEReference(forEachExecutionEClass, FOR_EACH_EXECUTION__TEMPLATE_USED_FOR_PRODUCTION);

        eostokenEClass = createEClass(EOSTOKEN);

        bostokenEClass = createEClass(BOSTOKEN);

        // Create enums
        versionEEnum = createEEnum(VERSION);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        TCSPackage theTCSPackage = (TCSPackage)EPackage.Registry.INSTANCE.getEPackage(TCSPackage.eNS_URI);
        EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        textBlockEClass.getESuperTypes().add(this.getDocumentNode());
        abstractTokenEClass.getESuperTypes().add(this.getDocumentNode());
        omittedTokenEClass.getESuperTypes().add(this.getAbstractToken());
        lexedTokenEClass.getESuperTypes().add(this.getAbstractToken());
        unlexedTokenEClass.getESuperTypes().add(this.getAbstractToken());
        forEachExecutionEClass.getESuperTypes().add(this.getTextBlock());
        eostokenEClass.getESuperTypes().add(this.getAbstractToken());
        bostokenEClass.getESuperTypes().add(this.getAbstractToken());

        // Initialize classes and features; add operations and parameters
        initEClass(textBlockEClass, TextBlock.class, "TextBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTextBlock_Type(), theTCSPackage.getTemplate(), null, "type", null, 0, 1, TextBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTextBlock_SubNodes(), this.getDocumentNode(), this.getDocumentNode_Parent(), "subNodes", null, 0, -1, TextBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTextBlock_ParentAltChoices(), ecorePackage.getEInt(), "parentAltChoices", null, 0, -1, TextBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTextBlock_ElementsInContext(), ecorePackage.getEObject(), null, "elementsInContext", null, 0, -1, TextBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTextBlock_ForEachExecutions(), this.getForEachExecution(), null, "forEachExecutions", null, 0, -1, TextBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTextBlock_CachedString(), theEcorePackage.getEString(), "cachedString", null, 0, 1, TextBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTextBlock_Complete(), theEcorePackage.getEBoolean(), "complete", "false", 1, 1, TextBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTextBlock_AdditionalTemplates(), theTCSPackage.getTemplate(), null, "additionalTemplates", null, 0, -1, TextBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTextBlock_CorrespondingModelElements(), theEcorePackage.getEObject(), null, "correspondingModelElements", null, 0, -1, TextBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        addEOperation(textBlockEClass, this.getTextBlock(), "getSubBlocks", 0, -1, IS_UNIQUE, IS_ORDERED);

        addEOperation(textBlockEClass, this.getAbstractToken(), "getTokens", 0, -1, IS_UNIQUE, IS_ORDERED);

        initEClass(abstractTokenEClass, AbstractToken.class, "AbstractToken", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getAbstractToken_Value(), ecorePackage.getEString(), "value", null, 0, 1, AbstractToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAbstractToken_Lookahead(), ecorePackage.getEInt(), "lookahead", null, 0, 1, AbstractToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAbstractToken_Lookback(), ecorePackage.getEInt(), "lookback", null, 0, 1, AbstractToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAbstractToken_State(), ecorePackage.getEInt(), "state", null, 0, 1, AbstractToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAbstractToken_Type(), ecorePackage.getEInt(), "type", null, 0, 1, AbstractToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(omittedTokenEClass, OmittedToken.class, "OmittedToken", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(lexedTokenEClass, LexedToken.class, "LexedToken", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getLexedToken_Operator(), theEcorePackage.getEBoolean(), "operator", null, 0, 1, LexedToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getLexedToken_ReferencedElements(), theEcorePackage.getEObject(), null, "referencedElements", null, 0, -1, LexedToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(unlexedTokenEClass, UnlexedToken.class, "UnlexedToken", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(documentNodeEClass, DocumentNode.class, "DocumentNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDocumentNode_Version(), this.getVersion(), "version", null, 0, 1, DocumentNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDocumentNode_ChildrenChanged(), ecorePackage.getEBoolean(), "childrenChanged", null, 0, 1, DocumentNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDocumentNode_RelexingNeeded(), ecorePackage.getEBoolean(), "relexingNeeded", null, 0, 1, DocumentNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentNode_Parent(), this.getTextBlock(), this.getTextBlock_SubNodes(), "parent", null, 0, 1, DocumentNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentNode_SequenceElement(), theTCSPackage.getSequenceElement(), null, "sequenceElement", null, 0, 1, DocumentNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDocumentNode_Offset(), ecorePackage.getEInt(), "offset", null, 0, 1, DocumentNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDocumentNode_Length(), ecorePackage.getEInt(), "length", null, 0, 1, DocumentNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentNode_OtherVersions(), this.getDocumentNode(), null, "otherVersions", null, 0, 2, DocumentNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDocumentNode_OffsetRelative(), theEcorePackage.getEBoolean(), "offsetRelative", null, 0, 1, DocumentNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDocumentNode_AbsoluteOffset(), ecorePackage.getEInt(), "absoluteOffset", null, 0, 1, DocumentNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(forEachExecutionEClass, ForEachExecution.class, "ForEachExecution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getForEachExecution_ForeachPedicatePropertyInit(), theTCSPackage.getForeachPredicatePropertyInit(), null, "foreachPedicatePropertyInit", null, 0, 1, ForEachExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getForEachExecution_ContextElement(), theEcorePackage.getEObject(), null, "contextElement", null, 0, 1, ForEachExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getForEachExecution_ResultModelElement(), theEcorePackage.getEObject(), null, "resultModelElement", null, 0, 1, ForEachExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getForEachExecution_SourceModelElement(), theEcorePackage.getEObject(), null, "sourceModelElement", null, 0, 1, ForEachExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getForEachExecution_ContextString(), ecorePackage.getEString(), "contextString", null, 0, 1, ForEachExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getForEachExecution_TemplateUsedForProduction(), theTCSPackage.getTemplate(), null, "templateUsedForProduction", null, 1, 1, ForEachExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(eostokenEClass, Eostoken.class, "Eostoken", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(bostokenEClass, Bostoken.class, "Bostoken", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        // Initialize enums and add enum literals
        initEEnum(versionEEnum, Version.class, "Version");
        addEEnumLiteral(versionEEnum, Version.REFERENCE);
        addEEnumLiteral(versionEEnum, Version.PREVIOUS);
        addEEnumLiteral(versionEEnum, Version.CURRENT);

        // Create annotations
        // http://www.eclipse.org/emf/2002/Ecore
        createEcoreAnnotations();
        // http://www.eclipse.org/emf/2002/Ecore/OCL
        createOCLAnnotations();
        // http://schema.omg.org/spec/MOF/2.0/emof.xml
        createEmofAnnotations();
    }

    /**
     * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createEcoreAnnotations() {
        String source = "http://www.eclipse.org/emf/2002/Ecore";		
        addAnnotation
          (this, 
           source, 
           new String[] {
             "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
             "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL"
           });		
        addAnnotation
          (textBlockEClass.getEOperations().get(0), 
           source, 
           new String[] {
             "constraints", "body"
           });			
        addAnnotation
          (textBlockEClass.getEOperations().get(1), 
           source, 
           new String[] {
             "constraints", "body"
           });			
    }

    /**
     * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createOCLAnnotations() {
        String source = "http://www.eclipse.org/emf/2002/Ecore/OCL";				
        addAnnotation
          (textBlockEClass.getEOperations().get(0), 
           source, 
           new String[] {
             "body", "self.subNodes->select(n | n.oclIsKindOf(TextBlock)).oclAsType(TextBlock)->asOrderedSet()"
           });			
        addAnnotation
          (textBlockEClass.getEOperations().get(1), 
           source, 
           new String[] {
             "body", "self.subNodes->select(n | n.oclIsKindOf(AbstractToken)).oclAsType(AbstractToken)->asOrderedSet()"
           });		
    }

    /**
     * Initializes the annotations for <b>http://schema.omg.org/spec/MOF/2.0/emof.xml</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createEmofAnnotations() {
        String source = "http://schema.omg.org/spec/MOF/2.0/emof.xml";							
        addAnnotation
          (getTextBlock_CorrespondingModelElements(), 
           source, 
           new String[] {
             "Property.oppositeRoleName", "correspondingDocumentNode"
           });		
        addAnnotation
          (getLexedToken_ReferencedElements(), 
           source, 
           new String[] {
             "Property.oppositeRoleName", "referencingDocumentNode"
           });
    }

} //TextblocksPackageImpl
