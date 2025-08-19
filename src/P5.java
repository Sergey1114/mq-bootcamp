public class P5 {
    public static void main(String[] args) {
        int result = absInt(-12);
        System.out.println(result);
    }

    public static int absInt(int n) {
        if (n < 0) return -n;
        else return n;
    }
}