public class P52 {
    public static void main(String[] args) {
        int[] a = {9, 3, 7};
        int result = minArray(a);
        System.out.println(result);
    }

    public static int minArray(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }
}