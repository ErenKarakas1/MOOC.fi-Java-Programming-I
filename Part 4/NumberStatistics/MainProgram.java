
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics stats1 = new Statistics();
        Statistics stats2 = new Statistics();
        Statistics stats3 = new Statistics();
        
        System.out.println("Enter numbers:");
        while (true){
            int value = Integer.valueOf(scanner.nextLine());
            if (value != -1){
                stats1.addNumber(value);
                if (value % 2 == 0){
                    stats2.addNumber(value);
                } else {
                    stats3.addNumber(value);
                } 
            } else {
                break;
            }
        }
        
        System.out.println("Sum: " + stats1.sum());
        System.out.println("Sum of even numbers: " + stats2.sum());
        System.out.println("Sum of odd numbers: " + stats3.sum());
    }
}
