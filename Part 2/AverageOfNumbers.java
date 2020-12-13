
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int counter = 0;
        
        while (true){
            System.out.println("Give a number:");
            Integer answer = Integer.valueOf(scanner.nextLine());          
            sum = sum + answer;
            counter = counter + 1;
 
            if (answer == 0){
                counter = counter - 1;
                System.out.println("Average of the numbers: " + (double) sum / counter);
                break;
            }
        }
    }
}