import org.w3c.dom.ls.LSOutput;

public class DifferenceArray {
    public static void main(String[] args) {
        int[] a = {4, 7, 10, 6};
        int n = a.length;
        int[] diff = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            diff[i] = a[i + 1] - a[i];
            System.out.print(diff[i] + " ");
        }
    }
}