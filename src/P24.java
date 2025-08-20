public class P24 {
    public static void main(String[] args) {
        boolean result = isInsideRange(7, 5, 10);
        System.out.println(result);
    }
    public static boolean isInsideRange(int x, int lo, int hi) {
        return x >= lo && x <= hi;
    }
}