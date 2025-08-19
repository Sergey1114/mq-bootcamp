import java.util.Random;

public class Problem1 {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(1, 11);
        System.out.println(isEven(n));
    }
    static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}