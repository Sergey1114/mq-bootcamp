public class BLEEPTheBadWord {
    public static void main(String[] args) {
        String[] words = {"We", "love", "Bad", "java", "BAD", "much"};
        for (int i = 0; i < words.length; i++) {
            if (words[i].equalsIgnoreCase("bad")) {
                words[i] = "****";
            }
        }
        System.out.println(String.join(" ", words));
    }
}