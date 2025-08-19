public class P3 {
    public static void main(String[] args) {
        System.out.println(signOf(-9));
        System.out.println(signOf(0));
        System.out.println(signOf(7));
    }
    static int signOf(int n) {
        if (n < 0) return -1;
        else if (n > 0) return 1;
        else return 0;
    }
}