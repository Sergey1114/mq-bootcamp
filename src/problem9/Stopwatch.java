package problem9;

public class Stopwatch {
    int seconds;

    public void startAt(int s) {
        seconds = s;
    }

    public void tick(int s) {
        seconds = seconds + s;
    }

    public String format() {
        int minutes = seconds / 60;
        int secs = seconds % 60;
        String minStr = "";
        String secStr = "";

        if (minutes < 10) {
            minStr = "0" + minutes;
        } else {
            minStr = "" + minutes;
        }

        if (secs < 10) {
            secStr = "0" + secs;
        } else {
            secStr = "" + secs;
        }
        return minStr + ":" + secStr;
    }
}