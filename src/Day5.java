import java.sql.SQLOutput;
import java.text.StringCharacterIterator;
import java.util.Random;

public class Day5 {
    public static void main(String[] args) {
        String message = "Look, I cannot pass this :(";
        if (message.contains(":)")) {
            System.out.println("smile found");
        } else {
            System.out.println("no smile");
        }
    }
}