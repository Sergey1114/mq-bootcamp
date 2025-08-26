package problem21;

public class Problem21 {
    public static void main(String[] args) {
        GuessBox guessBox = new GuessBox();
        int count = 0;
        guessBox.newSecret();
        for (int i = 1; i <= 10; i++) {
            count++;
            if (guessBox.guess(i)) {
                break;
            }
        }
        System.out.println(count);
    }
}