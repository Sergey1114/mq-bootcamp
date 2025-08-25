package problem16;

public class Problem16 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.w = 4;
        r1.h = 5;
        System.out.println("Rectangle 1 ");
        System.out.println("Area " + r1.area());
        System.out.println("Perimeter " + r1.peri());
        System.out.println("Is square? " + r1.isSquare());

        System.out.println();

        Rectangle r2 = new Rectangle();
        r2.w = 3;
        r2.h = 3;
        System.out.println("Rectangle 2 ");
        System.out.println("Area " + r2.area());
        System.out.println("Perimeter " + r2.peri());
        System.out.println("Is square? " + r2.isSquare());
    }
}