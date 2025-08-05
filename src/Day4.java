import java.util.Random;

public class Day4 {
    public static void main(String[] args) {
        Random random = new Random();
        char symbol = (char) random.nextInt(42, 48);
        double num1 = random.nextDouble(100);
        double num2 = random.nextDouble(100);

        System.out.println(symbol);
        System.out.println(num1);
        System.out.println(num2);

        switch (symbol) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);

        }
    }
}