public class MultipleIfStatementsSecond {
    public static void main(String[] args) {
        String light = "green";
        if (light == "yellow") {
            System.out.println("Ready");
        } else if (light == "green") {
            System.out.println("Go");
        } else if (light == "red") {
            System.out.println("Stop");
        }
    }
}