/**
 * Generated by the MOIN Generator Version 3.0
 **/

package org.omg.ocl.expressions.__impl;

public interface ATuplePartTupleLiteralExpInternal extends com.sap.tc.moin.repository.mmi.reflect.RefAssociation
{
    // internal association interface
    public boolean exists(com.sap.tc.moin.repository.core.CoreConnection connection, org.omg.ocl.expressions.VariableDeclaration _TuplePart, org.omg.ocl.expressions.TupleLiteralExp _TupleLiteralExp) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public java.util.Collection<org.omg.ocl.expressions.VariableDeclaration> getTuplePart(com.sap.tc.moin.repository.core.CoreConnection connection, org.omg.ocl.expressions.TupleLiteralExp _TupleLiteralExp) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public java.util.Collection<org.omg.ocl.expressions.TupleLiteralExp> getTupleLiteralExp(com.sap.tc.moin.repository.core.CoreConnection connection, org.omg.ocl.expressions.VariableDeclaration _TuplePart) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean add(com.sap.tc.moin.repository.core.CoreConnection connection, org.omg.ocl.expressions.VariableDeclaration _TuplePart, org.omg.ocl.expressions.TupleLiteralExp _TupleLiteralExp) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean remove(com.sap.tc.moin.repository.core.CoreConnection connection, org.omg.ocl.expressions.VariableDeclaration _TuplePart, org.omg.ocl.expressions.TupleLiteralExp _TupleLiteralExp) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
}