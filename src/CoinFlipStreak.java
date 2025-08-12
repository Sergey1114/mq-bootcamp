import java.util.Random;

public class CoinFlipStreak {
    public static void main(String[] args) {
        Random random = new Random();
        int current = 0;
        int max = 0;
        for (int i = 0; i < 15; i++) {
            boolean heads = random.nextBoolean();
            if (heads) {
                current++;
                if (current > max) {
                    max = current;
                }
            } else {
                current = 0;
            }
        }
        System.out.println(max);
    }
}