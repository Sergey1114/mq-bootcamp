package problem17;

public class CircleApprox {
    int r;

    public double area() {
        double p = 3.14;
        return p * r * r;
    }

    public double circumference() {
        double p = 3.14;
        return 2 * p * r;
    }
}