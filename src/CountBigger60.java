public class CountBigger60 {
    public static void main(String[] args) {
        int[] a = {59, 23, 80, 7, 46, 79, 35, 35, 32, 57, 96, 45};
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 60) {
                count++;
            }
        }
        System.out.println(count);
    }
}