public class P43 {
    public static void main(String[] args) {
        String result = toTItleSimple("mHer");
        System.out.println(result);
    }

    public static String toTItleSimple(String s) {
        String first = s.substring(0, 1).toUpperCase();
        String rest = s.substring(1).toLowerCase();
        return first + rest;
    }
}