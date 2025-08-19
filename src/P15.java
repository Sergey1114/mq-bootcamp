public class P15 {
    public static void main(String[] args) {
        int result = reverseDigits(789);
        System.out.println(result);
    }

    public static int reverseDigits(int n) {
        int reversed = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            reversed = reversed * 10 + lastDigit;
            n = n / 10;
        }
        return reversed;
    }
}