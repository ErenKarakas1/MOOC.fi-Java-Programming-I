
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer fNum = Integer.valueOf(scanner.nextLine());
        Integer sNum = Integer.valueOf(scanner.nextLine());
        
        if (fNum > sNum){
            System.out.println(fNum + " is greater than " + sNum + ".");
        } else if (sNum > fNum){
            System.out.println(fNum + " is smaller than " + sNum + ".");
        } else {
            System.out.println(sNum + " is equal to " + sNum + ".");
        }
    }
}
