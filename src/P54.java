public class P54 {
    public static void main(String[] args) {
        int[] a = {0, 3, 0};
        int result = countZeros(a);
        System.out.println(result);
    }
    public static int countZeros(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                count++;
            }
        }
        return count;
    }
}