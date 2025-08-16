public class MergeAlternating {
    public static void main(String[] args) {
        int[] x = {3, 5, 0};
        int[] y = {7, 9, 4};
        int[] z = new int[x.length + y.length];
        for (int i = 0; i < x.length; i++) {
            z[2 * i] = x[i];
            z[2 * i + 1] = y[i];
        }
        for (int i = 0; i < z.length; i++) {
            System.out.println(z[i]);
        }
    }
}