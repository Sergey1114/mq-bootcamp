import java.sql.SQLOutput;
import java.text.StringCharacterIterator;
import java.util.Random;

public class Day5 {
    public static void main(String[] args) {
        String phrase = "Hello world";
        int spaceIndex = phrase.indexOf(' ');
        String firstWord = phrase.substring(0, spaceIndex);
        System.out.println(firstWord);
    }
}