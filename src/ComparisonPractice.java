import javax.naming.NamingEnumeration;
import java.util.Random;

public class ComparisonPractice {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(30 - 10 + 1) + 10;
        if (num > 20) {
            System.out.println("Sugar Rush!");
        } else {
            System.out.println("Moderate snack.");
        }
    }
}