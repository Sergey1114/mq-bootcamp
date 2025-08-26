package problem22;

import java.util.Random;

public class Problem22 {
    public static void main(String[] args) {
        RockPaperScissors rps = new RockPaperScissors();
        Random random = new Random();
        String[] moves = {"rock", "paper", "scissors"};
        int wins = 0;
        int draws = 0;
        int losses = 0;
        for (int round = 1; round <= 10; round++) {
            String playerMove = moves[random.nextInt(3)];
            String cpuMove = rps.cpuMove();
            int outcome = rps.result(playerMove);
            if (outcome == 1) wins++;
            else if (outcome == 0) draws++;
            else losses++;
        }
        System.out.println("Wins: " + wins);
        System.out.println("Draws: " + draws);
        System.out.println("Losses: " + losses);
    }
}