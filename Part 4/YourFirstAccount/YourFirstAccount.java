
public class YourFirstAccount {

    public static void main(String[] args) {
        Account erenAcc = new Account("erenAccount", 100.0);
        
        erenAcc.deposit(20.0);
        
        System.out.println(erenAcc);
    }
}
