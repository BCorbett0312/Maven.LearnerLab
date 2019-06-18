package io.zipcoder.interfaces;

import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorsTest {

    private final String[] instructorNames = {"Dolio", "Kris", "Wilhelm", "Froiland"};

    @Test
    public void getInstance() {
        Instructors instructors = Instructors.getInstance();
        Boolean eachPerson = true;

        for(int i = 1; i<= instructorNames.length; i++){
            if(!instructors.findById(i+100).getName().equals(instructorNames[i-1])){
                eachPerson = false;
                break;
            }
        }
        assertTrue(eachPerson);
    }
}