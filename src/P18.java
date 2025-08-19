public class P18 {
    public static double toCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        double result = toCelsius(68);
        System.out.println(result);
    }
}