package problem25;

import java.util.Random;

public class Spinner {
    int sides;
    Random random = new Random();
    public Spinner(int sides) {
        this.sides = sides;
        random = new Random();
    }

    public int spin() {
        return random.nextInt(sides) + 1;
    }
}