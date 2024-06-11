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

    public void borrowBook(Book book, Reader reader, Library library){
        if(numberOfBookBorrowed < maxBookLimit && book.isAvailable()){
            borrowedBooks.add(book);
            numberOfBookBorrowed++;
            book.setStatus(false);
            book.setBorrowedBy(reader); // Kitabı ödünç alan kişiyi ayarla
            double amount = library.updateLibraryBalanceOnBorrow(memberType);
            System.out.println("Book borrowed: " + book);
        } else if(numberOfBookBorrowed >= maxBookLimit) {
            System.out.println("!!!Maximum book limit reached!!!");
        } else {
            if (book.getBorrowedBy() != null) {
                System.out.println("Book is not available. This book is borrowed by " + book.getBorrowedBy().getPersonName());
            }
        }
    }

    public void returnBook(Book book, Library library) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            numberOfBookBorrowed--;
            book.setStatus(true);
            book.setBorrowedBy(null);
            library.updateLibraryBalanceOnReturn();
            System.out.println("Book returned: " + book);
        } else {
            System.out.println("This book was not borrowed by you.");
        }
    }


    public void printInvoice(Reader reader, double amount) {
        System.out.println("***$$$*****INVOICE:***$$$*****");
        if (reader != null) {
            System.out.println("Member ID: " + memberId);
            System.out.println("Member Name: " + reader.getPersonName());
            System.out.println("Member Address: " + reader.getPersonAddress());
            System.out.println("Member Phone: " + reader.getPersonPhone());
            System.out.println("Member Type: " + memberType);
            if (reader instanceof Student) {
                System.out.println("Student Number: " + ((Student) reader).getStudentNumber());
            } else if (reader instanceof Faculty) {
                System.out.println("Faculty Department: " + ((Faculty) reader).getFacultyDepartment());
                System.out.println("Faculty Title: " + ((Faculty) reader).getFacultyTitle());
            }
        }
        System.out.println("Borrowed Books:");
        for (Book book : borrowedBooks) {
            System.out.println(book.getBookName());
        }
        System.out.println("Total Books Borrowed: " + numberOfBookBorrowed);
        System.out.println("Amount paid: " + amount + " TL");
        System.out.println("***$$$*****INVOICE:***$$$*****");
    }
}
