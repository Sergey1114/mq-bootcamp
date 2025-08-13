public class SumOfOddIndexes {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6}; // example array
        int sum = 0;
        for (int i = 1; i < a.length; i += 2) {
            sum += a[i];
        }
        System.out.println(sum);
    }
}