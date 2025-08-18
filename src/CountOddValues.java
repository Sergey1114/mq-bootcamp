public class CountOddValues {
    public static void main(String[] args) {
        int[] a = {6, 3, 1, 8, 0, 3, 4, 7, 2, 4, 7, 5, 7};
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}