package problem51;

public class Problem51 {
    public static void main(String[] args) {
        BudgetTracker tracker = new BudgetTracker();
        tracker.buy(10);
        tracker.buy(30);
        tracker.buy(5);
        System.out.println("Left: " + tracker.left());
        System.out.println("Overspent: " + tracker.overspent());
    }
}