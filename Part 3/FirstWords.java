
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            String answer = scanner.nextLine();
            
            if (answer.equals("")){
                break;
            }
            String[] words = answer.split(" ");

            System.out.println(words[0]);
        }
    }
}
