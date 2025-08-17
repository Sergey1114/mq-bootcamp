import java.util.Random;

public class CoinFlipsArray {
    public static void main(String[] args) {
        Random random = new Random();
        String[] flips = new String[20];
        int heads = 0;
        int tails = 0;
        for (int i = 0; i < flips.length; i++) {
            boolean flip = random.nextBoolean();
            if (flip) {
                flips[i] = "H";
                heads++;
            } else {
                flips[i] = "T";
                tails++;
            }
        }
        System.out.println("Heads " + heads);
        System.out.println("Tails " + tails);
    }
}