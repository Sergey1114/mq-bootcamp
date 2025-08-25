package problem11;

public class Problem11 {
    public static void main(String[] args) {
        CarOdometer carOdometer = new CarOdometer();
        carOdometer.addFuel(20);
        carOdometer.drive(100);
        System.out.println(carOdometer.fuelLeft());
    }
}