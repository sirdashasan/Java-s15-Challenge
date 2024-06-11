package library.models;

import java.util.HashSet;
import java.util.Set;

public class Author extends Person{

    private Set<Book> booksWriter = new HashSet<>();


    public Author(String personName, String personAddress, String personPhone, Set<Book> booksWriter) {
        super(personName, personAddress, personPhone);
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
