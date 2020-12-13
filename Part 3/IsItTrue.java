
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a string: ");
        String value = scanner.nextLine();
        
        if (value.equals("true")){
            System.out.println("You got it right!");
        } else {
            System.out.println("Try again!");
        }
    }
}
