package problem23;

public class Problem23 {
    public static void main(String[] args) {
        NumberLineWalker walker = new NumberLineWalker();
        String[] steps = {"L", "R", "R", "L", "R"};
        for (String step : steps) {
            if (step.equals("L")) {
                walker.stepLeft();
            } else if (step.equals("R")) {
                walker.stepRight();
            }
        }
        System.out.println("Final pos. " + walker.getPos());
    }
}