public class ComparisonPractice {
    public static void main(String[] args) {
        int time1 = 30;
        int time2 = 28;
        int time3 = 29;
        if (time1 <= time2 && time1 <= time3) {
            System.out.println("runner 1 is the fastest");
        } else if (time2 <= time1 && time2 <= time3) {
            System.out.println("runner 2 is the fastest");
        } else {
            System.out.println("runner 3 is the fastest");
        }
    }
}