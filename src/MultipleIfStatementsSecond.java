public class MultipleIfStatementsSecond {
    public static void main(String[] args) {
        int battery = 29;
        if (battery >= 0 && battery <= 20) {
            System.out.println("Red");
        } else if (battery >= 21 && battery <= 50) {
            System.out.println("Yellow");
        } else if (battery >= 51 && battery <= 100) {
            System.out.println("Green");
        }
    }
}


