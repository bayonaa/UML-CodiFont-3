import java.util.ArrayList;

public class AddressBook {
    private String code;
    private ArrayList<Person> persona;

    public AddressBook(String code) {
        this.code = code;
    }

    public AddressBook(String code, ArrayList<Person> persona) {
        this.code = code;
        this.persona = persona;
    }
}
