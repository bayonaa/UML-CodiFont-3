public class State {
    private int id;
    private String name;
    private Country country;

    public State(int id, String name, Country country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }

    public State(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
