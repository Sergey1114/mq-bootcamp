import java.sql.SQLOutput;
import java.text.StringCharacterIterator;

public class Day5 {
    public static void main(String[] args) {
        String fileName = "photo.jpeg";
        String extension = fileName.substring(fileName.lastIndexOf('.') + 1);
        System.out.println(extension);
    }
}