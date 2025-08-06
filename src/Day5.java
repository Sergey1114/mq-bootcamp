import java.sql.SQLOutput;
import java.text.StringCharacterIterator;
import java.util.Random;

public class Day5 {
    public static void main(String[] args) {
        String html = "<b>BOLD</b>";
        int start = html.indexOf(">") + 1;
        int end = html.indexOf("<", start);
        String r =  html.substring(start, end);
        System.out.println(r);
    }
}