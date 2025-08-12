import java.util.Random;

public class CandyBoxes {
    public static void main(String[] args) {
        Random rand = new Random();
        int total = 0;
        System.out.print("Boxes: ");
        for (int i = 0; i < 6; i++) {
            int candies = rand.nextInt(1, 10);
            System.out.print(candies + " ");
            total = total + candies;
        }
        System.out.println("\nTotal candies: " + total);
    }
}