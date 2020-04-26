package org.launchcode.techjobs_oo.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.assertEquals;

public class JobTest {
    Job test_job;
    Job test_job1;
    Job test_job2;
    Job test_job3;


    @Before
    public void createJobObject() {
        test_job = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence")
        );
        test_job1 = new Job();
        test_job2 = new Job();
        test_job3 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence")
        );
    }


    @Test
    public void testSettingJobId() {
        assertEquals(1,test_job2.getId() - test_job1.getId(),0.001);
    }

    @Test
    public void testJobConstructorSetAllFields() {
        assertEquals(true,test_job instanceof Job);
    }

    @Test
    public void testJobsForEquality() {
        assertEquals(false,test_job.equals(test_job3));
    }




}
