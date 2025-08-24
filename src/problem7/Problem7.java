package problem7;

public class Problem7 {
    public static void main(String[] args) {
        Thermometer thermometer = new Thermometer();
        System.out.println(thermometer.toF() + " " + thermometer.isFreezing());

        thermometer.setC(10);
        System.out.println(thermometer.toF() + " " + thermometer.isFreezing());

        thermometer.setC(-5);
        System.out.println(thermometer.toF() + " " + thermometer.isFreezing());
    }
}