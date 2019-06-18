package io.zipcoder.interfaces;



import java.util.ArrayList;


public abstract class People<E extends Person> {
    ArrayList<E> personList;

    public People(ArrayList<E> personList){
        this.personList = personList;
    }

    public People(){
        this(new ArrayList<E>());
    }



    public void add(E person){
        personList.add(person);
    }

    public Person findById(long id){
        for(E person: personList){
            if(person.getId() == id){
                return person;
            }
        }
        return null;
    }

    public Boolean contains(Person person){
        return personList.contains(person);
    }

    public Boolean remove(Person person){
        return personList.remove(person);
    }

    public Boolean remove(long id){
        for(Person person: personList){
            if(person.getId() == id){
                remove(person);
                return true;
            }
        }
        return false;
    }

    public void removeAll(){
        personList.clear();
    }

    public Integer count(){
        return personList.size();
    }

    public Person[] toArray(){
        Person[] personArray = new Person[personList.size()];
        for(int i = 0; i < personArray.length; i++){
            personArray[i] = personList.get(i);
        }
        return personArray;


    }


}
