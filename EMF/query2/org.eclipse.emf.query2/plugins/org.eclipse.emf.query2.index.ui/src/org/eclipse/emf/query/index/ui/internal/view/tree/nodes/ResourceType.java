package org.eclipse.emf.query.index.ui.internal.view.tree.nodes;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.query.index.ui.internal.properties.ResourceTypeIndexProperties;
import org.eclipse.ui.views.properties.IPropertySource;

/**
 * @author Animesh Kumar, SAP Labs India Pvt. Ltd.
 * 
 */
public class ResourceType {

	private Object elementType;
	private List<IndexTypeURI> resourceDescriptors;

	public ResourceType(Object elementType) {
		super();
		this.elementType = elementType;
		this.resourceDescriptors = new ArrayList<IndexTypeURI>();
	}

	public Object getElementType() {
		return elementType;
	}

	public List<IndexTypeURI> getResourceDescriptors() {
		return resourceDescriptors;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((elementType == null) ? 0 : elementType.hashCode());
		return result;
	}

	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ResourceType other = (ResourceType) obj;
		if (elementType == null) {
			if (other.elementType != null)
				return false;
		} else if (!elementType.equals(other.elementType))
			return false;
		return true;
	}

	
}