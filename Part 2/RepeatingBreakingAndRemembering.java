
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers:");
        Integer number = Integer.valueOf(scanner.nextLine());
        
        int evenCount = 0;
        int oddCount = 0;
        int counter = 1;
        
        if (number % 2 == 0){
            evenCount ++;
        } else {
            oddCount ++;
        }
            
        int sum = number;
        while (number != -1){
            number = Integer.valueOf(scanner.nextLine());
            
            if (number == -1){
                break;
            }
            
            if (number % 2 == 0){
                evenCount ++;
            } else {
                oddCount ++;
            }
            
            sum = sum + number;
            counter ++;
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + counter);
        System.out.println("Average: " + (double) sum / counter);
        System.out.println("Even: " + evenCount);
        System.out.println("Odd: " + oddCount);
    }
}
