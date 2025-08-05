import java.util.Random;

public class Day4 {
    public static void main(String[] args) {
        Random random = new Random();
       int hour = random.nextInt(0,23);
       if (hour >= 5 && hour <= 11) {
           System.out.println("Morning");
       } else if (hour > 11 && hour <= 16) {
           System.out.println("Afternoon");
       } else if (hour > 16 && hour <= 20) {
           System.out.println("Evening");
       } else {
           System.out.println("Night");
       }
    }
}
