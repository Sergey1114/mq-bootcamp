package problem58;

public class Problem58 {
    public static void main(String[] args) {
        SpeedCamera camera = new SpeedCamera();
        camera.setSpeed(49);
        System.out.println("Speed 1:");
        System.out.println("It is fine: " + camera.isFine());
        System.out.println("OverBy: " + camera.overBy());
        System.out.println();
        camera.setSpeed(74);
        System.out.println("Speed 2:");
        System.out.println("It is fine: " + camera.isFine());
        System.out.println("OverBy: " + camera.overBy());
    }
}