
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Where to?");
        Integer end = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        Integer start = Integer.valueOf(scanner.nextLine());
        
        for (;start <= end; start++){
            System.out.println(start);
        }
    }
}
