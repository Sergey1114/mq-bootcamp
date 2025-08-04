public class ComparisonPractice {
    public static void main(String[] args) {
        int a =4;
        int b = 10;
        int c = 7;
        if (a < b && a < c) {
            System.out.println("a is the smallest");
        } else if (a > b && b < c) {
            System.out.println("b is the smallest");
        } else if (a > c && c < b) {
            System.out.println("c is the smallest");
        } else if (a == b && b == c) {
            System.out.println("equal");
        }
    }
}