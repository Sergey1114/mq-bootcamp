package problem29;

import problem5.Dice;

import java.util.Random;

class MyDice {
    int sides;
    Random random = new Random();

    public MyDice(int sides) {
        this.sides = sides;
    }

    public int roll() {
        return random.nextInt(sides) + 1;
    }
}

class DicePair {
    MyDice d1, d2;

    public DicePair() {
        d1 = new MyDice(6);
        d2 = new MyDice(6);
    }

    public int rollSum() {
        return d1.roll() + d2.roll();
    }

    public boolean doubles() {
        return d1.roll() == d2.roll();
    }
}