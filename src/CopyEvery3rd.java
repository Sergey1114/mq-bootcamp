public class CopyEvery3rd {
    public static void main(String[] args) {
        int[] a = {2, 7, 4, 6, 8, 8, 5, 3, 4, 8, 9};
        int bLength = 0;
        for (int i = 2; i < a.length; i += 3) {
            bLength++;
        }
        int[] b = new int[bLength];
        int j = 0;
        for (int i = 2; i < a.length; i += 3) {
            b[j] = a[i];
            j++;
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}