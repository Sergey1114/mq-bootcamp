package problem47;

public class Problem47 {
    public static void main(String[] args) {
        StepGoal goal = new StepGoal();
        goal.add(1500);
        System.out.println("Left: " + goal.left());
        System.out.println("Done: " + goal.done());
    }
}