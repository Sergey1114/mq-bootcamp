public class ComparisonPractice {
    public static void main(String[] args) {
        int a = 9;
        int b = 12;
        int num = 10;
        if ((a - num) < (b - num)) {
            System.out.println("a is closer");
        } else if ((a - num) == (b - num)) {
            System.out.println("equal");
        } else {
            System.out.println("b is closer");
        }
    }
}