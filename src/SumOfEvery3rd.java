public class SumOfEvery3rd {
    public static void main(String[] args) {
        int[] a = {4, 7, 1, 9, 2, 3, 5};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (i % 3 == 2) {
                sum += a[i];
            }
        }
        System.out.println(sum);
    }
}