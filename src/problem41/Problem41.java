package problem41;

public class Problem41 {
    public static void main(String[] args) {
        Point1D point1Da = new Point1D(5);
        Point1D point1Db = new Point1D(10);
        point1Da.move(2);
        point1Db.move(-1);
        int distance = point1Da.distanceTo(point1Db);
        System.out.println("Distance between points: " + distance);
    }
}