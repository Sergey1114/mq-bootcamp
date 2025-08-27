package problem48;

public class Problem48 {
    public static void main(String[] args) {
        MoneyBox box = new MoneyBox();
        box.addCoins(50);
        System.out.println("Get cents: " + box.getCents());
        System.out.println("Can pay? " + box.tryPay(50));
        System.out.println("Remains: " + box.getCents());

    }
}