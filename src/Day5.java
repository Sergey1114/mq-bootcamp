import java.sql.SQLOutput;
import java.text.StringCharacterIterator;

public class Day5 {
    public static void main(String[] args) {
        String word = "level";
        char first = word.charAt(0);
        char last = word.charAt(4);
        System.out.println(first == last);
    }
}