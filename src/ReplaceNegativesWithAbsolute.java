public class ReplaceNegativesWithAbsolute {
    public static void main(String[] args) {
        int[] a = {4, -67, 3, 56, -4, 0, 76, -74, -7, 34, 31, 2, 0, 32};
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                a[i] = -a[i];
            }
            System.out.println(a[i]);
        }
    }
}