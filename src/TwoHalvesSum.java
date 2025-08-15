public class TwoHalvesSum {
    public static void main(String[] args) {
        int[] a = {3, 6, 1, 8, 6, 0, 9, 3};
        int n = a.length;
        int middle = n / 2;
        int sumfirst = 0;
        int sumlast = 0;
        for (int i = 0; i < middle; i++) {
            sumfirst += a[i];
        }
        for (int i = middle; i < n; i++) {
            sumlast += a[i];
        }
        if (sumfirst > sumlast) {
            System.out.println(sumfirst + " First half wins");
        } else if (sumlast > sumfirst) {
            System.out.println(sumlast + " Last half wins");
        } else {
            System.out.println("Tie");
        }
    }
}