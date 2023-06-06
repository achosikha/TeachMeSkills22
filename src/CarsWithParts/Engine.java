package CarsWithParts;

public class Engine {
    public String engineModel;
    public int horsePower;

    public Engine()
    {
        this("Unknown Engine", 0);
    }

    public Engine(String engineModel, int horsePower)
    {
        this.engineModel = engineModel;
        this.horsePower = horsePower;
    }
}
