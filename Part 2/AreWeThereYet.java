
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            System.out.println("Give a number:");
            Integer answer = Integer.valueOf(scanner.nextLine());
            
            if (answer == 4){
                break;
            }
        }
    }
}