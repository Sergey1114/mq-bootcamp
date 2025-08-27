package problem52;

public class CounterWithLimit {
    int value;
    int min;
    int max;

    public void up() {
        value++;
        if (value > max) {
            value = max;
        }
    }

    public void down() {
        value--;
        if (value < min) {
            value = min;
        }
    }

    void clamp() {
        if (value > max) {
            value = max;
        }
        if (value < min) {
            value = min;
        }
    }

    public boolean atEdge() {
        return value == min || value == max;
    }
}