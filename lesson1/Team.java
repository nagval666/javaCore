package lesson1;

public class Team {

    private String name;
    private Party[] peoples;

    public Team(String name, Party[] peoples) {
        this.name = name;
        this.peoples = peoples;
    }

    public String getName() {
        return name;
    }
    public Party[] getPeoples() {
        return peoples;
    }
}
