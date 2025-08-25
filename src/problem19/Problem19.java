package problem19;

public class Problem19 {
    public static void main(String[] args) {
        JarLabel jarLabel = new JarLabel();
        jarLabel.count = 12;
        jarLabel.name = "Gumdrops";
        jarLabel.rename("Jellybeans");
        jarLabel.label();
        System.out.println(jarLabel.label());
    }
}