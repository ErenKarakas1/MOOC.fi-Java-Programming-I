
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Integer fNum = Integer.valueOf(scanner.nextLine());
        Integer sNum = Integer.valueOf(scanner.nextLine());
        
        System.out.println(Math.sqrt(fNum+sNum));
    }
}
