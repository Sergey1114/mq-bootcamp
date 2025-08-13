public class RaiseLowScores {
    public static void main(String[] args) {
        int[] a = {29, 465, 145, 7, 65, 31, 48, 60, 40, 28};
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 40) {
                System.out.print(a[i] + " become: ");
                a[i] = 40;
                System.out.print(a[i] + ", ");
            }
        }
    }
}
