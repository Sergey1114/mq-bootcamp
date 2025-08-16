public class SumBetweenLToR {
    public static void main(String[] args) {
        int[] a = {3, 7, 5, 0, 8, 3, 5, 7};
        int L = 2;
        int R = 5;
        int sum = 0;
        if (L <= R) {
            for (int i = L; i <= R; i++) {
                sum += a[i];
                System.out.println(a[i]);
            }
        }
        System.out.println("Sum = " + sum);
    }
}