/**
 * Generated by the MOIN Generator Version 3.0
 **/

package org.omg.ocl.attaching.__impl;

public interface AttributeDerivationExpressionInternal extends com.sap.tc.moin.repository.mmi.reflect.RefAssociation
{
    // internal association interface
    public boolean exists(com.sap.tc.moin.repository.core.CoreConnection connection, org.omg.ocl.expressions.OclExpression _DerivationExpression, com.sap.tc.moin.repository.mmi.model.Attribute _AttributeForDerivationExpression) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public org.omg.ocl.expressions.OclExpression getDerivationExpression(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.model.Attribute _AttributeForDerivationExpression) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.tc.moin.repository.mmi.model.Attribute getAttributeForDerivationExpression(com.sap.tc.moin.repository.core.CoreConnection connection, org.omg.ocl.expressions.OclExpression _DerivationExpression) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean add(com.sap.tc.moin.repository.core.CoreConnection connection, org.omg.ocl.expressions.OclExpression _DerivationExpression, com.sap.tc.moin.repository.mmi.model.Attribute _AttributeForDerivationExpression) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean remove(com.sap.tc.moin.repository.core.CoreConnection connection, org.omg.ocl.expressions.OclExpression _DerivationExpression, com.sap.tc.moin.repository.mmi.model.Attribute _AttributeForDerivationExpression) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
}