public class P25 {
    public static void main(String[] args) {
        int result = distance1D(3, 10);
        System.out.println(result);
    }

    public static int distance1D(int x, int y) {
        return Math.abs(x - y);
    }
}