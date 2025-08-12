public class Day7 {
    public static void main(String[] args) {
        String color = "Red";
        switch (color.toLowerCase()) {
            case "red":
                System.out.println("Stop");
                break;
            case "yellow":
                System.out.println("Wait");
                break;
            case "green":
                System.out.println("Go");
                break;
        }
    }
}