public class Day7 {
    public static void main(String[] args) {
        String name = "Banana";
        int count = 0;
        name = name.toLowerCase();
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println(count);
    }
}