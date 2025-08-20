public class P38 {
    public static void main(String[] args) {
        String result = replaceSpaces("a b");
        System.out.println(result);
    }

    public static String replaceSpaces(String s) {
        return s.replace(" ", "_");
    }
}