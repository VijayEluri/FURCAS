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
package org.eclipse.emf.query2;

import java.io.IOException;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.query.index.DirtyResourceFactory;
import org.eclipse.emf.query.index.Index;

import org.eclipse.emf.query.index.query.EReferenceQuery;
import org.eclipse.emf.query.index.query.IndexQueryFactory;
import org.eclipse.emf.query.index.query.QueryCommand;
import org.eclipse.emf.query.index.query.QueryExecutor;
import org.eclipse.emf.query.index.query.QueryResult;
import org.eclipse.emf.query.index.query.descriptors.EReferenceDescriptor;
import org.eclipse.emf.query.index.update.IndexUpdater;
import org.eclipse.emf.query.index.update.ResourceIndexer;
import org.eclipse.emf.query.index.update.UpdateCommandAdapter;

public class EmfHelper {

	ResourceSet rs;

	Index index;

	private Index dirtyIndex;

	private Map<URI, EReference> referenceCache = new HashMap<URI, EReference>();

	private Map<URI, EClass> eclassCache = new HashMap<URI, EClass>();

	private boolean useDirty = false;
	/**
	 * Gets the index of the current context
	 * @return Index
	 */
	public Index getIndex() {
		return index;
	}

	public EmfHelper(QueryContext context, Index index) {
		this.rs = context.getResourceSet();
		if (this.rs instanceof ResourceSetImpl) {
			ResourceSetImpl rsImpl = (ResourceSetImpl) this.rs;
			if (rsImpl.getURIResourceMap() == null) {
				rsImpl.setURIResourceMap(new HashMap<URI, Resource>());
			}
		}else if(rs==null){//providing the null check
			//a new resource set is created if valid resource set is not passed
			//check https://bugs.eclipse.org/bugs/show_bug.cgi?id=331905
			this.rs=new ResourceSetImpl();
		}
		this.index = index;
	}

	public void setUseDirty() {
		this.useDirty = true;
	}

	public void setUseNonDirty() {
		this.useDirty = false;
	}

	/**
	 * Creates a URI with the given uri
	 * @param uriString
	 * @return URI created for uriString
	 */
	public URI createUri(String uriString) {

		return URI.createURI(uriString);
	}
	
	/**
	 * Returns corresponding eClass for given uri
	 * @param uri
	 * @return eClass for the given URI
	 */
	public EClass getTypeElement(URI uri) {

		EClass result;
		if ((result = this.eclassCache.get(uri)) == null) {
			result = (EClass) this.rs.getEObject(uri, true);
			this.eclassCache.put(uri, result);
		}
		return result;
	}

	public EObject getElement(URI uri) {

		return this.rs.getEObject(uri, true);
	}
	/**
	 * Returns corresponding eReference for given uri
	 * @param uri
	 * @return eReference for the given URI
	 */
	public EReference getReference(URI uri) {

		EReference result = null;
		if ((result = this.referenceCache.get(uri)) == null) {
			result = (EReference) this.rs.getEObject(uri, true);
			this.referenceCache.put(uri, result);
		}
		return result;
	}
	/**
	 * Gets all subtypes of the given eClass
	 * @param typeAsMofClass
	 * @return subtypes of given eClass as collection
	 */
	public Collection<EClass> getAllSubtypes(EClass typeAsMofClass) {

		return IndexQueryService.getAllSubtypes(this.index, typeAsMofClass);
	}
	
	/**
	 * Gets the structural feature from the eClass
	 * @param attrName, name of the structural feature
	 * @return structural feature by name attrName in mofClass
	 */
	public EStructuralFeature getFeatureByName(EClass mofClass, String attrName) {

		return mofClass.getEStructuralFeature(attrName);
	}

	public boolean existsResource(URI resource) {
		// boolean b = this.rs.getResource(resource, true) != null;
		// return this.rs.getResource(resource, true) != null;
		return this.rs.getResource(resource, false) != null || this.rs.getURIConverter().exists(resource, null);
	}

