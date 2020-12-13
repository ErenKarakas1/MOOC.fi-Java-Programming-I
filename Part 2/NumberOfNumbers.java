
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Integer counter = 0;
        
        while (true){
            System.out.println("Give a number:");
            Integer answer = Integer.valueOf(scanner.nextLine());
            
            if (answer != 0){
                counter = counter + 1;
                continue;
            }
            System.out.println("Number of numbers: " + counter);
            break;
        }
    }
}