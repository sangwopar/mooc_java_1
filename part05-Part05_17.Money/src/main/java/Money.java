
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
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

    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros + addition.euros, this.cents + addition.cents);
        return newMoney;
    }
    
    public boolean lessThan(Money compaMoney) {
        if (this.euros < compaMoney.euros) {
            return true;
        }
        if (this.euros == compaMoney.euros && this.cents < compaMoney.cents) {
            return true;
        }
        return false;
    }

    public Money minus(Money decreaser) {
        int cents = this.cents - decreaser.cents;
        int euros = this.euros - decreaser.euros;
        if (cents < 0) {
            euros = euros - 1;
            cents = 100 + cents;
        }
        if (euros < 0) {
            return new Money(0, 0);
        }

        return new Money(euros, cents);
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
