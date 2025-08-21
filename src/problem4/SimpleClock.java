package problem4;

public class SimpleClock {
    int hours;
    int minutes;

    public SimpleClock(int hours) {
        this.hours = hours;
        this.minutes = 0;
    }
    public void tick(int min) {
        minutes+=min;
        if (minutes > 59) {
            hours++;
            minutes = min-60;
        }
    }

    public String show() {

        if (minutes < 10) {
            return "0" + hours + ":0" + minutes;
        }
        return "0" + hours + ":" + minutes;
    }
}