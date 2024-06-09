package library.models;

import java.util.ArrayList;
import java.util.List;

public class MemberRecord {

    private int memberId;
    private String dateOfMembership;
    private int maxBookLimit = 5; // max alınabilecek kitap limiti
    private int numberOfBookBorrowed; // Ödünç alınmış kitap sayısı
    private MemberType memberType; // Üye tipi enums
    private List<Book> borrowedBooks = new ArrayList<>(); // Ödünç alınmış kitapların listesi

    public MemberRecord(int memberId, String dateOfMembership, MemberType memberType) {
        this.memberId = memberId;
        this.dateOfMembership = dateOfMembership;
        this.numberOfBookBorrowed = 0;
        this.memberType = memberType;

    }

    public int getMemberId() {
        return memberId;
    }

    public String getDateOfMembership() {
        return dateOfMembership;
    }

    public int getMaxBookLimit() {
        return maxBookLimit;
    }

    public int getNumberOfBookBorrowed() {
        return numberOfBookBorrowed;
    }

    public MemberType getMemberType() {
        return memberType;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Book book){
        if(numberOfBookBorrowed < maxBookLimit && book.isAvailable()){
            borrowedBooks.add(book);
            numberOfBookBorrowed++;
            book.setStatus(false);
            System.out.println("Book borrowed: " + book);
        } else if(numberOfBookBorrowed >= maxBookLimit) {
            System.out.println("!!!Maximum book limit reached!!!");
        } else {
            System.out.println("Book is not available.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            numberOfBookBorrowed--;
            book.setStatus(true);
            System.out.println("Book returned: " + book);
        } else {
            System.out.println("This book was not borrowed by you.");
        }
    }
}
