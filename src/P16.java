public class P16 {
    static int countDigits(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            n = n * -1;
        }
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countDigits(5639967));
    }
}