package problem3;

public class Problem3 {
    public static void main(String[] args) {
        BankPiggy piggy = new BankPiggy(3);

        piggy.deposit(100);
        System.out.println("Balance after deposit " + piggy.balance());

        boolean result = piggy.withdraw(150);
        System.out.println("Withdraw " + result);
        System.out.println("Balance after attempt " + piggy.balance());
    }
}