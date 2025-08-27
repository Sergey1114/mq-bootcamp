package problem71;

public class Student {
    String name;
    int score;

    public void addScore(int s) {
        score += s;
    }

    public boolean passed() {
        return score > 60;
    }

    public String info() {
        return "Name:" + name + ", Score = " + score;
    }
}