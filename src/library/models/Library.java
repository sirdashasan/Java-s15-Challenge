package library.models;

import java.util.*;

public class Library {

    private Map<Integer, Book> bookCollection = new HashMap<>(); //composition
    private Set<String> categories = new HashSet<>();
    private Set<String> authors = new HashSet<>();

    private double libraryBalance = 0.0; // Kütüphanenin kasa bakiyesi

    private static double BORROW_FEE = 100.0;
    private static double RETURN_FEE = 50.0;


    public Library(){
        addInitialBooks();
    }

    private void addInitialBooks() {
        bookCollection.put(1, new Book(1, "Aşkın Kapısı", "İkbal Bayrak", "Roman", "2024-03-01",true));
        bookCollection.put(2, new Book(2, "Sil Baştan", "Lynn Painter", "Genç Yetişkin", "2024-04-01",true));
        bookCollection.put(3, new Book(3, "Öfke Kralı", "Ana Huang", "Roman", "2024-05-01",true));
        bookCollection.put(4, new Book(4, "Maça Kızı 8", "Dilara Pamuk", "Genç Yetişkin", "2024-06-01",true));
        bookCollection.put(5, new Book(5, "Afili Hafiye", "Murat Menteş", "Polisiye", "2024-03-02",true));
        bookCollection.put(6, new Book(6, "Kendi Işığına Yürü", "Kemal Sayar", "Kişisel Gelişim", "2024-04-02",true));
        bookCollection.put(7, new Book(7, "Çarpık Yalanlar", "Ana Huang", "Roman", "2024-05-02",true));
        bookCollection.put(8, new Book(8, "Kürk Mantolu Madonna", "Sabahattin Ali", "Roman", "2024-06-02",true));
        bookCollection.put(9, new Book(9, "Hayvan Çiftliği", "George Orwell", "Roman", "2024-07-02",true));
        bookCollection.put(10, new Book(10, "Bilinmeyen Bir Kadının Mektubu", "Stefan Zweig", "Roman", "2024-03-03",true));
        bookCollection.put(11, new Book(11, "Körlük", "Jose Saramago", "Roman", "2024-03-04",true));
        bookCollection.put(12, new Book(12, "Körlük", "Jose Saramago", "Roman", "2024-03-04",true));
        bookCollection.put(13, new Book(13, "1984", "George Orwell", "Distopic", "2024-03-05",true));
        bookCollection.put(14, new Magazines(14, "Four Four Two", "Various", "Magazine", "2024-12-06", true, "2024-05"));
        bookCollection.put(15, new StudyBooks(15, "Thomas' Calculus", "George B.Thomas", "Study Book", "2024-12-06", true, "Mathematics"));
        bookCollection.put(16, new Journals(16, "Hybrid Car Vehicles", "Hasan Sırdaş", "Journal", "2024-12-06", true, true));
    }

    // Tüm kitapları yazdırma
    public void printAllBooks() {
        System.out.println("Current books in the library:");
        for (Book book : bookCollection.values()) {
            System.out.println(book);
        }
    }

    // Kitap ekleme (tüm bilgileri ayrı ayrı almak yerine encapsulation)
    public void addBook(Book book, String addedBy) {
        if (bookCollection.containsKey(book.getBookId())) {
            System.out.println("Book ID " + book.getBookId() + " already exists. Adding the book with a new ID.");
            int newId = Collections.max(bookCollection.keySet()) + 1;
            book = new Book(newId, book.getBookName(), book.getBookAuthor(), book.getBookCategory(), book.getBookDateOfPurchase(), book.isAvailable());
        }
        bookCollection.put(book.getBookId(), book);
        System.out.println("Book added: " + book + " added by " + addedBy);
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
    public void updateBookDetails(int bookId, String bookName, String bookAuthor, String bookCategory, String bookDateOfPurchase, boolean status){
        Book book = findBookById(bookId);
        if(book != null){
            book.updateBookDetails(bookName, bookAuthor, bookCategory, bookDateOfPurchase, status);
            System.out.println("Book details updated: " + book);
        } else {
            System.out.println("Book not found: " + bookId);
        }
    }

    // Varolan Kategorileri Set ile Unique Şekilde Yazdırma
    public void printAllCategories() {
        System.out.println("Categories in the library:");
        for (Book book : bookCollection.values()) {
            categories.add(book.getBookCategory().toLowerCase());  // Kategorileri set'e eklediğim yer
        }
        for (String category : categories) {
            System.out.println(category);
        }
    }

    // Kategoriye Göre Kitapları Listeleme (Sıralı gelsin diye LinkedHashSet yaptım)
    public Set<Book> listBooksByCategory(String category) {
        Set<Book> booksInCategory = new LinkedHashSet<>();
        for (Book book : bookCollection.values()) {
            if (book.getBookCategory().equalsIgnoreCase(category)) {
                booksInCategory.add(book);
            }
        }
        if (booksInCategory.isEmpty()) {
            System.out.println("No books found in category: " + category);
        }
        return booksInCategory;
    }

    // Varolan Yazarları Set ile Unique Şekilde Yazdırma
    public void printAllAuthors() {
        System.out.println("Authors in the library:");
        for(Book book : bookCollection.values()) {
            authors.add(book.getBookAuthor().toLowerCase()); // Yazarları set'e eklediğim yer
        }
        for (String author : authors) {
            System.out.println(author);
        }
    }

    // Yazarlara Göre Kitapları Listeleme (Sıralı gelsin diye LinkedHashSet yaptım)
    public Set<Book> listBooksByAuthors(String author) {
        Set<Book> booksInAuthor = new LinkedHashSet<>();
        for (Book book : bookCollection.values()) {
            if (book.getBookAuthor().equalsIgnoreCase(author)) {
                booksInAuthor.add(book);
            }
        }
        if (booksInAuthor.isEmpty()) {
            System.out.println("No books found in author: " + author);
        }
        return booksInAuthor;
    }

    //Kütüphane bakiyesi
    public double getLibraryBalance() {
        return libraryBalance;
    }

    //Kitap ödünç alındığında kütüphane bakiyesinin güncellenmesi
    public double updateLibraryBalanceOnBorrow(MemberType memberType){
        double fee = BORROW_FEE;
        if (memberType == MemberType.STUDENT) {
            fee *= 0.75; // %25 indirim
        }
        libraryBalance += fee;
        return fee;
    }

    //Kitap geri getirildiğinde kütüphane bakiyesinin güncellenmesi
    public void updateLibraryBalanceOnReturn(){
        libraryBalance -= RETURN_FEE;
    }





    @Override
    public String toString() {
        return "Library{" +
                "bookCollection=" + bookCollection +
                '}';
    }
}


