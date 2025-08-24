package problem7;

public class Thermometer {
    int celsius;

    public void setC(int c) {
        celsius = c;
    }

    public int toF() {
        int F;
        F = celsius * 9 / 5 + 32;
        return F;
    }

    public boolean isFreezing() {
        return celsius < 0;
    }
}