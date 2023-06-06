package CarsWithParts;

import java.util.Arrays;

public class Car {
    public String model;
    public int productionYear;
    public String color;
    public double weight;
    public double run;

    // has-a (Car has an Engine, Car has a Wheel)
    // Class example created based on another classes - called COMPOSITION
    public Engine engine;
    public Wheels wheels;

    public String[] spareParts;

    public Car()
    {
        this("Unknown", 0, "Unknown", 0, 0,
                new Engine(), new Wheels(), new String[]{});
    }

    public Car(String model, int productionYear, String color, double weight,
               double run, Engine engine, Wheels wheels, String[] spareParts)
    {
        this.model = model;
        this.productionYear = productionYear;
        this.color = color;
        this.weight = weight;
        this.run = run;
        this.engine = engine;
        this.wheels = wheels;
        this.spareParts = spareParts; // Array -> if I try to use copy constructor -> mistake
    }

    String getCarInformation()
    {
        return "Car model: " + this.model + "\n" +
                "Car color: " + this.color + "\n" +
                "Car production year: " + this.productionYear + "\n" +
                "Car weight: " + this.weight + "\n" +
                "Car run: " + this.run + "\n\n" +
                "Engine mode: " + engine.engineModel + "\n" +
                "Engine horse power: " + engine.horsePower + "\n" +
                "Wheel model: " + wheels.wheelModel + "\n" +
                "Wheel amount: " + wheels.wheelAmount + "\n" +
                "Spare parts: " + Arrays.toString(spareParts) + "\n";
    }
}
