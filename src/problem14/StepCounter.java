package problem14;

public class StepCounter {
    int steps;

    public void addSteps(int n) {
        steps += n;
    }

    public boolean reached(int goal) {
        return steps == goal;
    }

    public void reset() {
        steps = 0;
    }
}