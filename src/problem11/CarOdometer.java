package problem11;

public class CarOdometer {
    int km;
    int tank;

    public void addFuel(int l) {
        tank += l;
        if (tank > 50) {
            tank = 50;
        }
    }

    public boolean drive(int distance) {
        int fuelNeeded = distance / 10;
        if (fuelNeeded <= tank) {
            km += distance;
            tank -= fuelNeeded;
            return true;
        } else {
            return false;
        }
    }

    public int fuelLeft() {
        return tank;
    }
}