import java.sql.SQLOutput;
import java.text.StringCharacterIterator;
import java.util.Random;

public class Day5 {
    public static void main(String[] args) {
        String letter1 = "b";
        String letter2 = "A";
        int r = letter1.compareToIgnoreCase(letter2);
        if (r < 0) {
            System.out.println(letter1 + " comes before " + letter2);
        } else if (r > 0) {
            System.out.println(letter2 + " comes before " + letter1);
        } else {
            System.out.println(letter1 + " and " + letter2 + " are the same letter");
        }
    }
}