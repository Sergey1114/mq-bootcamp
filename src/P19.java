public class P19 {
    public static double toFahrenheit(double c) {
        return c*9/5+32;
    }

    public static void main(String[] args) {
        double result = toFahrenheit(20);
        System.out.println(result);
    }
}