package problem45;

public class Problem45 {
    public static void main(String[] args) {
        RectangleBoard board = new RectangleBoard();
        board.w = 3;
        board.h = 5;
        board.fill = '*';
        System.out.println(board.draw());
        System.out.println(board.area());
    }
}