import java.util.Random;

public class DiceHistogram {
    public static void main(String[] args) {
        int[] rolls = new int[60];
        int[] freq = new int[6];
        Random rand = new Random();
        for (int i = 0; i < rolls.length; i++) {
            int roll = rand.nextInt(6) + 1;
            rolls[i] = roll;
            freq[roll - 1]++;
        }
        for (int i = 0; i < freq.length; i++) {
            System.out.println((i + 1) + " = " + freq[i]);
        }
    }
}