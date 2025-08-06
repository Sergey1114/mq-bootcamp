import java.sql.SQLOutput;
import java.text.StringCharacterIterator;
import java.util.Random;

public class Day5 {
    public static void main(String[] args) {
        String code = "aa";
        if (code.charAt(0) == code.charAt(1)) {
            System.out.println(code.charAt(0));
        } else {
            System.out.println(code);
        }
    }
}