import library.models.*;

import java.util.HashSet;
import java.util.Set;

public class PersonMain {
    public static void main(String[] args) {

        Library library = new Library();

        //***** AUTHOR CLASS YAZAR OLUŞTURMA *****//
        /*Set<Book> booksWriterByAuthor = new HashSet<>();
        Person author = new Author("George Orwell", booksWriterByAuthor); //Polymorphism
        System.out.println("****************");*/

        //***** AUTHOR CLASS KİTAPLARI GÖRÜNTÜLEME *****//
        /*((Author) author).printAllBooksWriter(library);
        System.out.println("****************");*/


        //***** AUTHOR CLASS KİTAP EKLEME *****//
        /*Book newBook = new Book(1, "Hayvan Çiftliği", "George Orwell", "Roman", "2024-06-06");
        ((Author) author).addBookByWriter(newBook, library); // Down casting*/


        // ***** AUTHOR CLASS KİTAPLARI ID'YE GÖRE GÖRÜNTÜLEME ***** //
        /*Book bookById = ((Author) author).findBookByIdWriter(6, library);
        System.out.println(bookById);*/

        // ***** AUTHOR CLASS KİTAPLARI KİTAP İSMİNE GÖRE GÖRÜNTÜLEME ***** //
        /*Book bookByName = ((Author) author).findBookByNameWriter("Körlük",library);
        System.out.println(bookByName);
*/
        // ***** AUTHOR CLASS KİTAPLARI YAZAR İSMİNE GÖRE GÖRÜNTÜLEME ***** //
        /*Set<Book> booksByAuthor = ((Author) author).findBooksByAuthorWriter("George Orwell",library);
        for (Book book : booksByAuthor) {
            System.out.println(book);
        }*/

        // *****///***** //

        //***** READER CLASS READER OLUŞTURMA *****//
        MemberRecord memberRecord = new MemberRecord(1, "2024-01-01", MemberType.STUDENT);
        Person reader = new Reader("Taylan Can Köse", memberRecord);


        //***** READER KİTAP ÖDÜNÇ ALMA *****//
        Book bookToBorrow = library.findBookById(5);
        ((Reader) reader).getMemberRecord().borrowBook(bookToBorrow);
        Book bookToBorrow2 = library.findBookById(1);
        ((Reader) reader).getMemberRecord().borrowBook(bookToBorrow2);
        Book bookToBorrow3 = library.findBookById(2);
        ((Reader) reader).getMemberRecord().borrowBook(bookToBorrow3);
        Book bookToBorrow4 = library.findBookById(6);
        ((Reader) reader).getMemberRecord().borrowBook(bookToBorrow4);
        Book bookToBorrow5 = library.findBookById(7);
        ((Reader) reader).getMemberRecord().borrowBook(bookToBorrow5);
        Book bookToBorrow6 = library.findBookById(8);
        ((Reader) reader).getMemberRecord().borrowBook(bookToBorrow6);
        System.out.println("Borrowed Books:");
        for (Book book : ((Reader) reader).getMemberRecord().getBorrowedBooks()) {
            System.out.println(book);
        }

        //Ödünç alınan kitap sayısı
        System.out.println(reader.getPersonName() + " has borrowed " +
                ((Reader) reader).getMemberRecord().getNumberOfBookBorrowed() + " books.");
        System.out.println("****************");
        library.printAllBooks();
        System.out.println("****************");



        System.out.println("****************");
        System.out.println("****************");
        System.out.println("****************");
        //***** READER KİTAP GERİ VERME *****//
        ((Reader) reader).getMemberRecord().returnBook(bookToBorrow);
        ((Reader) reader).getMemberRecord().returnBook(bookToBorrow2);


        System.out.println("****************");
        library.printAllBooks();










    }
}
