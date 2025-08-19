public class P14 {
    public static void main(String[] args) {
        int result = sumDigits(2415);
        System.out.println(result);
    }

    public static int sumDigits(int n) {
        n = Math.abs(n);
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}