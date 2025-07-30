public class MultipleIfStatementsSecond {
    public static void main(String[] args) {
        int score = 58;
        if (score >= 90) {
            System.out.println("Gold");
        } else if (score >= 75) {
            System.out.println("Silver");
        } else if (score >= 60) {
            System.out.println("Bronze");
        } else {
            System.out.println("None");
        }
    }
}

