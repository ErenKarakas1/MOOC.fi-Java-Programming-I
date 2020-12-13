
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Integer limit = Integer.valueOf(scanner.nextLine());
        
        int sum = 0;
        
        for(int i = 1; i <= limit; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
