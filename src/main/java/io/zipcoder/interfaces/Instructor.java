package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher {
    public Instructor(Long id, String name) {
        super(id, name);
    }

    public void teach(Learner learner, Double numberOfHours) {
        learner.learn(numberOfHours);
    }

    public void lecture(Learner[] learners, Double numberOfHours) {
        for (Learner learner: learners) {
            learner.learn(numberOfHours/learners.length);

        }
    }
}
