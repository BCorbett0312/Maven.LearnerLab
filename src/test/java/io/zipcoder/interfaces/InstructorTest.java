package io.zipcoder.interfaces;

import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorTest {

    @Test
    public void testImplementation(){
        Instructor testInstructor = new Instructor(1L, "Clyde");

        assertTrue(testInstructor instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        Instructor testInstructor = new Instructor(4L, "Earl");

        assertTrue(testInstructor instanceof Person);

    }



    @Test
    public void teach() {
        Instructor testInstructor = new Instructor(4L, "Earl");
        Student testStudent = new Student(99L, "Emily");
        testInstructor.teach(testStudent, 55.0);

        Double expected = 55.0;

        assertEquals(expected, testStudent.getTotalStudyTime());
    }

    @Test
    public void lecture() {
        Instructor testInstructor = new Instructor(4L, "Earl");
        Learner[] myClass = new Learner[3];
        Student testStudent = new Student(99L, "Emily");
        Student testStudent2 = new Student(1L, "Bob");
        Student testStudent3 = new Student(9L, "Harley");
        myClass[0] = testStudent;
        myClass[1] = testStudent2;
        myClass[2] = testStudent3;

        testInstructor.lecture(myClass, 33.0);

        Double expected = 11.0;

        assertEquals(expected, testStudent.getTotalStudyTime());
        assertEquals(expected, testStudent2.getTotalStudyTime());
        assertEquals(expected, testStudent3.getTotalStudyTime());








    }
}