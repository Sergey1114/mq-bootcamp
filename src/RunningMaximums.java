public class RunningMaximums {
    public static void main(String[] args) {
        int[] a = {3, 7, 45, 5, 677, 47, 12, 0, 754, 64, 24, 8, 36};
        int[] runMax = new int[a.length];
        int maxSoFar = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > maxSoFar) {
                maxSoFar = a[i];
            }
            runMax[i] = maxSoFar;
        }
        for (int i = 0; i < runMax.length; i++) {
            System.out.println(runMax[i]);
        }
    }
}