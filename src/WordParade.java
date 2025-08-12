public class WordParade {
    public static void main(String[] args) {
        String[] words = {"we", "love", "java"};
        String sentence = "";
        for (int i = 0; i < words.length; i++) {
            if (i > 0) {
                sentence += " ";
            }
            sentence = sentence + words[i];
        }
        System.out.println(sentence);
    }
}