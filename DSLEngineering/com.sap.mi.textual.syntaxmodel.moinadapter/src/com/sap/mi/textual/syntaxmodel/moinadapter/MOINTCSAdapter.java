/**
 * 
 */
package com.sap.mi.textual.syntaxmodel.moinadapter;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import tcs.TcsPackage;

import com.sap.mi.textual.common.exceptions.ModelAdapterException;
import com.sap.mi.textual.grammar.IBareModelAdapter;
import com.sap.mi.textual.grammar.exceptions.DeferredActionResolvingException;
import com.sap.mi.textual.grammar.exceptions.ReferenceSettingException;
import com.sap.tc.moin.repository.Connection;
import com.sap.tc.moin.repository.ModelPartition;
import com.sap.tc.moin.repository.Moin;
import com.sap.tc.moin.repository.PRI;
import com.sap.tc.moin.repository.mmi.reflect.RefObject;
import com.sap.tc.moin.repository.mmi.reflect.RefPackage;
import com.sap.tc.moin.textual.moinadapter.adapter.MOINModelAdapter;

/**
 * specialized Adapter for TCS Syntaxes
 */
public class MOINTCSAdapter implements IBareModelAdapter {

	private final MOINModelAdapter adapter;
	private final Connection connection;
	private final Collection<PRI> metamodelPRIs;

	/**
	 * @param metamodelPRIs
	 * 
	 */
	public MOINTCSAdapter(Connection connection, Set<PRI> metamodelPRIs) {
		super();
		this.metamodelPRIs = metamodelPRIs;
		this.connection = connection;
		final RefPackage rootPackage = connection
				.getPackage(TcsPackage.PACKAGE_DESCRIPTOR);
		if (rootPackage == null) {
			throw new IllegalArgumentException(
					"Connection cannot resolve TCSPackage "
							+ TcsPackage.PACKAGE_DESCRIPTOR);
		}
		Set<PRI> adapterReferenceScopePRIs;
		if (metamodelPRIs != null) {
			adapterReferenceScopePRIs = new HashSet<PRI>(
					metamodelPRIs);
		} else {
			adapterReferenceScopePRIs = new HashSet<PRI>();
		}

		// since we have a connection, which is not null, and which
		// could resolve TcsPackage, we can assume Moin is running.
		Moin moin = MoinContext.getMoin();
		// For TCS, need the Mof Model as well as the transient
		// partitions as scope.
		adapterReferenceScopePRIs
				.add(moin
						.createPri("PF.MetaModelDataArea:DCs/sap.com/tc/moin/mof_1.4/_comp/moin/meta/PrimitiveTypes.moinmm"));
		adapterReferenceScopePRIs
				.add(moin
						.createPri("PF.MetaModelDataArea:DCs/sap.com/tc/moin/mof_1.4/_comp/moin/meta/Model.moinmm"));

		Collection<ModelPartition> transpartitions = connection
				.getTransientPartitions();
		for (Iterator<ModelPartition> iterator = transpartitions
				.iterator(); iterator.hasNext();) {
			ModelPartition modelPartition = iterator
					.next();
			PRI pri = modelPartition.getPri();
			adapterReferenceScopePRIs.add(pri);
		}

		adapter = new MOINModelAdapter(rootPackage, connection,
				adapterReferenceScopePRIs,  null);
	}

