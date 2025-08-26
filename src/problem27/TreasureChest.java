package problem27;

public class TreasureChest {
    int coins = 0;
    boolean locked = true;

    public void lock() {
        locked = true;
    }

    public void unlock() {
        locked = false;
    }

    public void addCoins(int n) {
        coins += n;
    }

    public int takeAll() {
        if (!locked) {
            int all = coins;
            coins = 0;
            return all;
        }
        return 0;
    }
}