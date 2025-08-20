public class P37 {
    public static void main(String[] args) {
        boolean result = endsWithBang("Look! Wow!");
        System.out.println(result);
    }

    public static boolean endsWithBang(String s) {
        return s.endsWith("Wow!");
    }
}