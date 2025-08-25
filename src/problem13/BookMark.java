package problem13;

public class BookMark {
    String title;
    int page;
    int pages;

    public void nextPage() {
        if (page < pages) {
            page++;
        }
    }

    public void goTo(int p) {
        if (p < 1) {
            page = 1;
        } else if (p > pages) {
            page = pages;
        } else {
            page = p;
        }
    }

    public int leftPages() {
        return pages - page;
    }
}