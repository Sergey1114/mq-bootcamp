import javax.naming.NamingEnumeration;
import java.util.Random;

public class ComparisonPractice {
    public static void main(String[] args) {
        Random random = new Random();
        boolean heads = random.nextBoolean();
        if (heads) {
            System.out.println("Woo-hoo");
        } else {
            System.out.println("Darn");
        }
    }
}