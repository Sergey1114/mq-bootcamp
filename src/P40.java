public class P40 {
    public static void main(String[] args) {
        int result = indexOfFirstA("cake");
        System.out.println(result);
    }

    public static int indexOfFirstA(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                return i;
            }
        }
        return -1;
    }
}