
import java.util.Scanner;

public class AgeOfTheOldest {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer biggestAge = 0;
        
        while (true){
            String answer = scanner.nextLine();
            
            if (answer.equals("")){
                break;
            }
            
            String[] words = answer.split(",");
            if (biggestAge < Integer.valueOf(words[1])){
                biggestAge = Integer.valueOf(words[1]);
            }           
        }
        System.out.println(biggestAge);
    }
}
