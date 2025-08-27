package problem53;

public class Problem53 {
    public static void main(String[] args) {
        TempRange range1 = new TempRange(10, 20);
        TempRange range2 = new TempRange(-5, 5);
        int[] testTemps = {0, 5, 10, 15, 25};
        for (int t : testTemps) {
            System.out.println("Temperature " + t + " in range 10–20: " + range1.contains(t));
            System.out.println("Temperature " + t + " in range -5–5: " + range2.contains(t));
        }
        System.out.println("Width of range 10–20: " + range1.width());
        System.out.println("Width of range -5–5: " + range2.width());
    }
}