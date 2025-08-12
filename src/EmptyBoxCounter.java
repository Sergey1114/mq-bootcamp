public class EmptyBoxCounter {
    public static void main(String[] args) {
        int[] boxes = {1, 3, 0, 5, 0, 7, 8, 0};
        int count = 0;
        for (int i = 0; i < boxes.length; i++) {
            if (boxes[i] == 0) {
                count++;
            }
        }
        System.out.println("empty boxes " + count);
    }
}
