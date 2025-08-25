package problem18;

public class Problem18 {
    public static void main(String[] args) {
        SimpleTimer simpleTimer = new SimpleTimer();
        int count = 0;
        simpleTimer.secondsLeft = 5;
        while (!simpleTimer.finished()) {
            simpleTimer.tick();
            count++;
            System.out.println("Tick " + count + "  Seconds left " + simpleTimer.secondsLeft);
        }
        System.out.println("Finished after " + count + " ticks");
    }
}