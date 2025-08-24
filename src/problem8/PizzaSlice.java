package problem8;

public class PizzaSlice {
    int totalSlices;
    int eaten;

    public PizzaSlice(int n) {
        this.totalSlices = n;
    }

    public boolean eat(int n) {
        if (eaten + n <= totalSlices) {
            eaten += n;
            return true;
        }
        return false;
    }

    public int left() {
        return totalSlices - eaten;
    }

    public void addSlice() {
        totalSlices++;
    }
}