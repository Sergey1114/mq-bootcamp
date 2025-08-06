import java.sql.SQLOutput;
import java.text.StringCharacterIterator;

public class Day5 {
    public static void main(String[] args) {
        String messy = "  hi  ";
        System.out.println("Before trim: " + messy.length());
        System.out.println("After trim: " + messy.trim().length());
        System.out.println(messy.trim());
    }
}