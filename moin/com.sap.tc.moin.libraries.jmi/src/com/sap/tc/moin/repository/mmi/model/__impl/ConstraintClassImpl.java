/**
 * Generated by the MOIN JMI Generator Version 3.0
 **/

package com.sap.tc.moin.repository.mmi.model.__impl;

public final class ConstraintClassImpl extends com.sap.tc.moin.repository.core.jmi.reflect.RefClassImpl implements com.sap.tc.moin.repository.mmi.model.ConstraintClass,com.sap.tc.moin.repository.mmi.model.__impl.ConstraintClassInternal {

    
    static {
    }

    // static variable declarations
    
    // default constructor
    public ConstraintClassImpl() {
        super();
    }

    // specific constructor
    public ConstraintClassImpl(java.lang.Object workspace, java.lang.String mofId, com.sap.tc.moin.repository.mmi.reflect.RefPackage immediatePackage, com.sap.tc.moin.repository.mmi.reflect.RefObject metaObject) {
        super(workspace, mofId, immediatePackage, metaObject);
    }

    // object creators
    public com.sap.tc.moin.repository.mmi.model.Constraint createConstraint() throws com.sap.tc.moin.repository.mmi.reflect.JmiException {
    
        com.sap.tc.moin.repository.mmi.model.Constraint result = (com.sap.tc.moin.repository.mmi.model.Constraint) refCreateInstance(get___CurrentConnection(), (java.util.List<? extends Object>)null);
        return result;
    }
    public com.sap.tc.moin.repository.mmi.model.Constraint createConstraint(com.sap.tc.moin.repository.core.CoreConnection connection) throws com.sap.tc.moin.repository.mmi.reflect.JmiException {
    
        com.sap.tc.moin.repository.mmi.model.Constraint result = (com.sap.tc.moin.repository.mmi.model.Constraint) refCreateInstance(connection, (java.util.List<? extends Object>)null);
        return result;
    }
    public com.sap.tc.moin.repository.mmi.model.Constraint createConstraintInPartition(com.sap.tc.moin.repository.ModelPartition partition) throws com.sap.tc.moin.repository.mmi.reflect.JmiException {
    
        com.sap.tc.moin.repository.mmi.model.Constraint result = (com.sap.tc.moin.repository.mmi.model.Constraint) refCreateInstanceInPartition(get___CurrentConnection(), (java.util.List<? extends Object>)null, partition);
        return result;
    }
    public com.sap.tc.moin.repository.mmi.model.Constraint createConstraintInPartition(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.ModelPartition partition) throws com.sap.tc.moin.repository.mmi.reflect.JmiException {
    
        com.sap.tc.moin.repository.mmi.model.Constraint result = (com.sap.tc.moin.repository.mmi.model.Constraint) refCreateInstanceInPartition(connection, (java.util.List<? extends Object>)null, partition);
        return result;
    }
    public com.sap.tc.moin.repository.mmi.model.Constraint createConstraint(java.lang.String name, java.lang.String annotation, java.lang.String expression, java.lang.String language, com.sap.tc.moin.repository.mmi.model.EvaluationKind evaluationPolicy) throws com.sap.tc.moin.repository.mmi.reflect.JmiException {
        java.util.List<java.lang.Object> parameterList = new java.util.ArrayList<java.lang.Object>(5);
        parameterList.add(name);
        parameterList.add(annotation);
        parameterList.add(expression);
        parameterList.add(language);
        parameterList.add(evaluationPolicy);
        return (com.sap.tc.moin.repository.mmi.model.Constraint) refCreateInstance(get___CurrentConnection(), parameterList);
    }
    public com.sap.tc.moin.repository.mmi.model.Constraint createConstraint(com.sap.tc.moin.repository.core.CoreConnection connection, java.lang.String name, java.lang.String annotation, java.lang.String expression, java.lang.String language, com.sap.tc.moin.repository.mmi.model.EvaluationKind evaluationPolicy) throws com.sap.tc.moin.repository.mmi.reflect.JmiException {
        java.util.List<java.lang.Object> parameterList = new java.util.ArrayList<java.lang.Object>(5);
        parameterList.add(name);
        parameterList.add(annotation);
        parameterList.add(expression);
        parameterList.add(language);
        parameterList.add(evaluationPolicy);
        return (com.sap.tc.moin.repository.mmi.model.Constraint) refCreateInstance(connection, parameterList);
    }
    public com.sap.tc.moin.repository.mmi.model.Constraint createConstraintInPartition(java.lang.String name, java.lang.String annotation, java.lang.String expression, java.lang.String language, com.sap.tc.moin.repository.mmi.model.EvaluationKind evaluationPolicy, com.sap.tc.moin.repository.ModelPartition partition) throws com.sap.tc.moin.repository.mmi.reflect.JmiException {
        java.util.List<java.lang.Object> parameterList = new java.util.ArrayList<java.lang.Object>(5);
        parameterList.add(name);
        parameterList.add(annotation);
        parameterList.add(expression);
        parameterList.add(language);
        parameterList.add(evaluationPolicy);
        return (com.sap.tc.moin.repository.mmi.model.Constraint) refCreateInstanceInPartition(get___CurrentConnection(), parameterList, partition);
    }
    public com.sap.tc.moin.repository.mmi.model.Constraint createConstraintInPartition(com.sap.tc.moin.repository.core.CoreConnection connection, java.lang.String name, java.lang.String annotation, java.lang.String expression, java.lang.String language, com.sap.tc.moin.repository.mmi.model.EvaluationKind evaluationPolicy, com.sap.tc.moin.repository.ModelPartition partition) throws com.sap.tc.moin.repository.mmi.reflect.JmiException {
        java.util.List<java.lang.Object> parameterList = new java.util.ArrayList<java.lang.Object>(5);
        parameterList.add(name);
        parameterList.add(annotation);
        parameterList.add(expression);
        parameterList.add(language);
        parameterList.add(evaluationPolicy);
        return (com.sap.tc.moin.repository.mmi.model.Constraint) refCreateInstanceInPartition(connection, parameterList, partition);
    }

