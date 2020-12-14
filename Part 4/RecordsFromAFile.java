
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        try (Scanner scanFile = new Scanner(Paths.get(file))){
            while (scanFile.hasNextLine()){
                String first = scanFile.nextLine();
                String[] list = first.split(",");
                System.out.println(list[0] + " age: " + list[1] + " years");
            }
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
