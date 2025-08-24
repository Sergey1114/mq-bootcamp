package problem9;

public class Problem9 {
    public static void main(String[] args) {
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.startAt(0);
        stopwatch.tick(125);
        stopwatch.format();
        System.out.println(stopwatch.format());
    }
}