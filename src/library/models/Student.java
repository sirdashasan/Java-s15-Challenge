package library.models;

public class Student extends Reader {

    private String studentNumber;

    public Student(String personName, String personAddress, String personPhone, MemberRecord memberRecord, String studentNumber) {
        super(personName, personAddress, personPhone, memberRecord);
        this.studentNumber = studentNumber;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    @Override
    public String whoYouAre() {
        return "I am a student";
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNumber='" + studentNumber + '\'' +
                '}' + super.toString();
    }

    public void borrowBook(Book book, Library library) {
        getMemberRecord().borrowBook(book, this, library);
    }
}
