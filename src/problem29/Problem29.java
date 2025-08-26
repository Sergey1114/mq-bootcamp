package problem29;

public class Problem29 {
    public static void main(String[] args) {
        DicePair pair = new DicePair();
        int doublesCount = 0;
        int rolls = 100;
        for (int i = 0; i < rolls; i++) {
            if (pair.doubles()) {
                doublesCount++;
            }
        }
        System.out.println("doubles " + doublesCount);
    }
}