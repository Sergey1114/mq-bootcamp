import java.util.Random;

public class Day6 {
    public static void main(String[] args) {
        int number = 2415;  // You can change this to any number
        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        System.out.println("Digit sum = " + sum);

    }
}