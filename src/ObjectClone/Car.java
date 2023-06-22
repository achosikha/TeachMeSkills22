package ObjectClone;

import java.util.Arrays;

public class Car implements Cloneable {
    private String model;
    private String color;
    private String[] sparParts;

    public Car(String model, String color, String[] sparParts)
    {
        this.model = model;
        this.color = color;
        this.sparParts = sparParts;
    }

    public Car(Car clone)
    {
        this.model = clone.model;
        this.color = clone.color;
        // this.sparParts = clone.sparParts;
        this.sparParts = Arrays.copyOf(clone.sparParts, clone.sparParts.length);
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSparParts(String[] sparParts) {
        this.sparParts = sparParts;
    }

    @Override
    public String toString() {
        return this.model + ". " + this.color + ". " + Arrays.toString(sparParts) + ".";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
