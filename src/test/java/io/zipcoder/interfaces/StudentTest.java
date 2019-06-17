package io.zipcoder.interfaces;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testImplementation(){
        Student testStudent = new Student(1L, "Chuck");

        assertTrue(testStudent instanceof Learner);
    }

    @Test
    public void testInheritance(){
        Student testStudent = new Student(2l, "bob");

        assertTrue(testStudent instanceof Person);
    }


    @Test
    public void learn() {
        Student testStudent = new Student(2l, "bob");

        Double expected = 0.0;

        assertEquals(expected, testStudent.getTotalStudyTime());

        testStudent.learn(5.0);

        Double newExpected = 5.0;

        assertEquals(newExpected, testStudent.getTotalStudyTime());



    }

    @Test
    public void getTotalStudyTime() {
        Student testStudent = new Student(2l, "bob");

        Double expected = 0.0;

        assertEquals(expected, testStudent.getTotalStudyTime());


    }



}