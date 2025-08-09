import java.sql.SQLOutput;
import java.text.StringCharacterIterator;
import java.util.Random;

public class Day5 {
    public static void main(String[] args) {
        String word = "car";
        if (word.charAt(0) == word.charAt(2)) {
            System.out.println("pal");
        } else {
            System.out.println("not");
        }
    }
}