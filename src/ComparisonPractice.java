public class ComparisonPractice {
    public static void main(String[] args) {
        int score1 = 37;
        int score2 = 45;
        if (score1 > score2) {
            System.out.println(score1 + " is bigger than " + score2);
        } else if (score2 > score1) {
            System.out.println(score2 + " is bigger than " + score1);
        } else if (score1 == score2) {
            System.out.println(score1 + " is equal to " + score2);
        }
    }
}