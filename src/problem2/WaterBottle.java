package problem2;

public class WaterBottle {
    int ml;
    int maxMl;

    public WaterBottle(int maxMl) {
        this.maxMl = maxMl;
        this.ml = 0;
    }

    public void drink(int n) {
        if (ml == 0) {
            return;
        }
        ml -= n;
    }

    public void refill() {
        ml = maxMl;
    }

    public boolean isEmpty() {
        return ml == 0;
    }
}