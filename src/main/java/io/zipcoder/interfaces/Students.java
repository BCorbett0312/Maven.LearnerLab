package io.zipcoder.interfaces;

public final class Students extends People {

    private static Students instance;

    private final String[] studentNames = {"Ben", "Dashya", "Bob", " Stefun", "Joann", "Sputnika", "Edward",
    "Alex I", "Alex B", "Angelica", "Robert", "Andrew", "Henry", "Erick"};

    public static Students getInstance (){


        return instance;}

    private Students() {
        for(int i = 0; i < 14; i++){
            Student addStudent = new Student(i);
            addStudent.setName(studentNames[i]);
            add(addStudent);
        }

    }
}
