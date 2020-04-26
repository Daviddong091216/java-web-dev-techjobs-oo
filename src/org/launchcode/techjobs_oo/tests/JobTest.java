package org.launchcode.techjobs_oo.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.assertEquals;

public class JobTest {

    Job test_job1;
    Job test_job2;
    Job test_job3;
    Job test_job4;
    Job test_job5;
    Job test_job6;
    Job test_job7;

    @Before
    public void createJobObject() {
        test_job1 = new Job();
        test_job2 = new Job();
        test_job3 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence")
        );
        test_job4 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence")
        );
        test_job5 = new Job("",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence")
        );
        test_job6 = new Job("Product tester",
                new Employer(""),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence")
        );
        test_job7 = new Job("",
                new Employer(""),
                new Location(""),
                new PositionType(""),
                new CoreCompetency("")
        );
    }


    @Test
    public void testSettingJobId() {
        assertEquals(1,test_job2.getId() - test_job1.getId(),0.001);
    }

    @Test
    public void testJobConstructorSetAllFields() {
        assertEquals(true,test_job3 instanceof Job);
    }

    @Test
    public void testJobsForEquality() {
        assertEquals(false,test_job3.equals(test_job4));
    }

    @Test
    public void testToStringEmpty() {
        assertEquals("",test_job1.toString());
    }

    @Test
    public void testToString1() {
        assertEquals("Data not available",test_job5.toString());
    }

    @Test
    public void testToString2() {
        assertEquals("Data not available",test_job6.toString());
    }

    @Test
    public void testToString3() {
        assertEquals("OOPS! This job does not seem to exist.",test_job7.toString());
    }





}
