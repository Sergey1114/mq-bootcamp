public class P10 {
    public static void main(String[] args) {
        boolean result = isMultiple(15, 5);
        System.out.println(result);
    }
    public static boolean isMultiple(int n, int k) {
        if (n % k == 0) return true;
        else return false;
    }
}