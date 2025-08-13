public class AverageOfArray {
    public static void main(String[] args) {
        double[] num = {12.5, 2.7, 10.9};
        double sum = 0;
        double avg = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[1];
        }
        avg = sum / num.length;
        System.out.println(avg);
    }
}