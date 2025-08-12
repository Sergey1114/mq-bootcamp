public class Day7 {
    public static void main(String[] args) {
        String w = "code";
        String rev = "";
        for (int i = w.length() - 1; i >= 0; i--) {
            rev = rev + w.charAt(i);
        }
        System.out.println(w);
        System.out.println(rev);
    }
}