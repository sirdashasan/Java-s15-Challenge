package library.models;

public class Reader extends Person {

    private MemberRecord memberRecord;

    public Reader(String personName, MemberRecord memberRecord ) {
        super(personName);
        this.memberRecord = memberRecord;
    }

    public MemberRecord getMemberRecord() {
        return memberRecord;
    }

    public void borrowBook(Book book){
        memberRecord.borrowBook(book);
    }

    public void returnBook(Book book){
        memberRecord.returnBook(book);
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
