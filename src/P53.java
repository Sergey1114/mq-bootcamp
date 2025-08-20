public class P53 {
    public static void main(String[] args) {
        int[] a = {5, 9, 9, 1};
        int result = indexOfMaxFirst(a);
        System.out.println(result);
    }
    public static int indexOfMaxFirst(int[] a) {
        int max = a[0];
        int index = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                index = i;
            }
        }
        return index;
    }
}