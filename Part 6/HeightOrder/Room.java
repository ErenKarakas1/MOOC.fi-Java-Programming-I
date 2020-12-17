/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eren
 */
import java.util.ArrayList;

public class Room {
    private ArrayList<Person> people;
    
    public Room(){
        this.people = new ArrayList<>();
    }
    
    public void add(Person person){
        this.people.add(person);
    }
    
    public boolean isEmpty(){
        return (this.people.size() == 0);
    }
    
    public ArrayList<Person> getPersons(){
        return this.people;
    }
    
    public Person shortest(){
        if (this.isEmpty()){
            return null;
        }
        
        int shortest = this.people.get(0).getHeight();
        Person shortestPerson = this.people.get(0);
        
        for (Person person : people){
            if (person.getHeight() < shortest){
                shortest = person.getHeight();
                shortestPerson = person;
            }
        }
        return shortestPerson;
    }
    
    public Person take(){
        if (this.isEmpty()){
            return null;
        }
        int index =  this.people.indexOf(this.shortest());
        return this.people.remove(index);
    }
}
