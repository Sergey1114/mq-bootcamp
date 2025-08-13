public class SumOfMultiplesOf5 {
    public static void main(String[] args) {
        int[] a = {23, 45, 15, 10, 19, 30, 40, 45, 28};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 5 != 0) {
                continue;
            }
            sum += a[i];
        }
        System.out.println(sum);
    }
}