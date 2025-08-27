package problem49;

public class Triangle3Sides {
    int a = 8;
    int b = 3;
    int c = 9;

    public int perimeter() {
        return a + b + c;
    }

    public boolean isValidSimple() {
        return a + b > c;
    }
}