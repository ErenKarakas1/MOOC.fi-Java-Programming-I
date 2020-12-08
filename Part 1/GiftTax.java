
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Value of the gift?");
        Integer vGift = Integer.valueOf(scan.nextLine());
        Double tax = 0.0;
        
        if (vGift >= 1000000){
            tax = 142100 + ((vGift - 1000000) * 0.17);
            System.out.println("Tax: " + tax);
        } else if (vGift >= 200000){
            tax = 22100 + ((vGift - 200000) * 0.15);
            System.out.println("Tax: " + tax);
        } else if (vGift >= 55000){
            tax = 4700 + ((vGift - 55000) * 0.12);
            System.out.println("Tax: " + tax);
        } else if (vGift >= 25000){
            tax = 1700 + ((vGift - 25000) * 0.10);
            System.out.println("Tax: " + tax);
        } else if (vGift >= 5000){
            tax = 100 + ((vGift - 5000) * 0.08);
            System.out.println("Tax: " + tax);
        } else {
            System.out.println("No tax!");
        }
    }
}
