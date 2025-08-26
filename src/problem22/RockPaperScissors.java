package problem22;

import java.util.Random;

public class RockPaperScissors {
    String last;
    Random random = new Random();

    public String cpuMove() {
        String[] moves = {"rock", "paper", "scissors"};
        last = moves[random.nextInt(3)];
        return last;
    }

    public int result(String player) {
        if (player.equals(last)) {
            return 0;
        } else if ((player.equals("rock") && last.equals("scissors")) ||
                (player.equals("paper") && last.equals("rock")) ||
                (player.equals("scissors") && last.equals("paper"))) {
            return 1;
        } else {
            return -1;
        }
    }
}