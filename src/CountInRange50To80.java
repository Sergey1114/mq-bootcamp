public class CountInRange50To80 {
    public static void main(String[] args) {
        int[] a = {45, 50, 60, 80, 81, 100};
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 50 && a[i] <= 80) {
                count++;
            }
        }
        System.out.println(count);
    }
}