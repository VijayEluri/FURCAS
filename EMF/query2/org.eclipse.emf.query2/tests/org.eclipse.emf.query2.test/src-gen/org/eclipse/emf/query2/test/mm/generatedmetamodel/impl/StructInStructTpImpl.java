/*******************************************************************************
 * Copyright (c) 2006, 2009 SAP AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     SAP AG - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.query2.test.mm.generatedmetamodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.query2.test.mm.generatedmetamodel.GeneratedmetamodelPackage;
import org.eclipse.emf.query2.test.mm.generatedmetamodel.StructInStructTp;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Struct In Struct Tp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.query2.test.mm.generatedmetamodel.impl.StructInStructTpImpl#getField1 <em>Field1</em>}</li>
 *   <li>{@link org.eclipse.emf.query2.test.mm.generatedmetamodel.impl.StructInStructTpImpl#getField2 <em>Field2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructInStructTpImpl extends EObjectImpl implements StructInStructTp {
	/**
	 * The default value of the '{@link #getField1() <em>Field1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getField1()
	 * @generated
	 * @ordered
	 */
	protected static final int FIELD1_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getField1() <em>Field1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getField1()
	 * @generated
	 * @ordered
	 */
	protected int field1 = FIELD1_EDEFAULT;

	/**
	 * The default value of the '{@link #getField2() <em>Field2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getField2()
	 * @generated
	 * @ordered
	 */
	protected static final String FIELD2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getField2() <em>Field2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getField2()
	 * @generated
	 * @ordered
	 */
	protected String field2 = FIELD2_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructInStructTpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratedmetamodelPackage.eINSTANCE.getStructInStructTp();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getField1() {
		return field1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setField1(int newField1) {
		int oldField1 = field1;
		field1 = newField1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratedmetamodelPackage.STRUCT_IN_STRUCT_TP__FIELD1, oldField1, field1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getField2() {
		return field2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setField2(String newField2) {
		String oldField2 = field2;
		field2 = newField2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratedmetamodelPackage.STRUCT_IN_STRUCT_TP__FIELD2, oldField2, field2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GeneratedmetamodelPackage.STRUCT_IN_STRUCT_TP__FIELD1:
				return getField1();
			case GeneratedmetamodelPackage.STRUCT_IN_STRUCT_TP__FIELD2:
				return getField2();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GeneratedmetamodelPackage.STRUCT_IN_STRUCT_TP__FIELD1:
				setField1((Integer)newValue);
				return;
			case GeneratedmetamodelPackage.STRUCT_IN_STRUCT_TP__FIELD2:
				setField2((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GeneratedmetamodelPackage.STRUCT_IN_STRUCT_TP__FIELD1:
				setField1(FIELD1_EDEFAULT);
				return;
			case GeneratedmetamodelPackage.STRUCT_IN_STRUCT_TP__FIELD2:
				setField2(FIELD2_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GeneratedmetamodelPackage.STRUCT_IN_STRUCT_TP__FIELD1:
				return field1 != FIELD1_EDEFAULT;
			case GeneratedmetamodelPackage.STRUCT_IN_STRUCT_TP__FIELD2:
				return FIELD2_EDEFAULT == null ? field2 != null : !FIELD2_EDEFAULT.equals(field2);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Field1: "); //$NON-NLS-1$
		result.append(field1);
		result.append(", Field2: "); //$NON-NLS-1$
		result.append(field2);
		result.append(')');
		return result.toString();
	}

} //StructInStructTpImpl