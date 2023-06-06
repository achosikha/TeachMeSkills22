package CarsWithParts;

public class Wheels {
    public String wheelModel;
    public int wheelAmount;

    public Wheels()
    {
        this("Unknown Weel Model", 0);
    }

    public Wheels(String wheelModel, int wheelAmount)
    {
        this.wheelModel = wheelModel;
        this.wheelAmount = wheelAmount;
    }
}
