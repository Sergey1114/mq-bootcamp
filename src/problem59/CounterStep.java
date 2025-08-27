package problem59;

public class CounterStep {
    int start;
    int step;
    int current;

    public void reset() {
        current = start;
    }

    public int nextValue() {
        current += step;
        return current;
    }
}