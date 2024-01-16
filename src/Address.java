public class Address {
    private String street;
    private String city;
    private int postalCode;
    private State state;

    public Address(String street, String city, int postalCode, State state) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
        this.state = state;
    }

    public Address(String street, String city, int postalCode) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }
}
