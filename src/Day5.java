import java.sql.SQLOutput;
import java.text.StringCharacterIterator;
import java.util.Random;

public class Day5 {
    public static void main(String[] args) {
        String word = "dusk";
        String swap = word.substring(2) + word.substring(0, 2);
        System.out.println(swap);
    }
}