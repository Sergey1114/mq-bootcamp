import java.util.Random;

public class Day4 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(1, 6);

        switch (number) {
            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println("III");
                break;
            case 4:
                System.out.println("IV");
                break;
            case 5:
                System.out.println("V");
                break;
        }
    }
}