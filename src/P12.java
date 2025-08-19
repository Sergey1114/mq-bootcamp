public class P12 {
    public static void main(String[] args) {
        int result = sum1toN(5);
        System.out.println(result);
    }

    public static int sum1toN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}