public class CountTarget {
    public static void main(String[] args) {
        int[] a = {7, 4, 5, 0, 1, 7, 4, 8, 1, 2, 34, 63, 99, 1, 7};
        int target = 7;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println(count);
        } else {
            System.out.println("none");
        }
    }
}