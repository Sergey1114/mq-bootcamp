package problem18;

public class SimpleTimer {
    int secondsLeft;

    public void set(int s) {
        secondsLeft = s;
    }

    public void tick() {
        if (secondsLeft > 0) {
            secondsLeft--;
        }
    }

    public boolean finished() {
        return secondsLeft == 0;
    }
}