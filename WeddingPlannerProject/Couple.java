public class Couple {
    private Person bride;
    private Person groom;

    // Blank constructor
    public Couple() {
    }

    // Overloaded constructor
    public Couple(Person bride, Person groom) {
        this.bride = bride;
        this.groom = groom;
    }

    // Get methods
    public Person getBride() {
        return bride;
    }

    public Person getGroom() {
        return groom;
    }
}
