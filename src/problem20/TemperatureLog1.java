package problem20;

public class TemperatureLog1 {
    int[] log = new int[100]; // maximum of 100 temperatures
    int size = 0;

    public void add(int t) {
        log[size] = t;
        size++;
    }

    public double avg() {
        int sum = 0;
        for (int i = 0; i < size ; i++) {
            sum += log[i];
        }
        return sum / (double) size;
    }

    public int max() {
        int maximum = log[0];
        for (int i = 1; i < size; i++) {
            if (log[i] > maximum) {
                maximum = log[i];
            }
        }
        return maximum;
    }
}