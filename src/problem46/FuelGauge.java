package problem46;

public class FuelGauge {
    int liters = 0;
    final int max = 50;

    public void add(int l) {
        if (l >= max || liters + l > max) {
            liters = max;
        } else {
            liters += l;
        }
    }

    public boolean consumeForKm(int km) {
        int fuelNeeded = km / 10;
        if (liters >= fuelNeeded) {
            liters -= fuelNeeded;
            return true;
        } else {
            return false;
        }
    }

    public int left() {
        return liters;
    }
}