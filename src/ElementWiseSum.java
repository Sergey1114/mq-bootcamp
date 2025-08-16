public class ElementWiseSum {
    public static void main(String[] args) {
        int[] x = {0, 4, 6};
        int[] y = {9, 6, 4};
        int[] z = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            z[i] = x[i] + y[i];
            System.out.println(z[i]);
        }
    }
}