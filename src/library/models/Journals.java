package library.models;

public class Journals extends Book {
    private boolean hasReferences;

    public Journals(int bookId, String bookName, String bookAuthor, String bookCategory, String bookDateOfPurchase,
                    boolean hasReferences) {
        super(bookId, bookName, bookAuthor, bookCategory, bookDateOfPurchase);
        this.hasReferences = hasReferences;
    }

    public boolean isHasReferences() {
        return hasReferences;
    }

    public void setHasReferences(boolean hasReferences) {
        this.hasReferences = hasReferences;
    }

    @Override
    public String toString() {
        return '{' + super.toString() +
                " hasReferences=" + hasReferences +
                '}';
    }
}
