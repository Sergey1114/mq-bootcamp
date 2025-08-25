package problem12;

public class ScoreCounter {
    int score;

    public void add(int pts) {
        score += pts;
    }

    public void bonusIfOver(int threshold, int bonus) {
        if (score > threshold) {
            score += bonus;
        }
    }

    public int get() {
        return score;
    }
}