public class CountIncreases {
    public static void main(String[] args) {
        int[] a = {2, 5, 1, 8, 3, 5, 0, 2, 4, 6, 7, 9};
        int count = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i]>a[i-1]) {
                count++;
            }
        }
        System.out.println(count);
    }
}