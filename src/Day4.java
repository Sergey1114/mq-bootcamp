import java.util.Random;

public class Day4 {
    public static void main(String[] args) {
        Random random = new Random();
        char ch1 =(char) random.nextInt(97, 123);
        char ch2 =(char) random.nextInt(97, 123);
        char ch3 =(char) random.nextInt(97, 123);
        System.out.println(ch1 + "," + ch2 + "," + ch3);
    }
}