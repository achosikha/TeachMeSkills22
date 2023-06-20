package Static;

public class Cars {
    private String model;
    private String color;
    private static String staticVariable;
    private int numberOfCars;
    private static int numberCarsStatic; // int default -> 0
    private static String staticName; // by default null

    public Cars(String model, String color)
    {
        System.out.println("This is a constructor");
        this.model = model;
        this.color = color;
        Cars.staticVariable = "General Static";
        numberOfCars++;
        numberCarsStatic++;
    }

    static {
        System.out.println("This is a static block....");
        staticName = "General Static Name";
    }

    {
        numberOfCars = 10;
    }

    public static String getStaticVariable() {
        return staticVariable;
    }

    public static void setStaticVariable(String staticVariable) {
        Cars.staticVariable = staticVariable;
    }

    public static int getNumberCarsStatic() {
        return numberCarsStatic;
    }

    @Override
    public String toString() {
        return this.model + " and " + this.color;
    }

    public int getNumberOfCars() {
        return numberOfCars;
    }
}
