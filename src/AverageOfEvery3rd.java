public class AverageOfEvery3rd {
    public static void main(String[] args) {
        int[] a = {4, 7, 1, 9, 2, 3, 5};
        int sum = 0, count = 0;
        for (int i = 0; i < a.length; i++) {
            if (i % 3 == 2) {
                sum += a[i];
                count++;
            }
        }
        if (count == 0) {
            System.out.println("none");
        } else {
            double avg = sum * 1.0 / count;
            System.out.println(avg);
        }
    }
}