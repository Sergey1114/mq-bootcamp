public class SkipNegatives {
    public static void main(String[] args) {
        int[] a = {24, 66, 81, -1, 75, -123, -98, 87};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                continue;
            }
            sum += a[i];
        }
        System.out.println(sum);
    }
}