	public void close() {
		connection.close();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sap.mi.textual.grammar.IModelAdapter#createElement(java.lang.String)
	 */
	@Override
	public Object createElement(List<String> typeName)
			throws ModelAdapterException {
		Object element = adapter.createElement(typeName);
		return element;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sap.mi.textual.grammar.IModelAdapter#createEnumLiteral(java.lang.String,
	 *      java.lang.String)
	 */
	@Override
	public Object createEnumLiteral(List<String> enumName, String name)
			throws ModelAdapterException {
		Object createdLiteral = adapter.createEnumLiteral(enumName,
				name);
		return createdLiteral;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sap.mi.textual.grammar.IModelAdapter#get(java.lang.Object,
	 *      java.lang.String)
	 */
	@Override
	public Object get(Object modelElement, String propertyName)
			throws ModelAdapterException {
		Object element = adapter.get(modelElement, propertyName);
		return element;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sap.mi.textual.grammar.IModelAdapter#hasDeferredActions()
	 */
	@Override
	public boolean hasDeferredActions() {
		return adapter.hasDeferredActions();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sap.mi.textual.grammar.IModelAdapter#instanceOf(java.lang.Object,
	 *      java.lang.String)
	 */
	@Override
	public boolean instanceOf(Object instance, Object typeName)
			throws ModelAdapterException {
		return adapter.instanceOf(instance, typeName);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sap.mi.textual.grammar.IModelAdapter#performAllDeferredActions()
	 */
	@Override
	public Map<Object, Object> performAllDeferredActions()
			throws DeferredActionResolvingException {

		Map<Object, Object> map = adapter.performAllDeferredActions();
		return map;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sap.mi.textual.grammar.IModelAdapter#set(java.lang.Object,
	 *      java.lang.String, java.lang.Object)
	 */
	@Override
	public void set(Object modelElement, String prop, Object value)
			throws ModelAdapterException {
		adapter.set(modelElement, prop, value);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sap.mi.textual.grammar.IModelAdapter#set(java.lang.Object,
	 *      java.lang.String, java.lang.Object, int)
	 */
	@Override
	public void set(Object modelElement, String prop, Object value,
			int index) throws ModelAdapterException {
		adapter.set(modelElement, prop, value, index);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sap.mi.textual.grammar.IModelAdapter#setReference(java.lang.Object,
	 *      java.lang.String, java.lang.String, java.lang.String,
	 *      java.lang.Object)
	 */
	@Override
	public Object setReference(Object sourceModelElement,
			String referencePropertyName, List<String> targetType,
			String targetKeyName, Object targetKeyValue)
			throws ModelAdapterException, ReferenceSettingException {
		Object reference = adapter.setReference(sourceModelElement,
				referencePropertyName, targetType,
				targetKeyName, targetKeyValue);
		return reference;
	}

	/**
	 * @param string
	 * @return
	 */
	public Set<Object> getElementsByType(String string) {
		RefObject[] array = adapter.getElementsOfType(string);
		Set<Object> set = null;
		if (array != null) {
			set = new HashSet<Object>(Arrays.asList(array));
		}
		return set;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sap.mi.textual.grammar.IModelAdapter#setOclReference(java.lang.Object,
	 *      java.lang.String, java.lang.String)
	 */
	@Override
	public Object setOclReference(Object modelElement, String propertyName,
			Object keyValue, String oclQuery, Object contextObject)
			throws ModelAdapterException {
		Object result = adapter
				.setOclReference(modelElement, propertyName,
						keyValue, oclQuery,
						contextObject);
		return result;
	}

	@Override
	public Collection getPredicateOclReference(Object modelElement,
			String propertyName, Object keyValue, String oclQuery,
			Object contextElement) throws ModelAdapterException {
		// TODO fill in the right stuff
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sap.mi.textual.grammar.IModelAdapter#getMetaType(java.util.List)
	 */
	@Override
	public Object getMetaType(List<String> typeName)
			throws ModelAdapterException {
		return adapter.getMetaType(typeName);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sap.mi.textual.grammar.IModelAdapter#setWithinContextObject(java.lang.Object,
	 *      java.lang.String, java.util.List, java.lang.String,
	 *      java.lang.Object, java.lang.Object)
	 */
	@Override
	public Object setWithinContextObject(Object modelElement,
			String propertyName, List<String> valueTypeName,
			String keyName, Object keyValue, Object contextObject)
			throws ModelAdapterException, ReferenceSettingException {
		return adapter.setWithinContextObject(modelElement,
				propertyName, valueTypeName, keyName, keyValue,
				contextObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sap.mi.textual.grammar.IModelAdapter#queryElement(java.util.List,
	 *      java.util.Map)
	 */
	@Override
	public Collection<Object> queryElement(List<String> type,
			Map<String, List<Object>> attributes)
			throws ModelAdapterException {
		return adapter.queryElement(type, attributes);
	}

	@Override
	public void unset(Object modelElement, String prop, Object value)
			throws ModelAdapterException {
		adapter.unset(modelElement, prop, value);
	}
	
}