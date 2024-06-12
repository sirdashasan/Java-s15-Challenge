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
        Book book1 = new Book(1, "Aşkın Kapısı", "İkbal Bayrak", "Roman", "2024-03-01", true);
        library.addBook(book1, "Hasan");
        System.out.println("****************");
        library.printAllBooks();*/

        //***** KİTAP SİLME *****//
        /*library.printAllBooks();
        System.out.println("****************");
        library.removeBook(5);
        library.printAllBooks();*/

        //***** ID'YE GÖRE, İSME GÖRE VE YAZARA GÖRE KİTAP SEÇME *****//
        /*Book bookById = library.findBookById(6);
        System.out.println(bookById);

        Book bookByName = library.findBookByName("Körlük");
        System.out.println(bookByName);

        Book booksByAuthor = library.findBooksByAuthor("Jose Saramago");
        System.out.println(booksByAuthor);*/

        //***** KİTAP BİLGİLERİNİ GÜNCELLEME *****//
        /*library.printAllBooks();
        System.out.println("****************");
        library.updateBookDetails(10, "Güncel Aşkın Kapısı", "Güncel İkbal Bayrak",
                "Güncel Roman", "2024-08-06",false);
        System.out.println("****************");
        library.printAllBooks();*/

        //*********************************//************************************************//

        //***** KATEGORİLERİ UNIQUE ŞEKİLDE YAZDIRMA *****//
        /*library.printAllBooks();
        System.out.println("****************");
        library.printAllCategories();
*/
        //***** KATEGORİYE GÖRE KİTAPLARI LİSTELEME *****//
        /*System.out.println("****************");
        String categoryToFind = "roman";
        Set<Book> booksInCategory = library.listBooksByCategory(categoryToFind);
        if((!booksInCategory.isEmpty())) {
            System.out.println("Books in category: " + categoryToFind);
            for (Book book : booksInCategory) {
                System.out.println(book);
            }
        }*/

        //***** YAZARLARI UNIQUE ŞEKİLDE YAZDIRMA *****//
        /*System.out.println("****************");
        library.printAllAuthors();*/

        //***** YAZARLARA GÖRE KİTAPLARI LİSTELEME *****//
        /*System.out.println("****************");
        String authorToFind = "george orwell";
        Set<Book> booksInAuthor = library.listBooksByAuthors(authorToFind);
        if((!booksInAuthor.isEmpty())) {
            System.out.println("Books in author: " + authorToFind);
            for (Book book : booksInAuthor) {
                System.out.println(book);
            }
        }*/















    }
}