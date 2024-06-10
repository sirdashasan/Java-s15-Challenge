package library.models;

public class Librarian extends Person {


    public Librarian(String personName, String personAddress, String personPhone) {
        super(personName, personAddress, personPhone);
    }

    @Override
    public String whoYouAre() {
        return "";
    }
}
