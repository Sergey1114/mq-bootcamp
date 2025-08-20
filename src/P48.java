public class P48 {
    public static void main(String[] args) {
        int[] a = {3, 7, 0, 10};
        printArray(a);
    }

    public static void printArray ( int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}