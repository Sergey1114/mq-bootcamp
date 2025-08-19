public class P17 {
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(2021));
        System.out.println(isLeapYear(2024));
    }
}