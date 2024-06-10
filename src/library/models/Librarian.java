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

    //Kütüphanecinin kitap ödünç verebilmesi
    public void borrowBookLibrarian(Book book, Reader reader, Library library) {
        reader.getMemberRecord().borrowBook(book, reader, library);
    }

    //Kütüphanecinin kitap geri alabilmesi
    public void returnBookLibrarian(Book book, Reader reader, Library library) {
        reader.getMemberRecord().returnBook(book, library);
    }

    //Kütüphanecinin fatura verebilmesi
    public void printInvoiceLibrarian(Reader reader, double amount) {
        reader.getMemberRecord().printInvoice(reader, amount);
    }

    //Kütüphanecinin kitapları bookID'ye göre görüntülemesi için
    public Book findBookByIdWriter(int bookId, Library library){
        return library.findBookById(bookId);
    }

    //Kütüphanecinin kitapları kitap ismine göre görüntülemesi için
    public Book findBookByNameWriter(String bookName, Library library) {
        return library.findBookByName(bookName);
    }

    //Kütüphanecinin kitapları yazar ismine göre görüntülemesi için
    public Set<Book> findBooksByAuthorWriter(String bookAuthor, Library library) {
        return library.listBooksByAuthors(bookAuthor);
    }




}
