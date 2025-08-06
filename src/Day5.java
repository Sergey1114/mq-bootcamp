import java.sql.SQLOutput;
import java.text.StringCharacterIterator;
import java.util.Random;

public class Day5 {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(0, 10);
        int b = random.nextInt(0, 10);
        String r = "" + a + b;
        System.out.println(r);
    }
}