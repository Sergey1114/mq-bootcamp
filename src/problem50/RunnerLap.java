package problem50;

public class RunnerLap {
    int lap;
    int lapLength = 400;
    int totalMeter;

    public void runLap() {
        lap++;
        totalMeter += lapLength;
    }

    public int meterSoFar() {
        return totalMeter;
    }
}