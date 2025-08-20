public class P41 {
    public static void main(String[] args) {
        String result = reverse4("code");
        System.out.println(result);
    }

    public static String reverse4(String s) {
        return s.charAt(3) + "" + s.charAt(2) + "" + s.charAt(1) + "" + s.charAt(0);
    }
}