public class P49 {
    public static void main(String[] args) {
        int[] a = {2, 4, 5};
        int result = sumArray(a);
        System.out.println(result);
    }

    public static int sumArray(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
}