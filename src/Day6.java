import java.util.Random;

public class Day6 {
    public static void main(String[] args) {
        int value = 1;

        while (value <= 1000) {
            System.out.print(value + " ");
            if (value * 2 > 1000) {
                break;
            }
            value = value * 2;
        }
    }
}