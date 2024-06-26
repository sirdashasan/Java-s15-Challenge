package library.models;

public class StudyBooks extends Book {
    private String subject;


    public StudyBooks(int bookId, String bookName, String bookAuthor, String bookCategory, String bookDateOfPurchase, boolean status,
                      String subject) {
        super(bookId, bookName, bookAuthor, bookCategory, bookDateOfPurchase, status);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return '{' + super.toString() +
                " subject='" + subject + '\'' +
                '}';
    }
}
