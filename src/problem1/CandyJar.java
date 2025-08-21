package problem1;

public class CandyJar {
    int capacity;
    int count;

    public CandyJar(int capacity) {
        this.capacity = capacity;
        this.count = 0;
    }

    public void fill() {
        count = capacity;
    }

    public void add(int n) {
        count += n;
        if (count > capacity) {
            count = capacity;
        }
    }

    public void take(int n) {
        count -= n;
        if (count < 0) {
            count = 0;
        }
    }

    public int spaceLeft() {
        return capacity - count;

    }
}