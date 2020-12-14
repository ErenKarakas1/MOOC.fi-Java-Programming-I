
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        } else if (cents < 0){
            euros --;
            cents += 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    public Money plus(Money addition){
        Money money = new Money(this.euros + addition.euros, this.cents + addition.cents);
        return money;
    }
    
    public boolean lessThan(Money compared){
        return (100 * this.euros + this.cents) < (100 * compared.euros + compared.cents);
    }
    
    public Money minus(Money decreaser){
        if (decreaser.lessThan(this)){
            Money money = new Money(this.euros - decreaser.euros, this.cents - decreaser.cents);
            return money;
        } else {
            Money money = new Money(0, 0);
            return money;
        }
    }
}
