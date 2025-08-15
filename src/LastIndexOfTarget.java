public class LastIndexOfTarget {
    public static void main(String[] args) {
        int[] a = {23, 49, 58, 12, 10, 47, 386, 35, 97, 4576, 97};
        int target = 47;
        boolean found = false;
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] == target) {
                System.out.println(i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("none");
        }
    }
}