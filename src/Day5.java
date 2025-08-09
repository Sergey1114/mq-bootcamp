import java.sql.SQLOutput;
import java.text.StringCharacterIterator;
import java.util.Random;

public class Day5 {
    public static void main(String[] args) {
        String link = "https://app.slack.com/client/T097XJ39MDG/C098C0WAM3K";
        if (link.startsWith("https://")) {
            System.out.println("https url");
        } else {
            System.out.println("not secure");
        }
    }
}