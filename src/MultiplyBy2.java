public class MultiplyBy2 {
    public static void main(String[] args) {
        int[] a = {7, 4, 68, 32, 1, 56, 7, 0};
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] * 2;
            System.out.println(a[i]);
        }
    }
}