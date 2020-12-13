
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        for (Integer limit = Integer.valueOf(scanner.nextLine()); limit < 101; limit++){
            System.out.println(limit);
        }
    }
}