    // methods for static attributes
    
    
    // methods for modeled static operations
    
    // methods for structure type creators


    // methods for internal modeled operations

    // internal enumeration creators
    public com.sap.tc.moin.repository.mmi.reflect.RefEnum create___RefEnum(com.sap.tc.moin.repository.mmi.model.EnumerationType enumType, String name) {
        com.sap.tc.moin.repository.mmi.reflect.RefEnum result = null;
        java.lang.String enumName = enumType.getName();
          if (enumName.equals("EvaluationKind")) { //$NON-NLS-1$
            result = com.sap.tc.moin.repository.mmi.model.EvaluationKindEnum.forName(name);
          }
        return result;
    }

    // internal structure type creators

    // reflective methods
        
    


    // for performance reasons overwrite method
    public boolean is___Singleton() {
        return false;
    }
    // for performance reasons overwrite method
    public boolean is___Abstract() {
        return false;
    }

    public com.sap.tc.moin.repository.mmi.reflect.RefObject get___Instance() throws com.sap.tc.moin.repository.mmi.reflect.JmiException {
        return new com.sap.tc.moin.repository.mmi.model.__impl.ConstraintImpl();    
    }

    // get the JMI interface
    public java.lang.Class<com.sap.tc.moin.repository.mmi.model.ConstraintClass> get___JmiInterface() {
        return com.sap.tc.moin.repository.mmi.model.ConstraintClass.class;
    }
        
    
    // reflective methods
    

    @Override
    public com.sap.tc.moin.repository.spi.core.Wrapper<com.sap.tc.moin.repository.mmi.model.__impl.ConstraintClassImpl> createWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, boolean synchronize) {
        return new com.sap.tc.moin.repository.mmi.model.__impl.ConstraintClassWrapper(conn, this, synchronize);
    }   

}