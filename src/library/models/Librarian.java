package library.models;

import java.util.Set;

public class Librarian extends Person {


    public Librarian(String personName, String personAddress, String personPhone) {
        super(personName, personAddress, personPhone);
    }

    @Override
    public String whoYouAre() {
        return "I am a librarian";
    }

    //Kütüphanecinin tüm kitapları görüntülemesi için
    public void printAllBooksLibrarian(Library library){
        library.printAllBooks();
    }

    //Kütüphanecinin kitapları bookID'ye göre görüntülemesi için
    public Book findBookByIdLibrarian(int bookId, Library library){
        return library.findBookById(bookId);
    }

    //Kütüphanecinin kitapları kitap ismine göre görüntülemesi için
    public Book findBookByNameLibrarian(String bookName, Library library) {
        return library.findBookByName(bookName);
    }

    //Kütüphanecinin kitapları yazar ismine göre görüntülemesi için
    public Set<Book> findBooksByAuthorLibrarian(String bookAuthor, Library library) {
        return library.listBooksByAuthors(bookAuthor);
    }


    //Kütüphanecinin kitap ödünç verebilmesi ve fatura
    /*public void borrowBookLibrarian(Book book, Reader reader, Library library) {
        reader.getMemberRecord().borrowBook(book, reader, library);
        System.out.println("The book was borrowed. Approval: Librarian.");
    }*/

    public boolean verifyMember(Reader reader) {
        if (reader.getPersonName() == null || reader.getPersonName().isEmpty()) return false;
        if (reader.getPersonAddress() == null || reader.getPersonAddress().isEmpty()) return false;
        if (reader.getPersonPhone() == null || reader.getPersonPhone().isEmpty()) return false;
        if (reader.getMemberRecord() == null) return false;
        return true;
    }

    public void borrowBookLibrarian(Book book, Reader reader, Library library) {
        if (verifyMember(reader)) {
            reader.getMemberRecord().borrowBook(book, reader, library);
            System.out.println("The book was borrowed. Approval: Librarian.");
        } else {
            System.out.println("Member verification failed. Cannot borrow book.");
        }
    }

    //Kütüphanecinin kitap geri alabilmesi
    public void returnBookLibrarian(Book book, Reader reader, Library library) {
        reader.getMemberRecord().returnBook(book, library);
        System.out.println("The book was returned. Approval: Librarian.");
    }

    //Kütüphane bakiyesi
    public double getLibraryBalance(Library library){
        return library.getLibraryBalance();
    }






}
