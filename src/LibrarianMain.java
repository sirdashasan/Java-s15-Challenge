import library.models.*;

import java.util.Set;

public class LibrarianMain {
    public static void main(String[] args) {
        Library library = new Library();

        // Kütüphaneci oluşturma
        Librarian librarian = new Librarian("Kütüphaneci", "İTÜ Kütüphane", "555-12-9999");

        //***** KÜTÜPHANECİ TÜM KİTAPLARI GÖRÜNTÜLEME *****//
        /*librarian.printAllBooksLibrarian(library);
        System.out.println("************************");*/

        //***** KÜTÜPHANECİ KİTAPLARI ID, İSİM VE YAZARA GÖRE GÖRÜNTÜLEME *****//
        //Kitap ID'ye, kitap ismine ve yazar ismine göre arama
        /*Book bookById = librarian.findBookByIdLibrarian(5, library);
        System.out.println("Book found by ID: " + bookById);


        Book bookByName = librarian.findBookByNameLibrarian("Hayvan Çiftliği", library);
        System.out.println("Book found by name: " + bookByName);


        Set<Book> booksByAuthor = librarian.findBooksByAuthorLibrarian("George Orwell", library);
        System.out.println("Books found by author:");
        for (Book book : booksByAuthor) {
            System.out.println(book);
        }

        System.out.println("************************");
        System.out.println("************************");
        System.out.println("************************");
        System.out.println("************************");
        System.out.println("************************");*/

        //***** KÜTÜPHANECİ ÜYELİK ONAYI VE DİĞER İŞLEMLER *****//

        // Öğrenci ve faculty oluşturma
        /*MemberRecord studentRecord = new MemberRecord(5, "2024-01-01", MemberType.STUDENT);
        Student student = new Student("Ali Veli", "Ankara Çankaya", "555-123-4567", studentRecord, "855");

        MemberRecord facultyRecord = new MemberRecord(6, "2024-01-01", MemberType.FACULTY);
        Faculty faculty = new Faculty("Ahmet Hoca", "Ankara Çankaya", "555-123-4567", facultyRecord, "Mathematics", "Assoc. Prof. Dr.");


        System.out.println("*****????**********?????*********");
        if (librarian.verifyMember(student) || librarian.verifyMember(faculty)) {
            System.out.println("Member verified successfully.");
        } else {
            System.out.println("Member verification failed.");
        }
        System.out.println("*****????**********?????*********");*/

        // Öğrenciye kitap ödünç verme, fatura alma ve iade etme
        /*Book studentBookToBorrow = librarian.findBookByIdLibrarian(5, library);
        librarian.borrowBookLibrarian(studentBookToBorrow, student, library);

        double totalAmount = student.getMemberRecord().getNumberOfBookBorrowed() * library.getBorrowFee(studentRecord.getMemberType());
        student.getMemberRecord().printInvoice(student, totalAmount);

        System.out.println("************************");
        System.out.println("Güncel kütüphane bakiyesi: " + librarian.getLibraryBalance(library) + " TL");
        System.out.println("************************");

        librarian.returnBookLibrarian(studentBookToBorrow, student, library);
        System.out.println("Güncel kütüphane bakiyesi: " + librarian.getLibraryBalance(library) + " TL");*/


    }
}
