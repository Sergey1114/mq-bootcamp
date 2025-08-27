package problem43;

public class GradeCard {
    String name;
    int[] marks;

    public GradeCard(String name, int subjects) {
        this.name = name;
        this.marks = new int[subjects];
    }

    public void setMark(int i, int v) {
        if (i >= 0 && i < marks.length) {
            marks[i] = v;
        }
    }

    public double average() {
        int sum = 0;
        for (int m : marks) {
            sum += m;
        }
        return (double) sum / marks.length;
    }

    public char letter() {
        double avg = average();
        if (avg >= 90) {
            return 'A';
        } else if (avg >= 80) {
            return 'B';
        } else if (avg >= 70) {
            return 'C';
        } else if (avg >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}