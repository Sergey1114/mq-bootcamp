package problem49;

public class Problem49 {
    public static void main(String[] args) {
        Triangle3Sides sides = new Triangle3Sides();
        System.out.println("Perimeter: " + sides.perimeter());
        System.out.println("Is Valid Simple: " + sides.isValidSimple());
    }
}