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

public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int maxWeight;
    
    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase){
        if (this.totalWeight() + suitcase.totalWeight() <= this.maxWeight){
            this.suitcases.add(suitcase);
        }
    }
    public int totalWeight(){
        int totalWeight = 0;
        
        for (Suitcase iter : this.suitcases){
            totalWeight += iter.totalWeight();
        }
        return totalWeight;
    }
    
    public String toString(){
        return this.suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
    }
    
    public void printItems(){
        for (Suitcase suitcase : this.suitcases){
            suitcase.printItems();
        }
    }
}
