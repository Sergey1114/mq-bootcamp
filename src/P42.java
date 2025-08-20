public class P42 {
    public static void main(String[] args) {
        boolean result = isPalindromeWord("level");
        System.out.println(result);
    }

    public static boolean isPalindromeWord(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}