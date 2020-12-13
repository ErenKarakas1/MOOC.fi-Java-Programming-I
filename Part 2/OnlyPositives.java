
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            System.out.println("Give a number:");
            Integer answer = Integer.valueOf(scanner.nextLine());
            
            if (answer < 0){
                System.out.println("Unsuitable number");
                continue;
            } else if (answer > 0) {
                System.out.println(answer * answer);
            } else {
                break;
            }
        }
    }
}