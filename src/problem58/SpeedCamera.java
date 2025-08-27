package problem58;

public class SpeedCamera {
    int speed;
    final int limit = 70;

    public void setSpeed(int s) {
        speed = s;
    }

    public boolean isFine() {
        return speed <= limit;
    }

    public int overBy() {
        if (speed > limit) {
            return speed - limit;
        } else {
            return 0;
        }
    }
}