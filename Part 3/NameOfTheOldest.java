
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Integer biggestAge = 0;
        int count = 0;
        String person = "";
        
        while (true){
            String answer = scanner.nextLine();
            
            if (answer.equals("")){
                break;
            }
            
            String[] words = answer.split(",");
            if (biggestAge < Integer.valueOf(words[1])){
                biggestAge = Integer.valueOf(words[1]);
                person = words[0];
            }
        }
        System.out.println("Name of the oldest: " + person);
    }
}
