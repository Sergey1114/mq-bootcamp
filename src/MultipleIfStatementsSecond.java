public class MultipleIfStatementsSecond {
    public static void main(String[] args) {
        int a = 3, b = 3, c = 3;
        if (a == b && b == c) {
            System.out.println("Equilateral");
        } else if (a == b || b == c || a == c) {
            System.out.println("Isosceles");
        } else {
            System.out.println("Scalene");
        }
    }
}

