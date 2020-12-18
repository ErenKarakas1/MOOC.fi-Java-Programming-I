/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eren
 */
import java.util.Scanner;

public class UserInterface {
    private JokeManager jokeManager;
    private Scanner scanner;
    
    public UserInterface(JokeManager jokeManager, Scanner scanner){
        this.jokeManager = jokeManager;
        this.scanner = scanner;
    }
    
    public void start(){
        while (true){
            System.out.println("Commands: ");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            
            String answer = scanner.nextLine();
            
            if (answer.equals("1")){
                this.addAJoke();
                continue;
            }
            if (answer.equals("2")){
                this.drawAJoke();
                continue;
            }
            if (answer.equals("3")){
                this.listJokes();
                continue;
            }
            if (answer.equals("X")){
                break;
            }
        }
    }
    
    public void addAJoke(){
        System.out.println("Write the joke to be added: ");
        String joke = scanner.nextLine();
        this.jokeManager.addJoke(joke);
    }
    
    public void drawAJoke(){
        System.out.println("Drawing a joke: ");
        System.out.println(this.jokeManager.drawJoke());
    }
    
    public void listJokes(){
        System.out.println("Printing the jokes.");
        this.jokeManager.printJokes();
    }
}
