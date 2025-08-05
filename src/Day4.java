import java.util.Random;

public class Day4 {
    public static void main(String[] args) {
        Random random = new Random();
        double income = random.nextDouble(100500);
        if (income < 10000) {
            System.out.println("Low");
        } else if (income < 30000) {
            System.out.println("Medium");
        } else if (income < 100000) {
            System.out.println("High");
        } else {
            System.out.println("Very High");
        }
    }
}