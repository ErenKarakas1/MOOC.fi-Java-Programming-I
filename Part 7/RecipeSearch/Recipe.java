import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eren
 */
public class Recipe {
    private String name;
    private Integer cookingTime;
    private ArrayList<String> ingredients;
    
    public Recipe(String name, Integer cookingTime){
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = new ArrayList<>();
    }
    
    public String getName(){
        return this.name;
    }
    
    public Integer getCookingTime(){
        return this.cookingTime;
    }
    
    public void addIngredient(String ingredient){
        this.ingredients.add(ingredient);
    }
    
    public ArrayList<String> getIngredients(){
        return this.ingredients;
    }
    
    public String toString(){
        return this.name + ", cooking time: " + this.cookingTime;
    }
}
