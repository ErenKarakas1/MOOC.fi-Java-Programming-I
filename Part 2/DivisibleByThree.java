
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    }
    public static void divisibleByThreeInRange(int start, int end){
        for (; start <= end; start++){
            if (start % 3 == 0){
                System.out.println(start);
            }
        }
    }
}
