
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a string:");
        String givenString = scan.nextLine();
        
        System.out.println("Give an integer:");
        Integer givenInt = Integer.valueOf(scan.nextLine());
        
        System.out.println("Give a double:");
        Double givenDouble = Double.valueOf(scan.nextLine());
        
        System.out.println("Give a boolean:");
        Boolean givenBool = Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string " + givenString);
        System.out.println("You gave the integer " + givenInt);
        System.out.println("You gave the double " + givenDouble);
        System.out.println("You gave the boolean " + givenBool);
        
        
    }
}
