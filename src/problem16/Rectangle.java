package problem16;

public class Rectangle {
    int w;
    int h;

    public int area() {
        return w * h;
    }

    public int peri() {
        return 2 * (w + h);
    }

    public boolean isSquare() {
        return w == h;
    }
}