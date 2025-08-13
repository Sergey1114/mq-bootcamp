public class CountMultiplesOf5 {
    public static void main(String[] args) {
        int[] a = {23, 45, 55, 10, 98, 13, 25, 70};
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 5 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}