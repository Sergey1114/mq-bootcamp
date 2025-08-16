public class AvgOfNonMultiplesOf3 {
    public static void main(String[] args) {
        int[] a = {3, 7, 5, 0, 8, 3, 5, 7};
        int count = 0;
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 3 != 0) {
                count++;
                sum += a[i];
            }
        }
        if (count > 0) {
            int avg = sum / count;
            System.out.println(avg);
        } else {
            System.out.println("none");
        }
    }
}