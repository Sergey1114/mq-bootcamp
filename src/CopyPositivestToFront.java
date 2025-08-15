import java.util.Arrays;

public class CopyPositivestToFront {
    public static void main(String[] args) {
        int[] a = {-3, -2, 2, 0, -5, 4, 16, -23};
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                a[j] = a[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(a));
        for (int i = j; i < a.length; i++) {
            a[i] = 0;
        }
        System.out.println(Arrays.toString(a));
    }
}