import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Book> bookList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            System.out.println("Title: ");
            String name = scanner.nextLine();
            if (name.equals("")){
                break;
            }
            System.out.println("Pages: ");
            int pageNum = Integer.valueOf(scanner.nextLine());
            
            System.out.println("Publication year: ");
            int pubYear = Integer.valueOf(scanner.nextLine());
            
            bookList.add(new Book(name, pageNum, pubYear));
        }
        System.out.println("What information will be printed?");
        String answer = scanner.nextLine();
        
        if (answer.equals("everything")){
            for (Book books : bookList){
                System.out.println(books);
            }
        } else if (answer.equals("name")){
            for (Book books : bookList){
                System.out.println(books.getName());
            }
        }
    }
}
