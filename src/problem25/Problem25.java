package problem25;

public class Problem25 {
    public static void main(String[] args) {
        Spinner spinner = new Spinner(5);
        Spinner spinner1 = new Spinner(8);
        for (int i = 0; i < 5; i++) {
            int result = spinner.spin();
            System.out.println(result);
        }
        for (int i = 0; i < 5; i++) {
            int result = spinner1.spin();
            System.out.println(result);
        }
    }
}