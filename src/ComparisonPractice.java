import javax.naming.NamingEnumeration;
import java.util.Random;

public class ComparisonPractice {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(6) + 1;
        if (number == 6) {
            System.out.println("Lucky");
        } else {
            System.out.println(number);
        }
    }
}