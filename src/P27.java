import java.util.Random;

public class P27 {
    public static void main(String[] args) {
        Random random = new Random();
        int result = randDie(random);
        System.out.println(result);
    }

    public static int randDie(Random r) {
        return r.nextInt(1,6);
    }
}