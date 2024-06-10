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

    public void borrowBook(Book book, Library library){
        if(numberOfBookBorrowed < maxBookLimit && book.isAvailable()){
            borrowedBooks.add(book);
            numberOfBookBorrowed++;
            book.setStatus(false);
            library.updateLibraryBalanceOnBorrow();
            System.out.println("Book borrowed: " + book);
        } else if(numberOfBookBorrowed >= maxBookLimit) {
            System.out.println("!!!Maximum book limit reached!!!");
        } else {
            System.out.println("Book is not available.");
        }
    }

    public void returnBook(Book book, Library library) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            numberOfBookBorrowed--;
            book.setStatus(true);
            library.updateLibraryBalanceOnReturn();
            System.out.println("Book returned: " + book);
        } else {
            System.out.println("This book was not borrowed by you.");
        }
    }

    public void printInvoice(Reader reader, Library library) {
        System.out.println("Invoice:");
        if (reader != null) {
            System.out.println("Member ID: " + memberId);
            System.out.println("Member Name: " + reader.getPersonName());
            System.out.println("Member Address: " + reader.getPersonAddress());
            System.out.println("Member Phone: " + reader.getPersonPhone());
            System.out.println("Member Type: " + memberType);
        }
        System.out.println("Borrowed Books:");
        for (Book book : borrowedBooks) {
            System.out.println(book.getBookName());
        }
        System.out.println("Total Books Borrowed: " + numberOfBookBorrowed);
        System.out.println("Amount paid: " + library.getLibraryBalance() + " TL");
    }
}
