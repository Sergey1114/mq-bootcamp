public class P23 {
    public static void main(String[] args) {
        double result = circleAreaApprox(2);
        System.out.println(result);
    }
    public static double circleAreaApprox(double r) {
        double p = 3.14159;
        return r*r*p;
    }
}