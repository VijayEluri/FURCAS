/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hpi.sam.bp2009.solution.eventManager.filters;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

public class NewValueClassFilterIncludingSubclasses extends ClassFilterIncludingSubclasses {

    public NewValueClassFilterIncludingSubclasses(EClass subClass, boolean negated) {
        super(subClass, negated);
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        NewValueClassFilterIncludingSubclasses other = (NewValueClassFilterIncludingSubclasses) obj;
        return super.equals(other);
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        return 37 * super.hashCode();
    }

    public boolean matchesFor(Notification event) {
        if (event.getNewValue() instanceof EObject) {
            return matches(((EObject) event.getNewValue()).eClass());
        }
        if (event.getNewValue() instanceof EList<?>) {
            for (Object o : (EList<?>) event.getNewValue()) {
                if (o instanceof EObject && matches(((EObject) o).eClass())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public String toString() {
        if (getWantedClass() != null)
            return "new value filter incl subs for new " + getWantedClass().toString();
        return "new value filter incl subs for undefined new";
    }

    @Override
    public NewValueClassFilterIncludingSubclasses clone() {
        return new NewValueClassFilterIncludingSubclasses(getWantedClass(), isNegated());
    }

} // NewValueClassFilterImpl