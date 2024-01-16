public class Main {
    public static void main(String[] args) {
        Country c1 = new Country(1, "España");
        Country c2 = new Country(2, "Japón");
        Country c3 = new Country(3, "Brasil");

        State s1 = new State(1,"Cataluña", c1);
        State s2 = new State(2,"Kantō", c2);
        State s3 = new State(3,"São Paulo", c3);

        Address a1 = new Address("Carrer de Sant Pau", "Barcelona", 12345, s1);
        Address a2 = new Address("Calle Hoppie", "Tokio", 12346, s2);
        Address a3 = new Address("Rua Goiás", "Santos", 12347, s3);

        Person p1 = new Person("Alejandro", "666666666", "alejandro@gmail.com", a1);
        Person p2 = new Person("Yuji", "888888888", "yuji@gmail.com", a2);
        Person p3 = new Person("Luis", "777777777", "luis@gmail.com", a3);

        AddressBook ab1 = new AddressBook("zxc1");

    }
}
