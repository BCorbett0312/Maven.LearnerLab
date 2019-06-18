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
            addTeacher.setName(instructorNames[i-1]);
            add(addTeacher);
        }
    }

    @Override
    public Instructor[] toArray(){
        Instructor[] instructorArray = new Instructor[personList.size()];
        for(int i=0; i<instructorArray.length; i++){
            instructorArray[i] = (Instructor)personList.get(i);
        }
        return instructorArray;
    }

}
