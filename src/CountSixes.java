import java.util.Random;

public class CountSixes {
    public static void main(String[] args) {
        Random random = new Random();
        int sixes = 0;
        for (int i = 0; i < 20; i++) {
            if (random.nextInt(1, 7) == 6) {
                sixes++;
            }
        }
        System.out.println(sixes);
    }
}