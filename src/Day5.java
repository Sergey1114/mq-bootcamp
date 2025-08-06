import java.sql.SQLOutput;
import java.text.StringCharacterIterator;
import java.util.Random;

public class Day5 {
    public static void main(String[] args) {
        String word = "water";
        if (word.length() % 2 == 0) {
            System.out.println("even length");
        } else {
            System.out.println("odd length");
        }
    }
}