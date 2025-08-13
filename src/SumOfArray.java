public class SumOfArray {
    public static void main(String[] args) {
        int[] a = {3, 4, 6, 12, 9};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }
}