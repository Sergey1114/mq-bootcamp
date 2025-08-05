import java.util.Random;

public class Day4 {
    public static void main(String[] args) {
        Random random = new Random();
       char symbol =(char) random.nextInt(97,123);
        System.out.println(symbol);

        switch (symbol) {
            case 'a':
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("Vowel");
                break;
            case 'o':
                System.out.println("Vowel");
                break;
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }
    }
}