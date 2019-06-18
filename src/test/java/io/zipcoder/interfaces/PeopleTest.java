package io.zipcoder.interfaces;

import org.junit.Test;

import static org.junit.Assert.*;

public class PeopleTest {
    private final String[] studentNames = {"Ben C", "Dashya", "Bob", " Stefun", "Joann", "Sputnika", "Edward",
            "Alex I", "Alex B", "Angelica", "Robert", "Andrew", "Henry", "Erick", "Reese", "Ajulu", "Ben R", "Justin", "Conner"};



    @Test
    public void add() {
        Students students = Students.getInstance();
        Student person1 = new Student(1L, "Ben");
        Student person2 = new Student(2L, "Ed");
        Student person3 = new Student(3L, "Stefun");
        students.add(person1);
        students.add(person2);

        assertTrue(students.contains(person1));
        assertTrue(students.contains(person2));
        assertFalse(students.contains(person3));




    }

    @Test
    public void findById() {
        Students students = Students.getInstance();
        Student person1 = new Student(66L, "Ben");
        Student person2 = new Student(2L, "Ed");

        students.add(person1);
        students.add(person2);

        Student expected = person1;

        assertEquals(expected, students.findById(66L));

    }

    @Test
    public void remove() {
        Students students = Students.getInstance();
        Student person1 = new Student(1L, "Ben");
        Student person2 = new Student(2L, "Ed");

        students.add(person1);
        students.add(person2);

        assertTrue(students.remove(person1));
    }

    @Test
    public void remove1() {
        Students students = Students.getInstance();
        Student person1 = new Student(1L, "Ben");
        Student person2 = new Student(2L, "Ed");

        students.add(person1);
        students.add(person2);

        assertTrue(students.remove(1L));
    }
}