public class SkipSpoilers {
    public static void main(String[] args) {
        String[] words = {"tag", "bird", "spoiler", "PC"};
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("spoiler")) {
                continue;
            } else {
                System.out.println(words[i]);
            }
        }
    }
}