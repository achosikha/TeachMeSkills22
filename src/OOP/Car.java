package OOP;

public class Car {
    public String name;
    public String model;
    public int housePower;

    // Access modifiers
    // Private
    // Default -> package-private
    // Protected
    // Public

    // Доступно только внутри класса, больше нигде
    private String privateName;

    // Уровень пакет + наследование
    String defaultName;

    // Наследование + package
    protected String protectedName;

    // Из любой точки моей программы, никаких ограничений
    public String publicName;

    private String getPrivateVariable()
    {
        return this.privateName;
    }

    public String getPrivateName() {
        return privateName;
    }

    public void setPrivateName(String privateName) {
        this.privateName = privateName;
    }
}
