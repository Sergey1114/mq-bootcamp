package problem13;

public class Problem13 {
    public static void main(String[] args) {
        BookMark book = new BookMark();
        book.pages = 100;
        book.page = 1;
        book.goTo(book.page + 5);
        System.out.println(book.leftPages());
    }
}