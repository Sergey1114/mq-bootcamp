public class DigitHistogram {
    public static void main(String[] args) {
        int[] a = {3, 7, 6, 0, 2, 9, 8, 1, 4, 2, 5,};
        int[] freq = new int[10];
        for (int i = 0; i < a.length; i++) {
            freq[a[i]]++;
        }
        for (int i = 0; i < freq.length; i++) {
            System.out.println(i + " = " + freq[i] );
        }
    }
}