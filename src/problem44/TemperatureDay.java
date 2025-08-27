package problem44;

public class TemperatureDay {
    int morning;
    int noon;
    int evening;

    public int max() {
        if (morning >= noon && morning >= evening) return morning;
        if (noon >= morning && noon >= evening) return noon;
        return evening;
    }

    public double avg() {
        return (double) (morning + noon + evening) / 3;
    }
}