public class MultipleIfStatementsSecond {
    public static void main(String[] args) {
        int letter = 20;
        if (letter >= 0 && letter <= 20) {
            System.out.println("A");
        } else if (letter > 20 && letter <= 40) {
            System.out.println("B");
        } else if (letter > 40 && letter <= 60) {
            System.out.println("C");
        } else if (letter > 60 && letter <= 80) {
            System.out.println("D");
        } else if (letter > 80 && letter <= 100) {
            System.out.println("F");
        }
    }
}


