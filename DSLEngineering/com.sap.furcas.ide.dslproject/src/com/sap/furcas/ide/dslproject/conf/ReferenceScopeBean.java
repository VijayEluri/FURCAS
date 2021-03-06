/**
 * 
 */
package com.sap.furcas.ide.dslproject.conf;

import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;

/**
 *
 */
public class ReferenceScopeBean {

    private final ResourceSet resourceSet;
    private final Set<URI> referenceScope;

    public ReferenceScopeBean(ResourceSet resourceSet, Set<URI> referenceURIs) {
        super();
        this.resourceSet = resourceSet;
        this.referenceScope = referenceURIs;
    }
    public ResourceSet getResourceSet() {
        return resourceSet;
    }
    public Set<URI> getReferenceScope() {
        return referenceScope;
    }
    
    
}
