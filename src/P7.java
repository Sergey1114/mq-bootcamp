public class P7 {
    public static void main(String[] args) {
        int result = min2(3, 8);
        System.out.println(result);
    }

    public static int min2(int a, int b) {
        if (a < b) return a;
        else return b;
    }
}