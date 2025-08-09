import java.sql.SQLOutput;
import java.text.StringCharacterIterator;
import java.util.Random;

public class Day5 {
    public static void main(String[] args) {
        String xy = "ab";
        String reversed = "" + xy.charAt(1) + xy.charAt(0);
        System.out.println(reversed);
    }
}