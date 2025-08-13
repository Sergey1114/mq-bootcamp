public class ReverseIntoNew {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int n = a.length;
        int[] b = {0, 0, 0, 0, 0};
        for (int i = 0; i < n; i++) {
            b[i] = a[n - 1 - i];
        }
        System.out.print("Reversed");
        for (int i = 0; i < n; i++) {
            System.out.print(b[i] + " ");
        }
    }
}