public class FindTheDragon {
    public static void main(String[] args) {
        String[] zoo = {"dragon", "cat", "cow"};
        for (int i = 0; i < zoo.length; i++) {
            if (zoo[i].equals("dragon")) {
                System.out.println(i);
                break;
            } else {
                System.out.println(-1);
            }
        }
    }
}
