/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hpi.sam.bp2009.solution.eventManager.tests;

import junit.textui.TestRunner;

import org.eclipse.emf.common.notify.Notification;
import org.junit.Test;

import company.CompanyFactory;
import company.Employee;

import de.hpi.sam.bp2009.solution.eventManager.EventManagerFactory;
import de.hpi.sam.bp2009.solution.eventManager.filters.OldValueClassFilterIncludingSubclasses;
import de.hpi.sam.bp2009.solution.impactAnalyzer.benchmark.preparation.notifications.NotificationHelper;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Old Value Class Filter</b></em>'. <!-- end-user-doc -->
 */
public class OldValueClassIncludingSubclassesFilterTest extends EventFilterTest {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     */
    public static void main(String[] args) {
        TestRunner.run(OldValueClassIncludingSubclassesFilterTest.class);
    }

    /**
     * Constructs a new Old Value Class Filter test case with the given name. <!-- begin-user-doc --> <!-- end-user-doc -->
     */
    public OldValueClassIncludingSubclassesFilterTest() {
        super();
    }

    private Notification noti;

    /**
     * Returns the fixture for this Old Value Class Filter test case. <!-- begin-user-doc --> <!-- end-user-doc -->
     */
    @Override
    protected OldValueClassFilterIncludingSubclasses getFixture() {
        return (OldValueClassFilterIncludingSubclasses) fixture;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see junit.framework.TestCase#setUp()
     */
    @Override
    public void setUp() {
        super.setUp();
        this.createInstances(1, 5, 1);
        setFixture(EventManagerFactory.eINSTANCE.createOldValueClassFilterIncludingSubclasses(employee));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see junit.framework.TestCase#tearDown()
     */
    @Override
    public void tearDown() {
        setFixture(null);
        super.tearDown();
    }

    @Override
    public void testMatchesFor__Notification() {
        Employee boss = CompanyFactory.eINSTANCE.createEmployee();
        this.aDepartment.setBoss(boss);
        noti = NotificationHelper.createReferenceRemoveNotification(this.aDepartment, this.bossRef, boss);
        assertTrue("No Match to Notification", getFixture().matchesFor(noti));
        noti = NotificationHelper.createReferenceAddNotification(this.aDepartment, this.bossRef, boss);
        assertFalse(getFixture().matchesFor(noti));
        this.aDivision.getDepartment().clear();
        noti = NotificationHelper.createReferenceAddNotification(this.aDivision, this.departmentRef,
                CompanyFactory.eINSTANCE.createDepartment());
        assertFalse(getFixture().matchesFor(noti));
    }

    @Test
    public void testMatchesFor__NotificationIncludingSubclasses() {
        Employee boss = CompanyFactory.eINSTANCE.createFreelance();
        this.aDepartment.setBoss(boss);
        noti = NotificationHelper.createReferenceRemoveNotification(this.aDepartment, this.bossRef, boss);
        assertTrue("No Match to Notification", getFixture().matchesFor(noti));
        noti = NotificationHelper.createReferenceAddNotification(this.aDepartment, this.bossRef, boss);
        assertFalse(getFixture().matchesFor(noti));
        this.aDivision.getDepartment().clear();
        noti = NotificationHelper.createReferenceAddNotification(this.aDivision, this.departmentRef,
                CompanyFactory.eINSTANCE.createDepartment());
        assertFalse(getFixture().matchesFor(noti));
    }

} // OldValueClassFilterTest