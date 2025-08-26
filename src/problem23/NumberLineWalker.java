package problem23;

public class NumberLineWalker {
    int pos;

    public void stepLeft() {
        pos--;
    }

    public void stepRight() {
        pos++;
    }

    public int getPos() {
        return pos;
    }
}