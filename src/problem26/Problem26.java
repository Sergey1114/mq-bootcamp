package problem26;

public class Problem26 {
    public static void main(String[] args) {
        SimpleSlot simpleSlot = new SimpleSlot();
        int count = 0;
        do {
            simpleSlot.spin();
            count++;
        } while (!simpleSlot.jackpot());
        System.out.println(count);
    }
}