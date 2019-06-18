package io.zipcoder.interfaces;

import org.junit.Test;

import static org.junit.Assert.*;

public class ZipCodeWilmingtonTest {

    ZipCodeWilmington cohort = null;


    @Test
    public void hostLecture() {

        ZipCodeWilmington cohort = ZipCodeWilmington.getInstance();
        Instructor[] instructors = cohort.getInstructors().toArray();
        Instructor instructor = instructors[0];
        Student[] students = cohort.getStudents().toArray();
        Double[] studyTimes = new Double[cohort.getStudents().toArray().length];

        for (int i = 0; i< studyTimes.length; i++){
            studyTimes[i] = students[i].getTotalStudyTime();
        }

        cohort.hostLecture(instructor, 38.0);

        Boolean testCriteria = true;

        for(int i = 0; i< studyTimes.length; i++){
            if(students[i].getTotalStudyTime() != studyTimes[i]){
                testCriteria = false;
            }
        }

        assertTrue(testCriteria);
    }

    @Test
    public void hostLecture1() {

        ZipCodeWilmington cohort = ZipCodeWilmington.getInstance();
        Instructor[] instructors = cohort.getInstructors().toArray();
        Instructor instructor = instructors[0];
        Student[] students = cohort.getStudents().toArray();
        Double[] studyTimes = new Double[cohort.getStudents().toArray().length];

        for (int i = 0; i< studyTimes.length; i++){
            studyTimes[i] = students[i].getTotalStudyTime();
        }

        cohort.hostLecture(100, 38.0);

        Boolean testCriteria = true;

        for(int i = 0; i< studyTimes.length; i++){
            if(students[i].getTotalStudyTime() != studyTimes[i]){
                testCriteria = false;
            }
        }

        assertTrue(testCriteria);

    }
}