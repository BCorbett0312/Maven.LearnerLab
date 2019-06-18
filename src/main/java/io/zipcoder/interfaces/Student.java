package io.zipcoder.interfaces;

public class Student extends Person implements Learner {
    private Double totalStudyTime;


    public Student(long id, String name) {
        super(id, name);
        totalStudyTime = 0.0;
    }

    public Student(long id){
        super(id);
        totalStudyTime = 0.0;
    }

    public void learn(Double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    public Double getTotalStudyTime() {
        return this.totalStudyTime;
    }


}
