
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer smallest = 9999;
        
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true){
            Integer value = Integer.valueOf(scanner.nextLine());
            numbers.add(value);
            if (value < smallest){
                smallest = value;
            }
            if (value == 9999){
                break;
            }
        }
        System.out.println("Smallest number: " + smallest);
        for (int i = 0; i < numbers.size(); i++){
            if (numbers.get(i) == smallest){
                System.out.println("Found at index: " + i);
            }
        }
    }
}
