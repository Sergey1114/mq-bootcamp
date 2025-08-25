package problem12;

public class Problem12 {
    public static void main(String[] args) {
        ScoreCounter scoreCounter = new ScoreCounter();
        scoreCounter.add(10);
        scoreCounter.bonusIfOver(5, 3);
        System.out.println(scoreCounter.get());
    }
}