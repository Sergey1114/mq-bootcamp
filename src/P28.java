import java.util.Random;

public class P28 {
    public static void main(String[] args) {
        Random random = new Random();
        String result = coinFlip(random);
        System.out.println(result);
    }

    public static String coinFlip(Random r) {
        int flip = r.nextInt(2);
        if (flip == 0) return "H";
        else return "T";
    }
}