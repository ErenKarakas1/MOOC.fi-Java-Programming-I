
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
    private Grades points;
    private Grades passed;
    
    public UserInterface(Scanner scanner, Grades gradeList, Grades passedList){
        this.scanner = scanner;
        this.points = gradeList;
        this.passed = passedList;
    }
    
    public void start(){        
        System.out.println("Enter point totals, -1 stops:");
        while (true){
            int answer = Integer.valueOf(scanner.nextLine());
            if (answer == -1){
                break;
            }
            this.points.addPoint(answer);
            if (answer > 49){
                this.passed.addPoint(answer);
            }
        }
    }
    
    public void passPercentage(){
        System.out.println("Pass percentage: " + (double) 100 * this.passed.getArray().size() / 
                            this.points.getArray().size());
    }
    
    public void gradeDist(){
        for (int i = 5; i > -1; i--){
            System.out.print(i + ": ");
            for (int point : this.points.getArray()){
                if (this.points.toGrade(point) == i){
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}
