import java.sql.SQLOutput;
import java.text.StringCharacterIterator;
import java.util.Random;

public class Day5 {
    public static void main(String[] args) {
       String word = "office";
       if (word.length() < 5) {
           System.out.println(word);
       } else {
           System.out.println(word.substring(0,5));
       }
    }
}