public class BalanceIndex {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 6};
        int leftSum = 0;
        int rightSum = 0;
        int total = 0;
        for (int i = 0; i < a.length; i++) {
            total += a[i];
        }
        for (int i = 0; i < a.length; i++) {
            rightSum = total - leftSum - a[i];
            if (leftSum == rightSum) {
                System.out.println(i);
                break;
            }
            leftSum += a[i];
        }
    }
}