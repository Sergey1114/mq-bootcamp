public class FirstBigger90 {
    public static void main(String[] args) {
        int[] a = {89, 90, 78, 91, 100, 92};
        boolean found = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 90) {
                System.out.println(a[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("none");
        }
    }
}