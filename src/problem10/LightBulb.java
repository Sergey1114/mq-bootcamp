package problem10;

public class LightBulb {
    boolean on;
    int hoursOn;

    public void toggle() {
        on = !on;
    }

    public void tickHour() {
        if (on) {
            hoursOn++;
        }
    }

    public boolean isOn() {
        return on;
    }

    public boolean hoursOn() {
        return on;
    }
}