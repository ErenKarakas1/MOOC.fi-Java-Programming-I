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
    private Scanner scanner;
    private TodoList todoList;
    
    public UserInterface(TodoList todoList, Scanner scanner){
        this.scanner = scanner;
        this.todoList = todoList;
    }
    
    public void start(){
        while (true){
            System.out.println("Command: ");
            String answer = scanner.nextLine();
            
            if (answer.equals("stop")){
                break;
            }
            if (answer.equals("add")){
                String task = scanner.nextLine();
                this.todoList.add(task);
            }
            if (answer.equals("list")){
                this.todoList.print();
            }
            if (answer.equals("remove")){
                System.out.println("Which one is removed?");
                int number = Integer.valueOf(scanner.nextLine());
                this.todoList.remove(number);
            }
        }
    }
}
