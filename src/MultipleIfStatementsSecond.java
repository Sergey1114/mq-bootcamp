public class MultipleIfStatementsSecond {
    public static void main(String[] args) {
        int temp = 15;
        if (temp < 0) {
            System.out.println("Very Cold");
        } else if (temp < 15) {
            System.out.println("Cold");
        } else if (temp < 25) {
            System.out.println("Warm");
        }else{
            System.out.println("Hot");
        }
    }
}