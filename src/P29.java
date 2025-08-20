import java.util.Random;

public class P29 {
    public static void main(String[] args) {
        Random random = new Random();
        int result = randInRange(random, 5, 9);
        System.out.println(result);
    }

    public static int randInRange(Random r, int lo, int hi) {
        return r.nextInt(hi - lo + 1) + lo;
    }
}