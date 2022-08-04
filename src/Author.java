public class Author {
    private final String firstName;
    private final String lastName;

    public Author(String firstName, String surname) {
        this.firstName = firstName;
        this.lastName = surname;
    }

    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public String toString() {
        return getFirstName() + " " + getLastName();
    }
}
