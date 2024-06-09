import library.models.Author;
import library.models.Book;
import library.models.Library;
import library.models.Person;

import java.util.HashSet;
import java.util.Set;

public class PersonMain {
    public static void main(String[] args) {

        Library library = new Library();

        //***** AUTHOR CLASS YAZAR OLUŞTURMA *****//
        library.printAllBooks();
        Set<Book> booksWriterByAuthor = new HashSet<>();
        Person author = new Author("George Orwell", booksWriterByAuthor); //Polymorphism
        System.out.println("****************");


        //***** AUTHOR CLASS KİTAP EKLEME *****//
        Book newBook = new Book(1, "Hayvan Çiftliği", "George Orwell", "Roman", "2024-06-06");
        ((Author) author).addBookByWriter(newBook, library); // Down casting

        System.out.println("****************");
        library.printAllBooks();
        System.out.println("****************");

        // ***** AUTHOR CLASS KİTAPLARI ID'YE GÖRE GÖRÜNTÜLEME ***** //
        Book bookById = ((Author) author).findBookByIdWriter(6, library);
        System.out.println(bookById);

        // ***** AUTHOR CLASS KİTAPLARI KİTAP İSMİNE GÖRE GÖRÜNTÜLEME ***** //
        Book bookByName = ((Author) author).findBookByNameWriter("Körlük",library);
        System.out.println(bookByName);

        // ***** AUTHOR CLASS KİTAPLARI YAZAR İSMİNE GÖRE GÖRÜNTÜLEME ***** //
        Set<Book> booksByAuthor = ((Author) author).findBooksByAuthorWriter("George Orwell",library);
        for (Book book : booksByAuthor) {
            System.out.println(book);
        }



    }
}
