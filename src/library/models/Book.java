package library.models;

import java.util.Objects;

public class Book {
    private int bookId;
    private String bookName;
    private String bookAuthor;
    private String bookCategory;
    private String bookDateOfPurchase;

    public Book(int bookId, String bookName, String bookAuthor, String bookCategory, String bookDateOfPurchase) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookCategory = bookCategory;
        this.bookDateOfPurchase = bookDateOfPurchase;
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

    //Kitap bilgilerinin güncellenmesi
    public void updateBookDetails(String bookName, String bookAuthor, String bookCategory, String bookDateOfPurchase){
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookCategory = bookCategory;
        this.bookDateOfPurchase = bookDateOfPurchase;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookId == book.bookId && Objects.equals(bookName, book.bookName) && Objects.equals(bookAuthor, book.bookAuthor) && Objects.equals(bookCategory, book.bookCategory) && Objects.equals(bookDateOfPurchase, book.bookDateOfPurchase);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId, bookName, bookAuthor, bookCategory, bookDateOfPurchase);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookCategory='" + bookCategory + '\'' +
                ", bookDateOfPurchase='" + bookDateOfPurchase + '\'' +
                '}';
    }
}
