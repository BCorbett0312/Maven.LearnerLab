package io.zipcoder.interfaces;

import org.junit.Test;

import static org.junit.Assert.*;

public class PeopleTest {

    @Test
    public void add() {
        People peopleList = new People();
        Person person1 = new Person(1L, "Ben");
        Person person2 = new Person(2L, "Ed");

        peopleList.add(person1);


        assertTrue(peopleList.contains(person1));
        assertFalse(peopleList.contains(person2));

    }

    @Test
    public void findById() {
        People peopleList = new People();
        Person person1 = new Person(1L, "Ben");
        Person person2 = new Person(2L, "Ed");

        peopleList.add(person1);
        peopleList.add(person2);

        Person expected = person1;

        assertEquals(expected, peopleList.findById(1L));

    }

    @Test
    public void remove() {
        People peopleList = new People();
        Person person1 = new Person(1L, "Ben");
        Person person2 = new Person(2L, "Ed");

        peopleList.add(person1);
        peopleList.add(person2);

        assertTrue(peopleList.remove(person1));
    }

    @Test
    public void remove1() {
        People peopleList = new People();
        Person person1 = new Person(1L, "Ben");
        Person person2 = new Person(2L, "Ed");

        peopleList.add(person1);
        peopleList.add(person2);

        assertTrue(peopleList.remove(1L));
    }
}