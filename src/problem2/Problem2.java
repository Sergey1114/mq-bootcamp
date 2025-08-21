package problem2;

public class Problem2 {
    public static void main(String[] args) {
        WaterBottle bottle = new WaterBottle(5);
        bottle.drink(3);

        System.out.println("ml " + bottle.ml);
        System.out.println("isEmpty " + bottle.isEmpty());
        bottle.refill();

        System.out.println("ml " + bottle.ml);
        System.out.println("isEmpty " + bottle.isEmpty());
        bottle.isEmpty();

        System.out.println("ml " + bottle.ml);
        System.out.println("isEmpty " + bottle.isEmpty());
    }
}