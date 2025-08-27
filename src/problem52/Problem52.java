package problem52;

public class Problem52 {
    public static void main(String[] args) {
        CounterWithLimit counter = new CounterWithLimit();
        counter.value = 2;
        counter.min = 0;
        counter.max = 5;
        System.out.println("Value: " + counter.value);
        for (int i = 0; i < 5; i++) {
            counter.up();
            System.out.println("After up(): " + counter.value + ", atEdge? " + counter.atEdge());
        }
        for (int i = 0; i < 7; i++) {
            counter.down();
            System.out.println("After down(): " + counter.value + ", atEdge? " + counter.atEdge());
        }
        counter.value = 10;
        System.out.println("Before clamp: " + counter.value);
        counter.clamp();
        System.out.println("After clamp: " + counter.value);
    }
}