import java.util.Arrays;
import java.util.Random;

public class FillAndShow {
    public static void main(String[] args) {
        Random random = new Random();
        int[] a = new int[8];
        for (int i = 0; i < 8; i++) {
            a[i] = random.nextInt(1, 100);
        }
        System.out.println(Arrays.toString(a));
    }
}