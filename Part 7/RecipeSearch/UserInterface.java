import java.nio.file.Paths;
import java.util.Scanner;
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
public class UserInterface {
    private Scanner scanner;
    private ArrayList<String> recipes;
    private ArrayList<Integer> startPoints;
    private ArrayList<Recipe> allRecipes;
    
    public UserInterface(Scanner scanner, ArrayList<String> recipes, ArrayList<Integer> startPoints){
        this.scanner = scanner;
        this.recipes = recipes;
        this.startPoints = startPoints;
        this.allRecipes = new ArrayList<>();
    }
    
    public void start(){
        System.out.println("File to read:");
        String answer = scanner.nextLine();
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - search recipes by name");
        System.out.println("find cooking time - find recipes by cooking time");
        System.out.println("find ingredient - searches recipes for ingredient");
        
        try (Scanner scan = new Scanner(Paths.get(answer))){
            int counter= 0;
            while (scan.hasNextLine()){
                String line = scan.nextLine();
                if (line.isEmpty()){
                    this.startPoints.add(counter);
                    continue;
                }
                counter++;
                this.recipes.add(line);
            }
            this.startPoints.add(counter);
            this.listRecipes();
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public void commands(){
        while (true){
            System.out.println("Enter command:");
            String command = this.scanner.nextLine();
            if (command.equals("list")){
                this.list();
            }
            if (command.equals("stop")){
                break;
            }
            if (command.equals("find name")){
                System.out.println("Searched word:");
                String word = this.scanner.nextLine();
                this.findbyName(word);
            }
            if (command.equals("find cooking time")){
                System.out.println("Max cooking time:");
                int time = Integer.valueOf(this.scanner.nextLine());
                this.findbyTime(time);
            }
            if (command.equals("find ingredient")){
                System.out.println("Ingredient:");
                String ing = scanner.nextLine();
                this.findbyIngredient(ing);
            }
        }
    }
    
    public void listRecipes(){
        int x = 0;
        int a = 0;
        for (int t = 0; t < this.startPoints.size(); t++){    
            Recipe recipe = new Recipe(this.recipes.get(x), Integer.valueOf(this.recipes.get(x+1)));
            for (int i = x+2; i < this.startPoints.get(a); i++){
                recipe.addIngredient(this.recipes.get(i));
            }
            x = this.startPoints.get(a);
            a++;
            this.allRecipes.add(recipe);
        } 
    }
    
    public void list(){
        for (Recipe recipe : this.allRecipes){
            System.out.println(recipe);
        }
    }
    
    public void findbyName(String word){
        System.out.println("Recipes:");
        for (Recipe recipe : this.allRecipes){
            if (recipe.getName().contains(word)){
                System.out.println(recipe);
            }
        }
    }
    
    public void findbyTime(Integer time){
        System.out.println("Recipes:");
        for (Recipe recipe : this.allRecipes){
            if (recipe.getCookingTime() <= time){
                System.out.println(recipe);
            }
        }
    }
    
    public void findbyIngredient(String ing){
        System.out.println("Recipes:");
        for (Recipe recipe : this.allRecipes){
            for (String ingredient : recipe.getIngredients()){
                if (ingredient.equals(ing)){
                    System.out.println(recipe);
                }
            }
        }
    }
}
