/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eren
 */
public class Bird {
    private String name;
    private String latinName;
    private int observed;
    
    public Bird(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
        this.observed = 0;
    }
    
    public void addObservation(){
        this.observed += 1;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getObservation(){
        return this.observed;
    }
    
    public String toString(){
        return this.name + " (" + this.latinName + "): " + this.observed + "observations";
    }
}
