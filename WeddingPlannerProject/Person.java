public class Person {
    private String firstName;
    private String lastName;

    // Blank constructor
    public Person() {
    }

    // Overloaded constructor
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Get method for firstName
    public String getFirstName() {
        return firstName;
    }

    // Get method for lastName
    public String getLastName() {
        return lastName;
    }
}
