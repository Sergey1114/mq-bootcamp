public class PrefixSums {
    public static void main(String[] args) {
        int[] a = {2, 5, 1, 3};
        int n = a.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
    }
}