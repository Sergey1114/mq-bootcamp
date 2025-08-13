public class CountZeros {
    public static void main(String[] args) {
        int[] e = {35, 55, 100, 360, 0, 10, 0, 0, 0, 0, 0, 25};
        int count = 0;
        for (int i = 0; i < e.length; i++) {
            if (e[i] == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}