package library.models;

import java.util.HashSet;
import java.util.Set;

public class Author extends Person{

    private Set<Book> booksWriter = new HashSet<>();


    public Author(String personName, Set<Book> booksWriter) {
        super(personName);
        this.booksWriter = booksWriter;
    }

    public Set<Book> getbooksWriter() {
        return booksWriter;
    }

    //Yazarın tüm kitapları görüntülemesi
    public void printAllBooksWriter(Library library){
        library.printAllBooks();
    }

    // Yazarın kütüphaneye kitap eklemesi
    public void addBookByWriter(Book book, Library library){
        library.addBook(book, "author " + getPersonName());
    }


    /*//Yazarın kitapları bookID'ye göre görüntülemesi için
    public Book findBookByIdWriter(int bookId, Library library){
        return library.findBookById(bookId);
    }

    //Yazarın kitapları kitap ismine göre görüntülemesi için
    public Book findBookByNameWriter(String bookName, Library library) {
        return library.findBookByName(bookName);
    }

    //Yazarın kitapları yazar ismine göre görüntülemesi için
    public Set<Book> findBooksByAuthorWriter(String bookAuthor, Library library) {
        return library.listBooksByAuthors(bookAuthor);
    }
*/

    @Override
    public String whoYouAre() {
        return "I am an author";
    }

    @Override
    public String toString() {
        return "Author{" +
                "booksWriter=" + booksWriter +
                '}' + super.toString() ;
    }
}
