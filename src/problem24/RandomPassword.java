package problem24;

import java.util.Random;

public class RandomPassword {
    String lastPwd;
    Random random = new Random();

    public RandomPassword() {
        random = new Random();
    }

    public String makeLetters(int len) {
        lastPwd = "";
        for (int i = 0; i < len; i++) {
            char c = (char) ('a' + random.nextInt(26));
            lastPwd = lastPwd + c;
        }
        return lastPwd;
    }
}