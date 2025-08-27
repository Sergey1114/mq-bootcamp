package problem55;

public class Ladder {
    int steps;
    int current;

    public Ladder(int steps) {
        this.steps = steps;
        this.current = 0;
    }

    public void up() {
        if (current < steps) {
            current++;
        }
    }

    public void down() {
        if (current > 0) {
            current--;
        }
    }

    public boolean atTop() {
        return current == steps;
    }

    public boolean atBottom() {
        return current == 0;
    }
}