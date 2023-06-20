package Homework82;

public abstract class Figure {

    // Constructor with 3 parameters
    public Figure()
    {

    }

    // Constructors with 4 parameters

    // Constructor for the Circle

    public abstract void perimeter();
    public abstract void square();

    public void general()
    {
        System.out.println("Just general method...");
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
