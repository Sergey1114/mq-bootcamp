package problem17;

public class Problem17 {
    public static void main(String[] args) {
        CircleApprox circleApprox = new CircleApprox();
        circleApprox.r = 5;
        circleApprox.area();
        circleApprox.circumference();
        System.out.println("Circle radius " + circleApprox.r);
        System.out.println("Area " + circleApprox.area());
        System.out.println("Circumference " + circleApprox.circumference());
    }
}