	public Resource getResource(final URI resource) {

		Resource r = rs.getResource(resource, false);
		if (r == null) {
			r = rs.getResource(resource, true);
			if (useDirty)
				addToIndex(r);
		} else {
			if (!r.isLoaded()) {
				try {
					r.load(null);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
		}
		return r;
	}
	

	private void addToIndex(final Resource r) {
		dirtyIndex.executeUpdateCommand(new UpdateCommandAdapter() {
			
			public void execute(IndexUpdater updater) {
				ResourceIndexer rd = new ResourceIndexer();
				ResourceIndexer indexer = rd.getInstance();
				indexer.resourceChanged(updater, r);
			}
		});
	}
	
	/**
	 * Returns all the loaded resources of the resourceSet
	 * @return list of resources
	 */
	public List<Resource> getLoadedResources() {

		List<Resource> result = new ArrayList<Resource>();
		for (Resource resource : this.rs.getResources()) {
			if (resource.isLoaded()) {
				result.add(resource);
			}
		}
		return result;
	}
	/**
	 * Gets all the elements in the given resource
	 * @param a resource
	 * @return elements in the given resource
	 */
	public List<EObject> getElementsInResource(Resource mp) {

		List<EObject> result = new ArrayList<EObject>();
		Set<EObject> seen = new HashSet<EObject>();
		int i = 0;
		for (EObject eobject : mp.getContents()) {
			if (seen.add(eobject)) {
				result.add(eobject);
			}
			for (; i < result.size(); i++) {
				EObject next = result.get(i);
				for (EObject ob : next.eContents()) {
					if (!ob.eIsProxy() && seen.add(ob) && ob.eResource() == mp) {
						result.add(ob);
					}
				}
			}
		}

		//		for (TreeIterator<EObject> it = EcoreUtil.getAllProperContents(mp, false); it.hasNext();) {
		//			if ((object = it.next()) instanceof EObject && !object.eIsProxy()) {
		//				result.add(object);
		//			}
		//		}
		return result;
	}

	private abstract static class QueryCommandWithResult<T> implements QueryCommand {

		T result;

		protected void setResult(T res) {
			this.result = res;

		}

		public T getResult() {
			return result;
		}
	}

	private Index getBackwardNavIndex() {
		if (useDirty) {
			//The dirty index is maintained by the DirtyResourceFactory
			return DirtyResourceFactory.getIndex();
		} else {
			return this.index;
		}
	}
	/**
	 *Returns a list of eObjects which are referring a particular eObject(target eObject), 
	 *usually through a backward navigation link 
	 *
	 */
	public List<EObject> getReferringElementsWithTypeAndInScope(final EObject toObject, final URI endAndMetaObject,
			final Set<URI> uriScope, final Set<EClass> mrisOfTypes, final Set<URI> elements) {

		QueryCommandWithResult<List<EObject>> command;
		if(this.getBackwardNavIndex()==null){
			return null; //Null check handling has to be done in the callee.
		}
		this.getBackwardNavIndex().executeQueryCommand(command = new QueryCommandWithResult<List<EObject>>() {

			
			public void execute(QueryExecutor queryExecutor) { // TODO provide more query possibilities on the index API
				EReferenceQuery<EReferenceDescriptor> query = IndexQueryFactory.createEReferenceQuery();
				query.eReferenceURI(endAndMetaObject);
				query.targetEObject().fragment(toObject.eResource().getURIFragment(toObject));
				query.targetEObject().resource().uri(toObject.eResource().getURI().toString());

				QueryResult<EReferenceDescriptor> queryResult = queryExecutor.execute(query);

				List<EObject> returnVal = new ArrayList<EObject>();

				for (EReferenceDescriptor entry : queryResult) {
					URI resourceURI = entry.getSourceResourceURI();
					String fragment = entry.getSourceFragment();
					if ((uriScope == null || uriScope.contains(entry.getSourceResourceURI())) && //
							(elements == null || elements.contains(resourceURI.appendFragment(fragment)))) {
						Resource r = rs.getResource(resourceURI, true);
						EObject eObject = r.getEObject(fragment);
						assert eObject != null;
						returnVal.add(eObject);
					}
				}

				setResult(returnVal);
			}

		});

		List<EObject> results = command.getResult();
		if (mrisOfTypes != null) {
			for (Iterator<EObject> it = results.iterator(); it.hasNext();) {
				if (!mrisOfTypes.contains(it.next().eClass())) {
					it.remove();
				}
			}
		}

		return results;

	}

	public EObject resolve(EObject oppositeEObject) {

		return EcoreUtil.resolve(oppositeEObject, this.rs);
	}
}