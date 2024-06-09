package library.models;

import java.util.Objects;

public class Book {
    private int bookId;
    private String bookName;
    private String bookAuthor;
    private String bookCategory;
    private String bookDateOfPurchase;
    private boolean status; // true ise kitap mevcut false ise kitap birisi tarafından alınmış.

    public Book(int bookId, String bookName, String bookAuthor, String bookCategory, String bookDateOfPurchase, boolean status) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookCategory = bookCategory;
        this.bookDateOfPurchase = bookDateOfPurchase;
        this.status = status;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public String getBookCategory() {
        return bookCategory;
    }

    public String getBookDateOfPurchase() {
        return bookDateOfPurchase;
    }

    public boolean isAvailable() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //Kitap bilgilerinin güncellenmesi
    public void updateBookDetails(String bookName, String bookAuthor, String bookCategory, String bookDateOfPurchase, boolean status){
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookCategory = bookCategory;
        this.bookDateOfPurchase = bookDateOfPurchase;
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookId == book.bookId && status == book.status && Objects.equals(bookName, book.bookName) && Objects.equals(bookAuthor, book.bookAuthor) && Objects.equals(bookCategory, book.bookCategory) && Objects.equals(bookDateOfPurchase, book.bookDateOfPurchase);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId, bookName, bookAuthor, bookCategory, bookDateOfPurchase, status);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookCategory='" + bookCategory + '\'' +
                ", bookDateOfPurchase='" + bookDateOfPurchase + '\'' +
                ", status=" + (status ? "available" : "borrowed") +
                '}';
    }
}
