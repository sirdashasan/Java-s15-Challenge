package library.models;

public class Reader extends Person {

    private MemberRecord memberRecord;

    public Reader(String personName, String personAddress, String personPhone, MemberRecord memberRecord ) {
        super(personName, personAddress, personPhone);
        this.memberRecord = memberRecord;
    }

    public MemberRecord getMemberRecord() {
        return memberRecord;
    }

    public void borrowBook(Book book, Library library){
        memberRecord.borrowBook(book, library );
    }

    public void returnBook(Book book, Library library){
        memberRecord.returnBook(book, library);
    }

    public void printAllBooksReader(Library library){
        library.printAllBooks();
    }



    @Override
    public String whoYouAre() {
        return "I am a reader";
    }

    @Override
    public String toString() {
        return "Reader{" +
                "memberRecord=" + memberRecord +
                '}';
    }


}
