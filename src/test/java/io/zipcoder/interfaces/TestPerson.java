package io.zipcoder.interfaces;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestPerson {
    @Test
    public void testConstructor(){
        Person person = new Person(100L, "Ben");

        String expected = "Ben";



        assertEquals(expected, person.getName());
        assertEquals(100L, person.getId());

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
