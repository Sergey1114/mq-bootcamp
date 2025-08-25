package problem15;

public class Battery {
    int percent;

    public void charge(int n) {
        percent += n;
        if (percent > 100) {
            percent = 100;
        }
    }

    public void use(int n) {
        percent -= n;
        if (percent < 0) {
            percent = 0;
        }
    }

    public boolean low() {
        return percent < 15;
    }
}