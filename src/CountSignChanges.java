public class CountSignChanges {
    public static void main(String[] args) {
        int[] a = {3, -2, 5, -1, 0, -3, 4};
        int count = 0;
        for (int i = 1; i < a.length; i++) {
            if ((a[i - 1] >= 0 && a[i] < 0) || (a[i - 1] < 0 && a[i] >= 0)) {
                count++;
            }
        }
        System.out.println(count);
    }
}