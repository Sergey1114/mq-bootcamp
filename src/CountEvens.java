public class CountEvens {
    public static void main(String[] args) {
        int[] a = {12, 23, 34, 45, 56, 67,};
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}