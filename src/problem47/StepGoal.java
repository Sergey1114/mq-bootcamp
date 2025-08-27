package problem47;

public class StepGoal {
    final int goal = 2000;
    int steps = 0;

    public void add(int s) {
        if (s >= goal || s + steps > goal) {
            steps = goal;
        } else {
            steps += s;
        }
    }

    public int left() {
        return goal - steps;
    }

    public boolean done() {
        return steps == goal;
    }
}