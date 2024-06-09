package library.models;

public class Magazines extends Book{
    private String issueNumber;

    public Magazines(int bookId, String bookName, String bookAuthor, String bookCategory, String bookDateOfPurchase, boolean status,
                     String issueNumber) {
        super(bookId, bookName, bookAuthor, bookCategory, bookDateOfPurchase, status);
        this.issueNumber = issueNumber;
    }

    public String getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(String issueNumber) {
        this.issueNumber = issueNumber;
    }

    @Override
    public String toString() {
        return  '{' + super.toString() +
                " issueNumber='" + issueNumber + '\'' +
                '}';
    }
}
