public class MultipleIfStatementsSecond {
    public static void main(String[] args) {
        int age = 21;
        if (age > 0 && age <= 2) {
            System.out.println("Baby");
        } else if (age >= 3 && age <= 5) {
            System.out.println("Toddler");
        } else if (age >= 6 && age <= 12) {
            System.out.println("Kid");
        } else if (age >= 13 && age <= 17) {
            System.out.println("Teen");
        } else {
            System.out.println("Adult");
        }
    }
}
