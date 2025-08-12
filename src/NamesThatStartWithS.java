public class NamesThatStartWithS {
    public static void main(String[] args) {
        String[] names = {"Sargis", "Sergey", "Valodik"};
        int count = 0;
        for (int i =0; i < names.length; i++) {
            if (names[i].toLowerCase().charAt(0) == 's') {
                count++;
            }
        }
        System.out.println(count);
    }
}