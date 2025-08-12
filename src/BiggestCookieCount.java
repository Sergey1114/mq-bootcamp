public class BiggestCookieCount {
    public static void main(String[] args) {
        int[] boxes = {4, 7, 2, 8, 5, 9, 3};
        int max = boxes[0];
        for (int i = 1; i < boxes.length; i++) {
            if (boxes[i] > max) {
                max = boxes[i];
            }
        }
        System.out.println("biggest cookie count " + max);
    }
}