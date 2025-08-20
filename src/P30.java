import java.util.Random;

public class P30 {
    public static void main(String[] args) {
        Random random = new Random();
        char result = randLowerLetter(random);
        System.out.println(result);
    }

    public static char randLowerLetter(Random r) {
        int n = r.nextInt(26);
        return (char) ('a' + n);
    }
}