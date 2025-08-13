public class AverageOfMultiplesOf5 {
    public static void main(String[] args) {
        int[] a = {10, 7, 15, 8, 20};
        int sum = 0, count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 5 != 0) {
                continue;
            }
            sum += a[i];
            count++;
        }
        if (count == 0) {
            System.out.println("none");
        } else {
            double avg = (double) sum / count;
            System.out.println(avg);
        }
    }
}