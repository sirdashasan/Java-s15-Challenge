package library.models;

public abstract class Person {
    private String personName;
    private String personAddress;
    private String personPhone;

    public Person(String personName, String personAddress, String personPhone) {
        this.personName = personName;
        this.personAddress = personAddress;
        this.personPhone = personPhone;
    }

    public String getPersonName() {
        return personName;
    }

    public String getPersonAddress() {
        return personAddress;
    }

    public String getPersonPhone() {
        return personPhone;
    }

    public abstract String whoYouAre();

    @Override
    public String toString() {
        return "Person{" +
                "personName='" + personName + '\'' +
                ", personAddress='" + personAddress + '\'' +
                ", personPhone='" + personPhone + '\'' +
                '}';
    }
}
