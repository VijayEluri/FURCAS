/**
 * 
 */
package com.sap.tc.moin.textual.moinadapter.adapter;

import static org.junit.Assert.fail;

import java.util.List;

import com.sap.mi.textual.common.exceptions.ModelAdapterException;
import com.sap.mi.textual.grammar.exceptions.DeferredModelElementCreationException;
import com.sap.mi.textual.grammar.exceptions.ReferenceSettingException;
import com.sap.tc.moin.repository.Connection;
import com.sap.tc.moin.repository.JmiHelper;
import com.sap.tc.moin.repository.mmi.model.MofClass;
import com.sap.tc.moin.repository.mmi.model.Reference;
import com.sap.tc.moin.repository.mmi.reflect.RefEnum;
import com.sap.tc.moin.repository.mmi.reflect.RefObject;
import com.sap.tc.moin.repository.mmi.reflect.RefPackage;

/**
 *
 */
public class AdapterJMIHelperStub extends AdapterJMIHelper {
    public Object createdObject;
    public RefEnum createdEnumObject;

    /**
     * @param root
     * @param connection
     * @param jmiHelper
     * @param pri
     */
    AdapterJMIHelperStub(RefPackage root, Connection connection,
            JmiHelper jmiHelper) {
        super(root, connection, jmiHelper, null, null);
    }

    /* (non-Javadoc)
     * @see com.sap.tc.moin.textual.moinadapter.adapter.AdapterJMIHelper#actualCreateFromMock(com.sap.tc.moin.textual.moinadapter.adapter.StructureTypeMockObject)
     */
    @Override
    public Object actualCreateFromMock(StructureTypeMockObject mock)
            throws DeferredModelElementCreationException {
        fail("not implemented yet");
        return super.actualCreateFromMock(mock);
    }

    /* (non-Javadoc)
     * @see com.sap.tc.moin.textual.moinadapter.adapter.AdapterJMIHelper#createAssociationLink(com.sap.tc.moin.repository.mmi.model.Reference, com.sap.tc.moin.repository.mmi.reflect.RefObject, com.sap.tc.moin.repository.mmi.reflect.RefObject)
     */
    @Override
    void createAssociationLink(Reference reference, RefObject endAObject,
            RefObject endBObject) {
        fail("not implemented yet");
        super.createAssociationLink(reference, endAObject, endBObject);
    }

    /* (non-Javadoc)
     * @see com.sap.tc.moin.textual.moinadapter.adapter.AdapterJMIHelper#createObject(java.lang.String)
     */
    @Override
    Object createObject(List<String> type) throws ModelAdapterException {
        return createdObject;
    }

    /* (non-Javadoc)
     * @see com.sap.tc.moin.textual.moinadapter.adapter.AdapterJMIHelper#findAssociationAndAddLink(com.sap.tc.moin.repository.mmi.reflect.RefObject, java.lang.String, java.lang.Object)
     */
    @Override
    boolean findAssociationAndAddLink(RefObject refAObject,
            String propertyName, Object value) throws ModelAdapterException {
        fail("not implemented yet");
        return super.findAssociationAndAddLink(refAObject, propertyName, value);
    }

    /* (non-Javadoc)
     * @see com.sap.tc.moin.textual.moinadapter.adapter.AdapterJMIHelper#findRefObjectOfType(java.lang.String, java.lang.String, java.lang.Object)
     */
    @Override
    RefObject findRefObjectOfType(List<String> targetType, String targetKeyName,
            Object targetKeyValue) throws ReferenceSettingException {
        fail("not implemented yet");
        return super.findRefObjectOfType(targetType, targetKeyName, targetKeyValue);
    }

    /* (non-Javadoc)
     * @see com.sap.tc.moin.textual.moinadapter.adapter.AdapterJMIHelper#getElementsOfType(java.lang.String)
     */
    @Override
    RefObject[] getElementsOfType(String targetType) {
        fail("not implemented yet");
        return super.getElementsOfType(targetType);
    }

    /* (non-Javadoc)
     * @see com.sap.tc.moin.textual.moinadapter.adapter.AdapterJMIHelper#getEnumLiteral(java.lang.String, java.lang.String)
     */
    @Override
    RefEnum getEnumLiteral(List<String> enumName, String name)
            throws ModelAdapterException {
        return createdEnumObject;
    }

    /* (non-Javadoc)
     * @see com.sap.tc.moin.textual.moinadapter.adapter.AdapterJMIHelper#getMofClass(java.lang.String)
     */
    @Override
    MofClass getMofClass(List<String> type) {
        return null;
    }
}