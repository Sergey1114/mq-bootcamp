package problem48;

public class MoneyBox {
    int cents = 0;

    public void addCoins(int c) {
        cents += c;
    }

    public boolean tryPay(int c) {
        if (cents >= c) {
            cents -= c;
            return true;
        } else {
            return false;
        }
    }

    public int getCents() {
        return cents;
    }
}