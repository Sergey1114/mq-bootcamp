import java.util.Random;

public class Day6 {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(100);
        System.out.println(n);
        int factor = 0;

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                factor = i;
                break;

            }
        }
        System.out.println("smallest factor = " + factor);
    }
}