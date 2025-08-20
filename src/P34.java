public class P34 {
    public static void main(String[] args) {
        char result = lastChar("cat");
        System.out.println(result);
    }

    public static char lastChar(String s) {
        return s.charAt(s.length() - 1);
    }
}