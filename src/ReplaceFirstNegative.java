public class ReplaceFirstNegative {
    public static void main(String[] args) {
        int[] a = {3, 0, 4, 6, 7, -4, 0, 1};
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                a[i] = 0;
                break;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}