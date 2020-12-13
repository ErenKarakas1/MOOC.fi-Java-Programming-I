
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer sum = 0;
        Integer count = 0;
        Integer nameCount = 0;
        String name = "";
        
        while (true){
            String answer = scanner.nextLine();
            
            if (answer.equals("")){
                break;
            }
            
            String[] words = answer.split(",");
            
            if (words[0].length() > nameCount){
                nameCount = words[0].length();
                name = words[0];
            }
            sum += Integer.valueOf(words[1]);          
            count++;          
        }
        System.out.println("Longest name: " + name);
        System.out.println("Average of birth years: " + (double) sum / count);
    }
}
