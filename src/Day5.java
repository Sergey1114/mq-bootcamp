import java.sql.SQLOutput;
import java.text.StringCharacterIterator;
import java.util.Random;

public class Day5 {
    public static void main(String[] args) {
        Random random = new Random();
        char rnd = (char)('a' + random.nextInt(26));
        System.out.println(rnd);
    }
}