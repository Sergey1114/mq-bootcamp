public class P8 {
    public static void main(String[] args) {
        int result = max3(4, 9, 1);
        System.out.println(result);
    }

    public static int max3(int a, int b, int c) {
        if (a >= b && a >= c) return a;
        else if (b >= a && b >= c) return b;
        else return c;
    }
}