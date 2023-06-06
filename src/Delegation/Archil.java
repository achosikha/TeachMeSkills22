package Delegation;

public class Archil {
    public String name;
    public String surname;
    public Human human;

    public Archil(String name, String surname)
    {
        this.name = name;
        this.surname = surname;
        human = new Human(this.name, this.surname);
    }

    void jumps()
    {
        human.jumps();
    }

    void runs()
    {
        human.runs();
    }
}
