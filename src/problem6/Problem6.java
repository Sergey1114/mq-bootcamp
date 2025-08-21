package problem6;

public class Problem6 {
    public static void main(String[] args) {
        Coin coin = new Coin();
        int headsCount = 0;
        for (int i = 0; i < 20; i++) {
            coin.flip();
            if (coin.isHead()) {
                headsCount++;
            }
        }
        System.out.println(headsCount);
    }
}