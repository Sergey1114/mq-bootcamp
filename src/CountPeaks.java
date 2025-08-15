public class CountPeaks {
    public static void main(String[] args) {
        int[] a = {1, 5, 2, 7, 9, 4, 0, 8};
        int count = 0;
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i] > a[i - 1] && a[i] > a[i + 1]) {
                count++;
            }
        }
        System.out.println(count);
    }
}