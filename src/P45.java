public class P45 {
    public static void main(String[] args) {
        String result = censorBad("Bad day");
        System.out.println(result);
    }

    public static String censorBad(String s) {
        if (s.toLowerCase().contains("bad")) {
            return s.replace("bad", "").replace("Bad", "");
        } else {
            return s;
        }
    }
}