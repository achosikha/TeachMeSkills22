package BasicClass;

public class Cars {
    // Поле класса
    // На уровне класса - все переменные получаются default values
    public String model = "Unknown"; // by default: null
    public int productionYear; // by default: 0
    public String color = "Unknown"; // by default: null
    public double weight; // by default: 0.0
    public double run; // by default: 0.0

    // У каждого класса есть default constructor
    // default constructor компилятором во время сборки программы
    public Cars() // by default constructor empty
    {
        System.out.println("Object " + model + " was created. Zero parameters.");
    }

    public Cars(String carModel, String carColor)
    {
        model = carModel;
        color = carColor;

        System.out.println("Object " + model + " was created. Two parameters.");
    }

    public Cars(String model, int productionYear, String color)
    {
        this.model = model; // Cars.model -> this (address class)
        this.productionYear = productionYear; // Cars.productionYear
        this.color = color; // this.color == Cars.color;
    }

    // Constructor delegate
    public Cars(String model, int productionYear, String color, double weight)
    {
        this(model, productionYear, color, weight, 0);
    }

    // overloaded constructor with three parameters
    public Cars(String carModel, int productYear, String carColor, double carWeight, double carRun)
    {
        model = carModel;
        productionYear = productYear;
        color = carColor;
        weight = carWeight;
        run = carRun;

        System.out.println("Object " + model + " was created. Five parameters.");
    }

    public void getCarInformation()
    {
        System.out.println("Car model is: " + model);
        System.out.println("Production year is: " + productionYear);
        System.out.println("Car color is: " + color);
        System.out.println("Car weight is: " + weight);
        System.out.println("Car run is: " + run);
    }

    public void getThis()
    {
        System.out.println(this);
    }
}
