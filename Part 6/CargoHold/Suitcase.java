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

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    
    public Suitcase(int maxWeight){
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }
    
    public void addItem(Item item){
        if (this.totalWeight() + item.getWeight() <= this.maxWeight){
            this.items.add(item);
        }
    }
    
    public String toString(){
        if (this.items.size() > 1){
            return this.items.size() + " items (" + this.totalWeight() + " kg)";
        }
        if (this.items.size() == 1){
            return this.items.size() + " item (" + this.totalWeight() + " kg)";           
        } else {
            return "no items (0 kg)";
        }
    }
    
    public void printItems(){
        for (Item item : items){
            System.out.println(item);
        }
    }
    
    public int totalWeight(){
        int totalWeight = 0;
        
        for (Item iter : this.items){
            totalWeight += iter.getWeight();
        }
        
        return totalWeight;
    }
    
    public Item heaviestItem(){
        if (this.items.size() == 0){
            return null;
        }
        
        Item heaviestObject = this.items.get(0);
        
        for (Item iter : this.items){
            if (iter.getWeight() > heaviestObject.getWeight()){
                heaviestObject = iter;
            }
        }
        return heaviestObject;
    }
}