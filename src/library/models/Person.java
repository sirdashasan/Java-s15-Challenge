package library.models;

public abstract class Person {
    private String personName;

    public Person(String personName) {
        this.personName = personName;
    }

    public String getPersonName() {
        return personName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personName='" + personName + '\'' +
                '}';
    }
}
