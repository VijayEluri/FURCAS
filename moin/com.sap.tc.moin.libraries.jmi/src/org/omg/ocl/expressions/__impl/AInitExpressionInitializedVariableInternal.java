/**
 * Generated by the MOIN Generator Version 3.0
 **/

package org.omg.ocl.expressions.__impl;

public interface AInitExpressionInitializedVariableInternal extends com.sap.tc.moin.repository.mmi.reflect.RefAssociation
{
    // internal association interface
    public boolean exists(com.sap.tc.moin.repository.core.CoreConnection connection, org.omg.ocl.expressions.OclExpression _InitExpression, org.omg.ocl.expressions.VariableDeclaration _InitializedVariable) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public org.omg.ocl.expressions.OclExpression getInitExpression(com.sap.tc.moin.repository.core.CoreConnection connection, org.omg.ocl.expressions.VariableDeclaration _InitializedVariable) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public org.omg.ocl.expressions.VariableDeclaration getInitializedVariable(com.sap.tc.moin.repository.core.CoreConnection connection, org.omg.ocl.expressions.OclExpression _InitExpression) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean add(com.sap.tc.moin.repository.core.CoreConnection connection, org.omg.ocl.expressions.OclExpression _InitExpression, org.omg.ocl.expressions.VariableDeclaration _InitializedVariable) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean remove(com.sap.tc.moin.repository.core.CoreConnection connection, org.omg.ocl.expressions.OclExpression _InitExpression, org.omg.ocl.expressions.VariableDeclaration _InitializedVariable) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
}