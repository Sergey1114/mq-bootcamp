package problem19;

public class JarLabel {
    String name;
    int count;

    public String label() {
        return name + ": " + count;
    }

    public void rename(String n) {
        name = n;
    }
}