public class P11 {
    public static void main(String[] args) {
        int result = nextEven(8);
        System.out.println(result);
    }

    public static int nextEven(int n) {
        if (n % 2 == 0) return n;
        else return n + 1;
    }
}