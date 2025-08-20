public class P33 {
    public static void main(String[] args) {
        char result = firstChar("cat");
        System.out.println(result);
    }

    public static char firstChar(String s) {
        return s.charAt(0);
    }
}