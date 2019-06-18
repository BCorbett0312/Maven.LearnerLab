package io.zipcoder.interfaces;

public class Instructors extends People{
    private static Instructors INSTANCE;

    private final String[] instructorNames = {"Dolio", "Kris", "Wilhelm", "Froiland"};

    public static Instructors getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Instructors();
        }
        return INSTANCE;
    }

    private Instructors(){
        for(int i = 1; i<= instructorNames.length; i++){
            Instructor addTeacher = new Instructor(i+100);
            addTeacher.setName(instructorNames[i]);
            add(addTeacher);
        }
    }

}
