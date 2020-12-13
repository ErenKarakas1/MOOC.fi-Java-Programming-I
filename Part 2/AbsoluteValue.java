
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Integer num = Integer.valueOf(scanner.nextLine());
        if (num > 0){
            System.out.println(num);
        } else {
            System.out.println(0 - num);
        }
    }
}
