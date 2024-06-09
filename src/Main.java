import library.models.Author;
import library.models.Book;
import library.models.Library;
import library.models.Person;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        //***** KİTAP EKLEME *****//
        /*library.printAllBooks();
        System.out.println("****************");
        Book book1 = new Book(1, "Aşkın Kapısı", "İkbal Bayrak", "Roman", "2024-03-01");
        library.addBook(book1, "Hasan");
        System.out.println("****************");
        library.printAllBooks();*/

        //***** KİTAP SİLME *****//
        /*library.printAllBooks();
        System.out.println("****************");
        library.removeBook(1);
        library.printAllBooks();*/

        //***** ID'YE GÖRE KİTAP SEÇME *****//
        /*Book bookById = library.findBookById(6);
        System.out.println(bookById);*/

        //***** KİTAP İSMİNE GÖRE KİTAP SEÇME *****//
        /*Book bookByName = library.findBookByName("Körlük");
        System.out.println(bookByName);*/

        //***** YAZAR İSMİNE GÖRE KİTAP SEÇME *****//
        /*Book booksByAuthor = library.findBooksByAuthor("Ana Huang");
        System.out.println(booksByAuthor);*/

        //***** KİTAP BİLGİLERİNİ GÜNCELLEME *****//
       /* library.printAllBooks();
        System.out.println("****************");
        library.updateBookDetails(10, "Güncel Aşkın Kapısı", "Güncel İkbal Bayrak",
                "Güncel Roman", "2024-08-06");
        System.out.println("****************");
        library.printAllBooks();*/

        //***** KATEGORİLERİ UNIQUE ŞEKİLDE YAZDIRMA *****//
        /*library.printAllBooks();
        System.out.println("****************");
        library.printAllCategories();*/

        //***** KATEGORİYE GÖRE KİTAPLARI LİSTELEME *****//
        /*library.printAllBooks();
        System.out.println("****************");
        String categoryToFind = "roman";
        Set<Book> booksInCategory = library.listBooksByCategory(categoryToFind);
        if((!booksInCategory.isEmpty())) {
            System.out.println("Books in category: " + categoryToFind);
            for (Book book : booksInCategory) {
                System.out.println(book);
            }
        }*/

        //***** YAZARLARI UNIQUE ŞEKİLDE YAZDIRMA *****//
        /*library.printAllBooks();
        System.out.println("****************");
        library.printAllAuthors();*/

        //***** YAZARLARA GÖRE KİTAPLARI LİSTELEME *****//
        /*library.printAllBooks();
        System.out.println("****************");
        String authorToFind = "george orwell";
        Set<Book> booksInAuthor = library.listBooksByAuthors(authorToFind);
        if((!booksInAuthor.isEmpty())) {
            System.out.println("Books in author: " + authorToFind);
            for (Book book : booksInAuthor) {
                System.out.println(book);
            }
        }*/

        //***** MAGAZINES, STUDYBOOKS VE JOURNALS EKLENMİŞ HALİ *****//
        //library.printAllBooks();














    }
}