public class EqualNeighbors {
    public static void main(String[] args) {
        boolean[] a = {true, true, false};
        boolean found = false;
        for (int i = 1; i < a.length; i++) {
            if (a[i] == a[i - 1]) {
                found = true;
                break;
            }
        }
        System.out.println(found);
    }
}