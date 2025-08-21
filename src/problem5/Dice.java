package problem5;

import java.util.Random;

public class Dice {
    int face;
    Random random;

    public Dice() {
        random = new Random();
        this.roll();
    }

    int roll() {
        this.face = random.nextInt(6) + 1;
        return this.face;
    }
}