public class RotateRightBy1 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int last = a[a.length - 1];
        for (int i = a.length - 1; i > 0; i--) {
            a[i] = a[i - 1];
            if (i == 1) {
                a[i - 1] = last;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}