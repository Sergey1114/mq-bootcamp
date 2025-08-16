public class ReplaceOutliers {
    public static void main(String[] args) {
        int[] a = {7, 6, 33, 565, 86, 34, 65, 13, 20, 51, 15, 12, 10};
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 10) {
                a[i] = 10;
            }
            if (a[i] > 90) {
                a[i] = 90;
            }
            System.out.println(a[i]);
        }
    }
}