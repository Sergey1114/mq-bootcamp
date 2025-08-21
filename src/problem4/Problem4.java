package problem4;

public class Problem4 {
    public static void main(String[] args) {
        SimpleClock clock = new SimpleClock(7);
        clock.hours = 7;
        clock.minutes = 0;
        System.out.println(clock.show());
        clock.tick(70);
        System.out.println(clock.show());
    }
}