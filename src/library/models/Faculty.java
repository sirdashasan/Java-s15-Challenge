package library.models;

public class Faculty extends Reader{

    private String facultyDepartment;
    private String facultyTitle;

    public Faculty(String personName, String personAddress, String personPhone, MemberRecord memberRecord, String facultyDepartment,
                   String facultyTitle) {
        super(personName, personAddress, personPhone, memberRecord);
        this.facultyDepartment = facultyDepartment;
        this.facultyTitle = facultyTitle;
    }

    public String getFacultyDepartment() {
        return facultyDepartment;
    }

    public String getFacultyTitle() {
        return facultyTitle;
    }

    @Override
    public String whoYouAre() {
        return "I am a faculty member";
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "facultyDepartment='" + facultyDepartment + '\'' +
                ", facultyTitle='" + facultyTitle + '\'' +
                '}' + super.toString();
    }

    public void borrowBook(Book book, Library library) {
        getMemberRecord().borrowBook(book, this, library);
    }

    public void returnBook(Book book, Library library) {
        getMemberRecord().borrowBook(book, this, library);
    }
}
