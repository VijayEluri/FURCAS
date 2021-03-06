/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.sap.furcas.metamodel.FURCAS.TCS;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predicate Semantic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sap.furcas.metamodel.FURCAS.TCS.PredicateSemantic#getWhen <em>When</em>}</li>
 *   <li>{@link com.sap.furcas.metamodel.FURCAS.TCS.PredicateSemantic#getAs <em>As</em>}</li>
 *   <li>{@link com.sap.furcas.metamodel.FURCAS.TCS.PredicateSemantic#getMode <em>Mode</em>}</li>
 *   <li>{@link com.sap.furcas.metamodel.FURCAS.TCS.PredicateSemantic#getForeachParent <em>Foreach Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sap.furcas.metamodel.FURCAS.TCS.TCSPackage#getPredicateSemantic()
 * @model
 * @generated
 */
public interface PredicateSemantic extends EObject {
    /**
     * Returns the value of the '<em><b>When</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>When</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>When</em>' attribute.
     * @see #setWhen(String)
     * @see com.sap.furcas.metamodel.FURCAS.TCS.TCSPackage#getPredicateSemantic_When()
     * @model
     * @generated
     */
    String getWhen();

    /**
     * Sets the value of the '{@link com.sap.furcas.metamodel.FURCAS.TCS.PredicateSemantic#getWhen <em>When</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>When</em>' attribute.
     * @see #getWhen()
     * @generated
     */
    void setWhen(String value);

    /**
     * Returns the value of the '<em><b>As</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>As</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>As</em>' reference.
     * @see #setAs(Template)
     * @see com.sap.furcas.metamodel.FURCAS.TCS.TCSPackage#getPredicateSemantic_As()
     * @model
     * @generated
     */
    Template getAs();

    /**
     * Sets the value of the '{@link com.sap.furcas.metamodel.FURCAS.TCS.PredicateSemantic#getAs <em>As</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>As</em>' reference.
     * @see #getAs()
     * @generated
     */
    void setAs(Template value);

    /**
     * Returns the value of the '<em><b>Mode</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mode</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mode</em>' attribute.
     * @see #setMode(String)
     * @see com.sap.furcas.metamodel.FURCAS.TCS.TCSPackage#getPredicateSemantic_Mode()
     * @model
     * @generated
     */
    String getMode();

    /**
     * Sets the value of the '{@link com.sap.furcas.metamodel.FURCAS.TCS.PredicateSemantic#getMode <em>Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mode</em>' attribute.
     * @see #getMode()
     * @generated
     */
    void setMode(String value);

    /**
     * Returns the value of the '<em><b>Foreach Parent</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link com.sap.furcas.metamodel.FURCAS.TCS.ForeachPredicatePropertyInit#getPredicateSemantic <em>Predicate Semantic</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Foreach Parent</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Foreach Parent</em>' container reference.
     * @see #setForeachParent(ForeachPredicatePropertyInit)
     * @see com.sap.furcas.metamodel.FURCAS.TCS.TCSPackage#getPredicateSemantic_ForeachParent()
     * @see com.sap.furcas.metamodel.FURCAS.TCS.ForeachPredicatePropertyInit#getPredicateSemantic
     * @model opposite="predicateSemantic" required="true" transient="false"
     * @generated
     */
    ForeachPredicatePropertyInit getForeachParent();

    /**
     * Sets the value of the '{@link com.sap.furcas.metamodel.FURCAS.TCS.PredicateSemantic#getForeachParent <em>Foreach Parent</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Foreach Parent</em>' container reference.
     * @see #getForeachParent()
     * @generated
     */
    void setForeachParent(ForeachPredicatePropertyInit value);

} // PredicateSemantic
