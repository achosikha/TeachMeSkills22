package Delegation;

public class Human {
    public String name;
    public String surname;

    public Human(String name, String surname)
    {
        this.name = name;
        this.surname = surname;
    }

    void jumps()
    {
        System.out.println(name + " " + surname + " jumps...");
    }

    void runs()
    {
        System.out.println(name + " " + surname + " runs...");
    }
}
