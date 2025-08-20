public class P55 {
    public static void main(String[] args) {
        int[] a = {2, 5, 8};
        int result = countEven(a);
        System.out.println(result);
    }

    public static int countEven(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}