package io.zipcoder.interfaces;

import java.util.Map;
import java.util.TreeMap;

public class ZipCodeWilmington {
    private Students students;
    private Instructors instructors;
    private static ZipCodeWilmington INSTANCE;

    private ZipCodeWilmington(){
        students = Students.getInstance();
        instructors = Instructors.getInstance();
    }

    public static ZipCodeWilmington getInstance(){
        if(INSTANCE == null){
            INSTANCE = new ZipCodeWilmington();
        }
        return INSTANCE;
    }


    public void hostLecture(long id, Double numberofHours){
        Instructor instructingTeacher = null;
        Instructor[] instructorArray = instructors.toArray();
        for (Instructor instructor: instructorArray) {
            if(instructor.getId() == id){
                instructingTeacher = instructor;
            }
        }

        if(instructingTeacher!=null){
            instructingTeacher.lecture(students.toArray(), numberofHours);
        }
    }



    public void hostLecture(Teacher teacher, Double numberOfHours){
        Instructor instructingTeacher = null;
        Instructor[] instructorArray = instructors.toArray();
        for(Instructor instructor: instructorArray){
            if(instructor.getName().equals(teacher)){
                instructingTeacher = instructor;
            }
        }
        if(instructingTeacher!=null){
            instructingTeacher.lecture(students.toArray(), numberOfHours);
        }

    }


    public Students getStudents() {
        return students;
    }


    public Instructors getInstructors() {
        return instructors;
    }


}
