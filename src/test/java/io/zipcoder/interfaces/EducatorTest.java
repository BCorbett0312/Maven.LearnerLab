package io.zipcoder.interfaces;

import org.junit.Test;

import static org.junit.Assert.*;

public class EducatorTest {




    @Test
    public void getTimeWorked() {

        Double expected= 0.0;

        assertEquals(expected, Educator.DOLIO.getTimeWorked());
    }

    @Test
    public void teach() {
        Students students = Students.getInstance();
        Learner thisStudent = students.personList.get(0);

        Educator.DOLIO.teach(thisStudent, 19.0);

        Double expected = 19.0;

        assertEquals(expected, thisStudent.getTotalStudyTime());

    }

    @Test
    public void lecture() {
        Students students = Students.getInstance();
        Learner[] learnerArray = students.toArray();

        Educator.DOLIO.lecture(learnerArray, 19.0);

        Double expected = 1.0;

        assertEquals(expected, learnerArray[1].getTotalStudyTime());



    }
}