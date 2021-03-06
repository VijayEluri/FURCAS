/**
 * 
 */
package com.sap.furcas.metamodel.FURCAS.TCS.stubs;

import org.eclipse.emf.ecore.EClass;

import com.sap.furcas.metamodel.FURCAS.TCS.Sequence;
import com.sap.furcas.metamodel.FURCAS.TCS.SequenceElement;
import com.sap.furcas.metamodel.FURCAS.TCS.TCSPackage;
import com.sap.furcas.metamodel.FURCAS.TCS.Template;

/**
 * Stub for the superClass of all concrete SequenceElements. Is abstract in the real metamodel.
 */
public class SequenceElementStub extends LocatedElementStub implements SequenceElement {

    
    
    private Sequence elementSequence;

    @Override
    public Sequence getElementSequence() {
        return elementSequence;
    }

    @Override
    public void setElementSequence(Sequence elementSequence) {
        this.elementSequence = elementSequence;
    }

    @Override
    public Template getParentTemplate() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void setParentTemplate(Template newValue) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public EClass eClass() {
        return TCSPackage.eINSTANCE.getSequenceElement();
    }

}
