public class P6 {
    public static void main(String[] args) {
        int result = max2(3, 8);
        System.out.println(result);
    }

    public static int max2(int a, int b) {
        if (a > b) return a;
        else return b;
    }
}