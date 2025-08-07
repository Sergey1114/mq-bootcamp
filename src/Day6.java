import java.util.Random;

public class Day6 {
    public static void main(String[] args) {

        Random random = new Random();
        int secret = random.nextInt(20) + 1;
        int iterator = 1;

        while (true) {
            int guess = random.nextInt(20) + 1;

            if (secret != guess) {

                iterator = iterator + 1;

            } else {
                System.out.println("Found " + secret + " in " + iterator + " guesses");
                break;
            }
        }
    }
}