import java.util.Random;

public class P47 {
    public static void main(String[] args) {
        int[] a = new int[10];
        Random random = new Random();
        fillRandom0to100(a, random);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void fillRandom0to100(int[] a, Random random) {
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(101);
        }
    }
}