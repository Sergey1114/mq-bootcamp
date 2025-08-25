package problem10;

public class Problem10 {
    public static void main(String[] args) {
        LightBulb lightBulb = new LightBulb();
        lightBulb.toggle();
        lightBulb.tickHour();
        System.out.println(lightBulb.hoursOn);
    }
}