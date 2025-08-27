package problem46;

public class Problem46 {
    public static void main(String[] args) {
        FuelGauge gauge = new FuelGauge();
        gauge.add(8685);
        System.out.println(gauge.consumeForKm(2000));
        System.out.println(gauge.left());
    }
}