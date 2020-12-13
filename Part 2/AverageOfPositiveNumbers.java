
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int counter = 0;
        
        while (true){
            System.out.println("Give a number:");
            Integer answer = Integer.valueOf(scanner.nextLine());          
            if (answer > 0){
                sum = sum + answer;
                counter = counter + 1;
            }
 
            if (answer == 0){
                if (sum == 0){
                    System.out.println("Cannot calculate the average");
                } else {
                    System.out.println((double) sum / counter);
                }
                break;
            }
        }
    }
}