package problem27;

public class Problem27 {
    public static void main(String[] args) {
        TreasureChest chest = new TreasureChest();
        chest.unlock();
        chest.addCoins(50);
        chest.lock();
        System.out.println(chest.takeAll());
        chest.unlock();
        System.out.println(chest.takeAll());
    }
}