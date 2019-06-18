package io.zipcoder.interfaces;

public enum Educator implements Teacher {
    DOLIO, KRIS, WILHELM, FROILAND;

    public Double timeWorked;
    private final Instructor instructor;

    Educator(){
        this.instructor = new Instructor(this.ordinal());
        instructor.setName(this.name());
        timeWorked = 0.0;
    }

    public Double getTimeWorked(){
        return timeWorked;
    }


    public void teach(Learner learner, Double numberOfHours) {
        instructor.teach(learner, numberOfHours);
        timeWorked+=numberOfHours;
    }

    public void lecture(Learner[] learners, Double numberOfHours) {
        instructor.lecture(learners, numberOfHours);
        timeWorked += numberOfHours;
    }
}
