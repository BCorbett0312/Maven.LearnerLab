package io.zipcoder.interfaces;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentsTest {
    private final String[] studentNames = {"Ben C", "Dashya", "Bob", " Stefun", "Joann", "Sputnika", "Edward",
            "Alex I", "Alex B", "Angelica", "Robert", "Andrew", "Henry", "Erick", "Reese", "Ajulu", "Ben R", "Justin", "Conner"};
    @Test
    public void getInstance() {
        Students students = Students.getInstance();
        Boolean eachPerson = true;

        for (int i = 0; i < studentNames.length; i++){
            if(!students.findById(i+1).getName().equals(studentNames[i])){
                eachPerson = false;
                break;
            }
        }
        assertTrue(eachPerson);

    }
}