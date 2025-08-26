package problem26;

import java.util.Random;

public class SimpleSlot {
    int a, b, c;
    Random r = new Random();

    public void spin() {
        a = r.nextInt(6) + 1;
        b = r.nextInt(6) + 1;
        c = r.nextInt(6) + 1;
    }

    public boolean jackpot() {
        return a == b && b == c;
    }
}