package io.zipcoder.interfaces;

public final class Students extends People {

    private static Students INSTANCE;

    private final String[] studentNames = {"Ben C", "Dashya", "Bob", " Stefun", "Joann", "Sputnika", "Edward",
    "Alex I", "Alex B", "Angelica", "Robert", "Andrew", "Henry", "Erick", "Reese", "Ajulu", "Ben R", "Justin", "Conner"};

    public static Students getInstance (){
        if(INSTANCE == null){
            INSTANCE = new Students();
        }
        return INSTANCE;
    }

    private Students() {
        for(int i = 0; i < studentNames.length; i++){
            Student addStudent = new Student(i+1);
            addStudent.setName(studentNames[i]);
            add(addStudent);
        }

    }

    @Override
    public Student[] toArray(){
        Student[] studentArray = new Student[personList.size()];
        for(int i = 0; i<studentArray.length; i++){
            studentArray[i] = (Student) personList.get(i);
        }
        return studentArray;
    }


}
