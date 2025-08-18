public class AddIndex {
    public static void main(String[] args) {
        int[] a = {5, 384, 6, 57, 4, 7, 9, 4, 67};
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] + i;
            System.out.println(a[i]);
        }
    }
}