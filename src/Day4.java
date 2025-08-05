public class Day4 {
    public static void main(String[] args) {
        int score = 75;
        if (score > 0 && score <= 20) {
            System.out.println("A");
        } else if (score > 20 && score <= 40) {
            System.out.println("B");
        } else if (score > 40 && score <= 60) {
            System.out.println("C");
        } else if (score > 60 && score <= 80) {
            System.out.println("D");
        } else if (score > 80 && score <= 100) {
            System.out.println("F");
        }
    }
}
