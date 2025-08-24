package problem8;

public class Problem8 {
    public static void main(String[] args) {
        PizzaSlice pizzaSlice = new PizzaSlice(8);
        pizzaSlice.eat(3);
        System.out.println("Slices left " + pizzaSlice.left());

        pizzaSlice.eat(2);
        System.out.println("Slices left " + pizzaSlice.left());

        pizzaSlice.eat(5);
        System.out.println("Slices left " + pizzaSlice.left());
    }
}