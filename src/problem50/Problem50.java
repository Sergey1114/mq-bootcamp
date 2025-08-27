package problem50;

public class Problem50 {
    public static void main(String[] args) {
        RunnerLap lap = new RunnerLap();
        lap.runLap();
        lap.runLap();
        lap.runLap();
        System.out.println(lap.meterSoFar());
    }
}