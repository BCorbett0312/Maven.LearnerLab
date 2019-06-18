package io.zipcoder.interfaces;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable<Person> {
    List<Person> personList = new ArrayList<Person>();

    public void People(){
        personList = new ArrayList<Person>();
    }



    public void add(Person person){
        personList.add(person);
    }

    public Person findById(long id){
        for(Person person: personList){
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


    public Iterator iterator() {


        return personList.iterator();
    }
}
