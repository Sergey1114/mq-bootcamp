public class P50 {
    public static void main(String[] args) {
        int[] a = {2, 4, 6};
        double result = averageArray(a);
        System.out.println(result);
    }

    public static double averageArray(int[] a) {
        int count = 0;
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < a.length; i++) {
            count++;
            sum += a[i];
            avg = sum / count;
        }
        return avg;
    }
}