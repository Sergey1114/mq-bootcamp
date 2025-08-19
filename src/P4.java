public class P4 {
    public static void main(String[] args) {
        int result = clamp0to100(145);
        System.out.println(result);
    }

    public static int clamp0to100(int n) {
        if (n < 0) return 0;
        if (n > 100) return 100;
        return n;
    }
}