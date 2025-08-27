package problem51;

public class BudgetTracker {
    int budget = 50;
    int spent;

    public void buy(int price) {
        if (budget >= price) {
            budget -= price;
            spent += price;
        }
    }

    public int left() {
        return budget;
    }

    public boolean overspent() {
        return !(spent > budget);
    }
}