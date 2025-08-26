package problem21;

import java.util.Random;

public class GuessBox {
    int secret;
    Random random = new Random();

    public void newSecret() {
        secret = random.nextInt(1, 11);
    }

    public boolean guess(int g) {
        return secret == g;
    }
}