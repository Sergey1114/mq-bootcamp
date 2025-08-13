public class ZeroOutOdds {
    public static void main(String[] args) {
        int[] a = {50, 40, 12, 44, 87, 70, 68, 13, 35, 49, 52, 25, 125};
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                a[i] = 0;
            }
            System.out.print(a[i] + " ");
        }
    }
}
