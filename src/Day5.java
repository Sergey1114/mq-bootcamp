import java.sql.SQLOutput;
import java.text.StringCharacterIterator;

public class Day5 {
    public static void main(String[] args) {
        String email = "[a@b.com](mailto:a@b.com)";
        if (email.contains("@") && email.contains(".")) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }
    }
}