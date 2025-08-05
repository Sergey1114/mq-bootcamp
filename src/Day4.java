import java.util.Random;

public class Day4 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(0, 3);
        if (number == 0) {
            System.out.println("Rock");
        } else if (number == 1) {
            System.out.println("Paper");
        } else if (number == 2) {
            System.out.println("Scissors");
        }
    }
}