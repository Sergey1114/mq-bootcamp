package problem44;

public class Problem44 {
    public static void main(String[] args) {
        TemperatureDay day = new TemperatureDay();
        day.morning = 20;
        day.noon = 25;
        day.evening = 18;
        day.max();
        day.avg();
        System.out.println(day.max());
        System.out.println(day.avg());
    }
}