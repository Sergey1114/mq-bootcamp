import java.sql.SQLOutput;
import java.text.StringCharacterIterator;

public class Day5 {
    public static void main(String[] args) {
        String ch = "A";
        if (ch.equals(ch.toLowerCase())) {
            System.out.println(ch.toLowerCase());
        } else if (ch.equals(ch.toUpperCase())){
            System.out.println(ch.toUpperCase());
        }
    }
}