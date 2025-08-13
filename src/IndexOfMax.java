public class IndexOfMax {
    public static void main(String[] args) {
        int[] value = {2,3,45,5,679,12,790,123};
        int max = value[0];
        int idx = 0;
        for (int i = 0; i < value.length; i++) {
            if (value[i] > max) {
                max = value[i];
                idx = i;
            }
        }
        System.out.println("first index of largest value " + idx);
    }
}