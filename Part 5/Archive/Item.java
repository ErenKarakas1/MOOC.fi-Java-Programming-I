/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eren
 */
public class Item {
    private String identifier;
    private String name;
    
    public Item(String identifier, String name){
        this.identifier = identifier;
        this.name = name;
    }
    
    public boolean equals(Object compared){
        if (compared == this){
            return true;
        }
        
        if (!(compared instanceof Item)){
            return false;
        }
        
        Item comparedItem = (Item) compared;
        
        return (this.identifier.equals(comparedItem.identifier));
    }
    
    public String toString(){
        return this.identifier + ": " + this.name;
    }
    
}
