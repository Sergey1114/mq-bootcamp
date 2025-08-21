package problem5;

public class Problem5 {
    public static void main(String[] args) {
        Dice dice = new Dice();
        for (int i = 0; i < 10; i++) {
            int result = dice.roll();
            System.out.println(i + 1 + ":" + result);
        }
    }
}