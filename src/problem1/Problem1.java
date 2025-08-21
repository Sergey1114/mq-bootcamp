package problem1;

public class Problem1 {
    public static void main(String[] args) {
        CandyJar jar = new CandyJar(20);
        jar.add(5);

        System.out.println("Count " + jar.count);
        System.out.println("Space left " + jar.spaceLeft());
        jar.add(30);

        System.out.println("Count " + jar.count);
        System.out.println("Space left " + jar.spaceLeft());
        jar.take(7);

        System.out.println("Count " + jar.count);
        System.out.println("Space left " + jar.spaceLeft());
        jar.fill();

        System.out.println("Count " + jar.count);
        System.out.println("Space left " + jar.spaceLeft());
    }
}