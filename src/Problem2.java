import java.util.Random;

public class Problem2 {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(1,11);
        System.out.println(isOdd(n));
    }
    static boolean isOdd(int n) {
        if (n % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }
}