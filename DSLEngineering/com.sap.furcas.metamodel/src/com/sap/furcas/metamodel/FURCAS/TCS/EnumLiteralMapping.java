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
 * A representation of the model object '<em><b>Enum Literal Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sap.furcas.metamodel.FURCAS.TCS.EnumLiteralMapping#getLiteral <em>Literal</em>}</li>
 *   <li>{@link com.sap.furcas.metamodel.FURCAS.TCS.EnumLiteralMapping#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sap.furcas.metamodel.FURCAS.TCS.TCSPackage#getEnumLiteralMapping()
 * @model
 * @generated
 */
public interface EnumLiteralMapping extends EObject {
    /**
     * Returns the value of the '<em><b>Literal</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Literal</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Literal</em>' containment reference.
     * @see #setLiteral(EnumLiteralVal)
     * @see com.sap.furcas.metamodel.FURCAS.TCS.TCSPackage#getEnumLiteralMapping_Literal()
     * @model containment="true" required="true" ordered="false"
     * @generated
     */
    EnumLiteralVal getLiteral();

    /**
     * Sets the value of the '{@link com.sap.furcas.metamodel.FURCAS.TCS.EnumLiteralMapping#getLiteral <em>Literal</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Literal</em>' containment reference.
     * @see #getLiteral()
     * @generated
     */
    void setLiteral(EnumLiteralVal value);

    /**
     * Returns the value of the '<em><b>Element</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Element</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Element</em>' containment reference.
     * @see #setElement(SequenceElement)
     * @see com.sap.furcas.metamodel.FURCAS.TCS.TCSPackage#getEnumLiteralMapping_Element()
     * @model containment="true" ordered="false"
     * @generated
     */
    SequenceElement getElement();

    /**
     * Sets the value of the '{@link com.sap.furcas.metamodel.FURCAS.TCS.EnumLiteralMapping#getElement <em>Element</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Element</em>' containment reference.
     * @see #getElement()
     * @generated
     */
    void setElement(SequenceElement value);

} // EnumLiteralMapping
