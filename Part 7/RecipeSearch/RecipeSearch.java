import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <String> recipes = new ArrayList<>();
        ArrayList <Integer> startPoints = new ArrayList<>();
        
        UserInterface userInt = new UserInterface(scanner, recipes, startPoints);
        userInt.start();
        userInt.commands();
    }
}
