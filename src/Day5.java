import java.sql.SQLOutput;
import java.text.StringCharacterIterator;

public class Day5 {
    public static void main(String[] args) {
        String word = "level";
        char first = word.charAt(0);
        int lastIndex = word.length() - 1;
        char lastChar = word.charAt(lastIndex);
        System.out.println(first == lastChar);
    }
}