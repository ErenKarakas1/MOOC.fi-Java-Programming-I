import java.util.ArrayList;
import java.util.Scanner;

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
    private ArrayList<Bird> birds;
    
    public UserInterface(Scanner scanner, ArrayList<Bird> birds){
        this.scanner = scanner;
        this.birds = birds;
    }
    
    public void start(){
        while (true){
            System.out.println("?");
            String answer = this.scanner.nextLine();
            if (answer.equals("Add")){
                this.addBird();
            }
            if (answer.equals("Observation")){
                this.addObs();
            }
            if (answer.equals("All")){
                this.printBirds();
            }
            if (answer.equals("One")){
                String name = scanner.nextLine();
                this.printOne(name);
            }
            if (answer.equals("Quit")){
                break;
            }
        }
    }
    
    public void addBird(){
        System.out.println("Name:");
        String name = this.scanner.nextLine();
        System.out.println("Name in Latin:");
        String latinName = this.scanner.nextLine();
        
        Bird bird = new Bird(name, latinName);
        this.birds.add(bird);
    }
    
    public void addObs(){
        System.out.println("Bird?");
        String name = this.scanner.nextLine();
        
        for (int i = 0; i < this.birds.size(); i++){
            if (this.birds.get(i).getName().equals(name)){
                this.birds.get(i).addObservation();
                return;
            }
        }
        System.out.println("Not a bird!");
    }
    
    public void printBirds(){
        for (Bird bird : this.birds){
            System.out.println(bird);
        }
    }
    
    public void printOne(String name){
        for (Bird bird : this.birds){
            if (bird.getName().equals(name)){
                System.out.println(bird);
            }
        }
    }
}
