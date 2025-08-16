public class CopyEvery2nd {
    public static void main(String[] args) {
        int[] a = {3, 7, 5, 0, 8, 3, 5, 7};
        int bLength = (a.length + 1) / 2;
        int[] b = new int[bLength];
        int j = 0;
        for (int i = 0; i < a.length; i += 2) {
            b[j] = a[i];
            j++;
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}