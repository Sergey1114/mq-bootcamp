package problem55;

public class Problem55 {
    public static void main(String[] args) {
        Ladder ladder = new Ladder(5);
        ladder.up();
        System.out.println("Now at step " + ladder.current);
        System.out.println("At top: " + ladder.atTop());
        System.out.println("At bottom: " + ladder.atBottom());
        System.out.println();
        ladder.up();
        System.out.println("Now at step " + ladder.current);
        System.out.println("At top: " + ladder.atTop());
        System.out.println("At bottom: " + ladder.atBottom());
        System.out.println();
        ladder.up();
        System.out.println("Now at step " + ladder.current);
        System.out.println("At top: " + ladder.atTop());
        System.out.println("At bottom: " + ladder.atBottom());
        System.out.println();
        ladder.down();
        System.out.println("Now at step " + ladder.current);
        System.out.println("At top: " + ladder.atTop());
        System.out.println("At bottom: " + ladder.atBottom());
        System.out.println();
        ladder.down();
        System.out.println("Now at step " + ladder.current);
        System.out.println("At top: " + ladder.atTop());
        System.out.println("At bottom: " + ladder.atBottom());
        System.out.println();
    }
}