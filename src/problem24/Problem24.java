package problem24;

import java.util.Random;

public class Problem24 {
    public static void main(String[] args) {
        RandomPassword randomPassword = new RandomPassword();
        Random random = new Random();
        for (int i = 1; i <= 3; i++) {
            int length = 6 + random.nextInt(3);
            String pwd = randomPassword.makeLetters(length);
            System.out.println("Password " + i + ": " + pwd);
        }
    }
}