import java.sql.SQLOutput;
import java.text.StringCharacterIterator;
import java.util.Random;

public class Day5 {
    public static void main(String[] args) {
        String password = "1223334444!";
        if (password.length() >= 8 && password.contains("!")) {
            System.out.println("strong");
        } else {
            System.out.println("weak");
        }
    }
}