package problem59;

public class Problem59 {
    public static void main(String[] args) {
        CounterStep step = new CounterStep();
        step.start = 0;
        step.step = 3;
        step.reset();
        for (int i = 0; i < 5; i++) {
            System.out.println(step.nextValue());
        }
    }
}