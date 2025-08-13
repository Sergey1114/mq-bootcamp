public class SumUntilNegative {
    public static void main(String[] args) {
        int[] a = {3, 5, 7, -2, 4};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                break;
            }
            sum += a[i];
        }
        System.out.println(sum);
    }
}