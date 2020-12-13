
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {

    }
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit){
        System.out.println("The numbers in range [" + lowerLimit + ", " + upperLimit + "]");
        for (int nums : numbers){
            if (lowerLimit <= nums && nums <= upperLimit){
                System.out.println(nums);
            }
        }
    }
}
