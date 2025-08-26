package problem41;

public class Point1D {
    int x;

    public Point1D(int x) {
        this.x = x;
    }

    public void move(int dx) {
        this.x += dx;
    }

    public int distanceTo(Point1D other) {
        return Math.abs(this.x - other.x);
    }
}