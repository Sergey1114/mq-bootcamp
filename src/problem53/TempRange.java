package problem53;

public class TempRange {
    int low;
    int high;

    public TempRange(int low, int high) {
        this.low = low;
        this.high = high;
    }

    public boolean contains(int t) {
        return t >= low && t <= high;
    }

    public int width() {
        return high - low;
    }
}