public class P51 {
    public static void main(String[] args) {
        int[] a = {9, 3, 7};
        int result = minArray(a);
        System.out.println(result);
    }

    public static int minArray(int[] a) {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }
}