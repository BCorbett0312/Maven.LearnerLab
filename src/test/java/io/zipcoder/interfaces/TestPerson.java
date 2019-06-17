package io.zipcoder.interfaces;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestPerson {
    @Test
    public void testConstructor(){
        Person person = new Person(100L, "Ben");

        String expected = "Ben";
        Long expectedNum = 100L;


        assertEquals(expected, person.getName());
        assertEquals(expectedNum, person.getId());

    }

    @Test
    public void testSetName(){
        Person person = new Person(100L, null);

        assertNull(person.getName());

        person.setName("Carl");

        String expected = "Carl";

        assertEquals(expected, person.getName());

    }

}
