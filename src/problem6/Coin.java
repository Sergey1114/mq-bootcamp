package problem6;

import java.util.Random;

public class Coin {
    String[] a = {"h", "t"};
    String side;
    Random random = new Random();

    public String flip() {
        side = a[random.nextInt(2)];
        return side;
    }

    public boolean isHead() {
        return side.equals("h");
    }
}