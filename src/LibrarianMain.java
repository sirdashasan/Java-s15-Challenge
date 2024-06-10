import library.models.*;

import java.util.Set;

public class LibrarianMain {
    public static void main(String[] args) {
        Library library = new Library();

        // Kütüphaneci oluşturma
        Librarian librarian = new Librarian("Kütüphaneci", "İTÜ Kütüphane", "555-12-9999");

        // Öğrenci oluşturma
        MemberRecord studentRecord = new MemberRecord(5, "2024-01-01", MemberType.STUDENT);
        Student student = new Student("Ali Veli", "Ankara Çankaya", "555-123-4567", studentRecord, "855");

        // Faculty oluşturma
        MemberRecord facultyRecord = new MemberRecord(6, "2024-01-01", MemberType.FACULTY);
        Faculty faculty = new Faculty("Ahmet Hoca", "Ankara Çankaya", "555-123-4567", facultyRecord, "Mathematics", "Assoc. Prof. Dr.");

        // Tüm kitapları görüntüleme
        librarian.printAllBooksLibrarian(library);

        // Öğrenciye kitap ödünç verme
        Book bookToBorrow = librarian.findBookByIdWriter(5, library);
        librarian.borrowBookLibrarian(bookToBorrow, student, library);

        // Öğrenciye fatura verme
        librarian.printInvoiceLibrarian(student, library.getLibraryBalance());

        // Faculty'ye kitap ödünç verme
        Book facultyBookToBorrow = librarian.findBookByIdWriter(7, library);
        librarian.borrowBookLibrarian(facultyBookToBorrow, faculty, library);

        // Faculty'ye fatura verme
        librarian.printInvoiceLibrarian(faculty, library.getLibraryBalance());

        // Kitap ismine göre arama
        Book bookByName = librarian.findBookByNameWriter("Hayvan Çiftliği", library);
        System.out.println("Book found by name: " + bookByName);

        // Yazar ismine göre kitapları listeleme
        Set<Book> booksByAuthor = librarian.findBooksByAuthorWriter("George Orwell", library);
        System.out.println("Books found by author:");
        for (Book book : booksByAuthor) {
            System.out.println(book);
        }
    }
}
