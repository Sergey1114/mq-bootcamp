package problem3;

public class BankPiggy {
    int cents;

    public BankPiggy(int amount) {
        this.cents = amount;
    }

    public void deposit(int amount) {
        cents += amount;
    }

    public boolean withdraw(int amount) {
        if (cents >= amount) {
            cents -= amount;
            return true;
        } else {
            return false;
        }
    }

    public int balance() {
        return cents;
    }
}