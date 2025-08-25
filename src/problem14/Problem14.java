package problem14;

public class Problem14 {
    public static void main(String[] args) {
        StepCounter stepCounter = new StepCounter();
        stepCounter.addSteps(3000);
        System.out.println("steps 3000");

        if (stepCounter.reached(10000)) {
            System.out.println("Goal reached");
        } else {
            System.out.println("Goal not reached yet");
        }

        stepCounter.addSteps(1000);
        System.out.println("steps 4000");

        stepCounter.addSteps(6000);
        System.out.println("steps: 10000");

        if (stepCounter.reached(10000)) {
            System.out.println("Goal reached");
        } else {
            System.out.println("Goal not reached yet");
        }
    }
}