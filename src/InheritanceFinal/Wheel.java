package InheritanceFinal;

public abstract class Wheel { // extends ClassFinal - нельзя!
    // final с переменной
    // final с классом
    // final с методом

    // goto - const (константа - Джава final)
    // Значение должно быть задано во время создания класса прямо или же через конструктор
    // значение не может быть изменено!
    // private final String name = "Unknown"; -> can be done
    private final String name;
    private String type;

    public Wheel(String name, String type)
    {
        this.name = name;
        this.type = type;
    }

    public void getInfo()
    {
        System.out.println("Your Wheel name is: " + this.name);
        System.out.println("Your Wheel type is: " + this.type);
    }

    // этот метод не может иметь другую реализацию в дочерних классах
    public final void cannotOverride()
    {
        System.out.println("You cannot override this method...");
    }
}
