import java.util.Random;

public class P26 {
    public static void main(String[] args) {
        Random random = new Random();
        int result = randInt01(random);
        System.out.println(result);
    }

    public static int randInt01(Random r) {
        return r.nextInt(2);
    }
}