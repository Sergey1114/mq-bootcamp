package problem15;

public class Problem15 {
    public static void main(String[] args) {
        Battery battery = new Battery();
        battery.charge(60);
        System.out.println(battery.percent);
        battery.use(40);
        System.out.println(battery.percent);
        battery.low();
        System.out.println(battery.low());
    }
}