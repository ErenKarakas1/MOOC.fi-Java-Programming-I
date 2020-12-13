
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        while (true){
            String answer = scanner.nextLine();
            
            if (answer.equals("")){
                break;
            }
            String[] words = answer.split(" ");

            for (int i = 0; i < words.length; i++){
                System.out.println(words[i]);
            }
        }
    }
}
