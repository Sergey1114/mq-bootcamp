package problem20;

public class Problem20 {
    public static void main(String[] args) {
        TemperatureLog1 temperatureLog1 = new TemperatureLog1();
        temperatureLog1.add(3);
        System.out.println(temperatureLog1.avg() + ", " + temperatureLog1.max());
        temperatureLog1.add(4);
        System.out.println(temperatureLog1.avg() + ", " + temperatureLog1.max());
        temperatureLog1.add(5);
        System.out.println(temperatureLog1.avg() + ", " + temperatureLog1.max());
        temperatureLog1.add(6);
        System.out.println(temperatureLog1.avg() + ", " + temperatureLog1.max());
        temperatureLog1.add(7);
        System.out.println(temperatureLog1.avg() + ", " + temperatureLog1.max());
    }
}