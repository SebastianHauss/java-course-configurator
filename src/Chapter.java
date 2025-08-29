public class Chapter extends Element {
    private String book;

    public Chapter(String name, String book) {
        super(name);
        this.book = book;
    }

    public String getBook() {
        return this.book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "[" + super.getName() + "] Book " + "(" + this.book + ")";
    }
}
