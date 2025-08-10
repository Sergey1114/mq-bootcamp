import java.sql.SQLOutput;
import java.text.StringCharacterIterator;
import java.util.Random;

public class Day5 {
    public static void main(String[] args) {
        String phrase = "Hello world";
        int lastSpace = phrase.lastIndexOf(' ');
        String lastWord = phrase.substring(lastSpace + 1);
        System.out.println(lastWord);
    }
}