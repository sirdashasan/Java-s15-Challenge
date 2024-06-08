package library.models;

import java.util.HashMap;
import java.util.Map;

public class Library {

    private Map<Integer, Book> bookCollection = new HashMap<>(); //composition

    public Library(){
        addInitialBooks();
    }

    private void addInitialBooks() {
        bookCollection.put(1, new Book(1, "Aşkın Kapısı", "İkbal Bayrak", "Roman", "2024-03-01"));
        bookCollection.put(2, new Book(2, "Sil Baştan", "Lynn Painter", "Genç Yetişkin", "2024-04-01"));
        bookCollection.put(3, new Book(3, "Öfke Kralı", "Ana Huang", "Roman", "2024-05-01"));
        bookCollection.put(4, new Book(4, "Maça Kızı 8", "Dilara Pamuk", "Genç Yetişkin", "2024-06-01"));
        bookCollection.put(5, new Book(5, "Afili Hafiye", "Murat Menteş", "Polisiye", "2024-03-02"));
        bookCollection.put(6, new Book(6, "Kendi Işığına Yürü", "Kemal Sayar", "Kişisel Gelişim", "2024-04-02"));
        bookCollection.put(7, new Book(7, "Çarpık Yalanlar", "Ana Huang", "Roman", "2024-05-02"));
        bookCollection.put(8, new Book(8, "Kürk Mantolu Madonna", "Sabahattin Ali", "Roman", "2024-06-02"));
        bookCollection.put(9, new Book(9, "Hayvan Çiftliği", "George Orwell", "Roman", "2024-07-02"));
        bookCollection.put(10, new Book(10, "Bilinmeyen Bir Kadının Mektubu", "Stefan Zweig", "Roman", "2024-03-03"));
        bookCollection.put(11, new Book(11, "Körlük", "Jose Saramago", "Roman", "2024-03-04"));
        bookCollection.put(12, new Book(12, "Körlük", "Jose Saramago", "Roman", "2024-03-04"));
    }

    // Tüm kitapları yazdırma
    public void printAllBooks() {
        System.out.println("Current books in the library:");
        for (Book book : bookCollection.values()) {
            System.out.println(book);
        }
    }

    // Kitap ekleme (tüm bilgileri ayrı ayrı almak yerine encapsulation)
    public void addBook(Book book){
        bookCollection.put(book.getBookId(), book);
        System.out.println("Book added: " + book);
    }

    // Kitap silme
    public void removeBook(int bookId){
        if (bookCollection.containsKey(bookId)){
            bookCollection.remove(bookId);
            System.out.println("Book removed: " + bookId);
        } else {
            System.out.println("Book not found: " + bookId);
        }
    }

    // ID'ye göre kitap seçme
    public Book findBookById(int bookId){
        return bookCollection.get(bookId);
    }

    //Kitap ismine göre kitap seçme
    public Book findBookByName(String bookName){
        for (Book book : bookCollection.values()) {
            if (book.getBookName().equalsIgnoreCase(bookName)) {
                return book;
            }
        }
        return null;
    }

    //Yazar ismine göre kitap seçme
    public Book findBooksByAuthor(String bookAuthor){
        for (Book book : bookCollection.values()) {
            if (book.getBookAuthor().equalsIgnoreCase(bookAuthor)) {
                return book;
            }
        }
        return null;
    }

    //Kitap bilgileri güncelleme(book classındaki updateBookDetails methodu ile)
    public void updateBookDetails(int bookId, String bookName, String bookAuthor, String bookCategory, String bookDateOfPurchase){
        Book book = findBookById(bookId);
        if(book != null){
            book.updateBookDetails(bookName, bookAuthor, bookCategory, bookDateOfPurchase);
            System.out.println("Book details updated: " + book);
        } else {
            System.out.println("Book not found: " + bookId);
        }
    }


    @Override
    public String toString() {
        return "Library{" +
                "bookCollection=" + bookCollection +
                '}';
    }
}

