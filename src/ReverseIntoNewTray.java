import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseIntoNewTray {
    public static void main(String[] args) {
        int[] boxes = {4, 7, 2, 9, 5, 9, 3};
        int[] rev = new int[boxes.length];
        for (int i = 0; i < boxes.length; i++) {
            rev[i] = boxes[boxes.length - 1 - i];
        }
        System.out.println("boxes " + Arrays.toString(boxes));
        System.out.println("rev   " + Arrays.toString(rev));
    }
}