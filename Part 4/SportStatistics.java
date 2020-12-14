
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File:");
        String file = scan.nextLine();
        
        System.out.println("Team:");
        String team = scan.nextLine();
        
        int gameNum = 0;
        int wins = 0;
        try (Scanner scanFile = new Scanner(Paths.get(file))){
            while (scanFile.hasNextLine()){
                String first = scanFile.nextLine();
                String[] list = first.split(",");
                if (list[0].equals(team)){
                    gameNum++;
                    if (Integer.valueOf(list[2]) > Integer.valueOf(list[3])){
                        wins++;
                    }
                } else if (list[1].equals(team)){
                    gameNum++;
                    if (Integer.valueOf(list[3]) > Integer.valueOf(list[2])){
                        wins++;
                    }
                }
            }
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Games: " + gameNum);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + (gameNum-wins));
    }
}
