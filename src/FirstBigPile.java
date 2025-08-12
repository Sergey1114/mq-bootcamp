public class FirstBigPile {
    public static void main(String[] args) {
        int[] boxes = {4, 5, 2, 1, 5, 9, 3};
        int i;
        for (i = 0; i < boxes.length; i++) {
            if (boxes[i] > 5) {
                System.out.println("First big pile: " + boxes[i] + " at index " + i);
                break;
            }
        }
        if (i == boxes.length) {
            System.out.println("none");
        }
    }
}
