public class P36 {
    public static void main(String[] args) {
        boolean result = startsWithHello("Hello world");
        System.out.println(result);
    }

    public static boolean startsWithHello(String s) {
        return s.startsWith("Hello");
    }
}