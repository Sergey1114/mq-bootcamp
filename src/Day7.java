public class Day7 {
    public static void main(String[] args) {
        String snack = "chocolate";
        for (int i = 0; i < snack.length(); i++) {
            if (snack.charAt(i) == 'a') {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}