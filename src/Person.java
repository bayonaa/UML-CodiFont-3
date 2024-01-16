public class Person {
    private String name;
    private String phoneNumber;
    private String emailAddress;
    private Address address;

    public Person(String name, String phoneNumber, String emailAddress, Address address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.address = address;
    }

    public Person(String name, String phoneNumber, String emailAddress) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public static void purchaseParkingPass(){

    }
}
