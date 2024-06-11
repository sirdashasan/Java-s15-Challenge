import library.models.*;

import java.util.HashSet;
import java.util.Set;

public class PersonMain {
    public static void main(String[] args) {

        Library library = new Library();

        //***** AUTHOR CLASS YAZAR OLUŞTURMA *****//
        /*Set<Book> booksWriterByAuthor = new HashSet<>();
        Person author = new Author("George Orwell","İzmir Karşıyaka", "554-789-6129", booksWriterByAuthor);
        System.out.println("****************");*/

        //***** AUTHOR CLASS KİTAPLARI GÖRÜNTÜLEME ve KİTAP EKLEME *****//
        /*((Author) author).printAllBooksWriter(library);
        System.out.println("****************");


        Book newBook = new Book(1, "Hayvan Çiftliği", "George Orwell", "Roman", "2024-06-06",true);
        ((Author) author).addBookByWriter(newBook, library);

        ((Author) author).printAllBooksWriter(library);*/


        // **********************************///******************************************* //

        //***** READER CLASS READER OLUŞTURMA *****//
        /*library.printAllBooks();
        System.out.println("****************");
        MemberRecord memberRecord = new MemberRecord(1, "2024-01-01", MemberType.STUDENT);
        Person reader = new Reader("Taylan Can Köse","İzmir Karşıyaka", "554-789-6129", memberRecord);
        MemberRecord memberRecord2 = new MemberRecord(2, "2024-01-01", MemberType.FACULTY);
        Person reader2 = new Reader("Mehmet Algül","İzmir Karşıyaka", "554-320-3248", memberRecord);
*/

        //***** READER KİTAP ÖDÜNÇ ALMA *****//
        /*Book bookToBorrow = library.findBookById(5);
        ((Reader) reader).borrowBook(bookToBorrow, library);
        Book bookToBorrow2 = library.findBookById(1);
        ((Reader) reader).borrowBook(bookToBorrow2, library);
        Book bookToBorrow3 = library.findBookById(2);
        ((Reader) reader).borrowBook(bookToBorrow3, library);
        Book bookToBorrow4 = library.findBookById(6);
        ((Reader) reader).borrowBook(bookToBorrow4, library);
        Book bookToBorrow5 = library.findBookById(7);
        ((Reader) reader).borrowBook(bookToBorrow5, library);
        Book bookToBorrow6 = library.findBookById(8);
        ((Reader) reader).borrowBook(bookToBorrow6, library);
        System.out.println("Borrowed Books:");
        for (Book book : ((Reader) reader).getMemberRecord().getBorrowedBooks()) {
            System.out.println(book);
        }*/

        //Fatura bastır
        /*System.out.println("***$$$*****INVOICE:***$$$*****");
        double totalAmount = ((Reader) reader).getMemberRecord().getNumberOfBookBorrowed() * library.getBorrowFee(memberRecord.getMemberType());
        ((Reader) reader).getMemberRecord().printInvoice((Reader) reader, totalAmount);
        System.out.println("***$$$*****INVOICE:***$$$*****");*/

        //Ödünç alınan kitap sayısı
        /*System.out.println(reader.getPersonName() + " has borrowed " +
                ((Reader) reader).getMemberRecord().getNumberOfBookBorrowed() + " books.");
        System.out.println("****************");
        library.printAllBooks();

        System.out.println("****************");
        System.out.println("****************");
        System.out.println("****************");*/

        //***** READER KİTAP GERİ VERME *****//
        /*((Reader) reader).getMemberRecord().returnBook(bookToBorrow, library);
        ((Reader) reader).getMemberRecord().returnBook(bookToBorrow2, library);


        System.out.println("****************");
        library.printAllBooks();

        System.out.println("****************");
*/
        // İkinci bir kişi alınan kitabı isterse
        /*Book bookToBorrow7 = library.findBookById(7);
        ((Reader) reader2).borrowBook(bookToBorrow7, library);*/



        // **********************************///******************************************* //

        //***** READER KİTAP ÖDÜNÇ ALMA VE GERİ GETİRME KÜTÜPHANE BAKİYESİNİN HESABI *****//

        //***** READER OLUŞTURMA *****//
       /* library.printAllBooks();
        System.out.println("****************");

        MemberRecord memberRecord = new MemberRecord(3, "2024-01-01", MemberType.STUDENT);
        Person reader = new Reader("Hasan Sırdaş", "İzmir Karşıyaka", "554-600-6599", memberRecord);


        System.out.println("*********KİTAP ÖDÜNÇ ALMA*******");
        Book bookToBorrow = library.findBookById(5);
        ((Reader) reader).borrowBook(bookToBorrow, library);

        Book bookToBorrow2 = library.findBookById(1);
        ((Reader) reader).borrowBook(bookToBorrow2, library);


        System.out.println("****************");
        library.printAllBooks();
        System.out.println("Library Balance: " + library.getLibraryBalance() + " TL");

        System.out.println("****************");
        System.out.println("****************");
        System.out.println("****************");*/


        //***** READER KİTAP İADE ETME ve KÜTÜPHANE BAKİYESİ*****//
        /*System.out.println("*********KİTAP GERİ GETİRME:*******");
        ((Reader) reader).returnBook(bookToBorrow, library);

        library.printAllBooks();

        System.out.println("Library Balance: " + library.getLibraryBalance() + " TL");*/

        // **********************************///******************************************* //



        // **********************************///******************************************* //

        //***** STUDENT İNDİRİMLİ KİTAP ÖDÜNÇ ALMA *****//
        /*library.printAllBooks();
        System.out.println("****************");

        MemberRecord studentRecord = new MemberRecord(5, "2024-01-01", MemberType.STUDENT);
        Reader student = new Student("Ali Veli", "Ankara Çankaya", "555-123-4567", studentRecord, "855");

        System.out.println("*********STUDENT KİTAP ÖDÜNÇ ALMA:*******");
        Book studentBookToBorrow = library.findBookById(5);
        student.borrowBook(studentBookToBorrow, library);

        System.out.println("***$$$*****INVOICE:***$$$*****");
        double totalAmount = student.getMemberRecord().getNumberOfBookBorrowed() * library.getBorrowFee(studentRecord.getMemberType());
        student.getMemberRecord().printInvoice(student, totalAmount);

        System.out.println("***$$$*****INVOICE:***$$$*****");
        System.out.println("****************");
        library.printAllBooks();
        System.out.println("Library Balance: " + library.getLibraryBalance() + " TL");

        System.out.println("****************");
        System.out.println("****************");
        System.out.println("****************");*/



        //***** FACULTY İNDİRİMSİZ KİTAP ÖDÜNÇ ALMA *****//
        /*System.out.println("********FACULTY İNDİRİMSİZ KİTAP ÖDÜNÇ ALMA********");
        library.printAllBooks();
        System.out.println("****************");

        MemberRecord facultyRecord = new MemberRecord(5, "2024-01-01", MemberType.FACULTY);
        Reader faculty = new Faculty("Ahmet Hoca", "Ankara Çankaya", "555-123-4567", facultyRecord,
                "Mathematics", "Assoc. Prof. Dr.");

        System.out.println("*********FACULTY KİTAP ÖDÜNÇ ALMA:*******");
        Book facultyBookToBorrow = library.findBookById(7);
        faculty.borrowBook(facultyBookToBorrow, library);

        System.out.println("***$$$*****INVOICE:***$$$*****");
        double totalAmount = faculty.getMemberRecord().getNumberOfBookBorrowed() * library.getBorrowFee(facultyRecord.getMemberType());
        faculty.getMemberRecord().printInvoice(faculty, totalAmount);
        System.out.println("***$$$*****INVOICE:***$$$*****");

        System.out.println("****************");
        library.printAllBooks();
        System.out.println("Library Balance: " + library.getLibraryBalance() + " TL");

        System.out.println("****************");
        System.out.println("****************");
        System.out.println("****************");*/


    }
    }

