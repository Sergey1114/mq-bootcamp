import java.util.Random;

public class Day4 {
    public static void main(String[] args) {
        Random random = new Random();
        int R = random.nextInt(0, 256);
        int G = random.nextInt(0, 256);
        int B = random.nextInt(0, 256);
        System.out.println("(" + R + "," + G + "," + B + ")");
    }
}