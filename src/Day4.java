import java.util.Random;

public class Day4 {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(0, 20);
        int b = random.nextInt(0, 20);
        int c = random.nextInt(0, 20);
        System.out.println(a + " " + b + " " + c);

        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("Equilateral");
            } else if (a == b || a == c || b == c) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        }
    }
}
