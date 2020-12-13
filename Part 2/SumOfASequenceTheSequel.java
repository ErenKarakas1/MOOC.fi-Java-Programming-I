
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("First number?");
        Integer first = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number?");
        Integer last = Integer.valueOf(scanner.nextLine());
        
        int sum = 0;
     
        for(; first <= last; first++){
            sum = sum + first;
        }
        System.out.println(sum);
    }
}
