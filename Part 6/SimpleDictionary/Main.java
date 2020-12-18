
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TextUI t = new TextUI(new Scanner(System.in), new SimpleDictionary());
        t.start();
    }
}
