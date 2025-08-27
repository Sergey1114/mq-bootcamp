package problem45;

public class RectangleBoard {
    int w;
    int h;
    char fill;

    public String draw() {
        String result = "";
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                result += fill;
            }
            result += "\n";
        }
        return result;
    }

    int area() {
        return w * h;
    }
}