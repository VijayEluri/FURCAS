/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.tc.moin.repository.mmi.model.__impl;

public final class DependsOnImpl extends com.sap.tc.moin.repository.core.jmi.reflect.RefAssociationImpl implements com.sap.tc.moin.repository.mmi.model.DependsOn,com.sap.tc.moin.repository.mmi.model.__impl.DependsOnInternal
{
    // default constructor
    public DependsOnImpl() {
        super();
    }

    // specific constructor
    public DependsOnImpl(java.lang.Object workspace, java.lang.String mofId, com.sap.tc.moin.repository.mmi.reflect.RefPackage immediatePackage, com.sap.tc.moin.repository.mmi.reflect.RefObject metaObject) {
        super(workspace, mofId, immediatePackage, metaObject);
    }
    
    public boolean exists(com.sap.tc.moin.repository.mmi.model.ModelElement _Dependent, com.sap.tc.moin.repository.mmi.model.ModelElement _Provider) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        boolean result = false;
        // missing an implementation provided in tag org.omg.sap2mof.OperationCodeExistsJava
        // calculate the existence based on the accessor for end 0: dependent
        for(java.util.Iterator iter = getDependent(_Provider).iterator(); iter.hasNext();) {
            if(iter.next().equals(_Dependent)) {
                result = true;
                break;
            }
        }
        return result;
    }
    public boolean exists(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.model.ModelElement _Dependent, com.sap.tc.moin.repository.mmi.model.ModelElement _Provider) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        boolean result = false;
        // missing an implementation provided in tag org.omg.sap2mof.OperationCodeExistsJava
        // calculate the existence based on the accessor for end 0: dependent
        for (java.util.Iterator it = ((com.sap.tc.moin.repository.core.JmiList) getDependent(connection, _Provider)).iterator(connection); it.hasNext();) {
            if (it.next().equals(_Dependent)) {
                result = true;
                break;
            }
        }
        return result;
    }
    public java.util.Collection<com.sap.tc.moin.repository.mmi.model.ModelElement> getDependent(com.sap.tc.moin.repository.mmi.model.ModelElement _Provider) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        com.sap.tc.moin.repository.core.CoreConnection connection = get___CurrentConnection();
        // begin of implementation provided in tag org.omg.sap2mof.DerivationCodeJava
        // DependsOn.getDependent
        return com.sap.tc.moin.repository.core.jmi.util.MoinMetamodelCode.getDependent(connection, this, _Provider);
        // end of implementation provided in tag org.omg.sap2mof.DerivationCodeJava
    }
    public java.util.Collection<com.sap.tc.moin.repository.mmi.model.ModelElement> getDependent(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.model.ModelElement _Provider) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        // begin of implementation provided in tag org.omg.sap2mof.DerivationCodeJava
        // DependsOn.getDependent
        return com.sap.tc.moin.repository.core.jmi.util.MoinMetamodelCode.getDependent(connection, this, _Provider);
        // end of implementation provided in tag org.omg.sap2mof.DerivationCodeJava
    }
    public java.util.Collection<com.sap.tc.moin.repository.mmi.model.ModelElement> getProvider(com.sap.tc.moin.repository.mmi.model.ModelElement _Dependent) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        com.sap.tc.moin.repository.core.CoreConnection connection = get___CurrentConnection();
        // begin of implementation provided in tag org.omg.sap2mof.DerivationCodeJava
        // DependsOn.getProvider
        return com.sap.tc.moin.repository.core.jmi.util.MoinMetamodelCode.getProvider(connection, this, _Dependent);
        // end of implementation provided in tag org.omg.sap2mof.DerivationCodeJava
    }
    public java.util.Collection<com.sap.tc.moin.repository.mmi.model.ModelElement> getProvider(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.model.ModelElement _Dependent) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        // begin of implementation provided in tag org.omg.sap2mof.DerivationCodeJava
        // DependsOn.getProvider
        return com.sap.tc.moin.repository.core.jmi.util.MoinMetamodelCode.getProvider(connection, this, _Dependent);
        // end of implementation provided in tag org.omg.sap2mof.DerivationCodeJava
    }
    public boolean refLinkExists(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefObject firstEnd, com.sap.tc.moin.repository.mmi.reflect.RefObject secondEnd) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        if ( firstEnd == null || secondEnd == null ) { return false; }
        checkTypesForRefLinkExists( connection, firstEnd, secondEnd );
        return exists( connection, (com.sap.tc.moin.repository.mmi.model.ModelElement) firstEnd, (com.sap.tc.moin.repository.mmi.model.ModelElement) secondEnd );
    }
    protected boolean ___exists(com.sap.tc.moin.repository.mmi.reflect.RefObject firstEnd, com.sap.tc.moin.repository.mmi.reflect.RefObject secondEnd) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        // RefAssociation methods are delegated to specific ones for derived associations
        return exists((com.sap.tc.moin.repository.mmi.model.ModelElement)firstEnd, (com.sap.tc.moin.repository.mmi.model.ModelElement)secondEnd);
    }
    protected boolean ___exists(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefObject firstEnd, com.sap.tc.moin.repository.mmi.reflect.RefObject secondEnd) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        // RefAssociation methods are delegated to specific ones for derived associations
        return exists(connection, (com.sap.tc.moin.repository.mmi.model.ModelElement)firstEnd, (com.sap.tc.moin.repository.mmi.model.ModelElement)secondEnd);
    }
    protected java.util.Collection ___query(java.lang.String queryEndName, com.sap.tc.moin.repository.mmi.reflect.RefObject queryObject) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        java.util.Collection result = new java.util.ArrayList();
        if(queryEndName.equals("provider")) { //$NON-NLS-1$
            result.addAll(getDependent((com.sap.tc.moin.repository.mmi.model.ModelElement)queryObject));
            return result;
        }
        if(queryEndName.equals("dependent")) { //$NON-NLS-1$
            result.addAll(getProvider((com.sap.tc.moin.repository.mmi.model.ModelElement)queryObject));
            return result;
        }
        else {
            throw new com.sap.tc.moin.repository.mmi.reflect.InvalidCallException(queryEndName, null);
        }
    }
    protected java.util.Collection ___query(com.sap.tc.moin.repository.core.CoreConnection connection, java.lang.String queryEndName, com.sap.tc.moin.repository.mmi.reflect.RefObject queryObject) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        java.util.Collection result = new java.util.ArrayList();
        if(queryEndName.equals("provider")) { //$NON-NLS-1$
            result.addAll(getDependent(connection, (com.sap.tc.moin.repository.mmi.model.ModelElement)queryObject));
            return result;
        }
        if(queryEndName.equals("dependent")) { //$NON-NLS-1$
            result.addAll(getProvider(connection, (com.sap.tc.moin.repository.mmi.model.ModelElement)queryObject));
            return result;
        }
        else {
            throw new com.sap.tc.moin.repository.mmi.reflect.InvalidCallException(queryEndName, null);
        }
    }

    public java.lang.Class<com.sap.tc.moin.repository.mmi.model.DependsOn> get___JmiInterface() {
        return com.sap.tc.moin.repository.mmi.model.DependsOn.class;
    }
    
    @Override
    public com.sap.tc.moin.repository.spi.core.Wrapper<com.sap.tc.moin.repository.mmi.model.DependsOn> createWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, boolean synchronize) {
        return new com.sap.tc.moin.repository.mmi.model.__impl.DependsOnWrapper(conn, this, synchronize);
    }
}