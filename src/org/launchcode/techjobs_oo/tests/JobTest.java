package org.launchcode.techjobs_oo.tests;

import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;


public class JobTest {
    Job jobOne = new Job();
    Job jobTwo = new Job();
    @Test
    public void testSettingJobId() {
        // create the object for the class
        // call the method you want to test
        // assertTrue, assertFalse, assertEquals

//        System.out.println(jobOne.getId()); 1
//        System.out.println(jobTwo.getId()); 2
   //assertEquals(jobOne!=jobTwo););
        //assertTrue(jobOne.getId()!= jobTwo.getId());
        //assertEquals(jobTwo.getId(),jobOne.getId()+1);
        //assertEquals(jobOne.getId(), jobTwo.getId()-1 );
        assertEquals(1,jobTwo.getId() - jobOne.getId());

//        assertEquals(jobOne == jobTwo);

    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job jobOne = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(jobOne.getName(), "Product tester");
        assertTrue(jobOne.getEmployer() instanceof Employer);
        assertTrue(jobOne.getLocation() instanceof  Location);
        assertTrue(jobOne.getPositionType() instanceof PositionType);
        assertTrue(jobOne.getCoreCompetency() instanceof  CoreCompetency);
    }
    @Test
    public void testJobsForEquality() {
        Job jobTwo = new Job(jobOne.getName(), jobOne.getEmployer(), jobOne.getLocation(), jobOne.getPositionType(), jobOne.getCoreCompetency());
        assertNotEquals(jobOne, jobTwo);
    }
}
