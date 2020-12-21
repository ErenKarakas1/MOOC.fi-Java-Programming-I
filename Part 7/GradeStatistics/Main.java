
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Grades gradeList = new Grades();
        Grades passedList = new Grades();
        UserInterface userInt = new UserInterface(scanner, gradeList, passedList);
        
        userInt.start();
        System.out.println("Point average (all): " + gradeList.getAverage());
        System.out.println("Point average (passing): " + passedList.getAverage());
        userInt.passPercentage();
        userInt.gradeDist();
    }
}
