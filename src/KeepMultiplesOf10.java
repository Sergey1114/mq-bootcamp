public class KeepMultiplesOf10 {
    public static void main(String[] args) {
        int[] a = {2, 6, 4, 9, 6, 1, 9, 28, 58, 30, 60, 24, 6, 40};
        int[] b = new int[a.length];
        int j = 0;
        boolean found = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 10 == 0) {
                b[j] = a[i];
                j++;
                found = true;
            }
        }
        for (int k = j; k < b.length; k++) {
            b[k] = -1;
        }
        if (!found) {
            System.out.println("none");
        } else {
            for (int k = 0; k < b.length; k++) {
                System.out.println(b[k]);
            }
        }
    }
}